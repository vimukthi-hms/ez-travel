package corelogic.repository.feedback.implementation;

import corelogic.repository.feedback.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by  on 12/18/17.
 */

@Repository
public class FeedbackImpl implements FeedbackRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Override
    public boolean addCustomerFeedback(String description, String customer_email, int driver_id, int hire_id) {

        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        try {

            String sqlForGetCustomerId = "SELECT customer_id FROM customer WHERE email = ?";
            Object[] args = new Object[]{customer_email};

            String customer_id = jdbcTemplate.queryForObject(sqlForGetCustomerId, args, String.class);

            String sqlForAddCustomerFeedback =
                    "INSERT INTO feedback (description, customer_id, driver_id, hire_id, feedback_status) VALUES (?, ?, ?, ?, 0)";

            Object[] arge = new Object[]{description, Integer.parseInt(customer_id), driver_id, hire_id};
            jdbcTemplate.update(sqlForAddCustomerFeedback, arge);

            transactionManager.commit(status);

            return true;
        }catch (Exception e){
            System.out.println("Reason => " + e.getMessage());
        }

        return false;
    }
}

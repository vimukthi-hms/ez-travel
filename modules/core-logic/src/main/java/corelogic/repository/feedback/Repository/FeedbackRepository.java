package corelogic.repository.feedback.Repository;

/**
 * Created by Menuka on 12/18/17.
 */
public interface FeedbackRepository {

    boolean addCustomerFeedback(String description, String customer_email, int driver_id, int hire_id);

    boolean addDriverFeedback(String description, String driver_email, int customer_id, int hire_id);

    boolean customerFeedbackReviewed(int feedback_id, String admin_email);

    boolean driverFeedbackReviewed(int feedback_id, String admin_email);
}
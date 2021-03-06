package eztravel.model.reply.customer;

import eztravel.model.reply.ReplyModel;

/**
 * This model used to reply customer ban request
 * @version 1.0
 * @auther Vidushka
 */
public class CustomerBanReplyModel extends ReplyModel {

    private boolean isCustomerBanned;

    public boolean getIsCustomerBanned() {
        return isCustomerBanned;
    }

    public void setCustomerBanned(boolean customerBanned) {
        isCustomerBanned = customerBanned;
    }
}

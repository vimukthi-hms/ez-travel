package eztravel.model.reply.driver;

import eztravel.model.reply.ReplyModel;

/**
 * Created by Vidushika on 12/6/17.
 */
public class DriverDeleteReplyModel extends ReplyModel {

    private boolean userDeletion;

      public boolean isUserDeletion() {
        return userDeletion;
    }

    public void setUserDeletion(boolean userDeletion) {
        this.userDeletion = userDeletion;
    }
}

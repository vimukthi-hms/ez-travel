package eztravel.model.reply.driver;



/**
 * Created by hsenid on 12/6/17.
 */
public class DriverPasswordUpdateReplyModel extends ReplyModel {

    private boolean isPasswordUpdated;

    public boolean isPasswordUpdated() {
        return isPasswordUpdated;
    }

    public void setPasswordUpdated(boolean passwordUpdated) {
        isPasswordUpdated = passwordUpdated;
    }
}

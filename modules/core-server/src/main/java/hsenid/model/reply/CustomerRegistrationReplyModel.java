package hsenid.model.reply;

/**
 * Created by Menuka on 9/18/17.
 */
public class CustomerRegistrationReplyModel {
    private int httpStatusCode;
    private String Message;
    private String requestStatus;
    private boolean userCreation;

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public boolean isUserCreation() {
        return userCreation;
    }

    public void setUserCreation(boolean userCreation) {
        this.userCreation = userCreation;
    }
}
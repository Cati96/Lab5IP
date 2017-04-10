/**
 * Created by Cati on 10-Apr-17.
 */
public class MessageType {
    String  requestReceived;
    String requestSent;
    String requestApproved;
    String requestDenied;
    String requestFinalised;

    public String getRequestReceived() {
        return requestReceived;
    }

    public void setRequestReceived(String requestReceived) {
        this.requestReceived = requestReceived;
    }

    public String getRequestSent() {
        return requestSent;
    }

    public void setRequestSent(String requestSent) {
        this.requestSent = requestSent;
    }

    public String getRequestApproved() {
        return requestApproved;
    }

    public void setRequestApproved(String requestApproved) {
        this.requestApproved = requestApproved;
    }

    public String getRequestDenied() {
        return requestDenied;
    }

    public void setRequestDenied(String requestDenied) {
        this.requestDenied = requestDenied;
    }

    public String getRequestFinalised() {
        return requestFinalised;
    }

    public void setRequestFinalised(String requestFinalised) {
        this.requestFinalised = requestFinalised;
    }
}

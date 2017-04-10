/**
 * Created by Cati on 10-Apr-17.
 */
public interface SendNotification {

    void  sendSMS(long userId, MessageType message);
    void sendSMS(Secretary secretariat, MessageType message);
    void sendEMAIL(long userId, MessageType message);
    void sendEMAIL(Secretary secretariat, MessageType message);
}

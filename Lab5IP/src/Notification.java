import java.util.List;

/**
 * Created by Cati on 10-Apr-17.
 */
public class Notification implements SendNotification {

    String toWhom;
    List<Email> studentsEmailList;
    List<PhoneNumber> studentsPhoneNrList;

    @Override
    public void sendSMS(long userId, MessageType message) {

    }

    @Override
    public void sendSMS(Secretary secretariat, MessageType message) {

    }

    @Override
    public void sendEMAIL(long userId, MessageType message) {

    }

    @Override
    public void sendEMAIL(Secretary secretariat, MessageType message) {

    }
}

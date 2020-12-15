import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class MakeText {

    private static final String ACCOUNT_SID = System.getenv("AS");
    private static final String AUTH_TOKEN = System.getenv("AT");


    public static String send (String text){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(new PhoneNumber("+18568130880"),
                new PhoneNumber("+18039747013"),
                text).create();
        return "Message sent";
    }

}


public class SendText {


    public static void main(String[] args) {
        FactRetriever fr = new FactRetriever();
        System.out.println(MakeText.send(fr.retrieveRandomFact()));

    }

}
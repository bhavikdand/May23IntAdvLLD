package designpatterns.adapter.third_party;

public class Sendgrid {
    public void send(String from, String to, String content, String[] cc, String[] bcc){
        System.out.println("Sending email via sendgrid");
    }
}

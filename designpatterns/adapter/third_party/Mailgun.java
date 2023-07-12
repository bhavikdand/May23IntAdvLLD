package designpatterns.adapter.third_party;

public class Mailgun {

    public void sendAsync(String from, String to, String content){
        System.out.println("Sending email asynchronously via Mailgun");
    }
}

package designpatterns.adapter;

public class EmailHelper {

    public EmailHelper(EmailAdapter adapter) {
        this.adapter = adapter;
    }

    EmailAdapter adapter;

    public void sendEmail(String from, String to, String content){
        adapter.sendEmail(from, to, content);
    }
}

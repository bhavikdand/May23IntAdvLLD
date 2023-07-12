package designpatterns.adapter;

public class Client {

    public static void main(String[] args) {
//        SendgridEmailAdapter adapter = new SendgridEmailAdapter();
        MailgunAdapter mailgunAdapter = new MailgunAdapter();
        EmailHelper emailHelper = new EmailHelper(mailgunAdapter);

        emailHelper.sendEmail("john@doe.com", "jane@doe.com", "Hi!");
    }
}

package designpatterns.adapter;

import designpatterns.adapter.third_party.Mailgun;

public class MailgunAdapter implements EmailAdapter{

    Mailgun client = new Mailgun();

    @Override
    public void sendEmail(String from, String to, String content) {
        client.sendAsync(from, to, content);
    }
}

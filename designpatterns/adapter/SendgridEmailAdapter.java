package designpatterns.adapter;

import designpatterns.adapter.third_party.Sendgrid;

public class SendgridEmailAdapter implements EmailAdapter{
    Sendgrid client = new Sendgrid();

    @Override
    public void sendEmail(String from, String to, String content) {
        client.send(from, to , content, null, null);
    }
}

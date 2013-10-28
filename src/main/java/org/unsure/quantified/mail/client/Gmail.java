package org.unsure.quantified.mail.client;


import com.googlecode.gmail4j.GmailClient;
import com.googlecode.gmail4j.GmailConnection;
import com.googlecode.gmail4j.GmailMessage;
import com.googlecode.gmail4j.http.HttpGmailConnection;
import com.googlecode.gmail4j.rss.RssGmailClient;
import org.joda.time.DateTime;
import org.unsure.quantified.mail.core.Inbox;

import java.util.List;

public class Gmail {
    final private String username;
    final private String password;

    public Gmail(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Inbox populateInbox() {
        GmailClient client = new RssGmailClient();
        GmailConnection connection = new HttpGmailConnection(username, password.toCharArray());
        client.setConnection(connection);
        final List<GmailMessage> messages = client.getUnreadMessages();
        for (GmailMessage message : messages) {
            System.out.println(message);
        }
        return new Inbox(0, 0, 0, 0, 0, 0, new DateTime());
    }
}

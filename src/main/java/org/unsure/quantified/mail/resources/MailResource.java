package org.unsure.quantified.mail.resources;

import com.yammer.metrics.annotation.Timed;
import org.unsure.quantified.mail.client.Gmail;
import org.unsure.quantified.mail.core.Inbox;
import org.unsure.quantified.mail.views.InboxView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/inbox")
@Produces(MediaType.TEXT_HTML)
public class MailResource {

    private final String username;
    private final String password;
    private final AtomicLong counter;
    private final Gmail gmail;

    public MailResource(String username, String password) {
        this.username = username;
        this.password = password;
        this.counter = new AtomicLong();
        this.gmail = new Gmail(username, password);
    }

    @GET
    @Timed
    public InboxView showInbox() {
        Inbox inbox = gmail.populateInbox();
        return new InboxView(inbox);
    }
}

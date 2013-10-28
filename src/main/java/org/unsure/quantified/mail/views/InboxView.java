package org.unsure.quantified.mail.views;

import com.yammer.dropwizard.views.View;
import org.unsure.quantified.mail.core.Inbox;

public class InboxView extends View {
    private final Inbox inbox;

    public InboxView(Inbox inbox) {
        super("inbox.ftl");
        this.inbox = inbox;
    }

    public Inbox getInbox() {
        return inbox;
    }
}

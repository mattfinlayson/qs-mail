package org.unsure.quantified.mail.core;

import org.joda.time.DateTime;

public class Inbox {
    private final long id;
    private final long total;
    private final long unread;
    private final long sent;
    private final long starred;
    private final long trashed;
    private DateTime timestamp;

    public Inbox(long id, long total, long unread, long sent, long starred, long trashed, DateTime timestamp) {
        this.id = id;
        this.total = total;
        this.unread = unread;
        this.sent = sent;
        this.starred = starred;
        this.trashed = trashed;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public long getTotal() {
        return total;
    }

    public long getUnread() {
        return unread;
    }

    public long getSent() {
        return sent;
    }

    public long getStarred() {
        return starred;
    }

    public long getTrashed() {
        return trashed;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }
}

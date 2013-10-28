<#-- @ftlvariable name="" type="org.unsure.quantified.mail.views.InboxView" -->
<html>
<body>
<!-- calls getPerson().getName() and sanitizes it -->
<h1>id, ${inbox.id?html}!</h1>
<h1>sent, ${inbox.sent?html}!</h1>
<h1>starred, ${inbox.starred?html}!</h1>
<h1>date, ${inbox.timestamp.toString()?html}!</h1>
<h1>total, ${inbox.total?html}!</h1>
<h1>trashed, ${inbox.trashed?html}!</h1>
<h1>unread, ${inbox.unread?html}!</h1>
</body>
</html>
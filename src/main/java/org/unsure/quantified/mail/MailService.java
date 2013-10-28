package org.unsure.quantified.mail;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import org.unsure.quantified.mail.resources.MailResource;

public class MailService extends Service<MailConfiguration> {

    public static void main(String[] args) throws Exception {
        new MailService().run(args);
    }

    @Override
    public void initialize(Bootstrap<MailConfiguration> bootstrap) {
        bootstrap.setName("qs-mail");
    }

    @Override
    public void run(MailConfiguration configuration, Environment environment) throws Exception {
        final String username = configuration.getUsername();
        final String password = configuration.getPassword();
        environment.addResource(new MailResource(username, password));    }
}

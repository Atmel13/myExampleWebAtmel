package com.it.Helpers;

import com.it.Pages.DashboardPage;
import com.it.Utils.Emails.Email;

public class DashboardHelper extends DashboardPage {

    public void sendEmail (Email email) {

        sendEmail(email.getEmailRecipient(), email.getSubjectEmail(), email.getEmailBody());

    }

}

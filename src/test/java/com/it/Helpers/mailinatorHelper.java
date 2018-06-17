package com.it.Helpers;

import com.it.Pages.mailinatorPage;
import com.it.Utils.Emails.Email;

public class mailinatorHelper extends mailinatorPage {

    public String getMailinatorEmail (Email sentEmail) throws InterruptedException {

        openInboxFolder(sentEmail.getEmailRecipient());
        openEmail(sentEmail.getSubjectEmail());
        return getEmailBody();

    }

}

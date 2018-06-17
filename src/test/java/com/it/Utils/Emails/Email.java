package com.it.Utils.Emails;

public class Email {

    private String emailRecipient;
    private String subjectEmail;
    private String emailBody;

    public Email(String emailRecipient, String subjectEmail, String emailBody) {
        this.emailRecipient = emailRecipient;
        this.subjectEmail = subjectEmail;
        this.emailBody = emailBody;
    }

    public String getEmailRecipient() {
        return emailRecipient;
    }

    public String getSubjectEmail() {
        return subjectEmail;
    }

    public String getEmailBody() {
        return emailBody;
    }

}

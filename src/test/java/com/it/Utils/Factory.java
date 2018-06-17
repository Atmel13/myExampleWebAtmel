package com.it.Utils;

import com.it.Utils.Emails.Email;
import com.it.Utils.Users.User;

import java.util.ResourceBundle;

public class Factory {

    static long time = + System.currentTimeMillis();

   public static class Users {

        static ResourceBundle resourceUser = ResourceBundle.getBundle("user");

        public static User getValidUser() {
            return new User(resourceUser.getString("validUser.login"),
                    resourceUser.getString("validUser.password"),
                    resourceUser.getString("validUser.email"));
        }

       public static User getRandomUser () {
           return new User("ittest2", "337774a", "ittest2@i.ua");

       }

    }

    public static class Emails {

        public static Email getRandomEmail () {
            return new Email("testaqa" + time + "@mailinator.com", "MySubject0806" + time, "Body 0806 test." + time);

        }

    }

}

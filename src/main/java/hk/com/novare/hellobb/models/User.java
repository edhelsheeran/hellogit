package hk.com.novare.hellobb.models;

import hk.com.novare.hellobb.controllers.AnnounceController;

/**
 * A user is an entry in a file that contains
 * a name and his/her greeting.
 *
 * This class is used by the {@link AnnounceController}
 * during announcements.
 *
 * @author jerieljan
 */
public class User {

    private String name;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}

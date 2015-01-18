package me.whiteship.boot;

/**
 * @author Keeun Baik
 */
public class MyAppConfiguration {

    private String firstName;

    private String lastName;

    private String greetingMessage;

    public String sayHello() {
        return greetingMessage + " " + firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}

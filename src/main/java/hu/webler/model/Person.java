package hu.webler.model;

public abstract class Person {

    private String firstName;
    private String midName;
    private String lastName;

    public abstract String doSomething();


    public Person() {
    }
    public Person(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidName() {
        return midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

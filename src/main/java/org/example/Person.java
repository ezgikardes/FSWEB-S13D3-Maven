package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private long id;
    private String email;
    private boolean isMarried;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, long id, String email, boolean isMarried) {
        this(firstName, lastName, age);
        this.id = id;
        this.email = email;
        this.isMarried = isMarried;
    }

    public String getFirstName(){
        return  firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if (age >= 13 && age <= 19){
            return true;
        }
        return false;
    }

}

package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);

        System.out.println("person.getFirstName() = " + person.getFirstName());
        System.out.println("person.getLastName() = " + person.getLastName());
        System.out.println("person.getAge() = " + person.getAge());
        System.out.println("person.isTeen() = " + person.isTeen());


        Wall wall = new Wall(5, 4);
        System.out.println("area=" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());

    }
}

package company;

public class Person {
    private String name;
    private String surmanme;
    private int age;

    public Person(String name, String surmanme) {
        this.name = name;
        this.surmanme = surmanme;
    }

    public Person(String name, String surmanme, int age) {
        this.name = name;
        this.surmanme = surmanme;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurmanme() {
        return surmanme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

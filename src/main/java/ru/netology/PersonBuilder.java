package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;


    public PersonBuilder setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name must be filled");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("Surname must be filled");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be less than 0");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Name isn't filled");
        }
        if (surname == null) {
            throw new IllegalStateException("Surname isn't filled");
        }

        return new Person(name, surname, age, address);
    }
}

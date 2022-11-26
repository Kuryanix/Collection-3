package Phonebook;

import java.util.Objects;

public class FullName {

    public String firstName;
    public String lastName;

    public FullName(String firstName, String name) {
        this.firstName = firstName;
        this.lastName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(firstName, fullName.firstName) && Objects.equals(lastName, fullName.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}


package Immutable;

import java.time.LocalDate;

public final class Person {
    private final LocalDate dob;

    public Person(LocalDate dob) {
        this.dob = dob; // safe, immutable
    }

    public LocalDate getDob() {
        return dob;
    }
}

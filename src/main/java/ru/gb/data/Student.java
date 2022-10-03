package ru.gb.data;

import java.util.UUID;

public class Student extends Human {

    private UUID studentId;

    public Student(final String firstName, final String secondName, final String patronymic, final UUID studentId) {
        super(firstName, secondName, patronymic);
        this.studentId = studentId;
    }
}

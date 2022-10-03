package ru.gb.data;

import java.util.UUID;

public class Teacher extends Human {
    private UUID teacherId;
    public Teacher(final String firstName, final String secondName, final String patronymic, final UUID teacherId) {
        super(firstName, secondName, patronymic);
        this.teacherId = teacherId;
    }
}

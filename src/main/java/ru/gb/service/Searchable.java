package ru.gb.service;

import ru.gb.data.Human;

import java.util.List;

public interface Searchable<T extends Human> {

    List<T> search(List<T> list);

}

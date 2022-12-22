package com.polezhaiev.homewrok12.phonebook.service;

import com.polezhaiev.homewrok12.phonebook.model.Record;

import java.util.List;

public interface PhoneBookService {
    void add(Record writer);
    boolean printList(List<Record>list);
    Record find(String name);
    List<Record> findAll(String name);
    List<Record> getRecords();
}

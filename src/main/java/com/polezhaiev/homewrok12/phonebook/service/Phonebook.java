package com.polezhaiev.homewrok12.phonebook.service;

import com.polezhaiev.homewrok12.phonebook.model.Record;

import java.util.ArrayList;
import java.util.List;

public class Phonebook implements PhoneBookService{
    private List<Record> records;

    public Phonebook() {
        records = new ArrayList<>();
    }

    public void add(Record record){
        records.add(record);
    }

    @Override
    public Record find(String name){
        if(name == null || name.length() == 0){
            return null;
        }

        for (Record record : records) {
            if(record.getName().equals(name)){
                return record;
            }
        }
        return null;
    }

    @Override
    public List<Record> findAll(String name){
        if(name == null || name.length() == 0){
            return null;
        }

        List<Record> findAllRecords = new ArrayList<>();

        for (Record record : records) {
            if(record.getName().equals(name)){
                findAllRecords.add(record);
            }
        }

        if(findAllRecords == null || findAllRecords.size() == 0){
            return null;
        }
        return findAllRecords;
    }

    @Override
    public boolean printList(List<Record> list){
        if(list == null || list.size() == 0){
            System.out.println("List is null");
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\n");
        }
        return true;
    }

    @Override
    public List<Record> getRecords() {
        return records;
    }
}

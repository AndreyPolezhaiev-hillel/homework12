package com.polezhaiev.homewrok12.phonebook;

import com.polezhaiev.homewrok12.phonebook.model.Record;
import com.polezhaiev.homewrok12.phonebook.service.PhoneBookService;
import com.polezhaiev.homewrok12.phonebook.service.Phonebook;

public class Phone {
    public static void main(String[] args) {
        Record record0= new Record("Andrey", "1111111111");
        Record record1 = new Record("Ivan", "2222222222");
        Record record2 = new Record("Andrey", "33333333333");
        Record record3 = new Record("Petr", "444444444444");
        Record record4 = new Record("Andrey", "55555555555");
        Record record5 = new Record("Ivan", "66666666666");

        PhoneBookService phonebook = new Phonebook();

        phonebook.add(record0);
        phonebook.add(record1);
        phonebook.add(record2);
        phonebook.add(record4);
        phonebook.add(record5);

        System.out.println("Method add()");
        phonebook.printList(phonebook.getRecords());
        System.out.println();

        System.out.println("Method find()");
        System.out.println(phonebook.find("Andrey").toString());

        System.out.println();
        System.out.println("Method findAll()");
        phonebook.printList(phonebook.findAll("Ivan"));
    }
}

package com.polezhaiev.homewrok12.listpractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //////////   1 TASK    ///////////////

        List<String> stringList = new ArrayList<>();

        for (int j = 0; j < 2; j++) {
            stringList.add("Hi");
        }

        for (int j = 0; j < 4; j++) {
            stringList.add("gt");
        }

        for (int j = 0; j < 5; j++) {
            stringList.add("rrr");
        }

        for (int j = 0; j < 3; j++) {
            stringList.add("World");
        }

        System.out.println("First task - " + countOccurrence(stringList, "World"));

        ////////////    2 TASK    ////////////
        Integer [] integers = new Integer[5];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = (int)(Math.random() * (10 - 1)) + 1;
        }
        System.out.println("Second task - not uniques:        " + toList(integers));


        /////////////    3 TASK     ///////////

        System.out.println("Third task - uniques from task 2: " + findUnique(toList(integers)));

        ////////////     4.1 TASK     ///////////

        System.out.println();
        System.out.print("Fourth task: ");
        calcOccurrence(stringList);

        ////////////     4.2 TASK     ///////////

        System.out.println();
        System.out.println();
        System.out.println(findOccurrence(stringList));

    }

    public static int countOccurrence(List<String> stringList, String string){
        if(stringList.size() == 0 || stringList == null || string.length() == 0 || string == null){
            return 0;
        }

        int count = 0;

        for (String i: stringList) {
            if(i.equals(string)){
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(Integer [] integers){
        if(integers.length == 0 || integers == null){
            return null;
        }

        List<Integer> integerList = new ArrayList<>();
        for (Integer i: integers) {
            integerList.add(i);
        }

        return integerList;
    }

    public static List<Integer> findUnique(List<Integer> numbers){
        if(numbers.size() == 0 || numbers == null){
            return null;
        }
        int a = 0;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            a = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if(numbers.get(i) == numbers.get(j)){
                    a++;
                }

                if(a > 1){
                    break;

                } else if(j == numbers.size() - 1 && a < 2){

                    result.add(numbers.get(i));
                    break;
                }
            }
        }

        return result;
    }

    public static void calcOccurrence (List<String> stringList){
        if(stringList.size() == 0 || stringList == null){
            System.out.println("List size is \"0\"");
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            int count = 0;

            for (int j = 0; j < stringList.size(); j++) {
                if(stringList.get(i).equals(stringList.get(j))){
                    count++;

                }
            }

            if(!(list.contains(stringList.get(i)))){
                list.add(stringList.get(i));
                System.out.print("\"" + stringList.get(i) + "\"" + ": " + count + "; ");

            }
        }
    }

    public static List<String> findOccurrence(List<String> stringList){
        if(stringList.size() == 0 || stringList == null){
            return null;
        }

        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            int count = 0;

            for (int j = 0; j < stringList.size(); j++) {
                if(stringList.get(i).equals(stringList.get(j))){
                    count++;

                }
            }

            if(!(list.contains(stringList.get(i)))){
                list.add(stringList.get(i));

                result.add("\n{word: \"" + stringList.get(i) + "\", occurrence: " + count + "}");
            }
        }

        return result;
    }
}

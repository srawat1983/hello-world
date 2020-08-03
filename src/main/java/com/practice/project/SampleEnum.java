package com.practice.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SampleEnum {

    String status;
    enum  LegalEntity{
      JPMLLC,
        JPMPLC, 
        JPMAG

    }

    String[] str = new String[2];


    public static void main(String [] args) {

        SampleEnum sampleClass = new SampleEnum();
        LegalEntity[] list;
        List lst = new ArrayList<Object>();

        //print enum
        for (LegalEntity lt : LegalEntity.values()) {
            System.out.println("printing enum values" + lt);
        }


        //Array
        list = LegalEntity.values();
        //for loop
        for (LegalEntity le : list) System.out.println("printing array values" + le);

        lst.add("JPMLLC");
        lst.add("JPMPLC");
        lst.add("JPMAG");

        //foreach
        lst.forEach(i -> System.out.println("printing array list values" + i));


        //Hashmap

        HashMap<Integer, String> hmp = new HashMap<Integer, String>();
        hmp.put(1,"JPMLLC");
        hmp.put(2,"JPMPLC");
        hmp.put(3,"JPMAG");

        hmp.forEach((integer, s) -> System.out.println("printing hashmap key & values " + integer + "," + s));

        //Set


    }

}










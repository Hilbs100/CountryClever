package com.example.countryapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CountriesOfTheDay extends Country{
    private int codYear;
    private int codMonth;
    private int codDay;
    // c stands for current
    private static int cYear;
    private static int cMonth;
    private static int cDay;
    private static ArrayList<CountriesOfTheDay> codList = new ArrayList<>();
    public CountriesOfTheDay(Country c, int year, int month, int day ) {
        super(c);
        codYear = year;
        codMonth = month;
        codDay = day;
        this.populate();
        codList.add(this);
    }
    //This sets the date for COD and is entered when the COD button is pressed
    public static void setDate(int year, int month, int day) {
        cYear = year;
        cMonth = month;
        cDay = day;
    }
    public static CountriesOfTheDay getCOD() {
        for (int i = 0; i < codList.size(); i++) {
            if (codList.get(i).codYear == cYear && codList.get(i).codMonth== cMonth && codList.get(i).codDay == cDay)
                return codList.get(i);
        }
        return null;
    }
    public static void exportCOD() {
        try {
            FileOutputStream fos = new FileOutputStream("codList.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(codList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void importCOD() {
        try {
            FileInputStream fis = new FileInputStream("codList.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            codList = (ArrayList<CountriesOfTheDay>)ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

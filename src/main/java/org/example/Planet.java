package org.example;

import java.io.OutputStream;

public class Planet implements Runnable{

    private int days;
    private int year;
    private double planetDay;
    private String planetName;
    private CommonResourse commonResourse;


    public Planet(int days, int year, double planetDay, String planetName, CommonResourse commonResourse)
    {
        this.planetDay = planetDay;
        this.days = days;
        this.year = year;
        this.planetName = planetName;
        this.commonResourse = commonResourse;
    }

    public int getDays() {
        return days;
    }

    public int getYear() {
        return year;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void run() {
        try {
            int cycleNum = 2;
            while(cycleNum>0)
            {
                int countDays = this.days;
                double countPlanetDay = this.planetDay;
                while(countDays>0)
                {
                    while(countPlanetDay>0)
                    {
                        countPlanetDay-=0.1;
                        Thread.sleep(50);
                    }
                    synchronized(commonResourse)
                    {
                        commonResourse.output.println("Доброе утро "+ this.planetName);
                    }
                    countDays--;
                }
                synchronized (commonResourse)
                {
                    commonResourse.output.println("С новым годом "+ this.planetName);
                }
                cycleNum--;
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

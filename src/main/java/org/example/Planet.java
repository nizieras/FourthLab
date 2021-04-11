package org.example;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Planet implements Runnable{

    private int days;
    private int year;
    private double planetDay;
    private String planetName;

    @Override
    public void run() {
        try {
            int cycleNum = 5;
            while(cycleNum>0)
            {
                int countDays = this.days;
                double countPlanetDay = this.planetDay;
                while(countDays>0)
                {
                    while(countPlanetDay>0)
                    {
                        countPlanetDay-=0.1;
                        Thread.sleep(5);
                    }
                    synchronized(System.out)
                    {
                        System.out.println("Доброе утро "+ this.planetName);
                    }
                    countDays--;
                }
                synchronized (System.out)
                {
                    System.out.println("С новым годом "+ this.planetName);
                }
                cycleNum--;
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.example;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class Controller {

    class ThreadInform
    {
       private Planet planet;
       private String planetName;
       private Thread planetThread;

        public ThreadInform( Planet planet,String planetName) {
           this.planet = planet;
           this.planetName = planetName;
           this.planetThread = new Thread(this.planet, this.planetName);
       }
       public void startTheThread() {
           this.planetThread.start();
       }
        public void joinTheThread() throws InterruptedException {
            this.planetThread.join();
        }
    }
    @FXML
    private Button startButton;

    @FXML
    public void btnStartClick(ActionEvent event) throws InterruptedException {
        startButton.setText("ВСЕЛЕННАЯ ЗАПУЩЕНА!!!");
        MainThread mainthread = new MainThread();
        ArrayList<ThreadInform> threadInforms = new ArrayList();
        threadInforms.add(new ThreadInform(new Planet(88,0,59,"Mercury"),"Mercury"));
        threadInforms.add(new ThreadInform(new Planet(225,0,243,"Venus"),"Venus"));
        threadInforms.add(new ThreadInform(new Planet(365,0,1,"Earth"),"Earth"));
        threadInforms.add(new ThreadInform(new Planet(687,0,1.1,"Mars"),"Mars"));
        threadInforms.add(new ThreadInform(new Planet(4331,0,0.5,"Jupiter"),"Jupiter"));
        threadInforms.add(new ThreadInform(new Planet(10747,0,0.5,"Saturn"),"Saturn"));
        threadInforms.add(new ThreadInform(new Planet(30589,0,0.72,"Uranus"),"Uranus"));
        threadInforms.add(new ThreadInform(new Planet(90739,0,0.61,"Neptune"),"Neptune"));
        mainthread.solarSystemEmulation(threadInforms);
    }
}

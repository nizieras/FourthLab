package org.example;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    CommonResourse commonResourse = new CommonResourse();
    MainThread mainthread = new MainThread();
    Planet mercuryPlanet = mainthread.createPlanet(88,0,59,"Mercury", commonResourse);
    Planet venusPlanet = mainthread.createPlanet(225,0,243,"Venus", commonResourse);
    Planet earthPlanet = mainthread.createPlanet(365,0,1,"Earth", commonResourse);
    Planet marsPlanet = mainthread.createPlanet(687,0,1.1,"Mars", commonResourse);
    Planet jupiterPlanet = mainthread.createPlanet(4331,0,0.5,"Jupiter", commonResourse);
    Planet saturnPlanet = mainthread.createPlanet(10747,0,0.5,"Saturn", commonResourse);
    Planet uranusPlanet = mainthread.createPlanet(30589,0,0.72,"Uranus", commonResourse);
    Planet neptunePlanet = mainthread.createPlanet(90739,0,0.61,"Neptune", commonResourse);


    @FXML
    private Button startButton;

    @FXML
    public void btnStartClick(ActionEvent event){
        startButton.setText("ВСЕЛЕННАЯ ЗАПУЩЕНА!!!");
        mainthread.solarSystemEmulation(mercuryPlanet, venusPlanet, earthPlanet,
                 marsPlanet, jupiterPlanet, saturnPlanet,
                uranusPlanet, neptunePlanet);
    }


}

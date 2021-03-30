package org.example;

import javafx.scene.text.Text;

public class MainThread {

    public MainThread()
    {

    }

    public Planet createPlanet(int days, int year, double planetDay ,String planetName, CommonResourse commonResourse)
    {
       return new Planet(days, year, planetDay,planetName, commonResourse);
    }

    public void solarSystemEmulation( Planet mercuryPlanet, Planet venusPlanet,Planet earthPlanet,
                                      Planet marsPlanet,Planet jupiterPlanet,Planet saturnPlanet,
                                      Planet uranusPlanet,Planet neptunePlanet)
    {
        Thread mercury = new Thread(mercuryPlanet, "Mercury");
        Thread venus = new Thread(venusPlanet, "Venus");
        Thread earth = new Thread(earthPlanet,"Earth" );
        Thread mars = new Thread(marsPlanet, "Mars");
        Thread jupiter = new Thread(jupiterPlanet,"Jupiter" );
        Thread saturn = new Thread(saturnPlanet, "Saturn");
        Thread uranus = new Thread(uranusPlanet,"Uranus" );
        Thread neptune = new Thread(neptunePlanet, "Neptune");

        mercury.start();
        venus.start();
        earth.start();
        mars.start();
        jupiter.start();
        saturn.start();
        uranus.start();
        neptune.start();

        try {
            mercury.join();
            venus.join();
            earth.join();
            mars.join();
            jupiter.join();
            saturn.join();
            uranus.join();
            neptune.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

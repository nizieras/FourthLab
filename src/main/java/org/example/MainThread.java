package org.example;

import java.util.ArrayList;

public class MainThread {
    public void solarSystemEmulation( ArrayList<Controller.ThreadInform> threadInforms) throws InterruptedException {
        for(int i = 0; i< threadInforms.size(); i++ )
            threadInforms.get(i).startTheThread();
        for(int i = 0; i< threadInforms.size(); i++ )
            threadInforms.get(i).joinTheThread();
    }
}

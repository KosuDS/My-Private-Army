package com.mygdx.MyPrivateArmy;

import stats.Running;
import com.badlogic.gdx.Game;

public class MyPrivateArmy extends Game {

    private Running running;

   @Override
    public void create() {
            running = new Running(this);
            setScreen(running);              
    }
}

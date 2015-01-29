package com.engine;

import com.game.Player;

import java.util.ArrayList;

/**
 * Created by sebastian on 29.01.15.
 */
public class Game
{
    private ArrayList<GameObject> objects;
    private ArrayList<GameObject> remove;
    private Player player;

    public Game()
    {
        player = new Player();
    }

    public void getInput()
    {
        player.getInput();

    }
}



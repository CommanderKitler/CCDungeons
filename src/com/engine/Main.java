package com.engine;


import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.CharKey;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

import java.util.Properties;

/**
 * Created by sebastian on 29.01.15.
 */

public class Main
{
    private static Game game;

    public static void main(String[]args)
    {
        initGame();
        gameLoop();


        /**
         *
         *
         Properties text = new Properties();
         text.setProperty("fontSize","20");
         text.setProperty("font", "Courier");
         ConsoleSystemInterface csi = null;
         try
         {
         csi = new WSwingConsoleInterface("CopyCat Dungeon - the testing", true);
         }
         catch (ExceptionInInitializerError eiie){
         System.out.println("*** Error: Swing Console Box cannot be initialized. Exiting...");
         eiie.printStackTrace();
         System.exit(-1);
         }
         csi.print(0,0, "Welcome to the Dungeon ", CSIColor.WHITE);
         int x = 0;
         int y  = 0;
         boolean stop = false;
         while(!stop){
         csi.cls();
         csi.print(x,y, '@', CSIColor.WHITE);
         csi.refresh();
         CharKey dir = csi.inkey();
         if(dir.isUpArrow() && (y-1 >= 0))
         {
         y--;
         }
         if(dir.isDownArrow() && (y+1 < 25))
         {
         y++;
         }
         if(dir.isLeftArrow() && (x-1 >= 0))
         {
         x--;
         }
         if(dir.isRightArrow() && (x+1 < 80))
         {
         x++;
         }
         if(dir.code == CharKey.Q)
         {
         stop = true;
         }


         }
         System.exit(0);
         */

    }

    private static void initGame()
    {
        game = new Game();
    }

    private static void gameLoop()
    {

    }

}

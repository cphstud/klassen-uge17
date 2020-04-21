package Controller;

import java.util.Scanner;

import Model.Riddle;
import View.View;

public class MainController {
    Scanner ms;
    View view;


    public MainController(View view, RiddleHandler riddleHandler) {
        ms = new Scanner(System.in);
        this.view = view;
    }
    // gameloop
    public void runGame() {
        int mainChoice = 0;
        int exitvalue = 9;
        while(mainChoice != exitvalue) {
            view.printMainNavi();
            mainChoice = ms.nextInt();
            switch (mainChoice) {
                // løs gåden
                case 1:
                    Riddle tmpRiddle = null;
                    String riddleFeedBack = "";
                    riddleFeedBack = view.riddleSolve();
                    riddleHandler.solveRiddle(riddle);
            }
        }
    }


}

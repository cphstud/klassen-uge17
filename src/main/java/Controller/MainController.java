package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Player;
import Model.Riddle;
import View.View;

public class MainController {
    Scanner ms;
    View view;
    ArrayList<Riddle> riddles;
    ArrayList<Player> players;
    RiddleHandler rH;


    public MainController(View view, RiddleHandler riddleHandler) {
        ms = new Scanner(System.in);
        rH = new RiddleHandler();
       riddles = new ArrayList<Riddle>();
        players = new ArrayList<Player>();
       riddles = rH.getAllRiddles();
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
                    boolean solved = false;
                    Riddle tmpRiddle = null;
                    // TODO: implement getRiddleByLevel or Category
                    Riddle toSolve = riddles.get(0);
                    Player player = players.get(0);
                    String riddleFeedBack = "";
                    riddleFeedBack = view.riddleSolve(toSolve,player);
                    solved = rH.solveRiddle(toSolve,riddleFeedBack, player);
                    if (solved) {
                        System.out.println("You made it");
                        rH.updateRiddleSolve(toSolve, riddleFeedBack,player);
                    } else {
                        System.out.println("Damn fool you are");
                    }
                    break;
            }
        }
    }


}

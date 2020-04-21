package View;

import Model.Player;
import Model.Riddle;
import java.util.Scanner;

public class View {
    Scanner ms = new Scanner(System.in);

    public void printMainNavi() {
        System.out.println("Vælg én af flg");
        System.out.println("1) løse gåden");
        System.out.println("2) forlad rum");
        System.out.println("9) slut spil");
    }
    public String riddleSolve(Riddle riddle, Player player) {
        String answer = "";
        System.out.println(riddle.getMessage());
        answer = ms.nextLine();
        return answer;
    }
    public void printRiddleSolve() {
        System.out.println("Vælg én af flg");
        System.out.println("1) løse gåden");
        System.out.println("2) forlad rum");
        System.out.println("9) slut spil");
    }
}

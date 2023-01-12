import java.util.*;
import java.util.Random;

public class SnakeGunWaterGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int chance = 3;
        int noOfChance = 0;

        System.out.println("******************   Wellcome To Snake Water Gun Game by -Aakash   ************");

        while (noOfChance < chance) {
            System.out.println("s -Snake");
            System.out.println("w -Water");
            System.out.println("g -Gun");

            String[] swg = {"s", "w", "g"};
            String comMove = swg[new Random().nextInt(swg.length)];
            String plyMove;
            while (true) {

                System.out.print("Please Enter Your Move: ");
                plyMove = sc.nextLine();

                if (plyMove.equals("s") || plyMove.equals("w") || plyMove.equals("g")) {
                    break;
                }
                System.out.println(plyMove + " is a not invalid :( ");
            }
            System.out.println("------ Computer Choice is : " + comMove+" ----------");

            if (plyMove.equals(comMove)) {
                System.out.println("----- The game was a tai :| ------");
            } else if (plyMove.equals("s")) {
                if (comMove.equals("w")) {
                    System.out.println("----- You Won :) ----- ");
                } else if (comMove.equals("g")) {
                    System.out.println("----- You Lose :( ----- ");
                }
            } else if (plyMove.equals("w")) {
                if (comMove.equals("g")) {
                    System.out.println("----- You Won :) ----- ");
                } else if (comMove.equals("s")) {
                    System.out.println("----- You Lose :( ----- ");
                }
            } else if (plyMove.equals("g")) {
                if (comMove.equals("s")) {
                    System.out.println("----- You Won :) ----- ");
                } else if (comMove.equals("w")) {
                    System.out.println("----- You Lose :( ----- ");
                }
            }
            noOfChance =noOfChance+1;
            System.out.println("**********************************");
            System.out.println(chance - noOfChance +" Left out of "+chance);
            System.out.println("**********************************");
            System.out.println();
        }
    }
}

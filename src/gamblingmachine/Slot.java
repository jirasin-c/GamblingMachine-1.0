/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamblingmachine;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author qbrickzx
 */
public class Slot {

    public static void playSlot() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insert coins: ");
        Player.coins = sc1.nextInt();
        for (; Player.coins > 1;) {
            Player.coins--;
            int[] jackpot = new int[3];
            jackpot[0] = ((int) (Math.random() * 3) + 1);
            jackpot[1] = ((int) (Math.random() * 3) + 1);
            jackpot[2] = ((int) (Math.random() * 3) + 1);
            if (jackpot[0] == jackpot[1] && jackpot[1] == jackpot[2]) {
                System.out.println(Arrays.toString(jackpot));
                System.out.println("Congratulations!! You've won");
                Player.coins += 10;
                System.out.println("Your coins: " + Player.coins);
            } else {
                System.out.println(Arrays.toString(jackpot));
                System.out.println("Sorry, better luck next time!!");
                System.out.println("Your coins: " + Player.coins);
            }

            System.out.println("Choose 0 to WITHDRAW, 1 to play again");
            Scanner sc2 = new Scanner(System.in);
            int select = sc2.nextInt();
            while(select != 0 && select != 1)
            {
                System.out.println("Invalid input!!");
                System.out.println("Choose 0 to WITHDRAW, 1 to play again");
                select = sc2.nextInt();
            }
            switch (select) {
                case 0:
                    System.out.println("Congrats!! Your coins is: " + Player.coins);
                    GamePlay.menu();
                    return;
                case 1:
                    break;
                default:
                    System.out.println("--Invalid input-- : Try again");
                    
            }
        }
        System.out.println("Your coins is run out!!!");
        System.out.println("Choose 0 to EXIT, 1 to play again");
        Scanner sc3 = new Scanner(System.in);
        int select = sc3.nextInt();
        while(select != 0 && select != 1){
            System.out.println("Invalid input!!");
            System.out.println("Choose 0 to EXIT, 1 to play again");
            select = sc3.nextInt();
        }
        switch (select) {
            case 0:
                GamePlay.menu();
                return;
            case 1:
                Slot.playSlot();
                return;
            default:
                System.out.println("--Invalid input-- : Try again");
        }
    }
}

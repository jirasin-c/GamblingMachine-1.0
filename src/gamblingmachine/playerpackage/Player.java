/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamblingmachine.playerpackage;

/**
 *
 * @author qbrickzx
 */
public class Player {
    public static String name = "";
    public static int id;
    public static int coins;
    
    public Player(String name, int id, int coins){
        this.name = name;
        this.id = id;
        this.coins = coins;
    }
}

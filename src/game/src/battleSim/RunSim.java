/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.src.battleSim;
import java.util.ArrayList;

import game.src.entities.*;



/**
 *
 * @author Jason
 */
public class RunSim {
    
    public static void main(String args[])
    {
    	//Creates Array and populates
        ArrayList<Base> entities = new ArrayList<Base>();
        entities.add(new Player(10,12,10,4,9,5,9,5,1,2));
        System.out.println("Player created");
        
        entities.add(new Enemy(20,2,2,2));
        System.out.println("Enemy 1 created");
        
        entities.add(new Enemy(30,2,2,2));
        System.out.println("Enemy 2 created");
        
        System.out.println("Starting Battle");
        
        Battle battle = new Battle(entities);
        
        battle.start();
    }
}

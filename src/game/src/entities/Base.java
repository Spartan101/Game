/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.src.entities;
import game.src.actions.CombatAction;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 * This class defines a Base Entity
 * 
 * TODO: javadoc this stuff
 *
 * @author Jason
 */
public abstract class Base {
    
    protected int hp;
    protected String name;
    protected int def;
    protected int agility;
    protected int weaponStr;
    protected ArrayList<Base> entities;
    
    public void setEntities(ArrayList<Base> entities) {
		this.entities = entities;
	}

	public CombatAction action(){
    	return null;
    }
    
    public int getHp()
    {
        return hp;
    }
    
    public int attack()
    {
        return (weaponStr);
    }
    public void takeDamage(int dmg)
    {
        Random random = new Random();
        int chance = random.nextInt(100);
        //System.out.println(chance);
        //System.out.println(agility);
        //System.out.println(agility*10);
        if(chance>=95)
        {
            JOptionPane.showMessageDialog(null,"CRITICAL HIT!!");
            hp -= dmg*3;
        }
        else if(chance>= (agility*10))
        {
            //System.out.println(dmg/def);
            hp -= (dmg/def);
        }
        else
        {
            System.out.println("Miss\n");
        }
    }

	public String getName() {
		return name;
	}
}

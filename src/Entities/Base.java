/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class Base {
    
    protected int HP;
    protected int def;
    protected int agility;
    protected int weaponStr;
    
    public int getHp()
    {
        return HP;
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
            HP -= dmg*3;
        }
        else if(chance>= (agility*10))
        {
            //System.out.println(dmg/def);
            HP -= (dmg/def);
        }
        else
        {
            System.out.println("Miss\n");
        }
    }
}

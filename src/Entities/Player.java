/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Jason
 */
public class Player extends Base {
    
    private int HP;
    private int TP;
    
    private int logic;
    private int techSavey;
    private int PA;
    private int senceOfDirection;
    private int security;
    private int agility;
    
    private int compStr=6;
    private int weaponStr=5;
    private int bombStr=8;
    
//    private Major prog;
//    private Major sec;
//    private Major games;

        
    public Player(int HP,int TP,int logic,int techSavey,int programmingAbility,int senceOfDirection,
                            int security,int agility,int major1,int major2)
    {
        this.HP = HP;
        this.TP = TP;
        this.logic = logic;
        this.techSavey = techSavey;
        this.PA = programmingAbility;
        this.senceOfDirection = senceOfDirection;
        this.security = security;
        this.agility = agility;
        
//        switch(major1)
//        {
//            case 1: 
//                //prog = new Major(1);
//                break;
//            case 2:
//                //sec = new Major(2);
//                break;
//            case 3:
//                //games = new Major(3);
//                break;
//        }
    }
    public int getHp()
    {
        return HP;
    }
    public void setHp(int hp)
    {
        this.HP = hp;
    }
    public int getTp()
    {
        return TP;
    }
    public void setTp(int tp)
    {
        this.TP = tp;
    }
    
    public int getLogic()
    {
        return logic;
    }
    public int getTechSavey()
    {
        return techSavey;
    }
    public int getPA()
    {
        return PA;
    }
    public int getSOD()
    {
        return senceOfDirection;
    }
    public int getSecurity()
    {
        return security;
    }
    public int getAgility()
    {
        return agility;
    }
    
    public int basicAttack()
    {
        return weaponStr;
    }
    
    /**
     * @param dmg 
     * Randomizes to hit chance
     * If >= 95 Critical hit
     * 
     * If chance is greater than players agility (to dodge)
     * then does damage based on how techsavy the player is and armor
     * (armor not encorperated yet
     * 
     * If chance is lower than agility then attack misses
     */
    public void takeDamage(int dmg)
    {
        Random random = new Random();
        int chance = random.nextInt(100);
        if(chance >= 95)
        {
            JOptionPane.showMessageDialog(null,"CRITICAL HIT!!");
            HP -= dmg * 3;
        }
        else if(chance >= (this.agility*10))
        {
            if((dmg/this.techSavey)<=0)
                this.HP -= 1;
            else
                this.HP -= dmg/this.techSavey;
        }
        else
            System.out.println("Miss\n");
    }
    
    public int attack(int num)
    {
        switch (num)
        {
            case 1: num = basicAttack();
                break;
            case 2: num = reprogram();
                break;
            case 3: num = binaryBlade();
                break;
            case 4: num = logicBomb();
                break;
            case 5: num = rootKit();
                break;
        }
        return num; 
    }
    /**
     *  Programming Attack code
     */
    public int reprogram()
    {
        return (compStr * PA);
    }
    public int binaryBlade()
    {
        //cost = 2TP
        System.out.println("Binary Blade");
        TP -= 2;
        return (weaponStr * PA);
    }
    
    /**
     *  Security Attack Code
     */
    public int logicBomb()
    {
        return (bombStr * security);
    }
    public int rootKit()
    {
        return(compStr * security);
    }
}

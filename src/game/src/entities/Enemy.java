/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.src.entities;
import java.util.Random;
/**
 * This entity is a generic enemy
 * @author Jason
 */
public class Enemy extends Base{
    
    public Enemy(int hp, int def, int agility, int weaponStr)
    {
        this.HP = hp;
        this.def = def;
        this.agility =  agility;
        this.weaponStr = weaponStr;
    }
    
    
}

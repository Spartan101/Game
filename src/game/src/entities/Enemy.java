/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.src.entities;
import game.src.actions.*;

import java.util.Random;
/**
 * This entity is a generic enemy
 * @author Jason
 */
public class Enemy extends Base{
    
    public Enemy(int hp, int def, int agility, int weaponStr, String name)
    {
        this.hp = hp;
        this.def = def;
        this.agility =  agility;
        this.weaponStr = weaponStr;
        this.name = name;
    }
    
    @Override
	public CombatAction action() {
		return new BasicAttackAction(this, entities.get(0));
	}
    
}

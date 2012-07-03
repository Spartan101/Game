package game.src.battleSim;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import game.src.actions.CombatAction;
import game.src.entities.*;




/**
 * This class handles most basic combat functions
 * @author Funkballs
 *
 */
public class Battle 
{
	//a list of enitities involved in combat
	private ArrayList<Base> entities;
	
	//the enitity who's turn it is
	private int currentEntity;
	
	//the graphics object to tell what to draw on the screen
	private CombatGUI gui;
	
	
	/**
	 * constructor for a battle contains a list of entities that will be involved
	 * 
	 * @param entities
	 */
	public Battle(ArrayList<Base> entities) 
	{
		this.entities = entities;
		
		//give each entity a list of all entities in the game...
		//maybe passing them the battle object would be better?
		//maybe there's some correct way of doing this I'd know if I did Game Design.
		for (Base base : entities) {
			base.setEntities(entities);
		}
		currentEntity = 0;
	}

	/**
	 * This function starts a battle and will launch the first turn
	 */
	public void start() 
	{
		gui = new CombatGUI(this);	
		
		//death handling should go here
		while (true){
			nextTurn();
		}
	}
	
	/**
	 * This function performs the actions of the entity who's turn it is
	 */
	public void nextTurn()
	{
		//TODO: change action handling code to allow multiple actions per entity
		
		CombatAction action = entities.get(currentEntity).action(); //throws null pointer because no entities have actions yet.
		action.use();
		System.out.println(action.description());
		
		//TODO: change menu handling... this is bad
		gui.showMenu(action.menuPanel());
		
		//complete the turn
		currentEntity++;
		if (currentEntity >= entities.size()){
			currentEntity = 0;
		}
	}
	
	
	public void attack(int targetEntity, int sourceEntity)
    {
		//TODO: rewrite attack events
		System.out.println("Player Attacks!");

//        int i = Integer.parseInt(JOptionPane.showInputDialog("Which enemy?"));
//        
//        Enemy grunt = enemies.get(i);
//        JOptionPane.showMessageDialog(null,"attacking now");
//        int dmg=0;
//        dmg=spartan101.attack(atknum);
//        JOptionPane.showMessageDialog(null,"attack code successful\nAttacking with " + dmg + " damage");
//    
//        JOptionPane.showMessageDialog(null,"Grunt HP before attack\n" + grunt.getHp());
//        grunt.takeDamage(dmg);
//        JOptionPane.showMessageDialog(null,"Grunt HP after attack\n" + grunt.getHp());
//        update();
//        JOptionPane.showMessageDialog(null,"damaged code successful");
//        hpCheck(grunt);
    }
    public void enemyAttack()
    {
    	//TODO: remove this method
//        for(int i=0;i<enemies.size();i++)
//        {
//            JOptionPane.showMessageDialog(null,"enemy attacking");
//            int dmg=0;
//           // dmg = enemies[i].
//            Enemy grunt = enemies.get(i);
//            dmg = grunt.attack();
//            JOptionPane.showMessageDialog(null,"attack code successful\nAttacking with " + dmg + " damage");
//        
//            JOptionPane.showMessageDialog(null,"Player HP before attack\n" + spartan101.getHp());
//            spartan101.takeDamage(dmg);
//            JOptionPane.showMessageDialog(null,"Player HP after attack\n" + spartan101.getHp());
//            update();
//            JOptionPane.showMessageDialog(null,"damaged code successful");
//            hpCheck(spartan101);
//        }
    }
    
    
    /**
     * This method makes sure everyone is alive and handles death.
     * It should probably be in the main turn loop
     * @param entity
     */
    public void hpCheck(Base entity)
    {
        if(entity.getHp()<=0)
        {
            //Take out of combat
            if(entity instanceof Player)
            {
                JOptionPane.showMessageDialog(null,"Defeat");
               System.exit(0);
            }
//            else if (entity==enemies.get(0))
//            {
//                JOptionPane.showMessageDialog(null,"Victory");
//                System.exit(0);
//            }
//            else if (entity==enemies.get(1))
//            {
//                JOptionPane.showMessageDialog(null,"Victory");
//                System.exit(0);
//            }
            else
            {
                for(int i=0;i< entities.size();i++)
                {
                    Base grunt = entities.get(i);
                    if(entity==grunt)
                    {
                        if(entities.size()<=1)
                        {
                            JOptionPane.showMessageDialog(null,"Enemy Killed");
                            JOptionPane.showMessageDialog(null,"Victory!!!");
                            System.exit(0);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Enemy Killed");
                            JOptionPane.showMessageDialog(null,entities.size());
                            entities.remove(i);
                            JOptionPane.showMessageDialog(null,entities.size());
                        }
                    }
                }
            }
        }
    }
}

package game.src.actions;

import game.src.gfx.menus.PlayerMenu;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 * This Interface defines what an entities action is and how to implement it
 *  
 * @author Funkballs
 *
 */
public interface CombatAction {
	/**
	 * This performs the entities action
	 */
	public void use();
	
	
	/**
	 * This returns a description of the action
	 * 
	 * @return description
	 */
	public String description();
	
	
	/**
	 * This retrieves graphics to be placed in the menuPanel area
	 * 
	 * @return
	 */
	public PlayerMenu menuPanel();
	
	
	/**
	 * This retrieves graphics to be placed in the GFXPanel area
	 * TODO: gfx panel doesn't exist
	 * 
	 * @return
	 */
	public JPanel GFXPanel();	
}

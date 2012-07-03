package game.src.actions;

import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import game.src.gfx.menus.*;
import game.src.entities.Base;


/**
 * This Class is broken
 * It's meant to be an action that triggers the player menu
 * 
 * It should be replaced with some simple returns and wait for input.
 * 
 * Menu options and the like should be defined in their respective classes
 * 
 * @author Funkballs
 *
 */
public class PlayerMenuAction implements CombatAction {
	
	public PlayerMenuAction (Base player) {
		
	}
	
	@Override
	public void use() {
		
		// TODO Auto-generated method stub

	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "A Wild Menu Appears!";
	}

	@Override
	public PlayerMenu menuPanel() {
		return null;
	}

	@Override
	public JPanel GFXPanel() {
		// TODO Auto-generated method stub
		return null;
	}

}

package game.src.gfx.menus;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JLayeredPane;

/**
 * This is a menu that has a bunch of options in it
 * maybe add a scrollpane to this at some point for if it gets too many options?
 * 
 * @author Funkballs
 *
 */
public class PlayerMenu extends JLayeredPane{
	private ArrayList<MenuOption> options = new ArrayList<MenuOption>();
	
	/**
	 * the constructor accepts an ArrayList of MenuOption objects that it will use to populate the menu
	 * @param options
	 */
	public PlayerMenu (ArrayList<MenuOption> options){
		this.options = options;
		for (MenuOption menuOption : options) {
			add(menuOption);
		}
	};
	
	
}

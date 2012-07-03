package game.src.gfx.menus;

import game.src.battleSim.Battle;

import javax.swing.JButton;


/**
 * This Abstract class defines what it is to be a menu option
 * 
 * Right now it's just a JButton but could be more later. 
 * It acts like an interface to allow each option to be defined in it's own class 
 * to save the gui from getting too cluttered
 * 
 * @author Funkballs
 *
 */
public abstract class MenuOption extends JButton{
}

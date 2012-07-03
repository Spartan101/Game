package game.src.actions;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import game.src.entities.Base;
import game.src.gfx.menus.PlayerMenu;

/**
 * This action performs a basic attack
 * 
 * @author Funkballs
 *
 */
public class BasicAttackAction implements CombatAction {
	
	
	/**
	 * The constructor accepts the source and target entities for the attack
	 * 
	 * @param source
	 * @param target
	 */
	public BasicAttackAction (Base source, Base target) {
		
	}
	
	@Override
	public void use() {
		//TODO: rewrite attack event
		System.out.println("Player Attacks!");

//		int i = Integer.parseInt(JOptionPane.showInputDialog("Which enemy?"));
//		        
//		Enemy grunt = enemies.get(i);
//		JOptionPane.showMessageDialog(null,"attacking now");
//		int dmg=0;
//		dmg=spartan101.attack(atknum);
//		JOptionPane.showMessageDialog(null,"attack code successful\nAttacking with " + dmg + " damage");
		//    
//		JOptionPane.showMessageDialog(null,"Grunt HP before attack\n" + grunt.getHp());
//		grunt.takeDamage(dmg);
//		JOptionPane.showMessageDialog(null,"Grunt HP after attack\n" + grunt.getHp());
//		update();
//		JOptionPane.showMessageDialog(null,"damaged code successful");
//		hpCheck(grunt);

	}

	/* (non-Javadoc)
	 * @see game.src.actions.CombatAction#description()
	 */
	@Override
	public String description() {
		return "A mighty Blow!";
	}

	/* (non-Javadoc)
	 * @see game.src.actions.CombatAction#menuPanel()
	 */
	@Override
	public PlayerMenu menuPanel() {
		// TODO add attack message to menu panel maybe?
		return null;
	}

	/* (non-Javadoc)
	 * @see game.src.actions.CombatAction#GFXPanel()
	 */
	@Override
	public JPanel GFXPanel() {
		// TODO Add Graphics...... long ways off
		return null;
	}

}

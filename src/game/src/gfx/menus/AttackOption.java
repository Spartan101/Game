package game.src.gfx.menus;

import game.src.battleSim.Battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * This is the button that you click to attack
 * 
 * TODO: sort out event handling and listeners
 * 
 * @author Funkballs
 *
 */
public class AttackOption extends MenuOption {
	

	public AttackOption() {
		this.setText("Attack");
		this.addActionListener(new ButtonListener());
		this.setBounds(10, 10, 150, 23);
	}
	
	private void basicAttackActionPerformed(ActionEvent evt) {
		//TODO: change attack handling
		int i = Integer.parseInt(JOptionPane.showInputDialog("Which enemy?"));  
		JOptionPane.showMessageDialog(null,"attacking now");
		
		
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(java.awt.event.ActionEvent evt) {
	        basicAttackActionPerformed(evt);
		}
		
	}

}
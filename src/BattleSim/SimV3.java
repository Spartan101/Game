/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Simulatino.java
 * 
 * While this file contains alot of creationg code, this will be eventually pased into it
 * Created on 03/11/2011, 7:03:14 PM
 */
package BattleSim;
import Entities.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author Jason
 */
public class SimV3 extends javax.swing.JFrame {
//private Player spartan101;
//private ArrayList<Enemy> enemies;
  private ArrayList<Base> entities;

    /** Creates new form RunSim */
    public SimV3() {
        //spartan101 = new Player(10,12,10,4,9,5,9,5,1,2);

        //Creates Array and populates
        entities = new ArrayList<Base>();
        entities.add(new Player(10,12,10,4,9,5,9,5,1,2));
        JOptionPane.showMessageDialog(null,"Player created");
        
        entities.add(new Enemy(20,2,2,2));
        entities.add(new Enemy(30,2,2,2));
        JOptionPane.showMessageDialog(null,"Enemy created");
        /* Create and display the form */
        initComponents();
        setup();
        update();
        
        setVisible(true);
        JOptionPane.showMessageDialog(null,"Battle Start");
        mainMenu.setVisible(true);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new Simulator().setVisible(true);
//            }
//        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        hpFeildPlayer = new javax.swing.JTextField();
        hpLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hpFeildEnemy = new javax.swing.JTextField();
        tpLabel = new javax.swing.JLabel();
        tpFeild = new javax.swing.JTextField();
        mainMenu = new javax.swing.JLayeredPane();
        basicAttack = new javax.swing.JButton();
        specialAttack = new javax.swing.JButton();
        specialMenu = new javax.swing.JLayeredPane();
        bBlade = new javax.swing.JButton();
        specialBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        test = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hpFeildPlayer.setEditable(false);
        hpFeildPlayer.setText("10");

        hpLabel.setText("HP:");

        name.setText("Spartan101");

        jLabel1.setText("Grunt");

        hpFeildEnemy.setEditable(false);
        hpFeildEnemy.setText("10");

        tpLabel.setText("TP:");

        tpFeild.setEditable(false);
        tpFeild.setText("10");

        basicAttack.setText("Attack");
        basicAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicAttackActionPerformed(evt);
            }
        });
        basicAttack.setBounds(10, 10, 150, 23);
        mainMenu.add(basicAttack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        specialAttack.setText("Special Attack");
        specialAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialAttackActionPerformed(evt);
            }
        });
        specialAttack.setBounds(10, 40, 150, 23);
        mainMenu.add(specialAttack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bBlade.setText("Binary Blade");
        bBlade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBladeActionPerformed(evt);
            }
        });
        bBlade.setBounds(10, 10, 140, 23);
        specialMenu.add(bBlade, javax.swing.JLayeredPane.DEFAULT_LAYER);

        specialBack.setText("Back");
        specialBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialBackActionPerformed(evt);
            }
        });
        specialBack.setBounds(10, 40, 140, 23);
        specialMenu.add(specialBack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("HP:");

        test.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jSeparator1)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tpLabel, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(hpLabel)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tpFeild, 0, 1, Short.MAX_VALUE)
                                .addComponent(hpFeildPlayer))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(556, 556, 556)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(hpFeildEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(specialMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(276, 276, 276)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpLabel)
                    .addComponent(hpFeildPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpLabel)
                    .addComponent(tpFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpFeildEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specialMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainMenu))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void basicAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicAttackActionPerformed
    playerAttack(1);
    enemyAttack();
}//GEN-LAST:event_basicAttackActionPerformed

private void bBladeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBladeActionPerformed
// TODO add your handling code here:
    specialMenu.setVisible(false);
    mainMenu.setVisible(true);
    playerAttack(3);
    enemyAttack();
}//GEN-LAST:event_bBladeActionPerformed

private void specialAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialAttackActionPerformed
    mainMenu.setVisible(false);
    specialMenu.setVisible(true);
}//GEN-LAST:event_specialAttackActionPerformed

private void specialBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialBackActionPerformed
    specialMenu.setVisible(false);
    mainMenu.setVisible(true);
}//GEN-LAST:event_specialBackActionPerformed

    /**
     * @param args the command line arguments
     */
    private void setup()
    {
        mainMenu.setVisible(false);
        specialMenu.setVisible(false);
    }
    private void update()
    {
        Base entity = entities.get(0);
        hpFeildPlayer.setText(String.valueOf(entity.getHp()));
        tpFeild.setText(String.valueOf(entity.getTp()));
        Base grunt = entities.get(1);
        hpFeildEnemy.setText(String.valueOf(grunt.getHp()));
        grunt = entities.get(2);
        test.setText(String.valueOf(grunt.getHp()));
        
    }
    private void playerAttack(int atknum)
    {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Which enemy?"));
        
        Enemy grunt = enemies.get(i);
        JOptionPane.showMessageDialog(null,"attacking now");
        int dmg=0;
        dmg=spartan101.attack(atknum);
        JOptionPane.showMessageDialog(null,"attack code successful\nAttacking with " + dmg + " damage");
    
        JOptionPane.showMessageDialog(null,"Grunt HP before attack\n" + grunt.getHp());
        grunt.takeDamage(dmg);
        JOptionPane.showMessageDialog(null,"Grunt HP after attack\n" + grunt.getHp());
        update();
        JOptionPane.showMessageDialog(null,"damaged code successful");
        hpCheck(grunt);
    }
    private void enemyAttack()
    {
        for(int i=0;i<enemies.size();i++)
        {
            JOptionPane.showMessageDialog(null,"enemy attacking");
            int dmg=0;
           // dmg = enemies[i].
            Enemy grunt = enemies.get(i);
            dmg = grunt.attack();
            JOptionPane.showMessageDialog(null,"attack code successful\nAttacking with " + dmg + " damage");
        
            JOptionPane.showMessageDialog(null,"Player HP before attack\n" + spartan101.getHp());
            spartan101.takeDamage(dmg);
            JOptionPane.showMessageDialog(null,"Player HP after attack\n" + spartan101.getHp());
            update();
            JOptionPane.showMessageDialog(null,"damaged code successful");
            hpCheck(spartan101);
        }
    }
    private void hpCheck(Base entity)
    {
        if(entity.getHp()<=0)
        {
            //Take out of combat
            if(entity==spartan101)
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
                for(int i=0;i<enemies.size();i++)
                {
                    Enemy grunt = enemies.get(i);
                    if(entity==grunt)
                    {
                        if(enemies.size()<=1)
                        {
                            JOptionPane.showMessageDialog(null,"Enemy Killed");
                            JOptionPane.showMessageDialog(null,"Victory!!!");
                            System.exit(0);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Enemy Killed");
                            JOptionPane.showMessageDialog(null,enemies.size());
                            enemies.remove(i);
                            JOptionPane.showMessageDialog(null,enemies.size());
                        }
                    }
                }
                
                
                
                
//                JOptionPane.showMessageDialog(null,"Error");
//                System.exit(1);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBlade;
    private javax.swing.JButton basicAttack;
    private javax.swing.JTextField hpFeildEnemy;
    private javax.swing.JTextField hpFeildPlayer;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLayeredPane mainMenu;
    private javax.swing.JLabel name;
    private javax.swing.JButton specialAttack;
    private javax.swing.JButton specialBack;
    private javax.swing.JLayeredPane specialMenu;
    private javax.swing.JTextField test;
    private javax.swing.JTextField tpFeild;
    private javax.swing.JLabel tpLabel;
    // End of variables declaration//GEN-END:variables
}

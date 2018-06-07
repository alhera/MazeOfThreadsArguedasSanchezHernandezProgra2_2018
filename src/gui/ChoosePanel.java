/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.applet.AudioClip;
import java.io.FileNotFoundException;
import javafx.scene.canvas.GraphicsContext;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class ChoosePanel extends javax.swing.JFrame {

    
    public ChoosePanel() throws FileNotFoundException {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(jrbHard);
        grupoDeBotones.add(jrbnormal);
        grupoDeBotones.add(jrbeasy);
        
       jrbWolf.setVisible(false);
       lblWolf.setVisible(false);
       lblNinja.setVisible(false);
       jrbNinja.setVisible(false);
       lblback.setEnabled(false);
       jrbTroll.setVisible(false);
       lblfurious.setVisible(false);
       lblTroll.setVisible(false);
       jsNinja.setVisible(false);
       jsTroll.setVisible(false);
       jsWolf.setVisible(false);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jrbHard = new javax.swing.JRadioButton();
        lblhard = new javax.swing.JLabel();
        lblnormal = new javax.swing.JLabel();
        jrbnormal = new javax.swing.JRadioButton();
        lbleasy = new javax.swing.JLabel();
        jrbeasy = new javax.swing.JRadioButton();
        play = new javax.swing.JLabel();
        lblback = new javax.swing.JLabel();
        lblnext = new javax.swing.JLabel();
        lblWolf = new javax.swing.JLabel();
        jrbWolf = new javax.swing.JRadioButton();
        lblNinja = new javax.swing.JLabel();
        jrbNinja = new javax.swing.JRadioButton();
        lblfast = new javax.swing.JLabel();
        lblSmart = new javax.swing.JLabel();
        lblTroll = new javax.swing.JLabel();
        jrbTroll = new javax.swing.JRadioButton();
        lblfurious = new javax.swing.JLabel();
        jsWolf = new javax.swing.JSpinner();
        jsNinja = new javax.swing.JSpinner();
        jsTroll = new javax.swing.JSpinner();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Settings");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 460, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 92, 1390, 10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Choose a difficult: ");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 120, 230, 50);

        jrbHard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbHard.setForeground(new java.awt.Color(255, 153, 0));
        jrbHard.setText("Hard");
        jrbHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHardActionPerformed(evt);
            }
        });
        getContentPane().add(jrbHard);
        jrbHard.setBounds(260, 380, 90, 23);

        lblhard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hard.png"))); // NOI18N
        getContentPane().add(lblhard);
        lblhard.setBounds(190, 200, 223, 160);

        lblnormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normal.png"))); // NOI18N
        getContentPane().add(lblnormal);
        lblnormal.setBounds(500, 210, 250, 150);

        jrbnormal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbnormal.setForeground(new java.awt.Color(255, 153, 0));
        jrbnormal.setText("Normal");
        getContentPane().add(jrbnormal);
        jrbnormal.setBounds(570, 380, 90, 23);

        lbleasy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/easy.png"))); // NOI18N
        getContentPane().add(lbleasy);
        lbleasy.setBounds(820, 210, 240, 148);

        jrbeasy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbeasy.setForeground(new java.awt.Color(255, 153, 0));
        jrbeasy.setText("Easy");
        getContentPane().add(jrbeasy);
        jrbeasy.setBounds(890, 380, 90, 23);

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/game.png"))); // NOI18N
        play.setToolTipText("Play");
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(1210, 600, 110, 100);

        lblback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        lblback.setToolTipText("back");
        lblback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackMouseClicked(evt);
            }
        });
        getContentPane().add(lblback);
        lblback.setBounds(100, 490, 50, 50);

        lblnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/next.png"))); // NOI18N
        lblnext.setToolTipText("next");
        lblnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblnextMouseClicked(evt);
            }
        });
        getContentPane().add(lblnext);
        lblnext.setBounds(1140, 510, 50, 50);

        lblWolf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/picasion.com_c28c0954b76ecb4b54aaf254f48ff09d.gif"))); // NOI18N
        getContentPane().add(lblWolf);
        lblWolf.setBounds(240, 290, 140, 70);

        jrbWolf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbWolf.setForeground(new java.awt.Color(255, 153, 0));
        jrbWolf.setText("Wolf");
        jrbWolf.setToolTipText("");
        getContentPane().add(jrbWolf);
        jrbWolf.setBounds(260, 380, 90, 23);

        lblNinja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/terrorista.gif"))); // NOI18N
        getContentPane().add(lblNinja);
        lblNinja.setBounds(590, 270, 50, 100);

        jrbNinja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbNinja.setForeground(new java.awt.Color(255, 153, 0));
        jrbNinja.setText("Ninja");
        getContentPane().add(jrbNinja);
        jrbNinja.setBounds(570, 380, 55, 23);

        lblfast.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        lblfast.setForeground(new java.awt.Color(255, 0, 0));
        lblfast.setText("Fast");
        getContentPane().add(lblfast);
        lblfast.setBounds(250, 210, 120, 30);

        lblSmart.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        lblSmart.setForeground(new java.awt.Color(255, 0, 0));
        lblSmart.setText("Smart");
        getContentPane().add(lblSmart);
        lblSmart.setBounds(560, 200, 130, 50);

        lblTroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/troll.gif"))); // NOI18N
        getContentPane().add(lblTroll);
        lblTroll.setBounds(890, 250, 110, 110);

        jrbTroll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbTroll.setForeground(new java.awt.Color(255, 153, 0));
        jrbTroll.setText("Troll");
        getContentPane().add(jrbTroll);
        jrbTroll.setBounds(890, 380, 55, 25);

        lblfurious.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        lblfurious.setForeground(new java.awt.Color(255, 0, 0));
        lblfurious.setText("Furious");
        getContentPane().add(lblfurious);
        lblfurious.setBounds(870, 210, 120, 30);
        getContentPane().add(jsWolf);
        jsWolf.setBounds(360, 380, 40, 30);
        getContentPane().add(jsNinja);
        jsNinja.setBounds(670, 380, 40, 30);
        getContentPane().add(jsTroll);
        jsTroll.setBounds(990, 380, 40, 30);

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wall.jpg"))); // NOI18N
        getContentPane().add(lblfondo);
        lblfondo.setBounds(0, -20, 1410, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbHardActionPerformed

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
       if(!jrbWolf.isSelected() && !jrbNinja.isSelected() &&!jrbTroll.isSelected()){
           JOptionPane.showMessageDialog(null, "You must select a personage for play");
           
       }else if(!jrbHard.isSelected() && !jrbeasy.isSelected() && !jrbnormal.isSelected()){
           JOptionPane.showMessageDialog(null, "You must select a maze for play");
           
       }else{
           if (jrbHard.isSelected()) {
            WindowHard w = new WindowHard();
            w.setVisible(true);
        } else if (jrbnormal.isSelected()) {
            WindowNormal wn = new WindowNormal();
            wn.setVisible(true);
        }else{
             WindowEasy we = new WindowEasy();
             we.setVisible(true);
            
        }
             AudioClip sonido;
             sonido = java.applet.Applet.newAudioClip(getClass().getResource("/assets/Sonidos Pacman.wav"));
             sonido.play();
             this.dispose();
       }
    }//GEN-LAST:event_playMouseClicked

    private void lblnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnextMouseClicked
        jrbHard.setVisible(false);
        jrbeasy.setVisible(false);
        jrbnormal.setVisible(false);
        lbleasy.setVisible(false);
        lblhard.setVisible(false);
        lblnormal.setVisible(false);
        jrbWolf.setVisible(true);
        lblWolf.setVisible(true);
        lblNinja.setVisible(true);
        jrbNinja.setVisible(true);
        jrbTroll.setVisible(true);
        lblTroll.setVisible(true);
        lblfurious.setVisible(true);
        jsNinja.setVisible(true);
       jsTroll.setVisible(true);
       jsWolf.setVisible(true);
        lblnext.setEnabled(false);
        lblback.setEnabled(true);
    }//GEN-LAST:event_lblnextMouseClicked

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseClicked
        jrbHard.setVisible(true);
        jrbeasy.setVisible(true);
        jrbnormal.setVisible(true);
        lbleasy.setVisible(true);
        lblhard.setVisible(true);
        lblnormal.setVisible(true);
        jrbWolf.setVisible(false);
        lblWolf.setVisible(false);
        lblNinja.setVisible(false);
        jrbNinja.setVisible(false);
        jrbTroll.setVisible(false);
        lblTroll.setVisible(false);
        lblfurious.setVisible(false);
        jsNinja.setVisible(false);
        jsTroll.setVisible(false);
        jsWolf.setVisible(false);
        lblnext.setEnabled(true);
        lblback.setEnabled(false);
    }//GEN-LAST:event_lblbackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrbHard;
    private javax.swing.JRadioButton jrbNinja;
    private javax.swing.JRadioButton jrbTroll;
    private javax.swing.JRadioButton jrbWolf;
    private javax.swing.JRadioButton jrbeasy;
    private javax.swing.JRadioButton jrbnormal;
    private javax.swing.JSpinner jsNinja;
    private javax.swing.JSpinner jsTroll;
    private javax.swing.JSpinner jsWolf;
    private javax.swing.JLabel lblNinja;
    private javax.swing.JLabel lblSmart;
    private javax.swing.JLabel lblTroll;
    private javax.swing.JLabel lblWolf;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lbleasy;
    private javax.swing.JLabel lblfast;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblfurious;
    private javax.swing.JLabel lblhard;
    private javax.swing.JLabel lblnext;
    private javax.swing.JLabel lblnormal;
    private javax.swing.JLabel play;
    // End of variables declaration//GEN-END:variables
}

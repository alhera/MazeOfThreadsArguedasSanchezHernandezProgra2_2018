/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Maze;
import java.awt.Graphics;

/**
 *
 * @author Equipo
 */
public class HardMazePanel extends javax.swing.JPanel {

    Maze myMaze;

    public HardMazePanel() {
        initComponents();
        myMaze = Maze.getInstance();
        setLocation(200, 200);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int ancho = 40;
        int large = 40;
        for (int i = 0; i < myMaze.getHardMaze().length; i++) {
            for (int j = 0; j < myMaze.getHardMaze()[0].length; j++) {
                if (myMaze.getHardMaze()[i][j] == 1) {
                    g.fillRect(ancho * j, large * i, ancho, large);
                }
            }
        }
    } //fin metodo paintComponent

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

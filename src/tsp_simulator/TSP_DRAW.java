/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp_simulator;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author yangy
 */
public class TSP_DRAW extends JPanel  {
    
    TSP_DRAW(TSP_Simulator tsp, VPEArray vpea,JLabel [][]grid){
        tsp_s = tsp;
        vpea_s = vpea;
        squares = grid;
    }
      @Override
    public void paint(Graphics g){
        super.paint(g);
        System.out.println("paint1");
    }
     private JLabel squares[][];
     private TSP_Simulator tsp_s;
     private VPEArray vpea_s;
     
}

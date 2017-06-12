/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp_simulator;

/**
 * VPEArray - Simulates full 2D array of VPEs
 * @author nestorj
 */
public class VPEArray {
    
    public VPEArray(int width, int height){
        vpeArr = new VPE[height][width];
        vpaWidth = width;
        vpaHeight = height;
    }
    
    public VPE getVPE(int xPos, int yPos) {
        if (yPos<vpaHeight && xPos< vpaWidth){
            VPE vpe_target = vpeArr[yPos][xPos]; 
            return vpe_target; 
        }
        else{
            return null; //placeholder
        }
    }
    
    public int getWidth() {
      return vpaWidth;
    }
    
    public int getHeight() {
        return vpaHeight;
    }
    
    private int vpaWidth;
    private int vpaHeight;
    private  VPE[][] vpeArr;
}
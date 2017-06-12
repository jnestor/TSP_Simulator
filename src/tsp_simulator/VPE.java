/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp_simulator;

/**
 * Virtual Processing Element
 * @author nestorj
 */
public class VPE {
    
    public VPE(){
    }
   
    public VPE(VPEArray vpe_Array, int x, int y){
        vpa = vpe_Array;
        xPos = x;
        yPos = y;
    }
    public boolean update() {
        return false;
    }
    
    public boolean onLeftEdge() {
        return xPos == 0;
    }
    
    public boolean onRightEdge() {
        return xPos == (vpa.getWidth() - 1);
    }
    
    public boolean onTopEdge() {
        return yPos == 0;
    }
    
    public boolean onBottomEdge() {
        return yPos == (vpa.getHeight() - 1);
    }
    
    public int getStatus() {
        return -1; // placeholder
    }
    
    public VPE getWestNeighbor() {
        if (onLeftEdge()) return null;
        else return vpa.getVPE(xPos-1, yPos);
    }
    
    public VPE getNorthNeighbor() {
        if (onTopEdge()) return null;
        else return vpa.getVPE(xPos, yPos-1);
    }
    
    public VPE getEastNeighbor() {
        if (onRightEdge()) return null;
        else return vpa.getVPE(xPos+1, yPos);// placeholder
    }
    
    public VPE getSouthNeighbor() {
        if (onBottomEdge()) return null;
        else return vpa.getVPE(xPos, yPos+1); // placeholder
    }
    
    private VPEArray vpa;
    private int xPos;
    private int yPos;
}

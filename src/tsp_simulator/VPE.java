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
    
    //default constructor
    public VPE(){
    }
   
    //constructor 
    public VPE(VPEArray vpe_Array, int x, int y,int num){
        vpa = vpe_Array;
        xPos = x;
        yPos = y;
        state = num;
        next = 0;
    }
    public int getX(){
        return xPos;
    }
    
    public int getY(){
        return yPos;
    }
    
    public boolean update() {
        state = next;
        next = 0;
        System.out.println(state +" state");
        return state == 1;
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
        return state; // placeholder
    }
    
    public VPE getWestNeighbor() {
        if (onLeftEdge())return null;
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
    
    public VPE getNorthWestNeighbor(){
        if (onTopEdge()||onLeftEdge()) return null;
        else return vpa.getVPE(xPos-1, yPos-1);
    }
    
    public VPE getNorthEastNeighbor(){
        if (onTopEdge()||onRightEdge()) return null;
        else return vpa.getVPE(xPos+1, yPos-1);
    }
    
    public VPE getSouthWestNeighbor(){
        if(onBottomEdge()||onLeftEdge()) return null;
        else return vpa.getVPE(xPos-1, yPos+1);
    }
    
    public VPE getSouthEastNeighbor(){
        if(onBottomEdge()||onRightEdge()) return null;
        else return vpa.getVPE(xPos+1, yPos+1);
    }
            
    public void setState(int num){
        state = num;
    }
    
    public void setNext(int num){
        next = num;
    }
    
    public int getState(){
        return state;
    }
    
    private VPEArray vpa;
    private int xPos;
    private int yPos;
    private int state;
    private int next;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp_simulator;

import java.util.*;

/**
 *
 * @author nestorj
 */
public class TSP_Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TSP_Simulator tsp = new TSP_Simulator();
        VPEArray vpea = new VPEArray(5, 10);
        tsp.initialize(vpea);
        //repeat the simulation process for 10 times
        for(int i = 0; i < 10; i++){            
            tsp.simulate(vpea); 
            for (int j = 0; j < 10; j++) {
                System.out.println();
                for (int k = 0; k < 5; k++) {
                    System.out.print(" " + vpea.getVPE(k, j).getState());
                }
            }
            System.out.println();
        }  
    }

    public TSP_Simulator(){
        eval = new LinkedList<VPE> ();
        update = new LinkedList<VPE> ();
        stay = new LinkedList<VPE> ();
    }
//simulate method for Conway's game of life            
    public void simulate(VPEArray vpea) {
        for(int i = 0; i < eval.size(); i++){
            getEvalList(eval.get(i));
        }
        while (!eval.isEmpty()){
            VPE vpe_process = eval.poll();
            if (vpe_process.getState() == 0) {
                if (getNeighbors(vpe_process) == 3) {
                    vpe_process.setNext(1);
                    update.add(vpe_process);
                }
            } else if (vpe_process.getState() == 1) {
                int neighbor_num = getNeighbors(vpe_process);
                if (neighbor_num < 2 || neighbor_num > 3) {
                    vpe_process.setNext(0);
                    update.add(vpe_process);
                }
                else stay.add(vpe_process);
            }
        }
        updateArray();
    }

//generated  a VPE array with random VPEs 
    public void initialize(VPEArray vpea) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        int x;
        int y;
        for (int i = 0; i < 5; i++) {
            x = rand1.nextInt(3 * vpea.getWidth() / 4 - vpea.getWidth() / 4) + vpea.getWidth() / 4;
            y = rand2.nextInt(3 * vpea.getHeight() / 4 - vpea.getHeight() / 4) + vpea.getHeight() / 4;
            System.out.println("x" + x + "y" + y);
            VPE temp = new VPE(vpea, x, y, 1);
            if(firstinitialize(temp))   vpea.insertVPE(temp);  
        }
        for (int j = 0; j < 10; j++) {
            System.out.println();
            for (int i = 0; i < 5; i++) {
                if (vpea.getVPE(i, j) == null) {
                    VPE temp = new VPE(vpea, i, j, 0);
                    vpea.insertVPE(temp);
                }
                System.out.print(" " + vpea.getVPE(i, j).getState());
            }
        }
        System.out.println();
    }
//get eight neighbors for the given VPE and record the number of active neighbors  
    public int getNeighbors(VPE vpe_process) {
        VPE east = vpe_process.getEastNeighbor();
        VPE west = vpe_process.getWestNeighbor();
        VPE north = vpe_process.getNorthNeighbor();
        VPE south = vpe_process.getSouthNeighbor();
        VPE northeast = vpe_process.getNorthEastNeighbor();
        VPE northwest = vpe_process.getNorthWestNeighbor();
        VPE southwest = vpe_process.getSouthWestNeighbor();
        VPE southeast = vpe_process.getSouthEastNeighbor();
        int survive = 0;
        if (east != null && east.getState() == 1) survive++;
           // System.out.println("test survive east" +vpe_process.getX()+" "+vpe_process.getY()+" "+ survive);
        if (west != null && west.getState() == 1) survive++;
           // System.out.println("test survive west" +vpe_process.getX()+" "+vpe_process.getY()+" "+ survive);}
        if (north != null && north.getState() == 1) survive++;
           // System.out.println("test survive north" +vpe_process.getX()+" "+vpe_process.getY()+" "+survive);}
        if (south != null && south.getState() == 1) survive++;
           // System.out.println("test survive south" +vpe_process.getX()+" "+vpe_process.getY()+" "+ survive);}
        if (northeast != null && northeast.getState() == 1) survive++;
           // System.out.println("test survive northeast" +vpe_process.getX()+" "+vpe_process.getY()+" "+ survive);}
        if (northwest != null && northwest.getState() == 1) survive++;
           // System.out.println("test survive northwest" +vpe_process.getX()+" "+vpe_process.getY()+" "+ survive);}
        if (southeast != null && southeast.getState() == 1) survive++;
           // System.out.println("test survive southeast" +vpe_process.getX()+" "+vpe_process.getY()+" "+ survive);}
        if (southwest != null && southwest.getState() == 1) survive++;
          // System.out.println("test survive southwest" +vpe_process.getX()+" "+vpe_process.getY()+" "+ survive);}
        return survive;
    }

    public void getEvalList(VPE vpe_process) {
        VPE east1 = vpe_process.getEastNeighbor();
        VPE west1 = vpe_process.getWestNeighbor();
        VPE north1 = vpe_process.getNorthNeighbor();
        VPE south1 = vpe_process.getSouthNeighbor();
        VPE northeast1 = vpe_process.getNorthEastNeighbor();
        VPE northwest1 = vpe_process.getNorthWestNeighbor();
        VPE southwest1 = vpe_process.getSouthWestNeighbor();
        VPE southeast1 = vpe_process.getSouthEastNeighbor();
        testExist(east1);
        testExist(west1);
        testExist(north1);
        testExist(south1);
        testExist(northeast1);
        testExist(northwest1);
        testExist(southeast1);
        testExist(southwest1);                
    }
//test whether the VPEs already in the eval list, used to delete duplicate neighbors
    public boolean testExist(VPE vpe_test) {
        if (vpe_test != null) {
            for (int i = 0; i < eval.size(); i++) {
                if (eval.get(i).equals(vpe_test)) {
                    return false;
                }
            }
            eval.add(vpe_test);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean firstinitialize(VPE vpe_process){
        for(int i = 0; i < eval.size(); i++){
            if(vpe_process.getX()==eval.get(i).getX() && vpe_process.getY()==eval.get(i).getY()){
                return false;
            }
        }
        eval.add(vpe_process);
        return true;
    }

//update the state of VPE in update list, put the new items in eval for next turn and clear update list 
    public void updateArray(){
        for(int i = 0; i < update.size(); i++){
            boolean sign = update.get(i).update();
            if(sign)       eval.add(update.get(i));
        }
        for(int j = 0; j < stay.size(); j++){
            eval.add(stay.get(j));
        }
        update.clear();
        stay.clear();
    }
    
    private LinkedList<VPE> eval;
    private LinkedList<VPE> update;
    private LinkedList<VPE> stay;
}

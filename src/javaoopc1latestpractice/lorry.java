/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoopc1latestpractice;

/**
 *
 * @author Jamit
 */
public abstract class lorry implements vehicle{
    @Override
    public void wheels(){
        System.out.println("wheels = 2");
    }
    
    @Override
    public void seats (){
        System.out.println("Seats = 2");
    }
    
    public void doors(){
        System.out.println("Doors = 0");
    }
    
}

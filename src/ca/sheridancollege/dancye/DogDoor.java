/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.dancye;

/**
 * A class that models a simple dog door which can be in one of two states
 * Code originally taken from Head First Object Oriented Analysis and Design:
 * http://proquestcombo.safaribooksonline.com.library.sheridanc.on.ca/book/software-engineering-and-development/object/0596008678/firstchapter#X2ludGVybmFsX0h0bWxWaWV3P3htbGlkPTA1OTYwMDg2NzglMkZsZXRhcG9zdHJvcGhlc19zdGFydF93aXRoX3RoZV9kb2dfZG9vcl9odG1sJnF1ZXJ5PQ==
 * @modifiedBy Liz Dancy, 2019
 */
public class DogDoor {

    private boolean open;//represents the state of the door
            
    public DogDoor()
    {
        open = false;
    }
    
    /**
     * A method to check the status of the door
     * @return true if door is open, false otherwise
     */
    public boolean isOpen()
    {
        return open;
    }
    
    /**
     * A method that simulates opening the door
     */
    public void openDoor()
    {
        System.out.println("Door is opening...");
        open = true;
               
    }
    
    /**
     * A method that simulates closing the door
     */
    public void closeDoor()
    {
        System.out.println("Door is closing...");
        open = false;
    }
}

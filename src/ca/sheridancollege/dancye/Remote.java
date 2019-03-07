
package ca.sheridancollege.dancye;

/**
 * Code to simulate the remote control for the Dog Door. To be filled in durng class!
 * Code originally taken from Head First Object-Oriented Analysis and Design
 * http://proquestcombo.safaribooksonline.com.library.sheridanc.on.ca/book/software-engineering-and-development/object/0596008678/firstchapter#X2ludGVybmFsX0h0bWxWaWV3P3htbGlkPTA1OTYwMDg2NzglMkZsZXRhcG9zdHJvcGhlc19zdGFydF93aXRoX3RoZV9kb2dfZG9vcl9odG1sJnF1ZXJ5PQ==
 * @modifier dancye, 2019
 */
public class Remote 
{
    private  DogDoor door;
    
    public Remote(DogDoor givenDoor)
    {
        door = givenDoor;
    }
    
    /**
     * A method that presses the remote button to open or close the door
     * based on the current status of the door before pressing.
     */
    public void pressButton()
    {
        System.out.println("Pressing the remote control button...");
        if(door.isOpen()==true){
            
            door.closeDoor();
        }
       
       
        else
        {
            door.openDoor();
        
        }
    }
}
 
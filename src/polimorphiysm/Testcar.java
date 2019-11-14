/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphiysm;

/**
 *
 * @author Nurisa
 */

class vehicle{
    public void move () {
        System.out.println("Vehicles are used for moving from on place to another");
    }
}
class car extends vehicle {
    public void move () {
        super.move(); // invokes the super class method
        System.out.println("car is a good medium of transport");
    }
}

public class Testcar {
    public static void main(String[] args) {
        vehicle b = new car (); //Vehicle reference but Car object
        car object;
                b.move (); //Calls the method in Car class
    }
}

    



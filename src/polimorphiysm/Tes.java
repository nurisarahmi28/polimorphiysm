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
class Parent {
int x = 5;
    public void Info() {
        System.out.println("Ini class Parent");
    }
}
class Child extends Parent{
    int x = 10;
    public void Info(){
        System.out.println("ini class Child");
    }
}
public class Tes{
    public static void main(String[] args) {
    Parent tes= new Child();
        System.out.println("Nilai x ="+tes.x);
        tes.Info();
    }
}



    
    




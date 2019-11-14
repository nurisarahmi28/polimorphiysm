/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Nuraniasa
 */
public class Test {
    public static void main(String[] args) {
        Line r = new Line(5,10,10,20);
        System.out.println(r.getLength());
        System.out.println(r.isGreater(r, r));
        System.out.println(r.isLess(r, r));
        System.out.println(r.isEqual(r, r));
        
    }
}

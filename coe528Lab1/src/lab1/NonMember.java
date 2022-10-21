/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Battl
 */
public class NonMember extends Passenger{
    public NonMember (String n, int a) {
        super (n, a);
    }
    @Override
    public double applyDiscount (double p) {
        if (getAge() > 65)
            return p * 0.9;
        return p;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coe528.lab3;
import java.util.ArrayList;
/**
 *
 * @author Battl
 */
public class QueueOfDistinctStrings {
    //Abstraction functions here
    /* 
    represents all the distinct strings in one string
    AF (s) = an abstract String q (where s is a Java String object)
    */
    //rep invariant here
    /* 
    RI (s) = true if items.contains(s) = false;
            = false otherwise;
    */
    
    private ArrayList<String> items;
    
    //constructor
    public QueueOfDistinctStrings () {
        //Effects: Creates a new QueueOfDistinctStrings object
        items = new ArrayList<String>();
    }
    
    //MODIFIES: this
    //EFFECTS: Appends the element at the end of the queue
    //          if the element is not in the queue, otherwise
    //           does nothing.
    public void enqueue(String element) throws Exception {
        if (element == null)
            throw new Exception();
        if (false == items.contains(element))
            items.add(element);
    }
    
    public String dequeue() throws Exception {
        //MODIFIES: this
        //EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0) 
            throw new Exception();
        return items.remove(0);
    }
    
    public boolean repOK(String s) {
        //EFFECTS: Returns true if the rep invariant holds for this 
        //          object; otherwise returns false
        if (items.contains(s) == false)
            return true;
        return false;
    }
    
    public String toString () {
        String ret = "";
        for (String s : items) {
            ret = ret + s + " ";
        }
        return ret;
    }
    
}

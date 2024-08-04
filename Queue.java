/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab4;
import java.util.ArrayList;
/**
 *
 * @author Mohamed Khedr
 * 
 * 
 * @param <T> 
 */
public class Queue<T> {
  
/**
 * Overview:
 * The Queue class represents a mutable, bounded
 * collection of elements that follow the protocol of first-in-first-out (FIFO).
 * It supports generic types, allowing for flexibility in the type of elements it can hold. 
 * 
 * Abstraction Function:
 * AF(c) = [c.items.get(0), c.items.get(1), c.items.get(2), ......... c.items.get(items.size()-1)] 
 *
 * Rep Invariant: RI(c)
 *               false if   
 *                        c.items == null                                                 the list is null
 *                   ||   c.items.get(i) == null  ---> for all 0 <= i < items.size()      an element of its list is null
 *
 */
    
    
    
    private ArrayList<T> items;

    /**
     * Constructs an empty queue.
     */
    public Queue() {
        // EFFECTS: Creates a new Queue object

        items = new ArrayList<T>();
    }

    public void enqueue(T element) {
// MODIFIES: this
// EFFECTS: Adds an element of type T to the rear end of the queue's items list
//          if the element is null it throws a RuntimeException
if (element == null ) throw new RuntimeException("Error: Entered element cannot be Null");
        items.add(0,element);
    }

    public T dequeue() {
// MODIFIES: this
// EFFECTS: removes an element of type T from the rear end of the items list and returns this removed item
//          if the items list is empty it throws a RuntimeException
        
        if (items.isEmpty()) {
 throw new RuntimeException("Error: The Queue is EMPYT!");        }
        T element = items.remove(items.size()-1);
        return element;
    }
    boolean isEmpty(){
    // EFFECTS: return true if the items list is empty, false otherwise
    return items.isEmpty();}

    private boolean repOK() {
// EFFECTS: return true if the representation invariant holds, false otherwise
if (items == null)
    return false;
for (T i : items){
if(i == null) return false;
    }
        return true;
    }

 
    @Override
    public String toString() {
 // EFFECTS: return a string representation of the queue's elements

 return items.toString();
   }     

}
   
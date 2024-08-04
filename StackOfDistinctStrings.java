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
 */
public class StackOfDistinctStrings {


// Overview: StacksOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// LIFO (Last-In-First-Out) order.
//
// The abstraction function is:
// a) AF(c)= [ c.items.get(0), c.items.get(1), c.items.get(2), .... c.items.get(items.size()-1)] | top = c.items(items.size()-1)
//
// The rep invariant is:  RI(c)
// b) false if 
//              c.items == null
//         ||  c.items.get(i) == null --> for all 0 <= i < items.size()                        an element = null 
//         ||  c.items.get(j.equals(c.items.get(k)) ----> for all  0 <= j < k < items.size()     an element is rpeated in the stack
//   true otherwise
     
private ArrayList<String> items;
// constructor
public StackOfDistinctStrings() {
// EFFECTS: Creates a new StackOfDistinctStrings object
items = new ArrayList<String>();
}
public void push(String element) throws Exception {
// MODIFIES: this
// EFFECTS: Appends the element at the top of the stack
// if the element is not in the stack, otherwise
// does nothing.
if(element == null) throw new Exception();
if(false == items.contains(element))
items.add(element);
}
public String pop() throws Exception {
// MODIFIES: this
// EFFECTS: Removes an element from the top of the stack
if (items.size() == 0) throw new Exception();
return items.remove(items.size()-1);
}
public boolean repOK() {
boolean x = true;
if(items == null) return false;
for(String s : items){
    if(s == null)   
    {
      x = false;
    return false;}    
for( String s2 : items){
if(s.equals(s2) && s != s2) 
{x = false;}
}}
return x;}

public String toString() {
// EFFECTS: Returns a string that contains the strings in the
// stack and the top element. 
//Implements the abstraction function.
 return items.toString()+"| top: " + items.get(items.size()-1);

}
}

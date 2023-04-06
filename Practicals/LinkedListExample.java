package sample;

import java.util.*;

public class LinkedListExample
{

    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<Integer>();//// Create a new linked list of integers
        
        // Add elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
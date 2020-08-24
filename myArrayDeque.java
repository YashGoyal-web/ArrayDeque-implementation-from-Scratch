package main.pkgclass.arraydeque;
import java.util.*;


public class MainClassArrayDeque {

    public static void main(String[] args) {

        myDoublyLinkedList<Integer> mDLL = new myDoublyLinkedList();
        
        Queue q = new LinkedList();
        
        mDLL.insertFirst(1);
        mDLL.insertFirst(2);
        mDLL.insertFirst(3);
        mDLL.insertLast(4);
                
        mDLL.removeFirst();
        mDLL.removeLast();
        
        mDLL.removeFirst();
        mDLL.removeLast();

        mDLL.show();
        
        mDLL.insertLast(4);
        mDLL.insertFirst(1);
        mDLL.insertLast(2);
        mDLL.removeFirst();
        mDLL.removeLast();

        mDLL.show();
  }
}

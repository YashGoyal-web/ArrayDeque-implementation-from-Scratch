package main.pkgclass.arraydeque;

public class myDoublyLinkedList<E> {

  private class Node<E> {
      E data;
      Node next;
      Node prev;
      Node(E data){
          this.data = data;
          next = prev = null;
      }
  }
  
  private Node<E> head = null;
  private Node<E> bottom = null;
  private boolean firstTime = false;
  
  public void insertFirst(E data){
     Node<E> node = new Node(data);
     if(head == null){
        firstTime=true;
        head=node;
        head.next=null;
        head.prev=null;
        bottom = head;
     }else{
         if(firstTime){
            bottom.prev = node;
            firstTime = false;
         }
         node.prev = null;
         head.prev = node;
         node.next = head;
         head = node;
     }
  }  

  public void insertLast(E data){
      Node<E> node = new Node(data);
      if(head == null){
         firstTime = true;
         head = node;
         head.next=null;
         head.prev=null;
         bottom = head;
     }else{
          bottom.next = node;
          node.prev = bottom ;
          bottom = node;
          bottom.next = null;
      }
  }    
  
  public E removeFirst(){

      if(head == null){
          System.err.println("Empty data nothing to remove");
          head = null;
          bottom = null;
      return null;          
      }else{
          E data = head.data;
          Node<E> node = head;
          head = head.next;
          if(head != null){
          head.prev = null;}
          else{
              head = null;
              bottom = null;
          }
          return data;
      }
      
  }  

  public E removeLast(){
  
      if(head == null){
          System.err.println("Empty data nothing to remove");
          head = null;
          bottom = null;
          return null;          
      }else{
          E data = bottom.data;
          Node<E> node = bottom;
          bottom = bottom.prev;
          if(bottom != null){
          bottom.next = null;}
          else{
              head = null;
              bottom = null;
          }
          return data;
      }    
  }  
  
  public E peekFirst(){
    return head.data;
  }  

  public E peekLast(){
     return bottom.data; 
  }
  
  public void show(){
      if(head == null){
          System.err.println("Empty data nothing to print");
              head = null;
          bottom = null;
      }else{
          Node<E> node = head;
          while(node != null){
              System.out.println(node.data);
              node = node.next;
          }
      }
  }
  
  void push(E data){
     insertFirst(data); 
  }

  E pop(){
     return removeFirst(); 
  }

  void peek(){
     peekFirst(); 
  }
  
}

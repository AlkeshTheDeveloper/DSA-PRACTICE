package LinkedList;

public class runner {
  static class Node{
       int data;
       Node next;
   }

  static  class LinkedList{
      Node head;
      public void insert(int data) {
          Node node = new Node();
          node.data = data;
          node.next = null;

          if (head == null) {
              head = node;
          } else {
              Node n = head;
              while (n.next != null) {

                  n = n.next;

              }
              n.next = node;
          }



      }
       public void insertAtStart(int data){
           Node node=new Node();
           node.data=data;
           node.next=null;
           node.next=head;
           head=node;
       }
      public void insertAt(int index,int data){
          Node node=new Node();
          node.data=data;
          node.next=null;
          if (index==0){
              insertAtStart(data);
          }
           Node n=head;
          for (int i = 0; i <index-1 ; i++) {
              n= n.next;
          }
          node.next=n.next;
          n.next=node;
      }
      public  void show(){
          Node k=head;
          while(k.next!=null){

              System.out.println(k.data);

              k=k.next;
          }
          System.out.println(k.data);

      }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(55);
        list.insert(88);        list.insert(16);
        list.insert(84);

        list.insertAtStart(15);
        list.insertAt(0,22);
        list.insert(99);
        list.show();
    }

}



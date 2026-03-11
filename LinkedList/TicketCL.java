class Node{

    int id;
    String name,movie,seat,time;

    Node next;

    Node(int i,String n,String m,String s,String t){
        id=i;
        name=n;
        movie=m;
        seat=s;
        time=t;
    }
}

public class TicketCL{

    static Node head;

    static void add(int i,String n,String m,String s,String t){

        Node x=new Node(i,n,m,s,t);

        if(head==null){
            head=x;
            x.next=head;
            return;
        }

        Node cur=head;

        while(cur.next!=head)
            cur=cur.next;

        cur.next=x;
        x.next=head;
    }

    static void show(){

        if(head==null) return;

        Node cur=head;

        do{
            System.out.println(cur.id+" "+cur.name+" "+cur.movie);
            cur=cur.next;
        }while(cur!=head);
    }

    public static void main(String[] args){

        add(1,"Aman","Avengers","A1","10AM");
        add(2,"Riya","Avatar","B3","11AM");

        show();
    }
}
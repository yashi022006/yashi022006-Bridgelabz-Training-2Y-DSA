class Node{
    int id,priority;
    String name,date;

    Node next;

    Node(int i,String n,int p,String d){
        id=i;
        name=n;
        priority=p;
        date=d;
    }
}

public class TaskCL{

    static Node head;

    static void add(int i,String n,int p,String d){

        Node t=new Node(i,n,p,d);

        if(head==null){
            head=t;
            t.next=head;
            return;
        }

        Node cur=head;

        while(cur.next!=head)
            cur=cur.next;

        cur.next=t;
        t.next=head;
    }

    static void show(){

        if(head==null) return;

        Node cur=head;

        do{
            System.out.println(cur.id+" "+cur.name);
            cur=cur.next;
        }while(cur!=head);
    }

    public static void main(String[] args){

        add(1,"Task1",1,"10May");
        add(2,"Task2",2,"12May");

        show();
    }
}

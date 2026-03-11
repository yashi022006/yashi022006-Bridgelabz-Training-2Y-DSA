class Node{
    int id,qty;
    String name;
    double price;

    Node next;

    Node(int i,String n,int q,double p){
        id=i;
        name=n;
        qty=q;
        price=p;
    }
}

public class InvLL{

    static Node head;

    static void add(int i,String n,int q,double p){

        Node t=new Node(i,n,q,p);
        t.next=head;
        head=t;
    }

    static void remove(int id){

        if(head==null) return;

        if(head.id==id){
            head=head.next;
            return;
        }

        Node cur=head;

        while(cur.next!=null && cur.next.id!=id)
            cur=cur.next;

        if(cur.next!=null)
            cur.next=cur.next.next;
    }

    static double total(){

        Node cur=head;
        double sum=0;

        while(cur!=null){
            sum+=cur.price*cur.qty;
            cur=cur.next;
        }

        return sum;
    }

    static void show(){

        Node cur=head;

        while(cur!=null){
            System.out.println(cur.name+" "+cur.qty+" "+cur.price);
            cur=cur.next;
        }
    }

    public static void main(String[] args){

        add(1,"Pen",10,5);
        add(2,"Book",5,50);

        show();

        System.out.println(total());
    }
}

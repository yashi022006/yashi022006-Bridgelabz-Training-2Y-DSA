class Node{

    int id,bt;

    Node next;

    Node(int i,int b){
        id=i;
        bt=b;
    }
}

public class RR{

    static Node head;

    static void add(int i,int b){

        Node n=new Node(i,b);

        if(head==null){
            head=n;
            n.next=head;
            return;
        }

        Node cur=head;

        while(cur.next!=head)
            cur=cur.next;

        cur.next=n;
        n.next=head;
    }

    static void run(int q){

        Node cur=head;

        do{

            if(cur.bt>0){

                int t=Math.min(q,cur.bt);
                cur.bt-=t;

                System.out.println("P"+cur.id+" "+t);
            }

            cur=cur.next;

        }while(cur!=head);
    }

    public static void main(String[] args){

        add(1,5);
        add(2,3);

        run(2);
    }
}

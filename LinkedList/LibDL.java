class Node{

    int id;
    String title,author,genre;
    boolean avail;

    Node next,prev;

    Node(int i,String t,String a,String g,boolean av){
        id=i;
        title=t;
        author=a;
        genre=g;
        avail=av;
    }
}

public class LibDL{

    static Node head,tail;

    static void add(int i,String t,String a,String g,boolean av){

        Node n=new Node(i,t,a,g,av);

        if(head==null){
            head=tail=n;
            return;
        }

        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    static int count(){

        int c=0;
        Node cur=head;

        while(cur!=null){
            c++;
            cur=cur.next;
        }

        return c;
    }

    public static void main(String[] args){

        add(1,"DSA","CLRS","CS",true);
        add(2,"OS","Silberschatz","CS",true);

        System.out.println(count());
    }
}

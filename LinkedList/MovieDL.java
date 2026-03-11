class Node{
    String title,dir;
    int year;
    double rating;

    Node next,prev;

    Node(String t,String d,int y,double r){
        title=t;
        dir=d;
        year=y;
        rating=r;
    }
}

public class MovieDL{

    static Node head,tail;

    static void addEnd(String t,String d,int y,double r){

        Node n=new Node(t,d,y,r);

        if(head==null){
            head=tail=n;
            return;
        }

        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    static void remove(String t){

        Node cur=head;

        while(cur!=null){

            if(cur.title.equals(t)){

                if(cur.prev!=null)
                    cur.prev.next=cur.next;
                else
                    head=cur.next;

                if(cur.next!=null)
                    cur.next.prev=cur.prev;
                else
                    tail=cur.prev;

                break;
            }

            cur=cur.next;
        }
    }

    static void showF(){

        Node cur=head;

        while(cur!=null){
            System.out.println(cur.title+" "+cur.rating);
            cur=cur.next;
        }
    }

    static void showR(){

        Node cur=tail;

        while(cur!=null){
            System.out.println(cur.title+" "+cur.rating);
            cur=cur.prev;
        }
    }

    public static void main(String[] args){

        addEnd("Inception","Nolan",2010,9);
        addEnd("Avatar","Cameron",2009,8);

        showF();
        showR();
    }
}

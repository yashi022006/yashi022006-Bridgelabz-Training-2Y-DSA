class Node{

    String text;

    Node next,prev;

    Node(String t){
        text=t;
    }
}

public class UndoDL{

    static Node cur;

    static void type(String t){

        Node n=new Node(t);

        if(cur!=null){
            cur.next=n;
            n.prev=cur;
        }

        cur=n;
    }

    static void undo(){

        if(cur.prev!=null)
            cur=cur.prev;
    }

    static void redo(){

        if(cur.next!=null)
            cur=cur.next;
    }

    static void show(){
        System.out.println(cur.text);
    }

    public static void main(String[] args){

        type("Hello");
        type("Hello World");

        undo();
        show();

        redo();
        show();
    }
}
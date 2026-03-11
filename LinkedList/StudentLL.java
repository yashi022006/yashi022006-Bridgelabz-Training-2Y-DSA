

class Node{
    int roll,age;
    String name,grade;
    Node next;

    Node(int r,String n,int a,String g){
        roll=r;
        name=n;
        age=a;
        grade=g;
    }
}

public class StudentLL{

    static Node head;

    static void addBeg(int r,String n,int a,String g){
        Node t=new Node(r,n,a,g);
        t.next=head;
        head=t;
    }

    static void addEnd(int r,String n,int a,String g){
        Node t=new Node(r,n,a,g);

        if(head==null){
            head=t;
            return;
        }

        Node cur=head;
        while(cur.next!=null)
            cur=cur.next;

        cur.next=t;
    }

    static void delete(int roll){
        if(head==null) return;

        if(head.roll==roll){
            head=head.next;
            return;
        }

        Node cur=head;

        while(cur.next!=null && cur.next.roll!=roll)
            cur=cur.next;

        if(cur.next!=null)
            cur.next=cur.next.next;
    }

    static Node search(int roll){
        Node cur=head;

        while(cur!=null){
            if(cur.roll==roll)
                return cur;
            cur=cur.next;
        }

        return null;
    }

    static void update(int roll,String g){
        Node t=search(roll);
        if(t!=null)
            t.grade=g;
    }

    static void show(){
        Node cur=head;

        while(cur!=null){
            System.out.println(cur.roll+" "+cur.name+" "+cur.age+" "+cur.grade);
            cur=cur.next;
        }
    }

    public static void main(String[] args){

        addBeg(1,"Aman",20,"A");
        addEnd(2,"Riya",21,"B");

        update(2,"A+");

        show();
    }
}
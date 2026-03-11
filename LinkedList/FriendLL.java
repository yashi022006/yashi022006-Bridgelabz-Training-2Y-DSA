import java.util.*;

class User{

    int id,age;
    String name;

    ArrayList<Integer> friends=new ArrayList<>();

    User next;

    User(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
}

public class FriendLL{

    static User head;

    static void add(int i,String n,int a){

        User u=new User(i,n,a);
        u.next=head;
        head=u;
    }

    static User find(int id){

        User cur=head;

        while(cur!=null){

            if(cur.id==id)
                return cur;

            cur=cur.next;
        }

        return null;
    }

    static void addFriend(int a,int b){

        User u1=find(a);
        User u2=find(b);

        if(u1!=null && u2!=null){

            u1.friends.add(b);
            u2.friends.add(a);
        }
    }

    public static void main(String[] args){

        add(1,"A",20);
        add(2,"B",21);

        addFriend(1,2);
    }
}

public class CmpSB{

    public static void main(String[] args){

        int n=1000000;

        long t1=System.nanoTime();

        StringBuilder sb1=new StringBuilder();

        for(int i=0;i<n;i++)
            sb1.append("hello");

        long t2=System.nanoTime();

        StringBuffer sb2=new StringBuffer();

        for(int i=0;i<n;i++)
            sb2.append("hello");

        long t3=System.nanoTime();

        System.out.println("Builder: "+(t2-t1));
        System.out.println("Buffer: "+(t3-t2));
    }
}

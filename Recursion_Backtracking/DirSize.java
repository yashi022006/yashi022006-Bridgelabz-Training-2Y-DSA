import java.io.File;

public class DirSize {

    static long getSize(File f){

        if(f.isFile())
            return f.length();

        long size = 0;

        File[] list = f.listFiles();

        if(list != null){
            for(File x : list)
                size += getSize(x);
        }

        return size;
    }

    public static void main(String[] args){

        File dir = new File("project");

        System.out.println(getSize(dir));
        
    }
}
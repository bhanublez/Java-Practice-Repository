import java.io.File;


public class Main_Method{
    public static void  main(String ar[]){
        File file=new File("Secrete_message.txt");//CAn also give file location or say its path
        if(file.exists()){
            System.out.println("Thats exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();//Delete the file
        }
        else{
            System.out.println("Not exist");
        }
        
    }
}
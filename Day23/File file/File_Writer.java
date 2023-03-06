import java.io.FileWriter;
import java.io.IOException;
public class File_Writer{
     public static  void main(String ar[]) {
        try{
            FileWriter writer =new FileWriter("poem.txt");
            writer.write("Roses are blanky and fanky redish\n Putty putty\n alalalla \n pppapap ash\b chchchc daadad");
            writer.close(); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
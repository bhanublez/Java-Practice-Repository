import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class File_Reader{

    public static void main(String ar[]){
        try{
            FileReader reader=new FileReader("poem.txt");
            int data=reader.read();
            while(data !=-1){
                System.out.print((char)data);
                data=reader.read();
            }
            reader.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        
    }
}
}
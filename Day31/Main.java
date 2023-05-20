package Day31;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String ar[]){
        try {
            FileReader reader=new FileReader("poem.txt");
            int data =reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data=reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}

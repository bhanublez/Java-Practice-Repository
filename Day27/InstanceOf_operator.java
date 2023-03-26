package Day27;

import java.util.Calendar;
import java.util.Date;

public class InstanceOf_operator {
    public static void main( String ar[]){
        Object obj = Calendar.getInstance();
        long time=0 ;
        System.out.println(time);
        if(obj instanceof Date)
        {
         time = ((Date)obj).getTime();
        }
        System.out.println(time);
        Date timee;

        if(obj instanceof Calendar)
        {
         timee=((Calendar)obj).getTime();
        }        
        
    }
}

package Day27.Date_related_Prgram;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class StringForamtDate {
    public static void main(String[] args) {
        String stringformat="yy/mm/dd hh:mm:ss";
    Date date= Calendar.getInstance().getTime();
    SimpleDateFormat simpledateformat=new SimpleDateFormat(stringformat);
    String formatedDate= simpledateformat.format(date);
    System.out.println(formatedDate);
    System.out.println(new SimpleDateFormat("yyyy/MM/dd hh:mm.ss").format(Calendar.getInstance().getTime()));
        
    }
    
}

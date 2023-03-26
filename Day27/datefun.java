package Day27;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class datefun {
    public static void main(String[] args) {
        java.util.Date ud= new java.util.Date();
        System.out.println("util.Date is "+ud);
        java.sql.Date sd= new java.sql.Date(ud.getTime());
        System.out.println("sql.Date is "+sd);
        DateFormat sdd=new SimpleDateFormat("dd/mm/yy - hh:mm:ss");
        System.out.println("sample formated date is "+sdd.format(ud));
        while(1>0){
            java.util.Date udd=new java.util.Date();
            DateFormat pp=new SimpleDateFormat("hh:mm:ss");
            System.out.println("sample formated date is "+pp.format(udd));

            
        }
    }
}

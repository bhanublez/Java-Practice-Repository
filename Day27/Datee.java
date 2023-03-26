package Day27;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Datee {
    public static void main(String args[])
 {
 java.util.Date utilDate = new java.util.Date();
 System.out.println("java.util.Date is : " + utilDate);

 java.sql.Date sqlDate = convert(utilDate);
 java.sql.Date sqd=new  java.sql.Date(utilDate.hashCode()); //Other way of writing
 System.out.println("java.sql.Date is : " + sqlDate);
 System.out.println("java.sql.Date another way is : " + sqd); 

 DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
 System.out.println("dateFormated date is : " + df.format(utilDate));
 }
 private static java.sql.Date convert(java.util.Date uDate) {
    java.sql.Date sDate = new java.sql.Date(uDate.getTime());
    return sDate;
    }
   
}

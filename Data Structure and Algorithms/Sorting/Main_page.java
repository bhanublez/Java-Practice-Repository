import java.util.*;

public class Main_page{
public static Scanner sc=new Scanner(System.in);
    public static void main(String arg[]){
        int n;
        try{
            System.out.print("Enter number of element to insert in array: ");
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Bubblesort b= new Bubblesort();
        b.Bubble_Sort(arr,n);
        System.out.print("Bubble sorted array is: ");
        for(int i=0;i<n;i++){
           System.out.print(" "+arr[i]);
        }
    }catch(Exception ex){
        System.out.println("Invalid input endered ");
    }

        

    }



}


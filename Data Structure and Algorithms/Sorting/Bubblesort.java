
import java.util.*;

public class Bubblesort{

  void Bubble_Sort(int arr[],int n){
    for(int pass=n-1;pass>=0;pass--){
        for(int i=0;i<=pass-1;i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
  }



}
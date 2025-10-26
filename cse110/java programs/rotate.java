import java.util.Arrays;

public class rotate{
  public static void main(String [] args)  {
   int arr[] = {1, 2, 3, 4, 5, 6};
   int d = 0;
   while(d < arr.length) {
     int temp = arr[d];
     arr[d] =  arr[arr.length - 1];
     arr[arr.length - 1] = temp;
     
     d++;
   }
      int k = 0;
   while(k < arr.length) {
     int temp = arr[k];
     arr[k] =  arr[arr.length - 1];
     arr[arr.length - 1] = temp;
     
     k++;
   }
   
   
   System.out.println(Arrays.toString(arr));
  }
}
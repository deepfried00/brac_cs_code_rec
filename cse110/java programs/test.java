import java.util.*;

public class test {
  public static void main(String[] args) {
    int[] arr = {10,2,19,20,22,7};

    for(int i = 0;  i < arr.length; i++) {
          int min = i ;
      for(int j = i+1; j < arr.length; j++) {
        if( arr[min] >  arr[j]) { // min 1 arr[min] = 2
          min  = j;
        }
      }
      int temp = arr[i];//10
      arr[i] = arr[min];//2
      arr[min] =  temp;//10
      
    }
    System.out.println(Arrays.toString(arr));

        
//    for(int i = 0; i < arr.length; i++) {
//      for(int j = i+1; j < arr.length; j++) { 
//        if (arr[i] > arr[j]){
//          int temp = arr[j];
//          arr[j] = arr[i];
//          arr[i] = temp;
//        }
//      }
//    }
//    System.out.println(Arrays.toString(arr));
  }
}
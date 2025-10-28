import java.util.*;

public class task3{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for(int i =0; i < arr.length; i++) {
      boolean flag = false;
      for(int k = 0; k < i; k++) {
        if( arr[i] == arr[k]) {
          flag = true;
          break;
        }
      }
      if( flag == false) {
      for(int j = 0; j < arr.length; j++){
        if ( arr[i] == arr[j]) {
          count++;
        }
      }
      System.out.println(arr[i] + " - " + count + " times"); 
        
        count = 0;
      }
      else {
        continue;
      }
    }
  }
}
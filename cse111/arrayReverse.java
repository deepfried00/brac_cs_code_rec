import java.util.*;

public class arrayReverse{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {-7,-31,344,97,100};
    int  j = arr.length-1;
    for(int i = 0; i < arr.length/2; i++) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j--;
      }
    System.out.println(Arrays.toString(arr));
  
  }}
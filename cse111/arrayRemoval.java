import java.util.*;

public class arrayRemoval{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    double[] arr = new double[size];
    for(int i =0; i < size; i++){
      arr[i] = sc.nextDouble();
    }
    int ssize = 1;
    for(int i = 1; i< arr.length; i++){
      if(arr[i] != arr[i-1]){
        ssize++;
      }
    }
    double[] narr = new double[ssize];
    int smt = 0;
    narr[smt++] = arr[0];
    for(int i = 1; i < arr.length; i++){
      if(arr[i] != arr[i-1]){
        narr[smt++] = arr[i];
      }
    }
    System.out.println(Arrays.toString(narr));
}
}
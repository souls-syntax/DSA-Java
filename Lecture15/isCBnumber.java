import java.util.*;

public class isCBnumber{
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    boolean check = true;

    for(int i = 0; i< arr.length; i++){
      if(n%arr[i]){
        check = false;
        break;
      }
    }
  }

  public static boolean isCB(long n){
    if(num == 0 || num == 1){
      return false;
    }
    for(int i =0; i< arr.length; i++){
      if(n == arr[i]){
        return true;
      }
    }

    for(int i = 0; i< arr.length; i++){
      if(n%arr[i]){
        return false;
      }
    }
  }
  public static void printall(String s){
    int c = 0;
		int n=s.length();
        for(int i=1;i<=n;i++){
          for(int j=i;j<=n;j++){
            int k=j-i;
            long num = Long.parseLong(s.substring(k,j));
			}
		}
	}
}




















































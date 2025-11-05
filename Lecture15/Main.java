import java.util.*;

public class Main{
    public static void main(String[] args){
     //   System.out.println("Hello, World!");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(longestlength(s));
  }

  public static int longestlength(String s) {
    int ans = 0, c = 0;
    for(int i =0; i<s.length();i++){
      char ch = s.charAt(i);
      if(Isvowels(ch)) {
        c++;
      }else{
        ans=Math.max(ans,c);
      }
    }
    ans = Math.max(ans, c);
    return ans;
  }
}

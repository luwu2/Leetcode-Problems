package RecursionProblems;

public class PowerOf {
  public static boolean powerOfN(int num, int n) {
    if(num%n != 0) {
      return false;
    }
    else if(num == n) {
      return true;
    }
    else if (num == 0) {
      return false;
    }
    else {
      return(powerOfN(num/n, n));
    }
  }


}

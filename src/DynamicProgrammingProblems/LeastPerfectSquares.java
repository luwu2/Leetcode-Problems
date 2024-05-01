package DynamicProgrammingProblems;

/**
 * Implementation of the perfect squares problem.
 * https://leetcode.com/problems/perfect-squares/description/
 */
public class LeastPerfectSquares {
  public static int numSquares(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Input cannot be less than zero.");
    }

    int highestSquare = findHighestSquare(n);
    int count = 0;
    while (n > 0) {
      if (n - highestSquare == 3 && highestSquare != 4) {
        highestSquare = 4;
        continue;
      }

      count++;
      n -= highestSquare;
      highestSquare = findHighestSquare(n);
    }
    return count;
  }
  // Helper method that returns the highest perfect square less than or equal to n.
  private static int findHighestSquare(int n) {
    int sqrt = (int) Math.sqrt(n);
    return sqrt * sqrt;
  }
}

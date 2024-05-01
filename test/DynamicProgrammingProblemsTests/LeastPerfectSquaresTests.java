package DynamicProgrammingProblemsTests;

import DynamicProgrammingProblems.LeastPerfectSquares;
import org.junit.Test;

import static DynamicProgrammingProblems.LeastPerfectSquares.numSquares;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LeastPerfectSquaresTests {
  @Test
  public void testLeastPerfectSquares() {
    assertEquals(3, numSquares(12));

    assertEquals(2, numSquares(13));

    assertEquals(1, numSquares(144));
  }

  @Test
  public void testIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> LeastPerfectSquares.numSquares(-10));
  }
}

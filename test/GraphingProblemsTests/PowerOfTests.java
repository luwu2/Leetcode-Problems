package GraphingProblemsTests;

import org.junit.Test;

import static RecursionProblems.PowerOf.powerOfN;
import static org.junit.Assert.assertTrue;

public class PowerOfTests {
  @Test
  public void testPowerOf() {
    assertTrue(powerOfN(27, 3));
    assertTrue(!powerOfN(100, 5));
    assertTrue(!powerOfN(0,1));
  }

}

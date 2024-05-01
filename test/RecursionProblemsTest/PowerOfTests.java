package RecursionProblemsTest;

import org.junit.Test;

import static RecursionProblems.PowerOf.powerOfN;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfTests {
  @Test
  public void testPowerOf() {
    assertTrue(powerOfN(27, 3));
    assertFalse(powerOfN(100, 5));
    assertFalse(powerOfN(0, 1));
  }

}

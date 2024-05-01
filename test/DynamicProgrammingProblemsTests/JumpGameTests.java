package DynamicProgrammingProblemsTests;

import org.junit.Test;

import static DynamicProgrammingProblems.JumpGame.canJump;
import static org.junit.Assert.assertTrue;

public class JumpGameTests {
  @Test
  public void testValidJump() {
    int[] nums = {2,3,1,1,4};
    assertTrue(canJump(nums));

    int[] nums2 = {3,2,1,0,4};
    assertTrue(!canJump(nums2));
  }

}

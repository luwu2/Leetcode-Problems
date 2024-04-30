package DynamicProgrammingProblems;

/**
 * Implementation of the jump game problem.
 * https://leetcode.com/problems/jump-game/description/
 */
public class JumpGame {
  public static boolean canJump(int[] nums) {
    int curr = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > curr) { return false; }
      curr = Math.max(curr, i + nums[i]);
    }
    return true;
  }

}

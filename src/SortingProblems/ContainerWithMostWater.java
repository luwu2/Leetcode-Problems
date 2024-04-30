package SortingProblems;

/**
 * Implementation of the container with most water problem.
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater {
  public static int maxContainerArea(int[] height) {
    if (height.length < 2) {
      throw new IllegalArgumentException("Height array cannot have less than 2 integers");
    }

    int left = 0;
    int right = height.length - 1;
    int area = 0;

    while (left < right) {
      int currArea = areaHelper(height, left, right);

      if (currArea > area) {area = currArea;}
      else if (height[left] > height[right]) {right--;}
      else {left++;}
    }

    return area;
  }

  // Helper method for calculating area.
  private static int areaHelper(int[] height, int a, int b) {
    int h = Math.min(height[a], height[b]);

    return (h * (b-a));
  }

}

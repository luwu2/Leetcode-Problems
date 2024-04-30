package SortingProblemsTests;

import org.junit.Test;
import SortingProblems.ContainerWithMostWater;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test for ContainerWithMostWater.
 */
public class ContainerWithMostWaterTests {
  @Test
  public void testCorrectArea() {
    int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    assertEquals(49, ContainerWithMostWater.maxContainerArea(heights1));

    int[] heights2 = {4, 3, 2, 1, 4};
    assertEquals(16, ContainerWithMostWater.maxContainerArea(heights2));

    int[] heights3 = {1, 2, 1};
    assertEquals(2, ContainerWithMostWater.maxContainerArea(heights3));

    int[] heights4 = {1, 1};
    assertEquals(1, ContainerWithMostWater.maxContainerArea(heights4));
  }

  @Test
  public void testIllegalArgumentException() {
    int[] heights5 = {};
    assertThrows(IllegalArgumentException.class, () -> ContainerWithMostWater.maxContainerArea(heights5));

    int[] heights6 = {5};
    assertThrows(IllegalArgumentException.class, () -> ContainerWithMostWater.maxContainerArea(heights6));
  }

}

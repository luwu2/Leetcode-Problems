package SortingProblems;


import static SortingProblems.MergeSort.mergeSort;

/**
 * Represents the implementation of the TwoPointers algorithm.
 *
 */
public class TwoPointers {

  /**
   * Given an array of integers and a target integer, returns
   * a pair of elements that sum up to the target value.
   *
   * @param arr array of integers
   * @param target target integer to be summed
   * @return array of integers with two numbers that sum to target
   */
  public int[] twoPointers(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    mergeSort(arr);

    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == target) {return new int[]{arr[left], arr[right]};}
      else if (sum < target) {left++;}
      else {right--;}
    }
    return null;
  }

}

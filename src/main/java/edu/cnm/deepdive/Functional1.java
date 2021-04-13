package edu.cnm.deepdive;

import java.util.LinkedList;
import java.util.List;

public class Functional1 {

  /**
   * Given a list of integers, return a list where each integer is multiplied by 2.
   *
   * doubling([1, 2, 3]) → [2, 4, 6]
   * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
   * doubling([]) → []
   *
   * @param nums
   * @return
   */
  public List<Integer> doubling(List<Integer> nums) {
    nums.replaceAll((value) -> value * 2);
    return nums;
  }

}

package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII229 {

  public List<Integer> majorityElement(int[] nums) {
    int countA = 0;
    int candidateA = 0;

    int countB = 0;
    int candidateB = 0;

    for (int num : nums) {
      if (candidateA == num) {
        countA++;
      } else if (candidateB == num) {
        countB++;
      } else if (countA == 0) {
        candidateA = num;
        countA = 1;
      } else if (countB == 0) {
        candidateB = num;
        countB = 1;
      } else {
        countA--;
        countB--;
      }
    }

    int checkCountA = 0;
    int checkCountB = 0;
    for (int num : nums) {
      if (num == candidateA) {
        checkCountA++;
      } else if (num == candidateB) {
        checkCountB++;
      }
    }

    List<Integer> result = new ArrayList<>();
    if (checkCountA > nums.length / 3) {
      result.add(candidateA);
    }

    if (checkCountB > nums.length / 3) {
      result.add(candidateB);
    }

    return result;
  }
}

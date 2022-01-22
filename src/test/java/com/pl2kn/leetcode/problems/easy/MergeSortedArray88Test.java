package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MergeSortedArray88Test {

  @Test
  public void Simple_Test() {
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    MergeSortedArray88 solution = new MergeSortedArray88();
    solution.merge(nums1, 3, nums2, 3);
    assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
  }

  @Test
  public void Empty_Second_Array_Test() {
    int[] nums1 = {1};
    int[] nums2 = {};
    MergeSortedArray88 solution = new MergeSortedArray88();
    solution.merge(nums1, 1, nums2, 0);
    assertArrayEquals(new int[]{1}, nums1);
  }

  @Test
  public void Empty_First_Array_Test() {
    int[] nums1 = {0};
    int[] nums2 = {1};
    MergeSortedArray88 solution = new MergeSortedArray88();
    solution.merge(nums1, 0, nums2, 1);
    assertArrayEquals(new int[]{1}, nums1);
  }
}

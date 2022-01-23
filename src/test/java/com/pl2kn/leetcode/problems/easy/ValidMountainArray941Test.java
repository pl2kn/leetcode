package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidMountainArray941Test {

  @Test
  public void Simple_Test() {
    int[] arr = {0, 3, 2, 1};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertTrue(solution.validMountainArray(arr));
  }

  @Test
  public void Long_Test() {
    int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertTrue(solution.validMountainArray(arr));
  }

  @Test
  public void Short_Array_Test() {
    int[] arr = {0, 1};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertFalse(solution.validMountainArray(arr));
  }

  @Test
  public void Not_Mountain_Array_Test() {
    int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 7, 1};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertFalse(solution.validMountainArray(arr));
  }

  @Test
  public void Non_Mountain_3_Element_Array_Test() {
    int[] arr = {3, 5, 5};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertFalse(solution.validMountainArray(arr));
  }

  @Test
  public void Mountain_4_Element_Array_Test() {
    int[] arr = {0, 3, 2, 1};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertTrue(solution.validMountainArray(arr));
  }

  @Test
  public void Sorted_Asc_Array_Test() {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertFalse(solution.validMountainArray(arr));
  }

  @Test
  public void Sorted_Desc_Array_Test() {
    int[] arr = {9, 8, 8, 6, 5, 4};
    ValidMountainArray941 solution = new ValidMountainArray941();
    assertFalse(solution.validMountainArray(arr));
  }
}

package com.pl2kn.leetcode.problems.hard;

public class FindTheLongestValidObstacleCourseAtEachPosition1964 {

  public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
    int n = obstacles.length;
    int[] result = new int[n];

    int[] lis = new int[n];
    int lisLength = 0;

    for (int i = 0; i < n; i++) {
      int height = obstacles[i];

      int index = binarySearch(lis, height, lisLength);
      if (index == lisLength) {
        lisLength++;
      }

      lis[index] = height;
      result[i] = index + 1;
    }

    return result;
  }

  private int binarySearch(int[] array, int target, int right) {
    if (right == 0) {
      return 0;
    }

    int left = 0;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (array[mid] <= target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }
}

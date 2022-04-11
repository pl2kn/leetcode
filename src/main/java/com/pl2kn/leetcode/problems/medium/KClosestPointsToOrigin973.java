package com.pl2kn.leetcode.problems.medium;

public class KClosestPointsToOrigin973 {

  public int[][] kClosest(int[][] points, int k) {
    int left = 0;
    int right = points.length - 1;
    while (left <= right) {
      int index = partition(points, left, right);
      if (index == k) {
        break;
      }
      if (k < index) {
        right = index - 1;
      } else {
        left = index + 1;
      }
    }
    int[][] result = new int[k][];
    for (int i = 0; i < k; i++) {
      result[i] = points[i];
    }
    return result;
  }

  private int partition(int[][] points, int left, int right) {
    double pivot = distance(points[left]);
    int index = left;
    for (int i = left + 1; i <= right; i++) {
      if (distance(points[i]) < pivot) {
        swap(points, ++index, i);
      }
    }
    swap(points, index, left);
    return index;
  }

  private void swap(int[][] points, int i, int j) {
    int[] tmp = points[i];
    points[i] = points[j];
    points[j] = tmp;
  }

  private double distance(int[] point) {
    return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
  }
}

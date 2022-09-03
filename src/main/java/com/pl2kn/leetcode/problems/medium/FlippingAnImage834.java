package com.pl2kn.leetcode.problems.medium;

public class FlippingAnImage834 {

  public int[][] flipAndInvertImage(int[][] image) {
    int n = image[0].length;

    for (int[] row : image) {
      for (int i = 0; i < (n + 1) / 2; i++) {
        int tmp = row[i] ^ 1;
        row[i] = row[n - 1 - i] ^ 1;
        row[n - 1 - i] = tmp;
      }
    }

    return image;
  }
}

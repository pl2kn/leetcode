package com.pl2kn.leetcode.easy;

public class SquaresOfASortedArray977 {

  public int[] sortedSquares(int[] nums) {
    int lastNegativeIndex = 0;
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (nums[i] < 0) {
        lastNegativeIndex = i;
      } else {
        break;
      }
    }
    int[] sortedNumSquares = new int[length];
    int sortedIndex = 0;
    int negativeIndex = lastNegativeIndex;
    int notNegativeIndex = lastNegativeIndex + 1;
    while (negativeIndex >= 0 && notNegativeIndex < length) {
      int negativeSquare = nums[negativeIndex] * nums[negativeIndex];
      int notNegativeSquare = nums[notNegativeIndex] * nums[notNegativeIndex];
      if (negativeSquare < notNegativeSquare) {
        sortedNumSquares[sortedIndex] = negativeSquare;
        negativeIndex--;
      } else {
        sortedNumSquares[sortedIndex] = notNegativeSquare;
        notNegativeIndex++;
      }
      sortedIndex++;
    }
    for (int i = negativeIndex; i >= 0; i --) {
      sortedNumSquares[sortedIndex++] = nums[i] * nums[i];
    }
    for (int i = notNegativeIndex; i < length; i ++) {
      sortedNumSquares[sortedIndex++] = nums[i] * nums[i];
    }
    return sortedNumSquares;
  }
}

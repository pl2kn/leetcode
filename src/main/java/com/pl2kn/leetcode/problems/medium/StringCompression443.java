package com.pl2kn.leetcode.problems.medium;

public class StringCompression443 {

  public int compress(char[] chars) {
    int length = chars.length;
    int k = 0;
    for (int left = 0, right = 0; right < length; right++) {
      if (right == length - 1 || chars[right] != chars[right + 1]) {
        int charCount = right - left + 1;
        chars[k++] = chars[right];
        if (charCount > 1) {
          for (char digit : String.valueOf(charCount).toCharArray()) {
            chars[k++] = digit;
          }
        }
        left = right + 1;
      }
    }
    return k;
  }
}

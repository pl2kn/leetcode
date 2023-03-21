package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.medium.DesignAddAndSearchWordsDataStructure211.WordDictionary;
import org.junit.jupiter.api.Test;

class DesignAddAndSearchWordsDataStructure211Test {

  @Test
  public void Simple_Test() {
    WordDictionary dictionary = new WordDictionary();
    dictionary.addWord("bad");
    dictionary.addWord("dad");
    dictionary.addWord("pad");
    dictionary.search("bad");
    dictionary.search(".ad");
    dictionary.search("b..");
  }

}
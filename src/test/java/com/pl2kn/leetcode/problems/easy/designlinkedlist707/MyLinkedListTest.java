package com.pl2kn.leetcode.problems.easy.designlinkedlist707;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

  @Test
  public void Simple_Test() {
    MyLinkedList list = new MyLinkedList();
    list.addAtHead(7);
    list.addAtHead(2);
    list.addAtHead(1);
    list.addAtIndex(3, 0);

  }
}

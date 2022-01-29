package com.pl2kn.leetcode.problems.medium.designlinkedlist707.doublylinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

  @Test
  public void Simple_Test() {
    MyLinkedList list = new MyLinkedList();
    list.addAtHead(1);
    list.addAtTail(3);
    list.addAtIndex(1, 2);
    assertEquals(2, list.get(1));
    list.deleteAtIndex(1);
    assertEquals(3, list.get(1));
  }
}

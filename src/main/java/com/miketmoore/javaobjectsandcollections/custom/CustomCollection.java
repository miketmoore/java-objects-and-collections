package com.miketmoore.javaobjectsandcollections.custom;

import java.util.Arrays;

public class CustomCollection {
  private Custom[] list;

  public CustomCollection(Custom[] list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return Arrays.toString(list);
  }
}

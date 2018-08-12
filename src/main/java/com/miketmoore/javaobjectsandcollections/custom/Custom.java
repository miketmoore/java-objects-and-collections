package com.miketmoore.javaobjectsandcollections.custom;

public class Custom {
  private String id;

  public Custom(final String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Custom:" + id;
  }
}

package com.miketmoore.javaobjectsandcollections;

import com.miketmoore.javaobjectsandcollections.custom.Custom;
import com.miketmoore.javaobjectsandcollections.custom.CustomCollection;
import java.util.Arrays;

public class Example {

  private static void log(Object x) {
    System.out.println(x);
  }

  private static void nl() {
    System.out.println();
  }

  public static void main(String[] args) {

    log("One object");
    Object obj = new Object();
    log(obj);
    nl();

    log("Array of objects");
    Object[] objects = new Object[] {new Object()};
    log(objects);
    nl();

    log("Multi-dimensional array of objects");
    Object[][] mdObjects = new Object[][] {new Object[] {new Object()}};
    log(mdObjects);
    nl();

    log("One Custom instance");
    Custom custom = new Custom("one");
    log(custom);
    nl();

    log("Array of Custom");
    Custom[] customs = new Custom[] {new Custom("two")};
    log(Arrays.toString(customs));
    nl();

    log("Multi-dimensional array of Custom");
    Custom[][] mdCustoms = new Custom[][] {new Custom[] {new Custom("three")}};
    log(mdCustoms);
    nl();

    log("CustomCollection");
    CustomCollection customCollection = new CustomCollection(new Custom[] {new Custom("four")});
    log(customCollection);
    nl();

    CustomCollection[] customCollections =
        new CustomCollection[] {new CustomCollection(new Custom[] {new Custom("boop")})};
    log(Arrays.toString(customCollections));

    Object x = "foo";
    log(x);

    Object[] y = new Object[] {"foo"};
    log(Arrays.toString(y));

    Object[][] z = new Object[][] {{"foo", "bar"}};
    log(Arrays.toString(z[0]));
  }
}

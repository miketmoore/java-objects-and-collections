# Java Objects and Arrays

or: How I Learned to Stop Worrying and Love the Java

## Clone, Install, Build, and Run

```
git clone https://github.com/miketmoore/java-objects-and-collections.git
cd java-objects-and-collections
make
```

## About

Recently, I saw a Java snippet like the following:

```
public Object[][] getMultiDimensionalArrayOfObjects() {
  return new Object[][] {
      {
          "Foo",
          "Bar"
      }
  };
}
```

I could not figure out how to recreate it for my own purposes, although I wanted to, because it appeared to be a very terse way to write data driven tests, so I built this little project to figure out the syntax.

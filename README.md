# Java Objects and Arrays

or: How I Learned to Stop Worrying and Love the Java

## Clone, Install, and Run

```
git clone https://github.com/miketmoore/java-objects-and-collections.git
cd java-objects-and-collections
mvn install
mvn package
java -jar target/java-objects-and-collections-1.0-SNAPSHOT.jar
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
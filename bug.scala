```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = println(value)
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10) 
    myInt.printValue() //This will work fine

    val myString = new MyClass("Hello")
    myString.printValue() //This will also work fine

    val myList = new MyClass(List(1,2,3))
    myList.printValue() //This will also work fine

    val myNull = new MyClass(null)
    myNull.printValue() // This will throw a NullPointerException if T is not a nullable type
  }
}
```
```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = println(value)
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10) 
    myInt.printValue() 

    val myString = new MyClass("Hello")
    myString.printValue() 

    val myList = new MyClass(List(1,2,3))
    myList.printValue() 

    //Solution 1: Using Nullable Type
    val myNull1: MyClass[Int] = new MyClass(null) //Int is not nullable, causes error. Instead use Option[Int]
    val myNull2: MyClass[Option[Int]] = new MyClass(None) 
    println(myNull2.value) // prints None
    
    //Solution 2: Explicit Null Check
    val myNull3: MyClass[String] = new MyClass(null) // This is fine
    val myNull4: MyClass[String] = new MyClass("Hello")
    def printNullableValue(c: MyClass[String]): Unit = {
        if(c.value == null) println("Value is null") else println(c.value)
    }
    printNullableValue(myNull3)
    printNullableValue(myNull4)
  }
}
```
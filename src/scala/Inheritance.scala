//: src/scala/Inheritance.scala
package inheritance

trait Base:
    def eat(): Unit
    def speak(): Unit

class Dog extends Base:
    def consume() = println("eating dog food")
    def communicate() = println("woof")

class Person extends Base:
    def consume() = println("eating pizza")
    def communicate() = println("hello")
//---
class Robot extends Base:
    def consume() = println("charging")
    def communicate() = println("operational")

class Slug extends Base:
    def consume() = println("eating grass")
    def communicate() = {}

def nourish(x: Base): Unit =
    x.eat()
    x.speak()

@main def main() =
    List(Dog(), Person(), Robot(), Slug()).foreach(nourish(_))

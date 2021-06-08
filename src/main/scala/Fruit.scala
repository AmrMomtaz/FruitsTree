class Fruit(var weight :Int){
  def printWeight: Unit ={
    println(weight)
  }
}

// Fruits Properties
trait Size

trait Large extends Size
trait Medium extends Size
trait Tiny extends Size


trait Color

trait Red extends Color
trait Green extends Color
trait Blue extends Color
trait Yellow extends Color


trait Shape

trait Oval extends Shape
trait Circular extends Shape

//Available Fruits
case class Apple(var Weight : Int) extends Fruit(weight = Weight) with Medium with Red with Circular



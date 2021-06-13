abstract class Fruit(){
  var weight : Int
  def describe: Unit ={
    println("Fruit Type : Abstract Fruit , Weight = " + weight + " gram")
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
trait Black extends Color
trait Brown extends Color
trait Orange extends Color

trait Shape

trait Oval extends Shape
trait Circular extends Shape

//Available Fruits
case class Apple(override var weight : Int) extends Fruit() with Medium with Red with Circular {
  override def describe: Unit = {
    println("Fruit Type : Apple , Weight = " + weight + " gram")
  }
}
case class Avocado(override var weight : Int) extends Fruit() with Medium with Green with Oval{
  override def describe: Unit = {
    println("Fruit Type : Avocado , Weight = " + weight + " gram")
  }
}
case class Banana(override var weight : Int) extends Fruit() with Medium with Yellow with Oval{
  override def describe: Unit = {
    println("Fruit Type : Banana , Weight = " + weight + " gram")
  }
}
case class Blackberries(override var weight : Int) extends Fruit() with Tiny with Black with Circular{
  override def describe: Unit = {
    println("Fruit Type : Blackberries , Weight = " + weight + " gram")
  }
}
case class Blueberries(override var weight : Int) extends Fruit() with Tiny with Blue with Circular{
  override def describe: Unit = {
    println("Fruit Type : Blueberries , Weight = " + weight + " gram")
  }
}
case class Cherries(override var weight : Int) extends Fruit() with Tiny with Red with Circular{
  override def describe: Unit = {
    println("Fruit Type : Cherries , Weight = " + weight + " gram")
  }
}
case class Coconut(override var weight : Int) extends Fruit() with Large with Brown with Circular{
  override def describe: Unit = {
    println("Fruit Type : Coconut , Weight = " + weight + " gram")
  }
}
case class Clementine(override var weight : Int) extends Fruit() with Medium with Orange with Circular{
  override def describe: Unit = {
    println("Fruit Type : Clementine , Weight = " + weight + " gram")
  }
}
case class Guava(override var weight : Int) extends Fruit() with Medium with Yellow with Oval{
  override def describe: Unit = {
    println("Fruit Type : Guava , Weight = " + weight + " gram")
  }
}
case class Kiwi(override var weight : Int) extends Fruit() with Tiny with Brown with Circular{
  override def describe: Unit = {
    println("Fruit Type : Kiwi , Weight = " + weight + " gram")
  }
}
case class Lemon(override var weight : Int) extends Fruit() with Tiny with Yellow with Circular{
  override def describe: Unit = {
    println("Fruit Type : Lemon , Weight = " + weight + " gram")
  }
}
case class Mango(override var weight : Int) extends Fruit() with Medium with Green with Oval{
  override def describe: Unit = {
    println("Fruit Type : Mango , Weight = " + weight + " gram")
  }
}
case class Mandarin(override var weight : Int) extends Fruit() with Medium with Orange with Circular{
  override def describe: Unit = {
    println("Fruit Type : Mandarin , Weight = " + weight + " gram")
  }
}
case class Peaches(override var weight : Int) extends Fruit() with Medium with Brown with Circular{
  override def describe: Unit = {
    println("Fruit Type : Peaches , Weight = " + weight + " gram")
  }
}
case class Pear(override var weight : Int) extends Fruit() with Medium with Green with Oval{
  override def describe: Unit = {
    println("Fruit Type : Pear , Weight = " + weight + " gram")
  }
}
case class Pineapple(override var weight : Int) extends Fruit() with Large with Yellow with Oval{
  override def describe: Unit = {
    println("Fruit Type : Pineapple , Weight = " + weight + " gram")
  }
}
case class Pomegranate(override var weight : Int) extends Fruit() with Large with Red with Circular{
  override def describe: Unit = {
    println("Fruit Type : Pomegranate , Weight = " + weight + " gram")
  }
}
case class Strawberries(override var weight : Int) extends Fruit() with Tiny with Red with Oval{
  override def describe: Unit = {
    println("Fruit Type : Strawberries , Weight = " + weight + " gram")
  }
}
case class Tangerine(override var weight : Int) extends Fruit() with Medium with Orange with Circular{
  override def describe: Unit = {
    println("Fruit Type : Tangerine , Weight = " + weight + " gram")
  }
}
case class Watermelon(override var weight : Int) extends Fruit() with Large with Green with Circular{
  override def describe: Unit = {
    println("Fruit Type : Watermelon , Weight = " + weight + " gram")
  }
}
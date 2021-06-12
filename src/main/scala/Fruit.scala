abstract class Fruit(){
  var weight : Int
  val kind : String
  def describe: Unit ={
    println("Fruit Type : " + kind +  " , Weight = " + weight + " gram")
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
  override val kind: String = "Apple"
}
case class Avocado(override var weight : Int) extends Fruit() with Medium with Green with Oval{
  override val kind: String = "Avocado"
}
case class Banana(override var weight : Int) extends Fruit() with Medium with Yellow with Oval{
  override val kind: String = "Banana"
}
case class Blackberries(override var weight : Int) extends Fruit() with Tiny with Black with Circular{
  override val kind: String = "Blackberries"
}
case class Blueberries(override var weight : Int) extends Fruit() with Tiny with Blue with Circular{
  override val kind: String = "Blueberries"
}
case class Cherries(override var weight : Int) extends Fruit() with Tiny with Red with Circular{
  override val kind: String = "Cherries"
}
case class Coconut(override var weight : Int) extends Fruit() with Large with Brown with Circular{
  override val kind: String = "Coconut"
}
case class Clementine(override var weight : Int) extends Fruit() with Medium with Orange with Circular{
  override val kind: String = "Clementine"
}
case class Guava(override var weight : Int) extends Fruit() with Medium with Yellow with Oval{
  override val kind: String = "Guava"
}
case class Kiwi(override var weight : Int) extends Fruit() with Tiny with Brown with Circular{
  override val kind: String = "Kiwi"
}
case class Lemon(override var weight : Int) extends Fruit() with Tiny with Yellow with Circular{
  override val kind: String = "Lemon"
}
case class Mango(override var weight : Int) extends Fruit() with Medium with Green with Oval{
  override val kind: String = "Mango"
}
case class Mandarin(override var weight : Int) extends Fruit() with Medium with Orange with Circular{
  override val kind: String = "Mandarin"
}
case class Peaches(override var weight : Int) extends Fruit() with Medium with Brown with Circular{
  override val kind: String = "Peaches"
}
case class Pear(override var weight : Int) extends Fruit() with Medium with Green with Oval{
  override val kind: String = "Pear"
}
case class Pineapple(override var weight : Int) extends Fruit() with Large with Yellow with Oval{
  override val kind: String = "Pineapple"
}
case class Pomegranate(override var weight : Int) extends Fruit() with Large with Red with Circular{
  override val kind: String = "Pomegranate"
}
case class Strawberries(override var weight : Int) extends Fruit() with Tiny with Red with Oval{
  override val kind: String = "Strawberries"
}
case class Tangerine(override var weight : Int) extends Fruit() with Medium with Orange with Circular{
  override val kind: String = "Tangerine"
}
case class Watermelon(override var weight : Int) extends Fruit() with Large with Green with Circular{
  override val kind: String = "Watermelon"
}
case class Comparator() {

  def compareFruits(fruit1 :Fruit,fruit2: Fruit): Int ={
    if (fruit1.weight == fruit2.weight)
      0
    else if (fruit1.weight > fruit2.weight)
      1
    else
      -1
  }
}

import scala.collection.mutable.ListBuffer
import scala.language.postfixOps
import scala.util.Random

object MainClass {

  val numberOfFruits : Int = 100

  def main(args: Array[String]): Unit = {
    //Generating random fruits
    val BST : BinarySearchTree = BinarySearchTree()
    val FruitsTypes  = List(Apple,Avocado,Banana,Blackberries,Blueberries,Cherries,Coconut,Clementine,Guava
    ,Kiwi,Lemon,Mango,Mandarin,Peaches,Pear,Pineapple,Pomegranate,Strawberries,Tangerine,Watermelon)
    for (_ <- 1 to numberOfFruits){
      val randomFruit : Fruit = FruitsTypes(Random.between(0,20))(Random.between(1,5001))
      BST insert randomFruit
    }

    println("\nInOrder Traversing :\n" +
            "--------------------")
    BST.Iterate()
    println("--------------------")


    print("Filtering the Apple :\n" +
      "---------------------\n")
    BST.filterByType(Apple)
    println("--------------------")


    println("Filtering the Watermelon :\n" +
            "--------------------------")
    BST.filterByType(Watermelon)
    println("--------------------")


    println("Filtering by weight fruits heavier than 3KG :\n" +
            "--------------------------------------------")
    BST.filterByWeight(3000)
    println("--------------------")


    println("Filtering by weight fruits heavier than 4KG :\n" +
             "--------------------------------------------")
    BST.filterByWeight(4000)
    println("--------------------")


    println("Magnifying all the bananas by 200 Grams :\n" +
            "-----------------------------------------")
    BST.magnifyByType(Banana,200)
    println("--------------------")

    println("Magnifying all the tangerine by 50 Grams :\n" +
      "-----------------------------------------")
    BST.magnifyByType(Tangerine,50)
    println("--------------------")


    print ("The heaviest fruit is : ")
    BST.findHeaviest().fruit.describe

    print("The Lightest fruit is : ")
    BST.findLightest().fruit.describe

  }
}
import scala.collection.mutable.ListBuffer
import scala.language.postfixOps

case class Node(var fruit: Fruit = null, var left :Node =null , var right: Node = null)

case class BinarySearchTree(var root: Node = null){

  //Delegation
  val comparator = Comparator()

  //Insert Function
  def insert (fruit: Fruit , node :Node = root): Unit ={
    if (root == null) {
      root = Node(fruit)
    } else {
      //Delegation
      val compare :Int = comparator.compareFruits(fruit,node.fruit)
      //Pattern Matching
      compare match{
        case 0 | -1 =>{
          if (node.left == null)
            node.left = Node(fruit)
          else
            insert(fruit,node.left)
        }
        case 1 =>{
          if (node.right == null)
            node.right = Node(fruit)
          else
            insert(fruit,node.right)
        }
      }
    }
  }

  //This function takes an
  def Iterate (list:ListBuffer[Fruit] = ListBuffer[Fruit](), node: Node = root , print: Boolean = true): ListBuffer[Fruit] ={
    if (node == null)
       return null
    if (node.left != null)
      Iterate(list,node.left,print)
    if (print) {
      node.fruit describe
    }
    list.addOne(node.fruit)
    if (node.right != null)
      Iterate(list,node.right,print)
     list
  }

  def filterByType(Type : AnyRef): ListBuffer[Fruit] ={
    val inOrderList = this.Iterate(print = false)
    //Higher Order function
    val filterFunction = (fruit:Fruit) => fruit.getClass().toString().substring(6).equals(Type.toString())
    val newList = inOrderList.filter(filterFunction)
    newList.foreach(f=> f describe)
    newList
  }

  def filterByWeight(Weight:Int): ListBuffer[Fruit] ={
    val inOrderList = this.Iterate(print = false)
    //Higher Order function
    val filterFunction = (fruit:Fruit) => fruit.weight>Weight
    val newList = inOrderList.filter(filterFunction)
    newList.foreach(f=> f.describe)
    newList
  }

  def magnifyByType(Type : AnyRef,Weight : Int): ListBuffer[Fruit] ={
    val inOrderList = this.Iterate(print = false)
    //Higher order function
    val magnifyFunction = (fruit:Fruit) => {
      if (fruit.getClass.toString.substring(6).equals(Type.toString))
        fruit.weight += Weight
    }
    println("Values before : " + inOrderList.filter(f=> f.getClass.toString.substring(6).equals(Type.toString)))
    inOrderList.foreach(magnifyFunction)
    println("Values after : " + inOrderList.filter(f=> f.getClass.toString.substring(6).equals(Type.toString)))
    //Reconstructing the Tree
    val newTree :BinarySearchTree  = BinarySearchTree()
    inOrderList.foreach(f => newTree.insert(f))
    this.root = newTree.root
    inOrderList
  }

  def findHeaviest(node : Node = root):Node={
    if (node == null)
      return null
    if (node.right != null)
      findHeaviest(node.right)
    else
      node
  }
  def findLightest(node : Node = root):Node={
    if (node == null)
      return null
    if (node.left != null)
      findLightest(node.left)
    else
      node
  }
}

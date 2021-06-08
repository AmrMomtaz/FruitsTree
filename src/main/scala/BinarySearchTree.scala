import scala.language.postfixOps

case class BinarySearchTree(var root: Node = null){

  //Delegation
  val comparator = Comparator()

  def insert (fruit: Fruit , node :Node = root): Unit ={
    if (root == null)
      root = Node(fruit)
    else {
      val compare :Int = comparator.compareFruits(fruit,root.fruit)
      if (compare <= 0){
        if (node.left == null)
          node.left = Node(fruit)
        else
          insert(fruit,node.left)
      }else{
        if (node.right == null)
          node.right = Node(fruit)
        else
          insert(fruit,node.right)
      }
    }
  }
}

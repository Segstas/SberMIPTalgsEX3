object Ex3 {
  def calcLists(listA: List[Int], list1: List[Int], list2: List[Int], flag: Int): List[Int] =
    listA match {
      case Nil =>
        list1 ::: list2
      case a :: xs if flag > 0 =>
        calcLists(listA.tail, list1 :+ listA.head , list2, -flag)
      case a :: xs if flag < 0 =>
        calcLists(listA.tail, list1, list2 :+ listA.head, -flag)
    }
}


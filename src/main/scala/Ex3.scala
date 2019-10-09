object Ex3 {
  def calcLists(listA: List[Int], list1: List[Int], list2: List[Int], flag: Int): List[Int] =
    listA match {
      case Nil => {
        list1.reverse ::: list2.reverse
      }
      case a :: xs if flag > 0 => {
        listA ++ list1
        calcLists(listA.tail, listA.head :: list1, list2, flag * (-1))
      }
      case a :: xs if flag < 0 => {
        listA ++ list2
        calcLists(listA.tail, list1, listA.head :: list2, flag * (-1))
      }
    }
}


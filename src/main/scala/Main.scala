object Main extends App {
  var testList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
  for (ans <- Ex3.calcLists(testList,Nil,Nil,1))
    print(ans) ///Ans =13572468
}

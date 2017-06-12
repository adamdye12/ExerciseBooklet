def Calculator2(list: List[Int], index: Int = 0): Unit = {
  var inc = 1
  while (inc < list.size) {
    val list2 = operate(list(index), list((index + inc) % list.size))
    for(x<- 0 until   list2.size ){
      if( list.contains(operate(list(index), list((index + inc) % list.size))(x))) {
        println("ANS -  "+list(index)+ " , " +list((index + inc) % list.size)+ " , " +  list2(x))
       }}
    inc += 1}
  if (index != list.size - 1) {Calculator2(list, (index + 1) % list.size)}
}

def operate(x: Int, y: Int): List[Int] = {
  val valueList = List(x + y, x-y, x*y, x/y)
  valueList
}

Calculator2(List(5, 3, 5, 3))












//OLD VERSION

//def Calculator(list: List[Int], index: Int = 0): Unit = {
//  var inc = 1
//  while (inc < list.size) {
//    var value = list(index) * list((index + inc) % list.size)
//    if (list.contains(value)) {
//      println("Multiplication " + list(index), list((index + inc) % list.size), value)
//    }
//    value = list(index) + list((index + inc) % list.size)
//    if (list.contains(value)) {
//      println("Addition " + list(index), list((index + inc) % list.size), value)
//    }
//    value = list(index) / list((index + inc) % list.size)
//    if (list.contains(value)) {
//      println("Division " + list(index), list((index + inc) % list.size), value)
//    }
//    value = list(index) - list((index + inc) % list.size)
//    if (list.contains(value)) {
//      println("Subtraction " + list(index), list((index + inc) % list.size), value)
//    }
//    inc += 1
//  }
//
//  if (index != list.size - 1) {
//    Calculator(list, ((index + 1) % list.size))
//  }
//}
//
//Calculator(List(5, 3, 15))










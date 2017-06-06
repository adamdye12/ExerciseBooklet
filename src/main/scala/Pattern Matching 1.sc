def twoIntegers (intInput1: Int, intInput2: Int, isTrue: Boolean): Int = {
  isTrue match {
    case true => intInput1 + intInput2
    case false => intInput1 * intInput2
  }
}
twoIntegers(2, 5, false)

def twoIntegers (intInput1: Int, intInput2: Int): Unit = {
  (intInput1,intInput2) match {
    case (0, 0)=> println(0)
    case (_, 0)=> println(intInput1)
    case (0, _)=> println(intInput1)
  }
}
twoIntegers(1, 0)





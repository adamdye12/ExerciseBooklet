def uniqueSum (intInput1 : Int, intInput2 : Int, intInput3 : Int): Int = {
  val array: Array[Int] = Array(intInput1, intInput2, intInput3)
  var sum: Int=0
  if (array(0) == array(1) && array(1) == array(2)){
    array(0) = 0
    array(1) = 0
    array(2) = 0
  }
  if (array(0) == array(1)){
    array(0) = 0
    array(1) = 0
  }
  if (array(0) == array(2)){
    array(0) = 0
    array(2) = 0
  }
  if (array(1) == array(2)){
    array(1) = 0
    array(2) = 0
  }
  for (index <- 0 to 2) {
    sum += array(index)
  }
  return sum
}

uniqueSum(1,2,3)
uniqueSum(3,3,3)
uniqueSum(1,1,2)
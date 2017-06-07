def blackJack (intInput1 : Int, intinput2 : Int): Unit ={
  if (intInput1 > 21 && intinput2 > 21) {
    println("0")
  } else if (intInput1 > intinput2) {
      println(intInput1)
    } else println(intinput2)


}
blackJack(13,21)
blackJack(20,18)
blackJack(22,22)
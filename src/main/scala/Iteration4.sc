def iteration1 (stringInput1 : String, intInput1 : Int): Unit = {
  if (intInput1 > 0) {
    println(stringInput1)
    iteration1(stringInput1, intInput1 - 1)
  }
}
iteration1("Hi", 3)


def iteration2 (stringInput1 : String, intInput1 : Int, intInput2 : Int): Unit = {
  if (intInput1 > 0) {
    println(stringInput1*intInput2)
    iteration2(stringInput1, intInput1 - 1, intInput2)
  }
}
iteration2("H", 4, 4)


def iteration (stringInput1 : String, stringInput2 : String, max : Int, counter : Int): Unit = {
  if (counter <= max) {
    if (counter % 3 == 0 && counter % 5 == 0)
      print(stringInput1.concat(stringInput2))
    else if (counter % 3 == 0)
      print(stringInput1 + ",")
    else if (counter % 5 == 0)
      print(stringInput2 + ",")
    else {
      print(counter + ",")
    }
    iteration(stringInput1, stringInput2, max, counter + 1)
  }
}
iteration ("Fizz", "Buzz", 15, 0)




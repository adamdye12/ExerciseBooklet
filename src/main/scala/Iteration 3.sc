def iteration (stringInput1 : String, stringInput2 : String, intInput : Int): Unit = {
  for (i<-1 to intInput) {
    if (i % 3 == 0 && i % 5 == 0)
      print(stringInput1.concat(stringInput2))
    else if (i % 3 == 0)
      print(stringInput1 + ",")
    else if (i % 5 == 0)
      print(stringInput2 + ",")
    else {
      print(i + ",")
    }
  }
}
iteration ("Fizz", "Buzz", 15)
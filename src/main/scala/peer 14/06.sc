def gold (weight: Int, temp: Int, arrayOfSeats: Array[Int], arrayOfTemps: Array[Int]): String = {
  var toReturn = ""
  for (i <- 0 to arrayOfSeats.length-1) if(weight < arrayOfSeats(i) && temp > arrayOfTemps(i)) toReturn = toReturn + i + " "
  toReturn
}
var seatingArray = Array(30, 130, 90, 150, 120, 200, 110)
var tempArray= Array (80, 50, 75, 60, 85, 70, 200, 100)
var weight = 100
var temp = 80
println(gold(weight, temp, seatingArray, tempArray))
def gold (weight: Int, temp: Int, arrayOfSeats: Array[Int], arrayOfTemps: Array[Int]): String = {
  var toReturn = ""
  for (i <- 0 to arrayOfSeats.length-1) if(weight < arrayOfSeats(i) && temp > arrayOfTemps(i)) toReturn = toReturn + (i+1) + " "
  toReturn
}
var seatingArray = Array(30, 130, 90, 150, 120, 200, 110)
var tempArray= Array (50, 75, 60, 85, 70, 200, 100)
var weight = 100
var temp = 80
println(gold(weight, temp, seatingArray, tempArray))

var challengeInput = "100 120 297 90 66 110 257 113 276 191 280 129 219 163 254 193 86 153 206 147 71 137 104 40 238 127 52 146 129 197 144 59 157 124 210 59 11 54 268 119 261 121 12 189 186 108 174 21 77 18 54 90 174 52 16 129 59 181 290 123 248 132"
var challArray = challengeInput.split(" ")
var chalWeight = challArray(0).toInt
var chalTemp = challArray(1).toInt
var chalSeatBuffer = scala.collection.mutable.ArrayBuffer.empty[Int]
var chalTempArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Int]
for(i <- 2 to challArray.length-1){
  if(i%2 == 0)  chalTempArrayBuffer += challArray(i).toInt
  else chalSeatBuffer += challArray(i).toInt
}
println(gold(chalWeight, chalTemp, chalSeatBuffer.toArray, chalTempArrayBuffer.toArray))


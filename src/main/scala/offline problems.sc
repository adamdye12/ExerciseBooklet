import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array
def stringInput (input1: String): String = {
  val stringOutput : String = ""
  for (i <- 1) {
    stringOutput = input1.substring(input1)
    println(stringOutput)
}
//tried to turn the input into a substring of itself to print twice.
}

stringInput("The")
stringInput("AAbb")
stringInput("Hi-There")


def getSandwich (string1: String): String = {
  val getJam : String = ""
    getJam = string1.split("jam")
    println(getJam)
}
//thought i could split around jam and remove other elements of array
getSandwich("breadjambread")
getSandwich("xxbreadjambreadyy")
getSandwich("xxbreadyy")


def evenlySpaced(int1: Int, int2: Int, int3: Int): Boolean = {
  var isTrue: Boolean = true
  if { (int1 + int2 + int3 % 2 == 0) == isTrue
    return true
  }
  else {
    return false
  }
}
//Tried to find if sum was even as an odd total would not be evenly spaced
evenlySpaced(2, 4, 6)
evenlySpaced(4, 6, 2)
evenlySpaced(4, 6, 3)

def nTwice (str1: String, int1: Int): String ={
  trim()
}

nTwice("Hello", 2)
nTwice("Chocolate", 3)
nTwice("Chocolate", 1)


//Task9
println("   -")
println("  ---")
println(" -----")
println("  ---")
println("   -")

//Task 10
println("   /\\")
println("  /  \\ ")
println(" /    \\  ")
println(" \    // ")
println("  \  // " )
println("   \// ")








def twoIntegers (intInput1: Int, intInput2: Int, boolean1: Boolean): Int = {
  if (boolean1) {
    intInput1 + intInput2
  } else {
    intInput1 * intInput2
  }
}
twoIntegers(2, 5, false)
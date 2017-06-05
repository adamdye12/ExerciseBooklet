def fourParameters (stringInput1: String, stringInput2: String, charInput1: Char, charInput2: Char): String = {
  var concatString: String = ""
  concatString = stringInput1.concat(stringInput2)
  var replaceString: String = ""
  replaceString = concatString.replace(charInput1, charInput2)
  replaceString
}
fourParameters("Ha", "llo", 'a', 'e')
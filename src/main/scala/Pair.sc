var decipher = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.— ".replace("—", "--")
var morseArray = decipher.split(' ')

def morse(morseCode: String): String = {
  morseCode match {
    case ".-" => "A"
    case "-..." => "B"
    case "-.-." => "C"
    case "-.." => "D"
    case "." => "E"
    case "..-." => "F"
    case "--." => "G"
    case "...." => "H"
    case ".." => "I"
    case ".---" => "J"
    case "-.-" => "K"
    case ".-.." => "L"
    case "--" => "M"
    case "-." => "N"
    case "---" => "O"
    case ".--." => "P"
    case "--.-" => "Q"
    case ".-." => "R"
    case "..." => "S"
    case "-" => "T"
    case "..-" => "U"
    case "...-" => "V"
    case ".--" => "W"
    case "-..-" => "X"
    case "-.--" => "Y"
    case "--.." => "Z"
    case "/" => " "
    case _ => ""
  }
}



  var i = 0
  var decoded:String = ""

  while (i < morseArray.length) {

    decoded += morse(morseArray(i))
    i = i + 1
  }

print(decoded)

def tooHot (temperature : Int, isSummer : Boolean): Boolean = {
  if (temperature >= 60 && temperature <= 90)
  {
    return true
  }
    else if (temperature >= 60 && temperature <= 100 && isSummer == true) {
    return true
  }
  else {
    return false
  }
}

tooHot(80, false)
tooHot(100, false)
tooHot(100, true)



/*Given an integer value and a Boolean value,temperature and isSummer, if temperature is
between 60 and 90 (inclusive), unless its summer where the upper limit is 100 instead of 90.
Return true if the temperature falls within the range, false other
  wise*/

class Day1ChronalCalibration{
  Integer calculate(String numbers){
    Integer result = 0
    numbers.eachLine{ number ->
      switch(number[0]){
        case "+":
          result += number.substring(1) as Integer
          break
        case "-":
          result -= number.substring(1) as Integer
          break
      }
    }
    result
  }
}

class Day1ChronalCalibration{
  Integer calculate(String numbers){
    Integer result = 0
		numbers.eachLine{
			result += it as Integer
		}
		result
  }

	Integer sameFrequency(String numbers){
		Integer result = iterateListOfNumbers(numbers)
		result
	}

	Integer iterateListOfNumbers(String numbers){
		Integer currentNumber = 0
		List numberList = []
		Boolean end = false
		while(true){
			numbers.eachLine{ number ->
				currentNumber += number as Integer
				if(numberList.contains(currentNumber)){
					println "Repeated number $currentNumber"
					end = true
				}
				numberList << currentNumber
			}
			if(end) break
		}
	currentNumber
	}

}

@Grab(group='org.spockframework', module='spock-core', version='1.2-groovy-2.5', scope='test')
import spock.lang.Specification

class Day1ChronalCalibrationSpec extends Specification{
  def day1 = new Day1ChronalCalibration()

  void "Should get the result of the first case"(){
    given: "A list of numbers"
      String numbers = """+1
+1
+1"""
    when: "The method is executed"
      Integer result = day1.calculate(numbers)
    then: "The result"
      assert result == 3
  }

  void "Should get the result of the second case"(){
    given: "A list of numbers"
      String numbers = """+1
+1
-2"""
    when: "The method is executed"
      Integer result = day1.calculate(numbers)
    then: "the result"
      assert result == 0
  }

  void "Should get the result of the third case"(){
    given: "A list of numbers"
      String numbers = """-1
-2
-3"""
    when: "The method is executed"
      Integer result = day1.calculate(numbers)
    then: "the result"
      assert result == -6
  }

  void "Should get the result of the exercise"(){
    given: "A text file"
      String numbers = new File('Day1.txt').text
    when: "The method is excuted"
      Integer result = day1.calculate(numbers)
    then: "The result"
			println "Part 1 "
			println "--------------------------"
      println result
			println "--------------------------"
      assert result
  }

	void "Should get the same frequency for the first case"(){
		given: "A list of numbers"
			String numbers = """+1
-1
"""
		when: "The method is executed"
			Integer result = day1.sameFrequency(numbers)
		then: "The result"
			assert result == 0
	}

	void "Should get the same frequency for the second case"(){
		given: "A list of numbers"
			String numbers = """+3
+3
+4
-2
-4
"""
		when: "The method is executed"
			Integer result = day1.sameFrequency(numbers)
		then: "The result"
			assert result
	}

	void "The result of the exercise"(){
		given: "A text file"
      String numbers = new File('Day1.txt').text
    when: "The method is excuted"
			Integer result = day1.sameFrequency(numbers)
    then: "The result"
			println "Part 2"
			println "--------------------------"
      println result
			println "--------------------------"
      assert result
	}
}

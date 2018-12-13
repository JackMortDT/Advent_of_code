@Grab(group='org.spockframework', module='spock-core', version='1.2-groovy-2.5', scope='test')
import spock.lang.Specification

class Day2InventoryManagementSystemSpec extends Specification{
  def day2 = new Day2InventoryManagementSystem()

  void "Should get the result for the first case"(){
    given: "an ID's"
      String ids = "bababc"
    when: "the method is executed"
      Integer result = day2.calculateTheInventorySystem(ids)
    then:
      assert result == 1
  }

  void "Should get the result for the second case"(){
    given: "and ID's"
      String ids = "abbcde"
    when: "the method is executed"
      Integer result = day2.calculateTheInventorySystem(ids)
    then:
      assert result == 0
  }

  void "Should get the result for the third case"(){
    given: "an ID's"
      String ids = "abcccd"
    when: "the method is executed"
      Integer result = day2.calculateTheInventorySystem(ids)
    then:
      assert result == 0
  }

  void "Should get the result for the fourth case"(){
    given: "an ID's"
      String ids = """bababc
bababc
"""
    when: "the method is executed"
      Integer result = day2.calculateTheInventorySystem(ids)
    then:
      assert result == 4
  }

  void "Should get the result for the excercice"(){
    given: "a txt file"
      String ids = new File('Day2.txt').text
    when: "the method is executed"
      Integer result = day2.calculateTheInventorySystem(ids)
    then:
			println "Part 1"
			println "--------------------------"
      println result
			println "--------------------------"
      assert result
  }
}

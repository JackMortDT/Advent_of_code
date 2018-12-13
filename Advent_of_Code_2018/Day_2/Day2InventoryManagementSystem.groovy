class Day2InventoryManagementSystem{
  Integer calculateTheInventorySystem(String ids){
    Integer three = 0
    Integer two = 0
    ids.eachLine{ id ->
    Integer threeLetters = 0
    Integer twoLetters = 0
      id.each{ letter ->
        id.findAll(letter).size() == 3 ? threeLetters++ : 0
        id.findAll(letter).size() == 2 ? twoLetters++ : 0
      }
      threeLetters ? three++ : 0
      twoLetters ? two++ : 0
    }
    three * two
  }
}

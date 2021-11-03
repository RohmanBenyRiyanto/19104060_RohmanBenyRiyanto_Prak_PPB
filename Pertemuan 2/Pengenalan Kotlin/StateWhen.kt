fun StWhen (){
  
  val value = 20
  when(value){
      6 -> println("value is 6")
      7 -> println("value is 7")
      8 -> println("value is 8")
      else -> println("value cannot be reached")
  }

  // var variable = "teks"
  // when (variable){
  //   is String -> println("String")
  //   is Int -> println("Int")
  //   is Double -> print('Double')
  //   else -> println("not reach")
  // }


  val value2 = 27
  val ranges = 10..50
  when(value2){
      in ranges -> println("value is in the range")
      !in ranges -> println("value is outside the range")
      else -> println("value undefined")



}
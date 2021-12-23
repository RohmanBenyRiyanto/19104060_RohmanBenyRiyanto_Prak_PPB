// Variabel static
  val valString = "ini String"
  val valInt = 123

  // Variabel dinamis
  var varString = "Iki String"
  var varInt = 456
  
  //Tipe Data
  //secara manual 
  var varMString : String = "sebuah teks"

  //tipedata referensi
  // var kelas : Kelas

  var penggabunganStr = "Angka ${valInt + varInt}"
  println(penggabunganStr)

  var gabungStr = "Angka $varInt"
  println(gabungStr)

  varString = "ubah"

  println(varString)
  print("Hello world!")
  println("Hello world!")
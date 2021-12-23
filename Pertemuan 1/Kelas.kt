

class Kelas (nama : String, id : Int, nilai : Double) : Prodi()  {
  
  private var nilaiC : Double 

  init{
      nilaiC = nilai * 0.01
  }

  fun Prosedur (nilai : Double){
    // logika
  }

  fun Fungsi (nilai : Double) : Double {
    //logika
    return nilai
  }

  fun Fungsi2 (nilai : Double) = "Sebuah kata $nilai" //return String

  fun Fungsi3 (nilai : Double) = nilai * nilaiC //return Double
}
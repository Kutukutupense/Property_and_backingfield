fun main(){
    // main fonksiyon içersinde değişkenleri private,internal vs yapamayız
    // çünkü buradaki değişken ve fonksiyonlar lokal değişken ve lokal fonksiyondur
    // bu yüzden değerleri kendilerine eşittir ve bir properyleri yoktur.
    //Çünkü bunları fun main() dışında zaten kullanamayız nedeni bu.

    private val name:String = "eylem" //
    private fun topla(numberOne: Int, numberTwo:Int):Int{
        return numberOne + numberTwo
    }
}
//classlarda ise bir değişken oluşturduğumuzda onların otomatik olarak arka planda (showkotlinbytecode) a bak.
// onların get() ve set() fonksiyonları oluşturulur bunlara property denir
//örneğin name değeri arkaplanda field olarak durur. (backingfield) yani asıl name değişkeninin değeri
// field'dır.
class Insan(){
    val name:String = "Eylem"  //arkaplanda get() fonksiyonu oluştu val olduğu için set() oluşmadı
    private val age: Int = 35  // private olduğu için get() set() fonksiyonları oluşmadı
    var nickName: String = "Kutukutupense" // get() ve set() fonksiyonları oluştu.



}
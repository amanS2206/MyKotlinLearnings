fun main(args: Array<String>) {
/*    val name = "Hello World"
    print("${name.toUpperCase()}")*/

  var i: Int = 100
    println(i)
    i = 90
    print(i)

/*
  val i: Int = 500
  print(i)
  i = 50 // Shows error because val are immutable
*/


/*
Everything is a class in Kotlin

There are 4 types of Number classes in Kotlin:
  1. Byte - 1 Byte
  2. Short - 2 Byte
  3. Int - 4 Byte
  4. Long - 8 Byte*/

/*
* There are 2 types of classes for floating numbers
* No.     ClassName   Size        Significant Bits      Exponent Bits    Decimal Digits
* 1.      Float       4 Byte              24                  8              6-7
* 2.      Double      8 Byte              53                  11            15-16
*
* Default type of decimal number is Float
*
*
* val pi = 3.14 // Double
* val e = 2.7182818284 // Double
* val eFloat = 2.7182818284f // Float, actual value is 2.7182817
* */

//  There is no implicit type conversion for classes in Kotlin

  fun printNum(n: Int){
    printNum(n)
  }

  /*val q: Int = 10
  val w: Float = 12.4f
  val e: Short = 11

  OR
  val q = 10
  val w = 12.4f
  val e = 11.6

  printNum(q)
  printNum(w) // Shows Error: Type Mismatch
  printNum(e) // Shows Error: Type Mismatch
*/

//No support for octal in Kotlin
//Long must have L in end
//Supports _ just like java in numbers e.g. val currency: Long = 10_000_000L

}

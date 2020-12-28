import kotlin.reflect.typeOf

fun main(args: Array<String>) {
/*    val name = "Hello World"
    print("${name.toUpperCase()}")*/

/*
  var i: Int = 100
    println(i)
    i = 90
    print(i)
*/

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
// For explicit type conversions we have methods like .toByte(), ,toShort(), .toInt(), .toLong(), .toFloat()
// , .toChar(), .toDouble(), .toString()
/*
  fun printNum(n: Int){
    printNum(n)
  }
*/

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

/*
  val name = "Kanishk"
  if(name == "Kanishk"){
    println("Yes")
  }
  else{
    print("No")
  }
*/
//If and else are same as java in Kotlin

//  Switch case is called as when in Kotlin, e.g.
 /* val num: Int = 10
  when(num){
    10 -> {
      print("It is 10")
    }
    12 ->{
      print("It is 12")
    }
    else ->{
      print("Bhai, kuch bhi mt input de yaar... ")
    }

  }
println()*/

/*  val name: String = "Kotlin"
  when(name) {
    "Kotlin" -> {
      print("It is Kotlin")
    }
    "Jet Brains" -> {
      print("It is Jet Brains")
    }
    else -> {
      print("Bhai, kuch bhi mt input de yaar... Abhi to bataya tha tujhe ")
    }
  }*/

  // Else must be always at last of all the cases in kotlin
  // We can also assign when values and if values in Kotlin, like
/*
  val num = 10
  val isNumberEqualsToTen = if(num == 10){
    print("It is 10")
  }
  else{
    print("It is not 10")
  }
  print(isNumberEqualsToTen) // It returns kotlin.Unit which is a Kotlin class
*/

/*  Unit datatype means nothing
  Any datatype means anything - It is the root of every class of Kotlin just like Object in Java
  */


//  Arrays in Kotlin

  // val nums = arrayOf(1,2,3,4,5,6,7,8,9,0)
  // print(nums) // prints   [Ljava.lang.Integer;@1b2c6ec2

/*  for (num in nums){
    println(num)
  }
  */

/*  nums.forEach {
    print(it)
  }*/
  // .forEach is a high order function in Kotlin


//  Ranges

  /*for(i in 0..9){
    print(i)
  }*/
  // .. is used to create a temporary list and this for loop is similar to python for loop

  for(i in 0..9 step 2){
    print(i)
  }

  // step is used to tell kotlin that by which value we want to increment the counter
}

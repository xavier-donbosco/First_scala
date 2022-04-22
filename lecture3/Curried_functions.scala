package lecture3

object Curried_functions extends App {
//  val superAdder:(Int)=>(Int=>Int)=(x:Int) =>(y: Int) => x+y
//  println(superAdder(2)(5))
  def curried_functions(c:String)(x:Double):String=c.format(x)
    val standardFormat=curried_functions("%4.2f")
    val preciseFormat:(Double=>String)=curried_functions("%10.8f")
    println(standardFormat(Math.PI))
    println(preciseFormat(Math.PI))
}

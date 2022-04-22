package lecture3

object function_1 extends App {
  val obj1=new Function[Int,Int] {
    def apply(element: Int): Int = element * 2
  }
  println(obj1(2))

  val obj2=new Function[String,Int] {
    def apply(v1: String): Int = v1.toInt
  }
  println(obj2("5710")+1)

  val obj3:((Int,Int)=>Int)=new Function2[Int, Int, Int]{
    override def apply(a: Int,b: Int): Int=a+b
  }
  println(obj3(2,2))
}

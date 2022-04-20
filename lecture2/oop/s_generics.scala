package lecture2.oop

object s_generics extends App {
  abstract class typeof[A]{
    def typeof(x:A, y:A):A
  }
  class TypeInt extends typeof[Int]{
    override def typeof(x: Int, y: Int): Int = x/y
  }
  class TypeDouble extends typeof[Double]{
    override def typeof(x: Double, y: Double): Double = x/y
  }
  class TypeFloat extends typeof[Float]{
    override def typeof(x: Float, y: Float): Float = x/y
  }
  val in=new TypeInt
  println(in.typeof(27,7))
  val dobu=new TypeDouble
  println(dobu.typeof(27,7))
  val flo=new TypeFloat
  println(flo.typeof(27,7))
}

package lecture2.oop
import Numeric._
object s1_generics extends App {
  def sample[A](a: A, b: A)(implicit num: Numeric[A]):A= num.plus(a,b)
  println("Addition of two number is "+sample(22,22))
}

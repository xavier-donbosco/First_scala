package lecture2.oop

object access_specifiers extends App {
  class Eat{
    protected def eat: String ="I can eat"
  }
  class Animal extends Eat {
    def cat: String="Cat"
    println(eat)
  }
  val animal=new Animal
  println(animal.cat)

}

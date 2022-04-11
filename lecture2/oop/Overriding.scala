package lecture2.oop

object Overriding extends App {
  class Animal{
    val x: String="Hi, I am Xavier"
    def y=println("I am 21")
  }
  class Cat extends Animal {
    override val x="Hi, I am Jack"
    override def y=println("I am 18")
  }
  val cat=new Cat
  println(cat.x)
  cat.y
}

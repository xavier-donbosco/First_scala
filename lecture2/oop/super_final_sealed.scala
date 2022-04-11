package lecture2.oop

object super_final_sealed extends App {
sealed class Animal{
  def eat=println("I am animal and I can eat")
  final def behaviour:Boolean=true
}
class Cat extends  Animal {
  println(s"is behaviour of the animal is good : $behaviour")
  super.eat
  override def eat=println("I can eat fish")
}
val cat=new Cat
cat.eat
}

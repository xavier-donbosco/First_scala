package lecture2.oop

object Polymorphism extends App {
  
class Animal{
  def eat=println("I am animal")
}
class Cat extends Animal{
  
  override def eat: Unit = println("I am animal and I can eat")
}
val ani=new Animal
ani.eat

val c1=new Cat
c1.eat

//polymorphic call
val cat:Animal =new Cat

cat.eat
}

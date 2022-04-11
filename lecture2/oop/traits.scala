package lecture2.oop

object traits extends App {
  abstract class Animal{
    val creatureType:String
    def eat:Unit
  }
  class Dog extends Animal {
    override val creatureType: String = "Dog"
    override def eat: Unit = println("I can eat")
  }
  trait cheta{
    def eat(animal: Animal):Unit
  }
  class Crocadail extends Animal with cheta{
    override val creatureType="Crocadile"
    override def eat: Unit = println("I am a cheta")
    override def eat(animal: Animal): Unit = println(s"I am a animal and I can eat ${animal.creatureType}")

  }
  val dog=new Dog
  val crock=new Crocadail
  crock.eat(dog)
}

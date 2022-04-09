package lecture2.oop
// This is single line comment
/*
  This is multi-line comment
*/
object inheritance extends App {
  val beast=new Beast
  println(beast.creatureType)
  println(beast.eat)

}
abstract class Animal{
  val creatureType: String
  def eat: Unit
}
class Beast extends Animal{
  val creatureType="Bird"
  def eat=println("Crunch crunch")
}

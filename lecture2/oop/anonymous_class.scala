package lecture2.oop

object anonymous_class extends App {
class john(name: String){
  def greet: Unit=println(s"Hi my name is $name and its good to see you around")
}
val jebaraj:john=new john("jebaraj"){
  override def greet: Unit = println(s"Hi my name is jebaraj and nice to see you")
}
println(jebaraj.greet)
println(jebaraj.getClass)
}

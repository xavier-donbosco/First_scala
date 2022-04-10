package lecture2.oop

object objects extends App {
  val x=sample.x
  val y=sample.y
  val z=sample.z
  println(s"The value of x is $x \nThe value of y is $y\nThe value of z is $z")
  sample.show("xavier",21)
  val show=new Show("Xavier")
}
object sample{
  val x: Int=23
  var y: Int=24
  def z: Int=25
  def show(name: String, age: Int): Unit={
    println(s"Hi my name is $name and my age is $age")
  }
}
class Show(name: String){
  println(name)
}

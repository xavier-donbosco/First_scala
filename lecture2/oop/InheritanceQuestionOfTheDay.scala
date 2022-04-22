package lecture2.oop

object InheritanceQuestionOfTheDay extends App {
  //Single Inheritance
  class Name{
    val name: String="Xavier Don Bosco"
  }
  class Details extends Name {
    val age:Int=22
    println("My name is : "+ name)
    println(s"I am $age years old")
  }
  val details=new Details

  //Multi-level Inheritance
  class Animals{
    val eat: Unit =println("Some animals can eat human")
  }
  class Behaviour extends Animals{
    val behaviour: Unit=println("Some animals can be good at behaviour")
  }
  class Fly extends Behaviour{
    val fly: Unit=println("Some animals can fly")
  }
  val fly=new Fly

  //Hierarchical Inheritance
  class Mother{
    val motherName: String="Enola"
  }
  class Child1 extends Mother{
    println(s"I am child 1 and my mother name is $motherName")
  }
  class Child2 extends Mother{
    println(s"I am child 2 and my Mother name is $motherName")
  }
  val child1=new Child1
  val child2=new Child2

//multiple inheritance
  val exam=new Exam
  println(exam.rollNo1())
  println(exam.seatNo1())

//hybrid inheritance
val detailsOfLibrary=new DetailsOfLibrary

}
//multiple inheritance
trait RollNo{
  def rollNo1(): String
}
trait SeatNo{
  def seatNo1(): String
}
class Exam extends RollNo with SeatNo{
  def rollNo1(): String = "BP201028"
  def seatNo1(): String = "First row 8th seat"
}
//hybrid inheritance
class Library{
  val name:String="British Cannimara Library"
}
trait Books extends Library {
  val books: Unit=println(s"In $name there are more than 10,00,000 books")
}
trait Reader extends Library{
  val reader: Unit=println(s"In $name there are of more than 10,000 readers")
}
class DetailsOfLibrary extends Books with Reader{
  books;reader
}
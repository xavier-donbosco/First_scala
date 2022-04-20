package lecture2.oop

object inner_class extends App {

  // class with in a class
  val liv=new Living_things
  val hum=new liv.Humans
  hum.eat

  // object with in a class
  val avg_sal=new Nation().People.avg_salary

  // class with in an object
  val children=new tamil_nadu.Children().cha

}
// class with-in a class
class Living_things{
  class Humans{
    def eat = println("Eat which are all edible!!!")
  }
}
// object with-in a class
class Nation{
  object People{
    def avg_salary=println("The salary of the average person is Rs. 5,000")
  }
}
// class with-in an object
object tamil_nadu{
  class Children{
    def cha=println("Many of the children are happy")
  }
}

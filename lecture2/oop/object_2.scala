package lecture2.oop

object object_2 {
def main(args: Array[String]): Unit={
  object Person{
    def apply(mother: Person, father: Person): Person=new Person("bobbie")
  }
  class Person(val name: String){
    println(name)
  }
  val Person1=Person
  val Person2=Person
  val mary=new Person("mary")
  val john=new Person("john")

  val bobby=Person(mary, john)
}
}


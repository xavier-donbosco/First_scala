package lecture2.oop

object auxilary_constructor extends App {
  
  class Parent(name: String, age: Int){
    
    def this(name: String)=this(name,0)
  }
  class Chile(name: String, age: Int, isgood: Boolean) extends Parent(name){

  }
}

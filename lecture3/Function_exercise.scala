package lecture3

object Function_exercise extends App {
  /*
  // we should only use the Fucntion2 for input 2 arguments and output 1 argument
  val obj:((String,String)=>String)=new Function2[String,String,String]{
    def apply(a: String,b:String):String=a+b
  }
  println(obj("Xavier","Don"))
  */
//  val functionWithInFunction:Function1[Int,Function1[Int,Int]]=new Function[Int,Function1[Int,Int]] {
//    override def apply(x: Int):Function1[Int,Int]= new Function[Int,Int] {
//      override def apply(y:Int):Int=x+y
//    }
//  }
//  val superAdder=functionWithInFunction(2)
//  println(superAdder(3))

  val superadders = (x:Int) => (y:Int) => x+y
  println(superadders(5)(2))
}

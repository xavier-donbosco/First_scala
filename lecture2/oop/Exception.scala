package lecture2.oop

object Exception extends App {
  def myexe(sample1: Boolean):Int={
    if(sample1) throw RuntimeException("no int for you")
    else 42
  }
  try{
    myexe(true)
  }
  catch{
    case ex:RuntimeException => println("Caught a runtime exception")
  }
  finally{
    println("No matter what I will be executed")
  }
}

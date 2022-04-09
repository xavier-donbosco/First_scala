object Assignment_1 extends App {
  def greetings(name: String, age: Int): String={
    "Hi my name is "+name+" and I am "+age+" years Old"
  }
  println(greetings("xavier",18))//hey use comments
  def factorial(lnumber: Int): Int={
//hey this is recursive function
    if(lnumber == 1 ) lnumber else lnumber*factorial(lnumber-1)
  }
  println(factorial(5))
  def fibonacci(nthnumber: Int,first: Int, last: Int): Int ={
    val f3=first+last
    if(nthnumber==1) f3 else fibonacci(nthnumber-1,first=last, last=f3)
  }
  println(fibonacci(7,1,1))
  def isprime(n: Int): Boolean={
    def  isprimeunit(t: Int): Boolean={
      if (t==1) true else n%t!=0 && isprimeunit(t-1)
    }
    isprimeunit(n/2)
  }
  println(isprime(6))
}

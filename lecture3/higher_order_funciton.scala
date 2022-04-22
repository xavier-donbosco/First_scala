package lecture3

object higher_order_funciton extends App {
  def nTimes(f:Int=>Int,n: Int, x: Int): Int={
    if(n<=0) x
    else nTimes(f,n-1,f(x))
  }
  val sample=(x:Int)=>x+1
  println(nTimes(sample,10,1))
}

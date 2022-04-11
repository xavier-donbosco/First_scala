package part1_basics
abstract class MyList{
  def head:Int
  def tail:MyList
  def isEmpty:Boolean
  def add(element: Int): MyList
  def printelement: String
  override def toString:String="[" + printelement + "]"
}
object Empty extends MyList{
  def head:Int=throw new NoSuchElementException
  def tail:MyList=throw new NoSuchElementException
  def isEmpty:Boolean=true
  def add(element: Int): MyList=new Cons(element,Empty)

  override def printelement: String = " "
}
class Cons(h: Int, t: MyList) extends MyList {
  def head:Int=h
  def tail:MyList=t
  def isEmpty:Boolean=false
  def add(element: Int): MyList=new Cons(element,this)

  override def printelement: String =
    if(t.isEmpty) s" $h "
    else s"$h ${t.printelement}"
}
object Ass_2_Mylist extends App {
  val con=new Cons(1,new Cons(2,new Cons(3,new Cons(4, Empty))))
  println(con.add(5).head)
  println(con.toString)
}
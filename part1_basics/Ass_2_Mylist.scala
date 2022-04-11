package part1_basics
abstract class MyList{
  def head:Int
  def tail:MyList
  def isEmpty:Boolean
  def add(element: Int): MyList
}
object Empty extends MyList{
  def head:Int=throw new NoSuchElementException
  def tail:MyList=throw new NoSuchElementException
  def isEmpty:Boolean=true
  def add(element: Int): MyList=new Cons(element,Empty)
}
class Cons(h: Int, t: MyList) extends MyList {
  def head:Int=h
  def tail:MyList=t
  def isEmpty:Boolean=false
  def add(element: Int): MyList=new Cons(element,this)
}
object Ass_2_Mylist extends App {
  val con=new Cons(1,Empty)
  println(con.head)
}
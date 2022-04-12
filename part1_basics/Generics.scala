package part1_basics

abstract class MyList1[+A]{
  def head:A
  def tail:MyList1[A]
  def isEmpty:Boolean
  def add[B>:A](element: B): MyList1[B]
  def printelement: String
  override def toString:String="[" + printelement + "]"
}
object Empty1 extends MyList1[Nothing]{
  def head:Nothing=throw new NoSuchElementException
  def tail:MyList1[Nothing]=throw new NoSuchElementException
  def isEmpty:Boolean=true
  def add[B>:Nothing](element: B): MyList1[B]=new Cons1(element,Empty1)

  override def printelement: String = " "
}
class Cons1[+A](h: A, t: MyList1[A]) extends MyList1[A] {
  def head:A=h
  def tail:MyList1[A]=t
  def isEmpty:Boolean=false
  def add[B>:A](element: B): MyList1[B]=new Cons1(element,this)

  override def printelement: String =
    if(t.isEmpty) s" $h "
    else s"$h ${t.printelement}"
}
object Generics extends App {
  val objint: MyList1[Int]=new Cons1(1,new Cons1(2,new Cons1(3,new Cons1(4,Empty1))))
  val objstr: MyList1[String]=new Cons1("hi",new Cons1("hello",new Cons1("welcome",Empty1)))
  println(objint)
  println(objstr)
}

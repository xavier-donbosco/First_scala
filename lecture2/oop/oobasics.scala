package lecture2.oop

object oobasics extends App {

  val writer_fullname = new Writer("Xavier","Don Bosco",2000)
  val novel_obj=new Novel("Wings of Chicken",2022,writer_fullname.fullname())
  println(novel_obj.age())
}
class Writer(fname: String, sname: String, year: Int){
  def fullname(): Unit=println("Writer name is "+fname+" "+sname)}

class Novel(name: String, y_r: Int, author: Unit){
  def age(): Unit="Your age is "+(2000-y_r)
  def iswrittenby():Unit="Author name is " + this.author
  def copy(): Unit=y_r+1
}


package lecture2.oop

object ass extends App {
val obj=new Person("mary","the rockstar")
println(obj.+())
println(obj.+("Xavier"))
println(obj.unary_+())
println(obj.learns("scala"))
print(obj.learnscala())
println(obj)
}
class Person(name: String, mess: String, age: Int =18){
    def +(): String= name+" "+mess
    def +(name: String, age: Int=this.age): String=s"Hi I am $name and I am $age years Old"
    def unary_+(): Int= age+1
    def learns(st: String):String={s"Mary learns $st"}
    def learnscala(): String=learns("Scala with in the function itself")
    def apply(): String="Hi"
}


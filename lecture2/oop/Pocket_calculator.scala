package lecture2.oop
import scala.io.StdIn;
import java.util.Scanner;
object Pocket_calculator extends App {
  val scanner=new Scanner(System.in)
  def sample:Unit= {
    println("Enter the first number: ")
    val a = scanner.nextInt()
    println("Enter the second number : ")
    val b = scanner.nextInt()
    println("Enter the operation to be performed\n1. Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter the number")
    val c = scanner.nextInt()
    if (c == 1) println(s"Addition of $a and $b is " + (a + b))
    else if (c == 2) println(s"Subtraction of $a and $b is " + (a - b))
    else if (c == 3) println(s"Multiplication of $a and $b is " + (a * b))
    else if (c == 4) println(s"Division of $a and $b is " + (a / b))
    else {
      println("Unknown Input!!!\nTry again!!!")
      sample
    }
  }
  sample
}

package lecture2.oop

object Enum{
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    def opendocument(): Unit =
      if (this == READ) println("This is reading")
      else println("This is opening")
  }

    def main(args: Array[String]):Unit={
      val samepermissions: Permissions=Permissions.READ
      samepermissions.opendocument()
    }
  }


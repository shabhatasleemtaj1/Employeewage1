import scala.util.Random
object Employee {
  def main(args: Array[String]): Unit = {
    val r = scala.util.Random
    if(r.nextBoolean==true)
    {
      println("Employee present")
    }
    else
    {
      println("Employee absent")
    }
  }
}
import scala.util.Random
object Employee {
  def main(args: Array[String]): Unit = {
    val r=scala.util.Random
    val wageperhour=20
    val parttime=4
    if(r.nextBoolean==true)
    {
      var DailyEmployeewage= wageperhour*parttime
      println("Employee present")
      println("DailyEmployeewage:" +DailyEmployeewage)
    }
    else
    {
      println("Employee absent")
    }
  }
}
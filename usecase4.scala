object Employee {
  def main(args: Array[String]): Unit = {
    val Emp_type = scala.util.Random.nextBoolean()
    var attendancecheck = scala.util.Random.nextBoolean()
    val Wageperhour=20
    attendancecheck match {
      case true =>
        Emp_type match {
          case true =>
            var hours = 8
            var Emp_type = "fulltime"
            println("employee type is fulltime":+ (hours*Wageperhour))
          case false =>
            var hours = 4
            var Emp_type = "parttime"
            println("employee type is parttime":+ (hours*Wageperhour))
        }
      case _ => println("employee absent")
    }
  }
}

object Employee {
  def main(args: Array[String]): Unit = {
    var Days = 1
    while (Days <= 20)
    {
    val Emp_type = scala.util.Random.nextBoolean()
    var attendancecheck = scala.util.Random.nextBoolean()
    val Wageperhour = 20

      attendancecheck match {
        case true =>
          Emp_type match {
            case true =>
              var hours = 8
              var Emp_type = "fulltime"
              println("empoyee type is fulltime and dailywage is:" + (hours * Wageperhour))
            case false =>
              var hours = 4
              var Emp_type = "parttime"
              println("empoyee type is parttime and dailywage is:" + (hours * Wageperhour))
          }

        case _ => println("employee absent")
      }
      Days= Days+1
    }
  }
}
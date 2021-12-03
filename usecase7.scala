object Employee {
  def main(args: Array[String]): Unit = {
    var Emp_type = scala.util.Random.nextBoolean()
    var attendancecheck = scala.util.Random.nextBoolean()

    def gethours(): Unit = {
      var gethours = scala.util.Random.nextBoolean()
      gethours match {
        case true =>
          println("Full time employee and hours is 8:")
        case default =>
          println("part time employee and hors is 4:")
      }
    }
    val Wageperhour = 20
    var Days = 1
    var maxhours = 0
    while (Days <= 20 && maxhours <= 100) {
      attendancecheck match {
        case true =>
          Emp_type match {
            case true =>
              var hours = 8
              var Emp_type = "fulltime"
            case false =>
              var hours = 4
              var Emp_type = "parttime"
              maxhours = maxhours + hours
              var totalwage = maxhours * Wageperhour
              println("total hour is:" + maxhours)
              println("totalwage is:" + totalwage)
          }
        case _ => println("employee absent")
      }
      Days = Days + 1
    }
  }
}


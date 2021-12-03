object Employee {
  def main(args: Array[String]): Unit = {
    val Emp_type = scala.util.Random.nextBoolean()
    var attendancecheck = scala.util.Random.nextBoolean()
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
              maxhours = maxhours + hours
              var totalwage = maxhours * Wageperhour
              var wage = (maxhours, totalwage)
              println("wage is:" + wage)
              var wages=Map("Days"->Days,"totalwage"->totalwage,"maxhours"->maxhours)
              println("wages:"+wages)
            case false =>
              var hours = 4
              var Emp_type = "parttime"
              maxhours = maxhours + hours
              var totalwage = maxhours * Wageperhour
              var wage = (maxhours, totalwage)
              println("wage is:" + wage)
              var wages=Map("Days"->Days,"totalwage"->totalwage,"maxhours"->maxhours)
              println("wages:"+wages)
          }
        case _ => println("employee absent")
      }
      Days = Days + 1
    }
  }
}
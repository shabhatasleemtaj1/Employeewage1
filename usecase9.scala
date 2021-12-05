object Employee {
  def main(args: Array[String]): Unit = {
    var Days = 1
    var maxhours = 0
    while (Days <= 20 && maxhours <= 100) {
      val Emp_type = scala.util.Random.nextBoolean()
      var attendancecheck = scala.util.Random.nextBoolean()
      val Wageperhour = 20
      attendancecheck match {
        case true =>
          Emp_type match {
            case true =>
              var hours = 8
              var Emp_type = "fulltime"
              var Dailywage=hours*Wageperhour
              maxhours = maxhours + hours
              var totalwage = maxhours * Wageperhour
              var wage = (maxhours, totalwage)
              var wages=Map("Days"->Days, "Dailywage"->Dailywage, "totalwage"->totalwage)
              println("wages:"+wages)
            case false =>
              var hours = 4
              var Emp_type = "parttime"
              var Dailywage=hours*Wageperhour
              maxhours = maxhours + hours
              var totalwage = maxhours * Wageperhour
              var wage = (maxhours, totalwage)
              var wages=Map("Days"->Days, "Dailywage"->Dailywage, "totalwage"->totalwage)
              println("wages:"+wages)
          }
        case _ => println("employee is absent on the day" +Days)
      }
      Days = Days + 1
    }
  }
}
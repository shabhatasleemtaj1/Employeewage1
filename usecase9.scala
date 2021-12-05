object Employee {
  def main(args: Array[String]): Unit = {
    var Days = 1
    var Maxhours = 0
    while (Days <= 20 && Maxhours <= 100) {
      val Emp_type = scala.util.Random.nextBoolean()
      var AttendanceCheck = scala.util.Random.nextBoolean()
      val Wageperhour = 20
      AttendanceCheck match {
        case true =>
          Emp_type match {
            case true =>
              var Hours = 8
              var Emp_type = "Fulltime"
              var Dailywage=Hours*Wageperhour
              Maxhours = Maxhours + Hours
              var Totalwage = Maxhours * Wageperhour
              var Wage = (Maxhours, Totalwage)
              var Wages=Map("Days"->Days, "Dailywage"->Dailywage, "Totalwage"->Totalwage)
              println("Wages:"+Wages)
            case false =>
              var Hours = 4
              var Emp_type = "Parttime"
              var Dailywage=Hours*Wageperhour
              Maxhours = Maxhours + Hours
              var Totalwage = Maxhours * Wageperhour
              var Wage = (Maxhours, Totalwage)
              var Wages=Map("Days"->Days, "Dailywage"->Dailywage, "Totalwage"->Totalwage)
              println("Wages:"+Wages)
          }
        case _ => println("Employee is absent on the day" +Days)
      }
      Days = Days + 1
    }
  }
}
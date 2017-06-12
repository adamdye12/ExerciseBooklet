abstract class Person(val firstName: String,
                      var surName: String,
                      val dateOfBirth: String,
                      var addressLine1: String,
                      var addressLine2: String,
                      var addressLine3: String,
                      var postCode: String,
                      var email: String,
                      var phoneNumber: String) {

}

class Employee(firstName: String,
               surName: String,
               dateOfBirth: String,
               addressLine1: String,
               addressLine2: String,
               addressLine3: String,
               postCode: String,
               email: String,
               phoneNumber: String,
               val employeeId: Int,
               var jobTitle: String
              ) extends Person(firstName, surName, dateOfBirth, addressLine1, addressLine2, addressLine3, postCode, email, phoneNumber) {
  override def toString: String = {
    s"Name: $firstName $surName. Date of Birth: $dateOfBirth. Address: $addressLine1 $addressLine2 $addressLine3. Post Code: $postCode. Email: $email Phone Number: $phoneNumber. Employee ID: $employeeId. Job Title: $jobTitle"
  }
}

class Customer(firstName: String,
               surName: String,
               dateOfBirth: String,
               addressLine1: String,
               addressLine2: String,
               addressLine3: String,
               postCode: String,
               email: String,
               phoneNumber: String,
               val customerId: Int
              ) extends Person(firstName, surName, dateOfBirth, addressLine1, addressLine2, addressLine3, postCode, email, phoneNumber) {
  override def toString: String = {
    s"Name: $firstName $surName. Date of birth is $dateOfBirth. Address: $addressLine1 $addressLine2 $addressLine3. Post Code: $postCode. Email Address: $email Phone Number is $phoneNumber. Customer ID:$customerId."
  }
}

abstract class Vehicle(val id: Int,
                       val model: String,
                       val reg: String,
                       var tyres: Int,
                       var colour: String) {

}

class Bike(id: Int,
           model: String,
           reg: String,
           tyres: Int,
           colour: String
          ) extends Vehicle(id, model, reg, tyres, colour) {
  override def toString: String = {
    s"Model: $model. Registration Number: $reg. Number of Tyres: $tyres. Colour: $colour"
  }
}

class Car(id: Int,
          model: String,
          reg: String,
          tyres: Int,
          colour: String,
          val doors: Int
         ) extends Vehicle(id, model, reg, tyres, colour) {
  override def toString: String = {
    s"Model: $model. Registration Number: $reg. Number of Tyres: $tyres. Colour: $colour"
  }
}

class Garage() {
  val vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]


  def addVehicle(vehicle: Vehicle): Unit = {
    vehicleArrayBuffer += vehicle
  }

  def printVehicles(): Unit = {
    vehicleArrayBuffer.foreach(println)
  }


  val employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]


  def addEmployee(employee: Employee): Unit = {
    employeeArrayBuffer += employee

  }


  def printEmployees(): Unit = {
    employeeArrayBuffer.foreach(println)
  }
}

val employee1 = new Employee("Adam", "Dye", "15/02/1993", "808", "The Heart,", "Salford", "M50 T36", "adamdye@email.com", "07935378321", 101, "Director")

val customer1 = new Customer("James", "Gallagher", "17/08/1995", "26", "Manc Road", "Manchester", "M06 L45", "jamesgallaghere@email.com", "0765287931", 236)

val bike1 = new Bike(101,"Yamaha M697", "YU65 M5G", 2, "Black")

val car1 = new Car(201,"Renault Clio", "JY15", 4, "Blue", 5)

val garage = new Garage

garage.addVehicle(car1)
garage.addVehicle(bike1)

garage.printVehicles()

garage.addEmployee(employee1)

garage.printEmployees()



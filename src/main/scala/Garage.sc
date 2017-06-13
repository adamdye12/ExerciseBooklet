abstract class Person(val firstName: String,
                      var surName: String,
                      val dateOfBirth: String,
                      var addressLine1: String,
                      var addressLine2: String,
                      var addressLine3: String,
                      var postCode: String,
                      var phoneNumber: String,
                      var email: String) {

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
                       var colour: String,
                       var repaired: Boolean) {

}

class Bike(id: Int,
           model: String,
           reg: String,
           tyres: Int,
           colour: String,
           repaired: Boolean
          ) extends Vehicle(id, model, reg, tyres, colour, repaired) {
  override def toString: String = {
    s"Model: $model. Registration Number: $reg. Number of Tyres: $tyres. Colour: $colour"
  }
}

class Car(id: Int,
          model: String,
          reg: String,
          tyres: Int,
          colour: String,
          repaired: Boolean,
          val doors: Int
         ) extends Vehicle(id, model, reg, tyres, colour, repaired) {
  override def toString: String = {
    s"Model: $model. Registration Number: $reg. Number of Tyres: $tyres. Colour: $colour"
  }
}

class Garage(var isOpen: Boolean = false) {
  val vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
  val employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]

  def addVehicle(vehicle: Vehicle): Unit = {
    vehicleArrayBuffer += vehicle
  }

  def removeVehicleId(id: Int): Unit = {
    vehicleArrayBuffer.foreach(x => if (x.id == id) {
      vehicleArrayBuffer -= x
      return
    })
  }

  def removeVehicleType(vehicleType: String) = vehicleType match {
    case "Car" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Car]) vehicleArrayBuffer -= x)
    case "Bike" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Bike]) vehicleArrayBuffer -= x)
    case _ => println("Please remove either a car or a bike.")
  }

  def repairVehicle(vehicle: Vehicle): Unit = {
    if (vehicle.repaired) {
      println("The vehicle has been repaired.")
    }
    else {
      println("The vehicle has not been repaired.")
    }

  }

  def addEmployee(employee: Employee): Unit = {
    employeeArrayBuffer += employee
  }

  def open(): Unit = {
    this.isOpen = true
  }

  def close(): Unit = {
    this.isOpen = false
  }

  def printContents(): Unit = {
    if (vehicleArrayBuffer.isEmpty) println("No vehicles in garage.")
    else
      println("Vehicles:")
    vehicleArrayBuffer.foreach(println)

    if (employeeArrayBuffer.isEmpty) println("No employees in garage.")
    else
      println("Employees:")
    employeeArrayBuffer.foreach(println)
  }
}

class Part(val name: String, val price: Int){
  var isBroken: Boolean = false
}

val fanBelt = new Part("fanbelt", 10)
val screw = new Part ("Screw", 2)

val employee1 = new Employee("Adam", "Dye", "15/02/1993", "808", "The Heart,", "Salford", "M50 T36", "adamdye@email.com", "07935378321", 101, "Director")

val customer1 = new Customer("James", "Gallagher", "17/08/1995", "26", "Manc Road", "Manchester", "M06 L45", "jamesgallaghere@email.com", "0765287931", 236)

val bike1 = new Bike(101, "Yamaha M697", "YU65 M5G", 2, "Black", true)

val car1 = new Car(201, "Renault Clio", "JY15", 4, "Blue", false, 5)

val garage = new Garage()


garage.addVehicle(car1)
garage.addVehicle(bike1)

/*garage.addEmployee(employee1)

garage.removeVehicleId(201)

garage.removeVehicleType("Car")*/

garage.repairVehicle(bike1)

garage.printContents()

garage.open()
println(garage.isOpen)

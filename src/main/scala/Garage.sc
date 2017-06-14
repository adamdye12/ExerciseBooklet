val vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
val employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]
val partArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Part]
val r = scala.util.Random

val garage = new Garage()

val fanBelt = new Part("fanbelt")
val screw = new Part("Screw")
val gearbox = new Part ("Gearbox")
val exhaust= new Part ("Exhaust")
val key = new Part ("Key")
val transmission = new Part ("Transmission")
val fuelTank = new Part ("Fuel Tank")
val indicator = new Part ("Indicators")
val brakeLight = new Part ("Brake Light")
val battery = new Part ("Battery")
val suspension = new Part ("Suspension")
val filtration = new Part ("Filtration")
val brakes = new Part ("Brakes")
val pistonRing = new Part ("Piston Ring")
val sumpPlug = new Part ("Sump Plug")
val timingBelt = new Part ("Timing Belt")
val oilPump = new Part ("Oil Pump")
val turboCharger = new Part ("Turbo Charger")
val pulley = new Part ("Pulley")
val headBolt = new Part ("Head Bolt")
val fuelInjector = new Part ("Fuel Injector")
val starterMotor = new Part ("Starter Motor")
val alternator = new Part ("Alternator")
val rearAxle  = new Part ("Rear Axle")
val spring = new Part ("Spring")
val catConverter = new Part ("Catalytic Converter")
val acceleratorCable = new Part ("Accelerator Cable")
val seat = new Part ("Seat")
val pedal = new Part ("Pedal")
val vacuumPump = new Part ("Vacuum Pump")
val calipers = new Part ("Calipers")


val employee1 = new Employee("Adam", "Dye", "15/02/1993", "808", "The Heart,", "Salford", "M50 T36", "adamdye@email.com", "07935378321", 101, "Director")

val customer1 = new Customer("James", "Gallagher", "17/08/1995", "26", "Manc Road", "Manchester", "M06 L45", "jamesgallaghere@email.com", "0765287931", 236)

val bike1 = new Bike("Yamaha M697", "YU65 M5G", 2, "Black", true)

val car1 = new Car("Renault Clio", "JY15", 4, "Blue", false, 5)


/*garage.addEmployee(employee1)

garage.removeVehicleId(201)

garage.removeVehicleType("Car")*/

garage.repairVehicle(bike1)

garage.printContents()

garage.open()
println(garage.isOpen)


abstract class Person() {
  val firstName: String
  var surName: String
  val dateOfBirth: String
  var addressLine1: String
  var addressLine2: String
  var addressLine3: String
  var postCode: String
  var phoneNumber: String
  var email: String
}

class Employee(val firstName: String,
               var surName: String,
               val dateOfBirth: String,
               var addressLine1: String,
               var addressLine2: String,
               var addressLine3: String,
               var postCode: String,
               var email: String,
               var phoneNumber: String,
               val employeeId: Int,
               var jobTitle: String
              ) extends Person() {
  override def toString: String = {
    s"Name: $firstName $surName. Date of Birth: $dateOfBirth. Address: $addressLine1 $addressLine2 $addressLine3. Post Code: $postCode. Email: $email Phone Number: $phoneNumber. Employee ID: $employeeId. Job Title: $jobTitle"
  }
}

class Customer(val firstName: String,
               var surName: String,
               val dateOfBirth: String,
               var addressLine1: String,
               var addressLine2: String,
               var addressLine3: String,
               var postCode: String,
               var email: String,
               var phoneNumber: String,
               val customerId: Int
              ) extends Person() {
  override def toString: String = {
    s"Name: $firstName $surName. Date of birth is $dateOfBirth. Address: $addressLine1 $addressLine2 $addressLine3. Post Code: $postCode. Email Address: $email Phone Number is $phoneNumber. Customer ID:$customerId."
  }
}

abstract class Vehicle() {
  var id: Int = 1
  if (vehicleArrayBuffer.isEmpty) {
    id = 1
  }
  else {
    id = vehicleArrayBuffer.last.id + 1
  }
  val model: String
  val reg: String
  var tyres: Int
  var colour: String
  var repaired: Boolean
  var parts = scala.collection.mutable.ArrayBuffer.empty[Part]
  parts = partArrayBuffer
  parts.foreach(f = x => {
    x.price = 10 + r.nextInt(40)
    x.time = 1 + r.nextInt(9)
  })
    garage.addVehicle(this)
}

class Bike(val model: String,
           val reg: String,
           var tyres: Int,
           var colour: String,
           var repaired: Boolean
          ) extends Vehicle() {
  override def toString: String = {
    s" ID: $id Model: $model. Registration Number: $reg. Number of Tyres: $tyres. Colour: $colour"
  }
}

class Car(val model: String,
          val reg: String,
          var tyres: Int,
          var colour: String,
          var repaired: Boolean,
          val doors: Int
         ) extends Vehicle() {
  override def toString: String = {
    s"ID: $id Model: $model. Registration Number: $reg. Number of Tyres: $tyres. Colour: $colour"
  }
}

class Garage(var isOpen: Boolean = false) {

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

class Part (val name: String) {
  var price = 10 + r.nextInt(40)
  var time = 1 + r.nextInt(9)
  var isBroken: Boolean = false
  partArrayBuffer += this
  override def  toString: String = {
    s"Part Name: $name. Price: £$price. Time: $time hours."
  }
}
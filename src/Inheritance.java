//class Vehicle{
//    int speed;
//    public void vehicle(){
//        this.speed=speed;
//    }
//    public void speedUp(){
//        System.out.println("there is a speeding vehicle");
//    }
//     int getSpeed(){
//        return 10;
//    }
//}
//
//class Car extends Vehicle{
//    public void speedUp(){
//        speed+=10;
//        System.out.println("car speed increases to" +" "+speed+"km/hr");
//    }
//}
//class Bike extends Vehicle{
//    public void speedUp(){
//        speed+=3;
//        System.out.println("bike speed increases to"+speed+" "+"km/hr");
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Vehicle c=new Car();
//        Vehicle b=new Bike();
//        Vehicle v=new Vehicle();
//        v.speedUp();
//        System.out.println(v.getSpeed());
//        v.getSpeed();
//        c.speedUp();
//        c.speedUp();
//        b.speedUp();
//    }
//}

//class Vehicle{
//    String make;
//    String model;
//
//     Vehicle(String make,String model){
//       this.make=make;
//       this.model=model;
//    }
//
//    void displayDetails(){
//        System.out.println(make+model);
//    }
//
//}
//class Car extends Vehicle{
//    int numberOfDoors;
//    Car(String make,String model,int numberOfDoors){
//        super(make, model);
//        this.numberOfDoors=numberOfDoors;
//    }
//    void displayDetails(){
//        System.out.println(make+model+" "+numberOfDoors);
//    }
//}
//class Truck extends Vehicle{
//    double loadCapacity;
//    Truck(String make,String model,Double loadCapacity){
//        super(make,model);
//        this.loadCapacity=loadCapacity;
//    }
//    void displayDetails(){
//        System.out.println(make +" "+model+" "+loadCapacity);
//    }
//}
//
//public class Inheritance{
//    public static void main(String[] args) {
//
//        Car myCar=new Car("a","b",2);
//        myCar.displayDetails();
////        Truck myTruck=new Truck();
////       Vehicle[] vehicles=new Vehicle[2];
////       vehicles[0]=new Car("abc","aaa",4);
////        vehicles[1]=new Truck("abc","aaa",4.9);
////        for(Vehicle v:vehicles){
////            v.displayDetails();
////        }
//    }
//}


//class Course{
//    String courseName;
//    String courseCode;
//
//    Course(String courseName,String courseCode){
//        this.courseName=courseName;
//        this.courseCode=courseCode;
//    }
//
//    void displayDetails(){
//        System.out.println(courseName+courseCode);
//    }
//}
//
//class OnlineCourse extends Course{
//    String platform;
//
//    OnlineCourse(String courseName,String courseCode,String platform){
//        super(courseName, courseCode);
//        this.platform=platform;
//    }
//    void displayDetails(){
//        System.out.println(courseName+courseCode+platform);
//    }
//}
//
//class OnsiteCourse extends Course{
//    String location;
//
//    OnsiteCourse(String courseName,String courseCode,String location){
//        super(courseName, courseCode);
//        this.location=location;
//    }
//
//    void displayDetails(){
//        System.out.println(courseName+courseCode+location);
//    }
//}
//
//public class Inheritance{
//    public static void main(String[] args) {
//        Course[] myCourse=new Course[2];
//        myCourse[0]=new OnlineCourse("bcom","JUY","ONLINE");
//
//for(Course name:myCourse){
//    name.displayDetails();
//}
//    }
//}
//public class Student {
//    int id;
//    String name;
//}

//INITIALISATION USING REFERENCE

//public class Student {
//    int id;
//    String name;
//}
//
//    class Info {
//        public static void main(String[] args) {
//            Student a = new Student();
//            a.id = 3;
//            a.name = "chippy";
//            System.out.println(a.id + " " + a.name);
//            Student b = new Student();
//            b.id = 4;
//            b.name = "hussain";
//            System.out.println(b.id + " " + b.name + " " + a.name);
//        }
//    }


//INITIALISATION USING METHOD

//class Student{
//    int id;
//    int age;
//    String name;
//
//    void values(int a,int b,String c){
//        id=a;
//        age=b;
//        name=c;
//    }
//
//    void display(){
//        System.out.println(id+" "+age+" "+name);
//    }
//}
//
//class Info{
//    public static void main(String[] args) {
//        Student s1=new Student();
//        s1.values(1,24,"hussain");
//        s1.display();
//
//        Student s2=new Student();
//        s2.values(2,26,"chippy");
//        s2.display();
//    }
//}
//
//class Student{
//    int id;
//    String name;
//    String place;
//    Long number;
//
//     Student(int a,String b,String c,long d){
//        id=a;
//        name=b;
//        place=c;
//        number=d;
//    }
//    void display(){
//        System.out.println(id+" "+name+" "+place+" "+number);
//    }
//
//    public static void main(String[] args) {
//        Student s1=new Student(1,"alita","tvm",9996352728L);
//        s1.display();
//    }
//}

//class Student{
//    static int cube(int x){
//        return x*x*x;
//    }
//
//    public static void main(String[] args) {
//
//      int result=Student.cube(5);
//        System.out.println(result);
//
//    }
//}




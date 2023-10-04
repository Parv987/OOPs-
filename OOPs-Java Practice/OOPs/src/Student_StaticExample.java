// here colg name is same for all the students but every time u create a student object colg is intialize
// even though it is same for all vales and technically it's a waste of memory because value is same for all
// just by writing static in front of it. It will only intialized when the class is loaded
// and will be same for every student object and less memory is used.

// ststic variable belong to class and not to object.

//static method can only access static variables of the class.
// instance method or non-static method can access static variable.
public class Student_StaticExample {
    String name;
    int age;
    String address;
    static int count=1;
    static String College="Galgotias";
    public Student_StaticExample(String name, int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static String getCollege() {
        return College;
    }
    public static int getCount() {
        return count++;
    }
    public static void main(String []args){

        Student_StaticExample stu=new Student_StaticExample("Parv",22,"Plot number 8");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getAddress());
        System.out.println(Student_StaticExample.getCount());
        //To access static we call static method on the name of class example--> Student_StaticExample.getCollege()
        System.out.println(Student_StaticExample.getCollege());
        System.out.println();
        Student_StaticExample stu1=new Student_StaticExample("Joe",21,"Plot number 10");
        stu1.setName("Ranjit");
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getAddress());
        System.out.println(Student_StaticExample.getCount());
        System.out.println(Student_StaticExample.getCollege());
     }
}

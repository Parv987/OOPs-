//MethodOverloading- 1> Method name should be same.
//                   2> Parameters/arguments can differ.
//                   3> Return types can also differ.
//                   4> MethodOverloading occours within a same class
//                   5> Occours during compile time.

public class MethodOverloadingDemo {
    public int multiply(int x,int y){
        return x*y;
    }
    public int multiply(int x,int y,int z){
        return x*y*z;
    }
    public double multiply(double x,double y){
        return x*y;
    }

    public static void main(String args[]){
       MethodOverloadingDemo de=new MethodOverloadingDemo();
        System.out.println(de.multiply(4,6));
        System.out.println(de.multiply(3,5,7));
        System.out.println(de.multiply(10.2,8.00));

    }
}

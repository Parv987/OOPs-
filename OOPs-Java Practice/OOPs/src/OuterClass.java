//                 Static nested class
//It is a way of logically grouping classes that are only used in one place.
//In this we define a class within the class.
//This Increases encapsulation.
//For example a kitchen cannot exist without a house therefore kitchen class exist within the house class using nested class.

public class OuterClass {
    int instanceVariable=10;
    static int outerStaticMember=20;
    private static int outerPrivate=30;
    static class StaticNestedClass{
        int l=90;
//Here l automatically become static as it is present in static class
        void display(){
            System.out.println("Outer Static member ="+outerStaticMember);
            System.out.println("Outer private static member ="+outerPrivate);
            System.out.println("Inner member of StaticClassNested="+l);
           // System.out.println("Instance Variable  from Outerclass ="+instanceVariable);
       // upper sout statement is not possible bcoz static block can only access static member
        }
    }
//Non-static block can access both static variables and non-static variable
    public static void main(String []args){
OuterClass.StaticNestedClass sb=new OuterClass.StaticNestedClass();
sb.display();
//here in this case we create a object by using outer class refrence for inner class
//for example 1st we will ener in the house then only in kitchen we cannot directly enter into the kitchen.
    }
}

//  # Abstraction - Hiding deatails from outside worlds and only showing useful things
//Encapsulation -
abstract class happy{
    //Abstract class must have one abstract method.
    //Abstract class cannot be called by making object it can be only called by using child class.
    void good(String str){
        System.out.println(str);
    }
    abstract void angry();
    abstract void sad();
}
class Feelings extends happy {
    void angry(){
        System.out.println("I am angry today");
    }
    void sad(){
        System.out.println("I am sad today");
    }
    void thinking(){
        System.out.println("I was thinking about yesterdays match");
    }
}
public class Abs  {
   public static void main(String args[]){
       Feelings feel=new Feelings();
       feel.thinking();
       feel.sad();
       feel.angry();
       String str="I am Happy";
       feel.good(str);
   }
}

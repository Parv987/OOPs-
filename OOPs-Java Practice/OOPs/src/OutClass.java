public class OutClass {
    class InnerClass{
          public void disply(){
              System.out.println("Displayed");
          }
    }
    void OutClassMethod(){
        System.out.println("In the out class method");
        class methodlocalClass{
            void localInnermethod(){
                System.out.println("in the method local class");
            }
        }
        methodlocalClass ml=new methodlocalClass();
        ml.localInnermethod();
    }
}
class InnerClassDemo{
    public static void main(String args[]){
OutClass.InnerClass in=new OutClass().new InnerClass();
in.disply();
OutClass OC=new OutClass();
OC.OutClassMethod();
    }
}

//Interfaces--> No concrete methods Interfaces can only contains default methods and method declarations which is
// initialized in base class
interface car{
    void carHeight(int inc);
    void carLength(int ince);
    int HorsePower(int hp);
    default void prints(){
        System.out.println("Our car is BEST");
    }
}
class vechiles implements car{
    private int currHeight;
    private int currLength;
    private int currHp;

    public int getCurrHeight() {
        return currHeight;
    }

    public void setCurrHeight(int currHeight) {
        this.currHeight = currHeight;
    }

    public int getCurrHp() {
        return currHp;
    }

    public void setCurrHp(int currHp) {
        this.currHp = currHp;
    }

    public int getCurrLength() {
        return currLength;
    }

    public void setCurrLength(int currLength) {
        this.currLength = currLength;
    }

    public vechiles(int cH, int cL, int cHp){
        this.currHeight=cH;
        this.currLength=cL;
        this.currHp=cHp;
    }
    @Override
    public void carHeight(int inc) {
         currHeight+=inc;
    }

    @Override
    public void carLength(int ince) {
        currLength+=ince;
       // System.out.println(currLength);
    }

    @Override
    public int HorsePower(int hp) {
        currHp+=hp;
        return currHp;
    }
}

public class InterFaCES {
    public static void main(String args[]){
     vechiles v1=new vechiles(23,42,100);
        System.out.println(v1.getCurrHp());
        System.out.println(v1.HorsePower(100));
        v1.carLength(5);
        System.out.println(v1.getCurrHeight());
        System.out.println(v1.getCurrLength());
        v1.setCurrHp(500);
        System.out.println(v1.getCurrHp());
        v1.prints();
    }
}

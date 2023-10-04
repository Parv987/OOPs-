//here class is Bicycle just for understanding I wrote Inheritance
 class Inheritance {
    //It is adviced to use protected when we use inheritence logic.
    protected int gear;
    protected int speed;
    public Inheritance(int startSpeed,int Gear){
        this.gear=Gear;
        this.speed=startSpeed;
    }

    public void setGear(int newVal) {
        gear = newVal;
    }
    public void applyBreak(int decrement) {
        speed -= decrement;
    }
    public void speedup(int increment){
        speed+=increment;
    }
}
class MountainBike extends Inheritance{
    public int seatHeight;
         //Constructor of child class will have all the arguments of parent class plus it's own
    public MountainBike(int sHeight,int startSpeed, int Gear) {
        //1st thing that is to be implemented in children calss constructor is super keyword with the arguments of base class constructor(startSpeed,gear).
        super(startSpeed, Gear);
        this.seatHeight=sHeight;
    }

    public void setSeatHeight(int newVal) {
        seatHeight = newVal;
    }
}
class Demo{
    public static void main(String args[]){
        MountainBike mu=new MountainBike(20,10,1);
        System.out.println(" gear ="+ mu.gear );
        System.out.println("Seat Height ="+ mu.seatHeight);
        System.out.println("Bike Speed ="+ mu.speed);
        mu.applyBreak(1);
        System.out.println("Speed after break is applied ="+mu.speed);
    }
}
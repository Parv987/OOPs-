
//Constructors
//We can make many constructors but with diffrent parameters.

//if we don't provide constructor to the class then java by default provides constructor.
// In the below code if we remove each constructor and call object d in the main section our program will run.
// Important---> Default constructor works only when there is no other constructor is provided by the user.
 class Cuboid {
    int width;
    int length;
    int depth;
    Cuboid(int width,int length,int depth){
        this.width=width;
        this.length=length;
        this.depth=depth;
    }
    Cuboid(int width,int length ){
        this.width=width;
        this.length=length;
        this.depth=10;
    }
    Cuboid(int dimension ){
        this.width=dimension;
        this.length=dimension;
        this.depth=dimension;
    }
    Cuboid( ){
        this.width=10;
        this.length=10;
        this.depth=10;
    }
    int volume(){
        return width*length*depth;
    }
    public static void main(String args[]){
        int volume;
      Cuboid a=new Cuboid(13,16,19);
        volume=a.volume();
        System.out.println("Volume =" + volume);
       Cuboid b=new Cuboid(7,8);
        volume=b.volume();
        System.out.println("Volume =" + volume);
         Cuboid c=new Cuboid(51);
        volume=c.volume();
        System.out.println("Volume =" + volume);
          Cuboid d=new Cuboid();
        volume=d.volume();
        System.out.println("Volume =" + volume);
    }
}


public class Programmer extends Person {
    String technology;

    //constructor default
    public Programmer() {
       super();
    }


    //constructor berparameter
    public Programmer(String name, String address, String technology) {
        //super constructor
        super(name, address);
        this.technology = technology;
    }

    
    void hacking() {
    System.out.println("I can hacking a website");
   }
   
   void coding() {
    System.out.println("I can create a application using technology : " + technology + ".");
   }

  public void greeting() {
    //super method
    super.greeting();
    this.hacking();
    this.coding();
   }

}

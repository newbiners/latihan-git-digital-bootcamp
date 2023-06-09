
public class Editor extends Person {
     String typeVideo;

public Editor() {
   super();
}

public Editor(String name, String address,String typeVideo) {
   //super constructor
   super(name, address);
   this.typeVideo = typeVideo;
}

     void editing() {
        System.out.println("I can edit " + typeVideo + " videos very well.");
     }

     //overriding
    public void greeting() {
      //super method
      super.greeting();
      this.editing();
     }
    
}

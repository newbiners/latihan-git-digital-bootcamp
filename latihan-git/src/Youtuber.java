public class Youtuber extends Person {
    String genre;

    public Youtuber() {
        super();
    }

    public Youtuber(String name, String address, String genre) {
        //super constructor
        super(name, address);
        this.genre = genre;
    }

   public void content() {
        System.out.println("I upload content " + genre + " in Youtube.");
    }

    // overriding
   public void greeting() {
        // super method
        super.greeting();
        System.out.println("I upload content " + genre + " in Youtube platform.");
    }

}

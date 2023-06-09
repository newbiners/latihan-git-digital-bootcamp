public class MainApp {
    public static void main(String[] args) throws Exception {
        //Person
        //constructor default
        Person person1 = new Person();
        person1.name = "Hendra";
        person1.address = "Jogja";
        person1.greeting();


        //constuctor dua parameter
        Person person2 = new Person("Yoga", "Makasar");
        person2.greeting();

        //Editor custructor berparameter

        Editor editor1 = new Editor("Andi","Lombok","Cinematic");

        editor1.greeting();
       

        //programmer custuctor berparameter
        Programmer programmer1 = new Programmer("Yuda","Lumajang","Javascript");

        programmer1.greeting();
      

        //Youtuber costructor berparameter
        Youtuber youtuber1 = new Youtuber("Dea","surabaya","Education");

        youtuber1.content();
        youtuber1.greeting();



    }
}

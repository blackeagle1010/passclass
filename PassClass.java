import java.util.Scanner;
public class PassClass {
    public static void main (String[] args){
    int Avarage, Math, Physic, Turkish, Chemic, Music;
    Scanner Input = new Scanner (System.in);
    System.out.print("Enter Math score:");
    Math = Input.nextInt ();

    System.out.print("Enter Physic score:");
    Physic = Input.nextInt();

    System.out.print("Enter Turkish score:");
    Turkish = Input.nextInt();

    System.out.print("Enter Chemic score:");
    Chemic = Input.nextInt();

    System.out.print("Enter Music score:");
    Music = Input.nextInt();

    Avarage = (Math + Physic + Turkish + Chemic + Music) / 5 ;

    if(Avarage >= 55){
        System.out.print("you pass the class successfully:" + Avarage);

    }
    else if (Avarage < 55) {
        System.out.print("you did not pass the class:" + Avarage);
    }
    else {
        System.out.print("there is a problem in the code...");
    }
}
}



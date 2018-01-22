package lesson8;

public class UserMain {


    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();


        user1.name = "MASHA";
        user1.age = 16;
        user1.gender = 'm';
        System.out.println("user1 " + user1.profession);

        user2.name = "JACK";

        user3.name = "ALLA";
        user3.age = 'm';

        User.profession = "slut";

        System.out.println("user1 " + user1.profession);
        System.out.println("User " + User.profession);
        System.out.println("user2 "+user2.profession);


    }
}

package lesson11;

public class TryFinallyExample {

    public static void main(String[] args) {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }

    }
}

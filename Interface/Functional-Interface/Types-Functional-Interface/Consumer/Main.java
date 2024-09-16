import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> logginObject = (Integer val) -> {
            if(val > 10) {
                System.out.println("Loggin");
            }
        };
        logginObject.accept(11);
    }
}

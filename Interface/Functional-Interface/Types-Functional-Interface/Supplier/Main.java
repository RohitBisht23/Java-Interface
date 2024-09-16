import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> isEvenNumber = () -> {
            return "I am returning this";
        };
        System.out.println(isEvenNumber.get());
    }
}

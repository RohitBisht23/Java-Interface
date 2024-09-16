public class Crocodile implements LandAnimal, WaterAnimal{
    @Override
    public void canBreathe() { //Override this
        System.out.println("Yes it can breathe");
    }
}

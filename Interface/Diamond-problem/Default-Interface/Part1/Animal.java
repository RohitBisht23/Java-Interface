public interface Animal {

    public void run();

    //Default method
    default public int speed() {
        return 300;
    }
} 

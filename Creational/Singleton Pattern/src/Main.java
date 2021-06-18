public class Main {
    public static void main(String[] args) {

        //Implementing the only object available
        Singleton singletonObject = Singleton.getInstance();

        singletonObject.singletonMessage();
    }
}

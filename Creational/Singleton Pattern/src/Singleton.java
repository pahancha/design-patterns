public class Singleton {

    static private Singleton instance;

    private Singleton(){} //private constructor, so that the class can't be instantiated.

    public static Singleton getInstance(){

        //If the instance field is null, then the field is getting the instance of the Singleton class.
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void singletonMessage(){
        System.out.println("Hello! I am a method declared inside the Singleton Class! :) ");
    }
}

public class Singleton2 {
    private static Singleton2 instance;
    public static Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
            return instance;
        }
        return instance;
    }
    Singleton2(){}
}

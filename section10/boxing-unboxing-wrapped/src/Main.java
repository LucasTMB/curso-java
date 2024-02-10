public class Main {
    public static void main(String[] args) {
        int x = 20;

        // boxing
        Object obj = x;
        System.out.println(obj);

        // unboxing
        // int y = obj;  // vai dar erro, pois são tipos diferentes
        int y = (int) obj;

        // wrapper
        int a = 20;

        Integer obj2 = a;

        int b = obj2;

        System.out.println(b);
    }
}
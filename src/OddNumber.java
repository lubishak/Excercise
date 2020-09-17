public class OddNumber{
    public static void main(String... args){
        int counter = 1;

        for( int  x = 1; x <= 15; x++) {
            x*= counter;
            System.out.printf(" counter is %d%n", x);
        }
    }
}

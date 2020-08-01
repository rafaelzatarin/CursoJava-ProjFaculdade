public class While {
    public static void main(String[] args) {

        // while
        System.out.println(" >> Whiile");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;

            if (i == 5) {
                break;
            }
        }
        System.out.println("\n >> Do Whiile");

        //do while
        int x = 10;
        do {
            System.out.println(x);
            x++;
        } while (x == 100);


    }
}

public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = 0;
        while (i < sideSize) {
            //System.out.println();
            printStars(sideSize);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int i = 0;
        while (i < height) { // while i is less than 3
            printStars(width); // print 17 stars
            //System.out.println(); // make new line
            i++; // increment the loop
            // = 3 lines * 17 stars
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int i = 1;
        while (i <= size){
            printStars(i);
            //System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);
        System.out.println();
        System.out.println("\n---");  // printing --- to separate the figures

        printSquare(4);
        System.out.println("\n---");

        printRectangle(17, 3);
        System.out.println("\n---");

        printTriangle(4);
        System.out.println("\n---");
    }

}

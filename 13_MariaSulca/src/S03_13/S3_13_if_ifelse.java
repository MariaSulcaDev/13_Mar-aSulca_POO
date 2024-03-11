package S03_13;

public class S3_13_if_ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean a = false;
        int b = 8;
        // if simple
        if (a) {
            System.out.println("Hola");
        }
        // if else
        if (a) {
            System.out.println("Ejecucin true");
        } else {
            System.out.println("Ejecucion false");
        }

        if (b == 10) {
            System.out.println("b vale 10");
        } else if (b == 20) {
            System.out.println("b vale 20");
        } else if (b == 30) {
            System.out.println("b vale 30");
        } else {
            System.out.println("No cumple");
        }
    }

}

public class Program {

    public static String[] args() {
        try {
            throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException ex) {
            System.out.println(ex.getMessage());
        }
        return args();
    }


}

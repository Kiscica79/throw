public class Program {

    public static void main (String args[]) throws NegativSzamException {
        Szamit szamitas = new Szamit();
        try {
            System.out.println(Szamit.duplaz(-3.8));
        } catch (NegativSzamException e) {
            System.out.println(e.getMessage());
        }

    }


}

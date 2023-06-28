public class Szamit {


    public double duplaz(double szam) {
        try {
            if (szam < 0) {
                throw new NegativSzamException();
            } else {
                return szam * 2;
            }
        } catch (NegativSzamException e) {
            System.out.println(e.getMessage());
        }

        return szam;
    }



}

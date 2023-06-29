public class Szamit {


    public static double duplaz(double szam) throws NegativSzamException {
        if (szam < 0) {
            throw new NegativSzamException("Ez nem a helyes szám, mert ez negatív");
        } else {
            return szam * 2;
        }
    }

    @Override
    public String toString() {
        return "Szamit{}";
    }
}

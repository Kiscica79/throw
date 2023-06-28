# throw
# 1. feladat
## NegativSzamException osztály

- Készíts egy osztályt NegativSzamException néven, amely kiterjeszti az Exception osztályt.
- Hozz létre egy konstruktort, amely egy uzenet nevű szöveges paramétert vár, és meghívja az ősosztály konstruktorát a paraméterrel.

## Szamit osztály

- Készíts egy osztályt Szamit néven.
- Definiálj egy duplaz metódust, amely egy szam nevű double paramétert vár.
  A metódus dobjon NegativSzamException kivételt, ha a szám kisebb, mint 0.
  Ha a szám nem negatív, akkor térjen vissza a szám duplájával (2-szeresével).


## Program osztály

- Készíts egy osztályt Program néven.
- Definiálj egy main metódust, amely egy String args[] tömböt vár.
- A metódus dobjon Exception kivételt.
- Hozz létre egy Szamit objektumot.
- Hívd meg a Szamit objektum duplaz metódusát a -3.8 értékkel, és írasd ki az eredményt a konzolra (System.out.println).
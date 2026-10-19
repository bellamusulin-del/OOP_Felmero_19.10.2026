# OOP_Felmero_19.10.2026
B változat – Űrzokni-teleportációs hivatal
Kiinduló kód: másold a következő osztályokat a projektbe, majd javítsd/kiegészítsd a követelményeknek
megfelelően. A hibák szándékosak. A feladat nem igényel adatbázist, hálózatot vagy GUI-t
1. Konstruktor és objektumállapot – 3 pont
Javítsd a UrZokni konstruktorát úgy, hogy a azonosito ténylegesen az átadott értéket tárolja. Az eredeti
konstruktor-paraméterek és nevek maradjanak meg. Írj rövid angol kommentet a javított sorhoz, amely
megmagyarázza a problémát.
2. Adatrejtés és ellenőrzött elérés – 3 pont
A azonosito mező legyen private. Hozz létre egy public String getAzonosito() metódust. A
leszármazott osztály ne érje el közvetlenül a szülő privát mezőjét; a gettert használja. Ne nevezz át
semmilyen meglévő metódust.
3. Validáció és szabályos állapot – 4 pont
A konstruktor ne engedjen negatív tisztasagPont értéket. A mosas(int pluszPont) metódus ne fogadjon
negatív paramétert. Mindkét hibás bemenetnél dobj IllegalArgumentException-t. Null vagy üres
azonosito se legyen elfogadható. A 0 érvényes.
4. Öröklés, felülírás, polimorfizmus – 6 pont
Javítsd a TeleportalosUrZokni cimke() metódusát úgy, hogy a saját speciális mezőjét is megjelenítse. Az
alapváltozat adja vissza az azonosítót és a pontszámot; a leszármazott változat azonosítót, pontszámot és
a speciális mezőt. A main-ben készíts egy alap- és egy leszármazott objektumot, tárold őket UrZokni típusú
referenciákban és hívd meg mindkettőn a cimke() metódust. A hívásnak a valódi objektumtípusnak
megfelelő metódust kell futtatnia.
5. Önálló algoritmikus feladat – 4 pont
Az űrzoknik 1-től kezdődően kapnak sorszámot, de néhány eltűnt a teleportban. Implementáld pontosan
ezt a statikus metódust: public static int elsoHianyzoZokni(int[] sorszamok). A legkisebb, pozitív
hiányzó egész számot adja vissza. A bemenetben duplikátum, 0 és negatív szám is lehet; az eredeti tömböt
ne módosítsd. Üres tömbre 1 az eredmény. Nem kell rendezést vagy haladó kollekciókat használnod.
// Expected: 3
int[] sorszamok = {4, 1, 2, 2, 0, -5};
System.out.println(elsoHianyzoZokni(sorszamok));
// Expected: 4
System.out.println(elsoHianyzoZokni(
    new int[] {1, 2, 3}));
A logikai feladat önálló: 4/20 pontot ér. A működő megoldás többet ér, mint egy jól hangzó magyarázat.
Készíts hozzá legalább két további tesztesetet; a nem triviális cikluslogikát angol kommenttel magyarázd.
Beadás előtti ellenőrzőlista
□ Fordul és fut a Java-projekt. □ Mind az 5 feladat elkészült. □ Legalább 5 tartalmas commit. □ Változó-,
osztály- és metódusnevek megtartva. □ Angol magyarázó kommentek. □ README és működő repository
URL

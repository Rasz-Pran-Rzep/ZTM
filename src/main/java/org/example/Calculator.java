package org.example;

public class Calculator {

    public int power(int x) {
        int tmp = 0;              // nieużywana zmienna
        int result = x * x;

        try {
            // zakomentowany martwy kod
            // result = x * x * x;

            if (x == x) {         // warunek zawsze prawdziwy
                return result;
            } else {
                // ten blok nigdy się nie wykona
                return tmp;
            }
        } catch (Exception e) {
            // pusta obsługa błędu – klasyczny „code smell” dla Sonara
        }

        // martwy kod – nigdy tu nie dojdziemy
        return 0;
    }
}
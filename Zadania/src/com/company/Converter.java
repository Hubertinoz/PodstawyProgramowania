package com.company;

public class Converter {
    public void main() {

        char a = 125;
        String b = "1111101";
        dectobin(a);
        bintodec(b);
        System.out.println("PLN to EUR: " + plntoeur(40));
        System.out.println("EUR to PLN: " + eurtopln(40));
        System.out.println("CELCIUS to FAHRENHAIT: " + celctof(1));
        System.out.println("FAHRENHAIT to CELCIUS: " + ftocelc(33.8));
    }

    public static void dectobin(int a) {

        int out[] = new int[20];
        int index = 0;

        while (a > 0) {
            out[index++] = (a % 2);
            a = a / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(out[i] + " ");
        }
        System.out.println();

    }

    public static void bintodec(String a) {
        int dec = 0;
        int pow = 1;
        char c;

        for (int i = a.length() - 1; i >= 0; i--) {
            c = a.charAt(i);
            dec = dec + (Integer.parseInt(c + "") * pow);
            pow *= 2;
        }
        System.out.println(dec);
    }

    public double plntoeur(double a) {
        return (a * 4.303);
    }

    public double eurtopln(double a) {
        return (a / 4.303);
    }

    public double ftocelc(double a) {
        return ((a - 32) * 5 / 9);
    }

    public double celctof(double a) {
        return ((a * 9 / 5) + 32);
    }
}

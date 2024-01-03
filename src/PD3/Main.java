package PD3;

public class Main {
    public static void main(String[] args) {
        // 1 uzduotis

        byte b = 8;
        System.out.println("byte = " + b + " bit " + "&& 1 byte" + " VALUE 0");

        short s = 16;
        System.out.println("short = " + s + " bit " + "&& 2 byte" + " VALUE 0");

        int i = 32;
        System.out.println("int = " + i + " bit " + "&& 4 byte" + " VALUE 0");

        long l = 64;
        System.out.println("long = " + l + " bit " + "&& 8 byte" + " VALUE 0L");

        float f = 32;
        System.out.println("float = " + f + " bit " + "&& 4 byte" + " VALUE 0.0f");

        double d = 64;
        System.out.println("double = " + d + " bit" + " && 8 byte" + " VALUE 0.0d");

        boolean boolean_b = true;
        System.out.println("boolean = 8 bit " + boolean_b + " 1 byte" + " VALUE TRUE");

        char c = 16;
        System.out.println("char = 16 " + c + " && 2 byte" + "VALUE /u0000");

        // 2  uzduotis

        System.out.println(b + (s * b));

        //3 uzduotis

        System.out.println(f % d);

        // 4 uzduotis

        boolean test = (s < b);
        if (test) {
            System.out.println("tiesa");
        } else {
            System.out.println("netiesa");
        }

        //5 uzduotis

        // int i double
        d = (double) i;
        System.out.println(d);
        // long i int
        i = (int) l;
        System.out.println(i);

        // 6 uzduotis
        boolean isLetter = Character.isLetter('a');
        System.out.println(isLetter);

        // 7 uzduotis
        String tekstas1 = "Labas,";
        String tekstas2 = " pasauli!";
        String tekstas3 = "labas";

        String sujungtasTekstas = tekstas1 + tekstas2;
        System.out.println("Sujungtas tekstas: " + sujungtasTekstas);

        // Palyginimas
        boolean arLygu = tekstas1.equals(tekstas3);
        System.out.println("Ar lygu: " + arLygu);

        // Dalies ištraukimas
        String dalis = sujungtasTekstas.substring(0, 5);
        System.out.println("Dalis ištraukta: " + dalis);

        // Teksto ilgis
        int ilgis = sujungtasTekstas.length();
        System.out.println("Teksto ilgis: " + ilgis);

        // Didžiųjų raidžių pavertimas mažosiomis ir atvirkščiai
        String didziosios = tekstas1.toUpperCase();
        System.out.println("Didžiosios raidės: " + didziosios);

        String mazosios = tekstas2.toLowerCase();
        System.out.println("Mažosios raidės: " + mazosios);

        // 8 uzduotis
        double pirmas = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
        double antras = 12.75 / (15.4 - 2.75);
        System.out.println(pirmas == antras);


    }


}

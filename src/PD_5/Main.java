package PD_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 pirma uzduotis

        for (int row = 1; row <= 10; row++) {  //row
            for (int column = 1; column <= row; column++) { //column
                if (column == 1 || column == row || row == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(".....................................................");
        for (int row = 1; row <= 6; row++) {  //row
            for (int column = 1; column <= 8; column++) { //column
                if (row == 1 || row == 6 || column == 1 || column == 8) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println(" ");


        }
        System.out.println("................................................");
        for (int row = 1; row <= 5; row++) {  //row
            for (int column = 1; column <= 5; column++) { //column
                if (row == 1 || row == 5 || column == 1 || column == 5) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");


        }

        // 2 uzduotis
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int ats = i * j;
                System.out.println(i + " x " + j + " = " + ats);
            }
        }

        // 3 uzduotis
        int n = 50;

        System.out.println("Pirminiai skaiciai nuo 2 iki " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            if (i > 1) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }

            if (isPrime) {
                System.out.println(i + " ");
            }
        }

        // 4 uzduotis
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int skaicius;

        do {
            System.out.print("Iveskite skaiciu (0 baigia skaiciavimus): ");
            skaicius = scanner.nextInt();
            suma += skaicius;
        } while (skaicius != 0);

        System.out.println("Visu ivestu skaiciu suma: " + suma);




        // 5 uzduotids
        for (int i = 1; i <= 100; i++)
        {
            if (i % 5 == 0)
            {
                continue;
            }
            System.out.println(i);

            if (i % 88 == 0) {
                System.out.println("Skaičius dalijasi iš 88, nutraukiame ciklą.");
                break;
            }

            //6 uzduotis


            System.out.print("Kiek egluciu atvezta? ");
            int kiekis = scanner.nextInt();

            int e = 0;

            for (int k = 1; k <= kiekis; k++) {
                System.out.print("Iveskite " + k + " eglutės aukšti: ");
                int aukstis = scanner.nextInt();
                e += aukstis;
            }

            if (kiekis > 0) {
                double vidurkis = (double) e / kiekis;
                System.out.println("Vidutinis egluciu aukstis: " + vidurkis);
                break;
            } else {
                System.out.println("Nera ivestu egluciu, todel vidutinio aukscio nera.");
                break;
            }
        }

        //7 uzduotis

        Scanner bSkaicius = new Scanner(System.in);

        System.out.print("Kiek dalyvavo begiku: ");
        int dalyviai = scanner.nextInt();

        int greiciausioBegikoLaikas = Integer.MAX_VALUE;
        int greiciausioBegikoNumeris = -1;

        for (int i = 1; i <= dalyviai; i++) {
            System.out.print("Iveskite " + i + " begiko laika: ");
            int laikas = scanner.nextInt();

            if (laikas < greiciausioBegikoLaikas) {
                greiciausioBegikoLaikas = laikas;
                greiciausioBegikoNumeris = i;
            }
        }

        System.out.println("Greiciausias begikas yra " + greiciausioBegikoNumeris + " su laiku " + greiciausioBegikoLaikas + " sek.");


        //8 uzduotis

        Scanner bakas = new Scanner(System.in);
        System.out.println("Iveskite kuro bako talpa: ");
        int kuroBakoTalpa = scanner.nextInt();
        System.out.println("Iveskite kuro sanaudas: ");
        int kuroSanaudos = scanner.nextInt();
        int dienos =0;


        while (kuroBakoTalpa >= kuroSanaudos) {
            // Lyginė diena
            if (dienos % 2 == 0) {
                kuroBakoTalpa -= kuroSanaudos;
            } else {
                kuroBakoTalpa -= 2 * kuroSanaudos;
            }

            dienos++;
        }

        System.out.println("Keliauti bus galima " + dienos + " dienas.");


        // 9 uzduotis

        System.out.print("Įveskite, kiek autobusų vyksta kasdien: ");
        int autobusuSkaicius = scanner.nextInt();

        int visoKeleiviu = 0;
        int visoLaikoMin = 0;

        int maziauNei10Keleiviu = 0;

        for (int i = 1; i <= autobusuSkaicius; i++) {
            System.out.print(i + " autobuso važiavimo laikas (val.): ");
            int valandos = scanner.nextInt();

            System.out.print(i + " autobuso važiavimo laikas (min.): ");
            int minutes = scanner.nextInt();

            System.out.print(i + " autobusas perveža keleivių: ");
            int keleiviai = scanner.nextInt();

            // Skaičiuojame viso keleivių ir laiko
            visoKeleiviu += keleiviai;
            visoLaikoMin += valandos * 60 + minutes;

            // Tikriname, ar keleivių skaičius mažesnis nei 10
            if (keleiviai < 10) {
                maziauNei10Keleiviu++;
            }
        }

        // Skaičiuojame vidutinį laiką vienam autobusui
        int vidutinisLaikasMin = visoLaikoMin / autobusuSkaicius;

        // Rodymas rezultatų
        System.out.println("(a) Kiek keleivių iš Vilniaus į Panevėžį pervežė autobusai: " + visoKeleiviu);
        System.out.println("(b) Kiek laiko vidutiniškai truko vienas autobusas: " + vidutinisLaikasMin + " min.");
        System.out.println("(c) Keliuose autobusuose važiavo mažiau nei 10 keleivių: " + maziauNei10Keleiviu);


        //10 uzduotis
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Įveskite intervalo pradžios skaičių (o): ");
        int o = scanner.nextInt();

        System.out.print("Įveskite intervalo pabaigos skaičių (m): ");
        int m = scanner.nextInt();

        System.out.println("Skaičiai intervalo [" + n + "; " + m + "], kurių paskutinis skaitmuo nelygus 3, tačiau dalijasi iš 3:");

        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 && i % 10 != 3) {
                System.out.println(i);
            }
        }

    }
    }




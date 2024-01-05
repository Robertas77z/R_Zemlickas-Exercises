package lt.techin;

import java.util.Scanner;

public class PD4 {
    public static void main(String[] args) {
        int number = 10;
        int secondNumber = 3;
//        1 uzduotis
        System.out.println(number + secondNumber);
        System.out.println(number - secondNumber);
        System.out.println(number * secondNumber);
        System.out.println(number / secondNumber);
        System.out.println(number % secondNumber);
//        2 uzduotis
        System.out.println(number == secondNumber);
        System.out.println(number != secondNumber);
        System.out.println(number > secondNumber);
        System.out.println(number < secondNumber);
        System.out.println(number >= secondNumber);
        System.out.println(number <= secondNumber);
//        3 uzduoties sake nereikia
        System.out.println("-------------------------------------");
//          4 uzduotis

        boolean tiesa = true;
        boolean netiesa = false;

        boolean rezultatas = tiesa && netiesa;
        System.out.println(rezultatas);
        boolean rezultatasKitas = tiesa || netiesa;
        System.out.println(rezultatasKitas);

        // 5 uzduotis
        System.out.println(number = secondNumber);
        System.out.println(number += secondNumber);
        System.out.println(number -= secondNumber);
        System.out.println(number *= secondNumber);
        System.out.println(number /= secondNumber);
        System.out.println(number %= secondNumber);

        // 6 uzduotis
        int number1 = 10;
         String result;
         // Using the ternary operator
         result = (number1 > 5) ? "> 5" : "< 5";
         System.out.println(result);

         // 7 uzduotis

         int x = 5;
         int y = 10;
         int z = 15;

         int resultatas = x * y + z;
        System.out.println(resultatas);

         int resultatas2 = (x + y) * z;
        System.out.println(resultatas2);

         boolean resultatas3 = x < y && y < z;
        System.out.println(resultatas3);

// 8 uzduotis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek paskaitu buvo pirmadieni? ");
        int paskaituSkaiciusPirmadieni = scanner.nextInt();
        int paskaitosTrukme = 45;

        System.out.println("Kiek paskaitu buvo antradieni? ");
        int antradienioPaskaitos = scanner.nextInt();

        System.out.println("Kiek paskaitu buvo treciadieni? ");
        int treciadienioPaskaitos = scanner.nextInt();

        System.out.println("Kiek paskaitu buvo ketvirtadieni? ");
        int ketvirtadienioPaskaitos = scanner.nextInt();

        System.out.println("Kiek paskaitu buvo penktadieni? ");
        int penktadienioPaskaitos = scanner.nextInt();

        int visoPaskaituSkaicius = paskaituSkaiciusPirmadieni + antradienioPaskaitos + treciadienioPaskaitos + ketvirtadienioPaskaitos + penktadienioPaskaitos;
        System.out.println("Paskaitu skaicius per savaite " + visoPaskaituSkaicius);
        int visoMinuciu = paskaitosTrukme * visoPaskaituSkaicius;
        System.out.println("Tai sudaro " + visoMinuciu + " minuciu.");

        //9 uzduotis

        int a = 4;
        int h = 3;
        double k = 0.5;

        int sienosKvadratura = h * a;

        double plytosIlgis = 0.20;
        double plytosAukstis = 0.10;

        double plytosKvadratura = plytosIlgis*plytosAukstis;
        double plytuKiekis = sienosKvadratura / plytosKvadratura;
        int suapvalintasPlytuKiekis = (int) Math.ceil(plytuKiekis);

        System.out.println("Plytu kiekis "+suapvalintasPlytuKiekis);
        double kaina = suapvalintasPlytuKiekis * k;
        System.out.println("Plytos kainuos " + kaina);

        // 10 uzduotis

        int dezute = 3;
        int m = 7;

        int pilnaDezute = m / dezute ;
        System.out.println("Pilnu dezuciu skaicius " + pilnaDezute);

        int nesupakuotaDezute =m % dezute ;
        System.out.println("Nesupakuotu puodeliu skaicius " + nesupakuotaDezute);

        //11 uzduotis

        double kelioIlgis = 264;
        double v = 60;
        double keliasNuvaziuotasPersekundeMetrais = v * 1000 / 3600;
        double laikasNuvaziuotasDuotamAtstumui = kelioIlgis / keliasNuvaziuotasPersekundeMetrais;
        double suapvalintasLaikas = Math.round (laikasNuvaziuotasDuotamAtstumui * 100.0) / 100.0;
        System.out.println("Automobilis tuneli pravaziuos per " + suapvalintasLaikas);

        // 12 uzduotis


        int zuvuSkaicius = 5;
        int dienos = 3;
        int naujosZuvis = 3;

        int galutinisZuvuSkaicius = zuvuSkaicius + (dienos * naujosZuvis);
        System.out.println("Po 3 dienu akvariume gyvens " + galutinisZuvuSkaicius);


}



        }








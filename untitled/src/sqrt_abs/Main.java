package sqrt_abs;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.System.in;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

            Double a, b, wynik = null;
            int wybor;

            System.out.println("jakie dzialanie chcesz wykonac :" );
            System.out.println("1. dodawanie ");
            System.out.println("2. odejmowanie");
            System.out.println("3. mnozenie");
            System.out.println("4. dzielenie");
            System.out.println("5. Potęgowanie");
            System.out.println("6. Pierwiastkowanie");
            System.out.println("7. Modulo");

            Scanner scanner = new Scanner(in);
            wybor = scanner.nextInt();

            switch(wybor){
                case 1:
                    System.out.println("Podaj 1 liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj 2 liczbe: ");
                    b = scanner.nextDouble();
                    wynik = a + b;
                    System.out.println("Wynik wynosi: " +wynik);
                    scanner.close();
                    break;

                case 2:
                    System.out.println("Podaj 1 liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj 2 liczbe: ");
                    b = scanner.nextDouble();
                    wynik = a - b;
                    System.out.println("Wynik wynosi: " +wynik);
                    scanner.close();
                    break;

                case 3:
                    System.out.println("Podaj 1 liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj 2 liczbe: ");
                    b = scanner.nextDouble();
                    wynik = a*b;
                    System.out.println("Wynik wynosi: " +wynik);
                    scanner.close();
                    break;

                case 4:
                    System.out.println("Podaj 1 liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj 2 liczbe: ");
                    b = scanner.nextDouble();
                    if( b == 0){
                        System.out.println("nie dzieli sie przez zero!!!");
                    }
                    else{ wynik = a/b;
                    }
                    System.out.println("Wynik wynosi: " +wynik);
                    scanner.close();
                    break;


                case 5:
                    System.out.println("Podaj 1 liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj potęgę do ktorej 1 liczba zostanie podniesiona: ");
                    b = scanner.nextDouble();
                    wynik =pow(a,b);
                    System.out.println("Wynik wynosi: " +wynik);
                    scanner.close();
                    break;

                case 6:
                    System.out.println("Podaj 1 liczbe: ");
                    a = scanner.nextDouble();
                    wynik = Math.sqrt(a);
                    System.out.println("Wynik wynosi: " +wynik);
                    scanner.close();
                    break;

                case 7:
                    System.out.println("Podaj 1 liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj 2 liczbe: ");
                    b = scanner.nextDouble();
                    wynik = a%b;
                    System.out.println("Wynik wynosi: " +wynik);
                    scanner.close();
                    break;
            }
        }




}

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("champagnepapi");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 1; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//
//        }
//
//        int i = 2;
//        System.out.println(i);
//        double f = 2.0;
//        long l = 2L;
//
//        Integer i2 = 2;
//        System.out.println(i2.doubleValue());
//        Double f2 = 2.0;
//        Long l2 = 2L;
//
//        char w = 'x';
//
  //      String name = "champagnepapi";
 //       System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());

//        int a;
//        for (a=1;a<16;++a)
//        System.out.println(a);
//        char();

//
//        int i = 1;
//        for (i = 1; i <= 5; ++i); {
//            System.out.print(i + '\n'  + "," );
//
//        String nazwa = "hello";
//
//        int a = 0;
//        int b = 10;
//        String name1= "hello";
//
//        while (a <= 9)
//    {
//        System.out.print(a++ + " ,");
//        if (a>9)
//            System.out.println(b);
//    }
//        System.out.println(nazwa);
//b();
////c();
//imie();
//String imie = "essa";
//}
//    protected static void b(){
//        System.out.println("fck a");
//    }
//    private static void imie (){
//        String imie = "essa";
//        System.out.println(imie);




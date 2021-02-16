import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Podaj pierwszą liczbę:");
        int a= scanner.nextInt();
        System.out.println("Podaj drugą liczbe liczbę:");
         int b= scanner.nextInt();
        System.out.println("Podaj + lub -");
        scanner.nextLine()
        String c= scanner.nextLine(); 

        if (c.equals ("+"));
        { 
            System.out.println("wybrano dodawanie" + (a+b));   
        }
    
     else if (c.equals("-"));
        {
            System.out.println("wybrano odejmowanie" + (a-b));
        }
    else { System.out.println("złe dane");
    }

    scanner.close();

    }
}

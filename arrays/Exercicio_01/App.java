import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) {
            
            System.out.println("Product name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Product price:");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price); 
        }
        
        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum/vect.length;
        System.out.printf("AVERAGE PRICE: %.2f", avg);

        sc.close();
        
    }
}

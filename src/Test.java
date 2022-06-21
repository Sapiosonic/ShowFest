import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();

        double value;
        System.out.println("Enter the ticket's value: ");
        do{
            value = scanner.nextDouble();
            if(value > 0){
                ticket.setValue(value);
            } else {
                System.out.println("Invalid value! Please, try again!");
            }
        }while(value <= 0);

        int quantity;
        System.out.println("Inform the ticket's quantity: ");
        do{
            quantity = scanner.nextInt();
            if(quantity > 0){
                ticket.setQuantity(quantity);
            }else{
                System.out.println("Invalid quantity! Please, try again! ");
            }
        }while(quantity <= 0);
 
        System.out.println("Your ticket is a half price ticket! ");
        boolean halfPrice = true;
        ticket.setHalfPrice(halfPrice);
        
        ticket.show();

        scanner.close();
    }
}

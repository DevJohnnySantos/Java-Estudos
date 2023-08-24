package aplication;

import entities.Client;
import java.util.Date;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enuns.OrderStatus;

import java.text.ParseException;
import  java.text.SimpleDateFormat;

import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++ ){
            System.out.println("Enter for #" +i+1 + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();


            Product product = new Product(productName, productPrice);
            OrdemItem it = new OrdemItem(quantity, productPrice, product);
            order.addItems(it);
        }
        System.out.println();
        System.out.println(order);


        sc.close();
     }
}

package application;

import model.entities.Resevetion;
import model.exceptions.DomainExeption;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static  void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIN = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyy): ");
            Date checkOut = sdf.parse(sc.next());

            Resevetion resevetion = new Resevetion(number, checkIN, checkOut);
            System.out.println("Reservation: " +resevetion);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIN = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            resevetion.updateDates(checkIN, checkOut);
            System.out.println("Reservation: " + resevetion);

        }

        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch ( DomainExeption e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}

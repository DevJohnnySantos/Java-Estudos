package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalServices {

    private Double pricePerDay;
    private Double getPricePerHour;

    private Tax.TaxSevices taxSevices;

    public RentalServices(){

    }
    public RentalServices(Double pricePerDay, Double getPricePerHour, Tax.TaxSevices taxSevices){
        this.pricePerDay = pricePerDay;
        this.getPricePerHour = getPricePerHour;
        this.taxSevices = taxSevices;
    }
    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getStart()).toMinutes();
        double hours = minutes /60.0;

        double basicPayment;
        if (hours <= 12.0){
            basicPayment = pricePerDay * Math.ceil(hours);
        }
        else {
            basicPayment = getPricePerHour * Math.ceil(hours/24);
        }
        double tax = taxSevices.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax ));
    }
}

package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter frt = DateTimeFormatter.ofPattern("dd/MM?yyyy");

    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    @Override
    public String toString(){
        return dueDate.format(frt) + " - " + String.format("%.2f", amount);
    }
}

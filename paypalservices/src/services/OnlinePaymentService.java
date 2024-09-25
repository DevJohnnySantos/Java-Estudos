package services;

public interface OnlinePaymentService {

    double paymenfee(double amount);

    double interest(double amount, int months);
}


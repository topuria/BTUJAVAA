package ge.edu.CurrencyConverter.service;

public interface CurrencyService {
     int convert(int amount);
     double convert(double amount);
     void setExchangeRate(double rate);
}

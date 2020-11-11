package ge.edu.CurrencyConverter.service;

public class CurrencyServiceImpl implements CurrencyService {
     private double exchangeRate;
     @Override
     public int convert(int amount){
        return amount*exchangeRate;
     }
     @Override
     public double convert(double amount){
        return amount*exchangeRate;
     }
     @Override
     public void setExchangeRate(double rate){
          this.exchangeRate = rate;
     }
}

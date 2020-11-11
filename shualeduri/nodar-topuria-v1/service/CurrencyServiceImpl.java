package ge.edu.CurrencyConverter.service;

public class CurrencyServiceImpl implements CurrencyService {
     private double exchangeRate;
     @Override
     public void convert(int amount){
        System.out.println(amount*exchangeRate);
     }
     @Override
     public void convert(double amount){
        System.out.println(amount*exchangeRate);
     }
     @Override
     public void setExchangeRate(double rate){
          this.exchangeRate = rate;
     }
}

package ge.edu.CurrencyConverter

public class CurrencyConverter
{
  
  public static void main(String args[])
  {
      CurrencyServiceImpl c = new CurrencyServiceImpl();
      c.setExchangeRate(3.5);
      c.convert(2);
      c.convert(3.5);      
    
  }
  
  
}

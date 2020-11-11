package ge.edu.CurrencyConverter

@Slf4j
public class CurrencyConverter
{
  
  public static void main(String args[])
  {
      Scanner input = new Scanner(System.in);
      System.out.println("შეიყვანე შენთვის სასურველი კურსი აქ მაინც :( ");
      double r = input.nextDouble();
      CurrencyServiceImpl c = new CurrencyServiceImpl();
      c.setExchangeRate(r);
      log.info("შენთვის სასურველი კურსი: "+r);
      int amount = c.convert(2);
      double amount2 = c.convert(3.5);   
      System.out.println(amount);
      System.out.println(amount2);
    
  }
  
  
}

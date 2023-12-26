import java.util.Calendar;

public class Bills {
   
   Calendar now = Calendar.getInstance();

   //Instance variables
   private String orderNumber;
   private String orderName;
   private int phoneNumber;
   private double burgerHousePrice;
   private double tacoPlacePrice;
   private double sandwitchHousePrice;
   private double totalOrder;

   //constructors
   public Bills (){
   totalOrder = 0;
   }
   
   public Bills (String orderNumber, String orderName, int phoneNumber, double burgerHousePrice, double tacoPlacePrice, double sandwitchHousePrice, double totalOrder){
   orderNumber = order;
   orderName = name;
   phoneNumber = number;
   burgerHousePrice = burger;
   tacoPlacePrice = taco;
   sandwitchHousePrice = sandwitch;
   totalOrder = total;
   }
   
   //set methods

   public void setOrderNumber(String order){
      orderNumber = order;
   }

   public void setOrderName(String name) {
      orderName = name;
   }
   
   public void setPhoneNumber(double number) {
      phoneNumber = number;
   }

   public void setBurgerHousePrice(double burger) {
      burgerHousePrice = burger;
   }

   public void setTacoPlacePrice(double taco) {
      tacoPlacePrice = taco;
   }
   
   public void setSandwitchHousePrice(double sandwitch) {
     sandwitchHousePrice = sandwitch;
   }

   public void setTotalOrder(double total) {
      totalOrder = total;
   }

   // Get methods
   public String getOrder() {
      return orderNumber;
      }   
   public String getName() {
      return orderName;
      }
   public double getPhoneNumber() {
      return phoneNumber;
      }
   public double getBurgerHousePrice() {
      return burgerHousePrice;
      }
  public double getTacoPlacePrice() {
     return tacoPlacePrice;
     }
  public double getSandwitchHousePrice() {
     return sandwitchHousePrice;
     }
   public double getTotalOrder() {
      return totalOrder;
      }
      
      
  // total price
  public void burgerPrice1 (double price1) {
      burgerPrice1 = totalOrder + price1;
      System.out.printf("$%.2f has been added to your order.\n", burgerPrice1);
      }
  public void burgerPrice2 (double price2) {
      burgerPrice2 = totalOrder + price2;
      System.out.printf("$%.2f has been added to your order.\n", burgerPrice2);
      }
  public void burgerPrice3 (double price3) {
      burgerPrice3 = totalOrder + price3;
      System.out.printf("$%.2f has been added to your order.\n", burgerPrice3);
      }
  public void TacoPrice1 (double price4) {
      TacoPrice1 = totalOrder + price4;
      System.out.printf("$%.2f has been added to your order.\n", TacoPrice1);
      }
  public void TacoPrice2 (double price5) {
      TacoPrice2 = totalOrder + price5;
      System.out.printf("$%.2f has been added to your order.\n", TacoPrice2);
      }
  public void TacoPrice3 (double price6) {
      TacoPrice3 = totalOrder + price6;
      System.out.printf("$%.2f has been added to your order.\n", TacoPrice3);
      }
  public void SandwitchPrice1 (double price7) {
      SandwitchPrice1 = totalOrder + price7;
      System.out.printf("$%.2f has been added to your order.\n", SandwitchPrice1);
      }
  public void SandwitchPrice2 (double price8) {
      SandwitchPrice2 = totalOrder + price8;
      System.out.printf("$%.2f has been added to your order.\n", SandwitchPrice2);
      }
  public void SandwitchPrice3 (double price9) {
      SandwitchPrice3 = totalOrder + price9;
      System.out.printf("$%.2f has been added to your order.\n", SandwitchPrice3);
      }
   }
// recipt     
   public void receipt() {
      Calendar now = Calendar.getInstance();
      System.out.println(now.getTime());
      System.out.println("Customer Name: " + orderName + "\t\tOrder Number: " + orderNumber);
      System.out.println("Your order has been completed successfully!");
      System.out.printf("Your total price: $%.2f\n", totalOrder);
      System.out.println("We will send you a messege when your order is ready.");
      System.out.println("Thank you for using JC Kiosk!");
      }

import java.util.Scanner;
class Main {

public static void main(String[] args) {
    sayMoney(20);
    Scanner scan = new Scanner(System.in);
      System.out.println("welcome to shoe stone how are you today");
      System.out.println("every shoe here is 20 ,would you like to buy any shoes.");
      boolean shoe = scan.nextBoolean();

      int Money = scan.nextInt();

      if(Money >= 20)
      {
        System.out.println("yay would you like to go check out");
        boolean checkOut = scan.nextBoolean();
      }
       
  }

  public static void sayMoney(int q) {
    if (q == 0) {
      System.out.println("money");
    } else {
      System.out.println("money");
      q--;
      sayMoney(q);
    }
  }
}
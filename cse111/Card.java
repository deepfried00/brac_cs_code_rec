public class Card{
  double balance;
  String name;
  public Card(int n, String m){
    balance = n;
    name = m;
    System.out.println(name + " Card created successfully.");
    System.out.println("Balance: " + balance + " tk");
  }
  
  public void addMoneyFromAccount(int n, MFS m){
    if(m.balance < n){
      System.out.println("Insufficient account balance!");
    }
    else{
      balance += n;
      m.balance -= n;
      System.out.println("Added " + n + " tk to card from MFS account#"+m.accnum);
      System.out.println("New balance in card: "+  balance + " tk");
    }
  }
}
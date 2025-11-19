public class MFS{
  String accnum;
  double balance;
  Card c ;
//  int count = 0;
  boolean stat = false;
  public MFS(String s){
    accnum = s;
    balance = 0.0;
    System.out.println("Account created.");
    System.out.println("AccNo: " + accnum);
    System.out.println("Balance: " + balance + " tk");
    if(stat == false){
    System.out.println("Card not saved");
    }
    else{
    }
  }
  public void addMoneyFromCard(int n){
    if(c == null){
      System.out.println("Please add a card to your MFS account");
    }
    else{
      if(c.balance >= n){
      System.out.println("Transfer successful.");
      balance += n;
      c.balance -= n;
      System.out.println("New MFS account balance: " + balance + " tk.");
      System.out.println("Card balance: " + c.balance + " tk");
    }
      else {
        System.out.println("Insufficient balance in " + c.name + " Card.");
      }
  }
  }
  public void addNewCard(Card x){
    c = x;
      System.out.println(x.name + " Card added to MFS acc#" + accnum);
      stat = true;
    }
  
  
}


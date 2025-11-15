public class Player{
  public String name;
  public int hp;
  String[] defe = new String[5];
  int count = 0;
  public Player(String  n, int m){
    name = n;
    hp = m;
    System.out.println(name + " joined the game");
    System.out.println("HP: " + this.hp);
  }
  public void viewInfo(){
    System.out.println("Player Name: "+ this.name);
    System.out.println("Current HP:  " + this.hp);
    if(count > 0){
    System.out.println("Defeated: " );
    for(int i = 0; i < count; i++){
      System.out.print(defe[i] + ", ");
    }
    System.out.println();
    }
  }
  public void defeatVillain(String s , int n){
    if(n > hp){
      System.out.println("failed to defeat " + s);
    }
    else if( n <= hp){
      if(count < 5){
        hp += n;
        System.out.println("defeated "+ s);
        defe[count] = s;
        count++;
      }
      else{}
    }
  }
  public void defeatVillain(char n, String s, int m){
    hp = hp * (n - '0');
    System.out.println("HP with " + n +"x boost: " + hp);
    defeatVillain(s,m);
  }
    public void defeatVillain(Player n){
    defeatVillain(n.name,n.hp);
  }
  public Player(String m){
    name = m;
    hp = 100;
        System.out.println(name + " joined the game");
    System.out.println("HP: " + this.hp);
  }
}
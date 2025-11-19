public class NetflixUser{
  String name;
  String ano;
  boolean stat;
  Movie[] fav = new Movie[3];
  int count = 0;
  public NetflixUser(String n, String x){
    name = n;
    if(x.equals("Free")){
      stat = false;
    }
    else {
      stat = true;
    }
    System.out.println("New user account created!");
  }
 public NetflixUser(String n){
    name = n;
    stat = false;
    System.out.println("New user account created!");
  }
  public void addToFavourites(Movie m){
    if(stat){
      if(count < 3){
      fav[count] = m;
      count++;
      System.out.println("Movie added to favourites");
      }
      else {
      System.out.println("Cannot add new movies. Favourites list is full");
      }
    }
    else{
      System.out.println("Cannot add movies to favourites");
      System.out.println("Please upgrade to Netflix Premium.");
    }
  }
  public void showFavourites(){
    if(stat == true){
      if(count == 0){
        System.out.println("No available favourties.");
      }
      System.out.println("Showing " + name + "'s Favourties:");
      for(int i =0; i <count ; i++){
        System.out.print(fav[i].name + ", " + fav[i].cata + ", " + "Duration: " +fav[i].hour);
      }
      System.out.println();
    }
    else{
      System.out.println("Please upgrade to Netflix Premium.");
    }
    
  }
  public void upgradePlan(){
    if(stat == false){
    stat = true;
    System.out.println("Welcome to Netflix Premium!");}
    else {
    System.out.println("You already have Netflix Premium!");
    }
  }

  
  }

public class Movie{
  String name;
  String cata;
  String hour;
  public Movie(String n, String m, String p){
    name = n;
    cata = m;
    hour = p;
  }
    public Movie(String n, String m){
    name = n;
    cata = m;
    hour = "Unknown";
  }
}
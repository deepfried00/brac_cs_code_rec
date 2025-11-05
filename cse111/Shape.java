public class Shape{
  public String type;
  public double area;
  public void setParameters(String s, int n ){
    this.type = s;
    this.area = Math.pow(n, 2) * Math.PI;
  }
  public String details(){
     System.out.println(this.type);
    return "Area: " + this.area ;

  }
    public void setParameters(String s, int n, int p ){
    this.area = 0.5 * n * p;
  }
        public void setParameters(String s, double n, double p ){
    this.area = n * p;
  }
}
package src;

public abstract class Piece{
  private String color;
  private String type;
  private int posX;
  private int posY;

  public Piece(){
    this.color = "white";
    this.type = "";
  }

  public Piece(String c, String t){
    this.color = c;
    this.type = t;
  }

  public Piece(String c, String t,int x, int y){
    this.color = c;
    this.type = t;
    this.posX = x;
    this.posY = y;
  }

  public String getColor(){
    return this.color;
  }

  public String getType(){
    return this.type;
  }

  public int getX(){
    return this.posX;
  }

  public int getY(){
    return this.posY;
  }

  public void setY(int y){
    this.posY = y;
  }

  public void setX(int x){
    this.posX = x;
  }

  public void setType(String t){
    this.color = t;
  }

  public void setColor(String c){
    this.color = c;
  }

  public abstract int[] movePossible(int dimX, int dimY);

}

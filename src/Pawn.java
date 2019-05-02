package src;

public class Pawn extends Piece{
  public Pawn(String color, int x,int y){
    super(color,"pawn",x,y);
  }

  public int[] movePossible(int dimX, int dimY){
    int[] tab = new int[5];
    int nbMove = 0;
    if(getColor().equals("white")){
      if(getY() < dimY){
        if(getX()-1 > 0){
          nbMove++;
          tab[1]=getX()-1;
          tab[2]=getY()+1;
        }
        else{
          tab[1]=0;
          tab[2]=0;
        }
        if(getX()+1 < dimX){
          nbMove++;
          tab[3]=getX()+1;
          tab[4]=getY()+1;
        }
        else{
          tab[3]=0;
          tab[4]=0;
        }
      }
      tab[0]=nbMove;
    }
    if(getColor().equals("black")){
      if(getY() > 0){
        if(getX()-1 > 0){
          nbMove++;
          tab[1]=getX()-1;
          tab[2]=getY()-1;
        }
        else{
          tab[1]=0;
          tab[2]=0;
        }
        if(getX()+1 < dimX){
          nbMove++;
          tab[3]=getX()+1;
          tab[4]=getY()-1;
        }
        else{
          tab[3]=0;
          tab[4]=0;
        }
      }
      tab[0]=nbMove;
    }
    return tab;
  }
}

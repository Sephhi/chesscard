package src;

public class King extends Piece{

  public King(String color, int x , int y){
    super(color,"king",x,y);
  }

  public int[] movePossible(int dimX, int dimY){
    int[] tab = new int [17];
    int nbMove = 0;
    if(getX()-1 > 0){
      tab[1]=getX()-1;
      tab[2]=getY();
      nbMove++;
      if(getY()-1 > 0){
        tab[3]=getX()-1;
        tab[4]=getY()-1;
        nbMove++;
      }
      else{
        tab[3]=0;
        tab[4]=0;
      }

      if(getY()+1 < dimY){
        tab[5]=getX()-1;
        tab[6]=getY()+1;
        nbMove++;
      }
      else{
        tab[5]=0;
        tab[6]=0;
      }
    }
    else{
      tab[1]=0;
      tab[2]=0;
      tab[3]=0;
      tab[4]=0;
      tab[5]=0;
      tab[6]=0;
    }

    if(getX()+1 < dimX){
      tab[7]=getX()+1;
      tab[8]=getY();
      nbMove++;
      if(getY()-1 > 0){
        tab[9]=getX()+1;
        tab[10]=getY()-1;
        nbMove++;
      }
      else{
        tab[9]=0;
        tab[10]=0;
      }

      if(getY()+1 < dimY){
        tab[11]=getX()+1;
        tab[12]=getY()+1;
        nbMove++;
      }
      else{
        tab[11]=0;
        tab[12]=0;
      }
    }
    else{
      tab[7]=0;
      tab[8]=0;
      tab[9]=0;
      tab[10]=0;
      tab[11]=0;
      tab[12]=0;
    }
    if(getY()+1 < dimY){
      tab[13]=getX();
      tab[14]=getY()+1;
      nbMove++;
    }
    else{
      tab[13]=0;
      tab[14]=0;
    }
    if(getY()-1 > 0){
      tab[15]=getX();
      tab[16]=getY()-1;
      nbMove++;
    }
    else{
      tab[15]=0;
      tab[16]=0;
    }

    return tab;
  }
}

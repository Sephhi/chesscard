package src;

public class Knight extends Piece{
  public Knight(String color, int x, int y){
    super(color,"knight",x,y);
  }

  public int[] movePossible(int dimX, int dimY){
    int[] tab = new int[17];
    int nbMove = 0;
    if(getX()-2 > 0){
      if(getY()-1 >0){
        nbMove++;
        tab[1]=getX()-2;
        tab[2]=getY()-1;
      }
      else{
        tab[1]=0;
        tab[2]=0;
      }
      if(getY()+1 < dimY){
        nbMove++;
        tab[3]=getX()-2;
        tab[4]=getY()+1;
      }
      else{
        tab[3]=0;
        tab[4]=0;
      }
    }
    else{
      for(int i =1;i<=4;i++){
        tab[i]=0;
      }
    }

    if(getX()+2 < dimX){
      if(getY()-1 >0){
        nbMove++;
        tab[5]=getX()+2;
        tab[6]=getY()-1;
      }
      else{
        tab[5]=0;
        tab[6]=0;
      }
      if(getY()+1 < dimY){
        nbMove++;
        tab[7]=getX()+2;
        tab[8]=getY()+1;
      }
      else{
        tab[7]=0;
        tab[8]=0;
      }
    }
    else{
      for(int i=5;i<=8;i++){
        tab[i]=0;
      }
    }

    if(getY()+2 < dimY){
      if(getX()-1 >0){
        nbMove++;
        tab[9]=getX()-1;
        tab[10]=getY()+2;
      }
      else{
        tab[9]=0;
        tab[10]=0;
      }
      if(getX()+1 < dimY){
        nbMove++;
        tab[11]=getX()+1;
        tab[12]=getY()+2;
      }
      else{
        tab[11]=0;
        tab[12]=0;
      }
    }
    else{
      for(int i=9;i<=12;i++){
        tab[i]=0;
      }
    }

    if(getY()-2 > 0){
      if(getX()-1 >0){
        nbMove++;
        tab[13]=getX()-1;
        tab[14]=getY()-2;
      }
      else{
        tab[13]=0;
        tab[14]=0;
      }
      if(getX()+1 < dimY){
        nbMove++;
        tab[15]=getX()+1;
        tab[16]=getY()-2;
      }
      else{
        tab[15]=0;
        tab[16]=0;
      }
    }
    else{
      for(int i=13;i<=16;i++){
        tab[i]=0;
      }
    }

    tab[0]=nbMove;
    return tab;

  }
}

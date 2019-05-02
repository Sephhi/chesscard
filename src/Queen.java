package src;

public class Queen extends Piece{
  public Queen(String color, int x, int y){
    super(color,"queen",x,y);
  }

  public int[] movePossible(int dimX, int dimY){
    int[] tab = new int[(dimX-1 + dimY-1)*2 + (dimX + dimY-2)*2 + 1];
    int cpt = 1;
    for(int i = 1; i <= dimX ; i++){
      for(int j = 1; j <= dimY; j++){
        if(i+j == getX()+getY() && (i!=getX() || j!=getY()))
        {
          tab[cpt] = i;
          tab[cpt+1] = j;
          cpt += 2;
        }
      }
    }
    for(int i = 1; i <= dimX ; i++){
      for(int j = 1; j <= dimY; j++){
        if(i-j == getX()-getY()&& (i!=getX() || j!=getY())){
          tab[cpt] = i;
          tab[cpt+1] = j;
          cpt += 2;
        }
      }
    }

    for(int i = 1; i <= dimX;i++){
      if(i != getX()){
        tab[cpt] = i;
        tab[cpt+1]=getY();
        cpt +=2;
      }
    }

    for(int j =1; j <= dimY ;j++){
      if(j != getY()){
        tab[cpt]=getX();
        tab[cpt+1] = j;
        cpt += 2;
      }
    }
    tab[0]=(cpt-1)/2;
    return tab;
  }
}

package src;

public class Rook extends Piece{
  public Rook(String color, int x, int y){
    super(color,"rook",x,y);
  }

  public int[] movePossible(int dimX, int dimY){
    int[] tab = new int[(dimX + dimY-2)*2 +1];
    tab[0]=dimX + dimY -2;
    int cpt = 0;
    for(int i = 1; i <= dimX;i++){
      if(i != getX()){
        System.out.println("test boucle i:"+ i + " " + getY() + "indice :" + ((i-cpt)*2 -1));
        tab[(i-cpt)*2 -1] = i;
        tab[2*(i-cpt)]=getY();
      }
      else{
        System.out.println("i");
        cpt++;
      }

    }
    cpt=0;
    for(int j =1; j <= dimY ;j++){
      if(j != getY()){
        System.out.println("test boucle j:"+ getX() + j);
        tab[2*(j-cpt) -1 +(dimX-1)*2]=getX();
        tab[2*(j-cpt) + (dimX-1)*2] = j;
      }
      else{
        System.out.println("j");
        cpt++;
      }
    }
    return tab;
  }
}

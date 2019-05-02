package src;

public class Main{
  public static void main(String[] args){
    Queen k = new Queen("black",3,3);
    int[] tab = k.movePossible(5,5);
    System.out.println(tab[0]);
    for (int i = 1 ; i <=tab[0] ; i++){
      System.out.println(i*2-1+":"+tab[i*2-1]+ " "+(i*2) +":" +tab[i*2]);
      System.out.println();
    }

  }
}

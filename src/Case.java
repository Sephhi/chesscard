package src;

public class Case{
  private boolean empty;
  private Piece piece;

  public Case(){
    this.empty = true;
  }

  public Case(Piece p){
    this.empty = false;
    this.piece = p;
  }

  public boolean isEmpty(){
    return empty;
  }

  public Piece getPiece() throws Exception{
    if(!empty){
      return piece;
    }
    else{
      throw new Exception("Erreur getPiece. La case est vide");
    }
  }

  public void setPiece(Piece p){
    this.empty = false;
    this.piece = p;
  }

  public void empty(){
    this.empty = true;
  }


}

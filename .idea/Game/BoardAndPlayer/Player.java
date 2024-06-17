public class Player {

    //vida do jogador
    private int hp = 2;

    //deck do jogador // no maximo 30 cartas!
    private Arraylist<Card> deck = new ArrayList<Card>();

    public Player(){
        deck = new ArrayList<Card>();
    }
}
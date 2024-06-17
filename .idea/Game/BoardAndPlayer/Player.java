import java.util.Random;

public class Player {

    //vida do jogador
    private int hp = 2;

    //deck do jogador // no maximo 30 cartas!
    private Arraylist<Card> deck = new ArrayList<Card>();

    //mao do jogador
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Player(){
        deck = new ArrayList<Card>();
    }

    public void shuffle(Arralist<Card> deck){
        //criacao de objeto para randomizar
        Random random = new Random();

        for(int i = 0 ; i < 10; i++){
            int randomNumber = random.nextInt();
        }
    }
}
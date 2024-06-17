import java.util.Arraylist;

public class Board {

    //cartas que o jogador possui na mao
    private Arraylist<Card> hand = new ArrayList<Card>();

    //cartas no campo
    private Arraylist<Card> infantary = new ArrayList<Card>();
    private Arraylist<Card> artillary = new ArrayList<Card>();
    private Arraylist<Card> siege = new ArrayList<Card>();

    //pontos de cada campo
    private int infantary_points = 0;
    private int artillary_points = 0;
    private int siege_points = 0;

    //pontos da rodada (do jogador)
    private int points = 0;

    //vidas do jogador
    private int hp = 2;

    public tabuleiro(){
        //construtor da mao do jogador
        hand = new ArrayList<Card>();

        //construtor dos campos de batalha
        infantary = new ArrayList<Card>();
        artillary = new ArrayList<Card>();
        siege = new ArrayList<Card>();
    }

    //getters e setters
    public Arraylist<Card> getHand() {
        return hand;
    }

    public void setHand(Arraylist<Card> hand) {
        this.hand = hand;
    }

    public Arraylist<Card> getInfantary() {
        return infantary;
    }

    public void setInfantary(Arraylist<Card> infantary) {
        this.infantary = infantary;
    }

    public Arraylist<Card> getArtillary() {
        return artillary;
    }

    public void setArtillary(Arraylist<Card> artillary) {
        this.artillary = artillary;
    }

    public Arraylist<Card> getSiege() {
        return siege;
    }

    public void setSiege(Arraylist<Card> siege) {
        this.siege = siege;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
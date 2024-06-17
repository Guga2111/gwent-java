package Game;

import java.util.ArrayList;

public class Board {

    //cartas que o jogador possui na mao
    private Arraylist<Card> hand;

    //cartas no campo
    private Arraylist<Card> infantary;
    private Arraylist<Card> artillary;
    private Arraylist<Card> siege;

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
        this.hand = new ArrayList<>();

        //construtor dos campos de batalha
        this.infantary = new ArrayList<>();
        this.artillary = new ArrayList<>();
        this.siege = new ArrayList<>();
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
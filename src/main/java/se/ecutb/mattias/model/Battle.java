package se.ecutb.mattias.model;

public class Battle {

    private Gladiator player;
    private Gladiator opponent;
    private int round;

    public Battle(Gladiator player, Gladiator opponent){
        this.player = player;
        this.opponent = opponent;
        round = 1;
    }

    public boolean battle(){
        System.out.println(player.getDetails());
        System.out.println("******vs******");
        System.out.println(opponent.getDetails());

        while (player.isAlive() && opponent.isAlive()){
            System.out.println("ROUND " + round);
            Round battleRound = new Round(round);
            battleRound.doRound(player, opponent);
            System.out.println(battleRound.getResult());
            round++;
        }
        return player.isAlive();
    }

}

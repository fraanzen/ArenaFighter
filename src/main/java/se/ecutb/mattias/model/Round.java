package se.ecutb.mattias.model;

import java.util.concurrent.ThreadLocalRandom;

public class Round {

    private String result;
    private int roundNumber;
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    public Round ( int roundNumber){
        this.roundNumber = roundNumber;
        this.result = "";
    }

    public void doRound(Gladiator player, Gladiator opponent){
        int playerAttack = player.getStrength() + random.nextInt(1, 7);
        int opponentAttack = opponent.getStrength() + random.nextInt(1, 7);

        if (playerAttack >= opponentAttack){
            opponent.setHealth(opponent.getHealth() - 1);
            result = player.getName() + " won round " + roundNumber + " and did damage to " + opponent.getName();
        }else{
            player.setHealth(player.getHealth() - 1);
            result = opponent.getName() + " won round: " + roundNumber + " and did damage to " + player.getName();
        }
    }

    public String getResult (){
        return result;
    }

}

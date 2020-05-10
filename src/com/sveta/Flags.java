package com.sveta;

public class Flags {

    private boolean flagSveta;
    private boolean flagFilya;

    Turn turn;

    public Flags() {
        flagSveta = false;
        flagFilya = false;
        turn = Turn.FILYA;
    }

    public synchronized boolean getOpponentFlag(String s) {
        //no condition synchronization is needed
        if (s.equals("Sveta")) return flagFilya;
        return flagSveta;
    }

    public synchronized void setTrue(String s) {
        //no condition synchronization is needed
        if (s.equals("Sveta")) { flagSveta = true;}
        else { flagFilya = true; }
    }

    public synchronized void setFalse(String s) {
        //no condition synchronization is needed
        if (s.equals("Sveta")) { flagSveta = false; }
        else { flagFilya = false; }
    }

    public Turn getOpponentTurn(String s) {
        if (s.equals("Sveta")) return Turn.FILYA;
        return Turn.SVETA;
    }

    public void switchTurnToOpponent(String s) {
        if (s.equals("Sveta")) turn = Turn.FILYA;
        turn = Turn.SVETA;
    }
}
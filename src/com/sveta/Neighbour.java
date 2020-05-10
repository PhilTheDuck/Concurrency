package com.sveta;

public class Neighbour extends Thread {

    private final Flags flags;

    public Neighbour(Flags flags) {
        this.flags = flags;
    }

    public void run() {
        while (true) {
            try {
                String name = Thread.currentThread().getName();

                Thread.sleep((int)(200 * Math.random()));

                flags.setTrue(name);
                System.out.println(name + " Wants berries");


                while (flags.getOpponentFlag(name) && flags.turn == flags.getOpponentTurn(name));

                System.out.println("\n____________________________________ \n" + name + " enters the field :)");
                Thread.sleep(100);
                System.out.println(name + " got the berries, now leaving!");

                flags.setFalse(name);
                flags.switchTurnToOpponent(name);
                System.out.println(name + " finished!" + "\n====================================\n");
            }
            catch (InterruptedException e) {}
        }
    }
}
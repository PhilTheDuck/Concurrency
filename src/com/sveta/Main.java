package com.sveta;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
//        System.out.println("Enter a number of Neighbours: ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int neighbourCount = Integer.parseInt(reader.readLine());
        Flags flags = new Flags();

        Thread a = new Neighbour(flags);
        Thread b = new Neighbour(flags);

        a.setName("Sveta");
        b.setName("Filya");

        a.start();
        b.start();

    }
}


package com.company;

public class Main {

    public static void main(String[] args) {

        Korova korova = new Korova("saryui", 2, 50 );
        Korova korova1 = new Korova("akui", 3, 60);
        Korova korova2 = new Korova("karaui", 5, 65);
        Korova korova3 = new Korova("kuronui", 10,55);
        Korova korova4 = new Korova("seryui", 1, 15);

        Korova[] korovy = {korova, korova1, korova2, korova3, korova4};

        Baran baran = new Baran("kozu", 3, 25);
        Baran baran1 = new Baran("ulak", 2, 10);
        Baran baran2 = new Baran("kochkor", 10, 40);
        Baran baran3 = new Baran("echki", 5, 20);
        Baran baran4 = new Baran("kozuu", 4, 15);
        Baran baran5 = new Baran("uulak", 6, 22);
        Baran baran6 = new Baran("kochkorr", 8, 30);
        Baran baran7 = new Baran("echky", 7, 35);

        Baran[] barans = {baran, baran1,baran2, baran3, baran4, baran5, baran6,baran7};

        Loshad loshad = new Loshad("akula", 4,70);
        Loshad loshad1 = new Loshad("akuula", 8, 60);


        Loshad[] loshads = {loshad, loshad1};

        Korova korova5 = new Korova("belyi", 4, 70);
        Korova korova6 = new Korova("jeltyi", 8, 34);

        Korova[] korovas = {korova5, korova6};





        Pastbishe pastbishe = new Pastbishe("jailoo", "kashkasuu", "atabek",korovy,barans,loshads);
        for (Korova a:pastbishe.getKorovy()) {
            System.out.println(a.getName()+" "+a.getAge()+" "+a.getWeight());

        }


    }

}

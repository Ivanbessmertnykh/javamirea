package com.company.lab7;

public class DishTester {
    public static void main(String[] args) {
        Chainik chainik = new Chainik(100, "Black", false);
        chainik.nalitVoduVChainik();
        chainik.switchChainik();
        System.out.println(chainik);

        Skovoroda skovoroda = new Skovoroda(200, "White", true);
        skovoroda.fixSkovoroda();
        skovoroda.hitSkovorodoi();
        System.out.println(skovoroda);
    }

}

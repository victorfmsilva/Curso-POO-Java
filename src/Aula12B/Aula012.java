package Aula12B;

import Aula12B.ClassesNetas.*;

public class Aula012 {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru canguru1 = new Canguru();
        Cachorro cachorro1 = new Cachorro();
        Cobra cobra1 = new Cobra();
        Tartaruga t1 = new Tartaruga();
        GoldFish goldFish1 = new GoldFish();
        Arara arara1 = new Arara();

//        a1.locomover();
//        p1.locomover();
//        r1.locomover();

//        m1.setPeso(80.0f);
//        m1.alimentar();
//        m1.locomover();
//        m1.emitirSom();

        canguru1.locomover();
        cachorro1.locomover();
        canguru1.emitirSom();
        cachorro1.emitirSom();


    }
}

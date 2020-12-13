package Aula12B.ClassesNetas;

import Aula12B.Mamifero;

public class Canguru extends Mamifero {
    public void usarBolsa() {

    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}

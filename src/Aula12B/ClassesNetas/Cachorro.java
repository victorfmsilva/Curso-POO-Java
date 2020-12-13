package Aula12B.ClassesNetas;

import Aula12B.Mamifero;

public class Cachorro extends Mamifero {
    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}

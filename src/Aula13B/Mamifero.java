package Aula13B;

public class Mamifero extends Animal{
    private String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}

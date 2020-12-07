package Aula06B;

import java.sql.SQLOutput;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }

    public void abrirMenu(){
        System.out.println("----------MENU------------");
        System.out.println("Está ligado? "+ getLigado());
        System.out.println("Está tocando? "+ getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.printf(" | ");
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume(){
        if (this.getLigado() == true) {
            this.setVolume(getVolume() + 5);
        }else {
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume(){
        if (this.getLigado() == false) {
            this.setVolume(getVolume() - 5);
        }else {
            System.out.println("Impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo(){
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play(){
        if (this.getLigado() == true && !(this.getTocando()) == true) {
            this.setTocando(true);
        }else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause(){
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
        }else {
            System.out.println("Não consegui pausar");
        }
    }


}

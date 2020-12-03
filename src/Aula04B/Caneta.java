package Aula04B;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, float p) { //Construtor
        this.modelo = modelo;
        this.ponta = p;
        this.tampar();
        this.status();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destanpar(){
        this.tampada = false;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void status(){
        System.out.println("modelo: "+ getModelo());
        System.out.println("ponta: " + getPonta());
        System.out.println("--------------------");
    }

}

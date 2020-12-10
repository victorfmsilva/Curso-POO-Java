package Aula09B;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "Jose almeida", 150, p[0]);
        l[1] = new Livro("POO Iniciante", "Guanabara", 500, p[1]);
        l[2] = new Livro("Java Avancado", "Jose Guanabara", 200, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(205);
        l[1].voltarPag();
        System.out.println(l[1].detalhes());
    }
}

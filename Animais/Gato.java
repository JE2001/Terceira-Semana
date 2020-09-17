package Animais;

public class Gato extends Mamifero{
    public Gato(String nome, int qtde_patas, boolean AlimentarLeite){
        super(nome, qtde_patas, AlimentarLeite);
        System.out.println("\nConstruindo Animal...");
        System.out.printf("\nNome: " + nome + "\nPatas: " + qtde_patas + "\nLeite?: " + AlimentarLeite);

    }
}

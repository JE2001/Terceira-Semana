package HerancaExercicios.Animais;

public class Mamifero extends Animal {

    boolean AlimentarLeite;



    public Mamifero(){}

    public Mamifero(String nome, int qtde_patas, boolean AlimentarLeite){
        //super(nome, qtde_patas, AlimentarLeite);
        this.AlimentarLeite = AlimentarLeite;
    }

    /*public String toString() {
        return "Nome: " + this.nome + "\n" +
                  "Patas: " + this.qtde_patas + "\n" +
                  "Leite?: " + this.AlimentarLeite;
      }*/
    
}

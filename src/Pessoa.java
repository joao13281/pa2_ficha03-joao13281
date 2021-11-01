public class Pessoa {

    String nome;
    char genero;
    int idade;
    String falar;

    {
        falar = "bla bla bla bla";
    }

    Pessoa() {}

    Pessoa(String nome, Character genero, Integer idade, String falar){

        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.falar = falar;
    }
    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome) {
        this.nome = nome;
        return this.nome;
    }
    public Character getGenero(){
        return this.genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String falar() {
        return falar;
    }

   // public String nextLine() {
    //}

    //public int nextInt() {
    //}
   // public void printDetails(){
     //    System.out.println(getNome() + "," + getGenero() + "," + getIdade());
    //}

}


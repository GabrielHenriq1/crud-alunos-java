public class Aluno {

    private int id;
    private String nome;
    private int idade;
    private String faixa;

    public Aluno(){

    }

    public Aluno(int id, String nome, int idade, String faixa) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.faixa = faixa;
    }

    public int getId() {
        return id;
    }


    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getFaixa(){
        return faixa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

}
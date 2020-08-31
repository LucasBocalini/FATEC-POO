package exercicio1;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    Apolice(){


    }

    Apolice (String nomeSegurado, int idade, double valorPremio){
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    void imprimir() {
        System.out.println(nomeSegurado);
        System.out.println(idade);
        System.out.println(valorPremio);
    }

    void imprimirTeste() {
        System.out.println(getNomeSegurado());
        System.out.println(getIdade());
        System.out.println(getValorPremio());
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
}

package exercicio1;

public class Main {

    public static void main(String[] args) {
	Apolice apolice = new Apolice("Lucas Bocalini", 21, 5000.00);
	apolice.imprimir();



	Apolice apoliceTeste = new Apolice();

	apoliceTeste.setNomeSegurado("Samuel Marques");
	apoliceTeste.setIdade(21);
	apoliceTeste.setValorPremio(5000.00);
    apoliceTeste.imprimirTeste();
    }
}

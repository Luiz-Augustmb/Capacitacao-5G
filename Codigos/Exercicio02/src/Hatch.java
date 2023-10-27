public class Hatch extends Carro{

    private int portas;

    public Hatch(double valor, String cor, int ano, int portas) {
        super(valor, cor, ano);
        this.portas = portas;
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void mostraInfo() {
        System.out.println("Modelo Hatch");
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Portas: " + this.portas);
        System.out.println("---------------------");
    }
}

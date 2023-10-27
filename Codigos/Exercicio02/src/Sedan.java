public class Sedan extends Carro{

    private int portaMalas;

    public Sedan(double valor, String cor, int ano, int portaMalas) {
        super(valor, cor, ano);
        this.portaMalas = portaMalas;
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void mostraInfo() {
        System.out.println("Modelo Sedan");
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Porta Malas: " + this.portaMalas);
        System.out.println("---------------------");
    }
}

public class SUV extends Carro{

    private String tracao;

    public SUV(double valor, String cor, int ano, String tracao) {
        super(valor, cor, ano);
        this.tracao = tracao;
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void mostraInfo() {
        System.out.println("Modelo SUV");
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tração: " + this.tracao);
        System.out.println("---------------------");
    }
}

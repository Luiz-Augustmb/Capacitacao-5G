public class Banda {

    public String nome;
    public String genero;
    public Empresario empresarioDaBanda;

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println("A banda " + this.nome + " é do genero " + this.genero);
        if(empresarioDaBanda != null) {
            System.out.println(empresarioDaBanda.nome + " é o empresario, com CNPJ = " + empresarioDaBanda.cnpj);
        }else {
            System.out.println("A banda não possui empressário");
        }
    }

}

public class Banda {

    public String nome;
    public String genero;
    public Empresario empresarioDaBanda;
    public Musico[] musico = new Musico[10];
    public Musica[] musicas = new Musica[100];

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println("--------------------------");
        System.out.println("A banda " + this.nome + " é do genero " + this.genero);
        if(empresarioDaBanda != null) {
            System.out.println(empresarioDaBanda.nome + " é o empresario, com CNPJ = " + empresarioDaBanda.cnpj);
        }else {
            System.out.println("A banda não possui empressário");
        }
        System.out.println("--------------------------");
        if(musico!=null){
            for (int i = 0; i < musico.length; i++) {
                if(musico[i]!=null){
                    System.out.println(musico[i].funcao + " da banda é o " + musico[i].nome);
                }
            }
        }else {
            System.out.println("Não foi adicionado nenhum membro na banda ainda!");
        }
        System.out.println("--------------------------");
        if(musicas!=null){
            for (int i = 0; i < musicas.length; i++) {
                if(musicas[i]!=null){
                    System.out.println("Musica número " + (i+1));
                    System.out.println("Nome: " + musicas[i].nome + " com duração de " + musicas[i].tempo + " minutos");
                    System.out.println("--------------------------");
                }
            }
        }else {
            System.out.println("Não foi adicionado nenhuma musica da banda ainda!");
        }



    }

}

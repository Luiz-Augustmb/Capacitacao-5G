public class Kart {

    public String nome;
    public Motor motorKart;
    public Piloto pilotoKart;
    public Kart(){

        motorKart = new Motor();
    }

    public void pular(){

        System.out.println("KART " + nome + " PULOU");
    }

    public void soltarTurbo(){

        System.out.println("KART " +nome + " ativou o TURBO");
    }

    public void fazerDrift(){

        System.out.println("KART " +nome + " fez um DRIFT");
    }

}

// Criar um sistema que conta carneiros até o cidadão dormir.
// O sistema perguntará se o cabra dormiu.
// Se ele dormir, encerra o programa com uma mensagem e volta ao início.
// Se não, soma +1 no valor carneiro e retorna a pergunta.

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //sistema de sono
        System.out.println("Bem-Vindo ao Contador de ovelhas para seu sono!");
        System.out.println("Por favor, prossiga com o programa.");
        System.out.println("1. Prosseguir");
        System.out.print("> ");
        Scanner sc = new Scanner (System.in);
        int prosseguir = sc.nextInt();

        Ovelhotas contador = new Ovelhotas();

        Sonho(contador);

    }
    public static void Sonho(Ovelhotas contador) {

        //Texto de apresentação
        System.out.println();
        System.out.println("--__--");
        System.out.println("ZZZZ....ZZZZ....");
        System.out.println("Sonho, sonho......");
        System.out.println("Estou dormindo?");
        System.out.println("1. Sim.");
        System.out.println("2. Não.");
        System.out.print("> ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();


        if (escolha == 1) {
            System.out.println("--__--");
            System.out.println("Você conseguiu dormir após " + contador.getContagem() +" ovelha(s) contada(s).");
            System.out.println("Durma bem.");
            System.out.println("--__--");
        }
        if (escolha == 2) {
            contador.addOvelha();

            System.out.println("--__----__----__----__--");
            System.out.println();
            System.out.println("-----------▢▢▢-----");
            System.out.println("--------▢〝ʕ°ꈊ°ʔ〞--");
            System.out.println("--------▢▢▢▢------");
            System.out.println("-------//---||-----");
            System.out.println("--------####-------");
            System.out.println("-^^-----#--#---^^--");
            System.out.println();
            System.out.println("--__----__----__----__--");
            System.out.println();
            System.out.println("--__--");
            System.out.println(contador.getContagem() + " carneirinho(s)");
            System.out.println("--__--");
            System.out.println();
            Sonho(contador);

        }

    }
}

class Ovelhotas
{
  private int contagem;


  public Ovelhotas()
  {
      this.contagem = 0;
  }

  public void addOvelha()
  {
      contagem+=1;
  }

  public int getContagem()
  {
      return contagem;
  }

}
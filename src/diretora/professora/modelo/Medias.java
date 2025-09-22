package diretora.professora.modelo;


import java.util.Scanner;

public class Medias {

    String nomeDoAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
    String resultado;

    public void obterDados() {
        Scanner leitor = new Scanner(System.in);

        //obtendo
        System.out.print("Qual o nome do aluno?");
        nomeDoAluno = leitor.nextLine();

        System.out.print("qual a nota do(a) " + nomeDoAluno + " no primeiro bimestre?");
        nota1 = leitor.nextDouble();

        System.out.print("no segundo bimestre?");
        nota2 = leitor.nextDouble();

        System.out.print(" no terceiro bimestre");
        nota3 = leitor.nextDouble();

        System.out.print("e no quarto bimestre?");
        nota4 = leitor.nextDouble();

        calcularMedia();

    }


    public void calcularMedia(){

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        determinarStuacao();
    }

    public void determinarStuacao(){
        if(media >= 5.0){
            resultado = "aprovado(a)";
        }  else if(media >= 3.0) {
            resultado = "recuperação";
        } else {
            resultado = "reprovado(a)";
        }

        exibirResultados();

    }

    public void exibirResultados() {

        System.out.println("------------------------------");
        System.out.println("A media desse ano do(a) " +nomeDoAluno+ " é respectivamente " +media+ " ");
        System.out.println("------------------------------");
        System.out.println("ele(a) está " +resultado+ " ");

    }
}
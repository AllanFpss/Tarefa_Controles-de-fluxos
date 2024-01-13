public class mediaAluno {

    public static void main(String args[]) {
        int nota1 = 5;
        int nota2 = 6;
        int nota3 = 9;
        int nota4 = 5;

        int notas = nota1 + nota2 + nota3 + nota4;
        int media = notas / 4;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}

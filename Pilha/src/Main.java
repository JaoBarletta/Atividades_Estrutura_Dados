import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primeiro defina o tamanho da pilha: ");
        int size = scan.nextInt();
        Pilha<Pessoa> pilha = new Pilha(size);
        firstloop:{
        while(true){
            System.out.println("=================================================");
            System.out.println("Isso é apenas um teste do conceito de pilha");
            System.out.println("=================================================");
            System.out.println("1- Vizualizar pilha");
            System.out.println("2- Adicionar pessoa a pilha");
            System.out.println("3- Remover e vizualizar a pessoa no topo da pilha");
            System.out.println("4- Apenas vizualizar a pessoa do topo da pilha");
            System.out.println("5- Verificar se a pilha está cheia");
            System.out.println("6- Esvaziar a pilha");

            int menu = scan.nextInt();
            switch (menu){
                case 1 : break;
                case 2 :
                    System.out.println("Digite o nome da pessoa");
                    String nome = scan.next();
                    System.out.println("Digite a idade da pessoa");
                    int idade = scan.nextInt();
                    System.out.println("Digite o genero da pessoa");
                    String genero = scan.next();
                    Pessoa p = new Pessoa(nome,idade,genero);
                    pilha.push(p);
                    break;
                case 3 : pilha.pop();break;
                case 4 : pilha.peek();break ;
                case 5 : pilha.isFull();break;
                case 6 : pilha.clear();break;
                default: System.out.println("Entrada incorreta");break;
            }


        }

        }

    }
}
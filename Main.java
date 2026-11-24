import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AlunoService service = new AlunoService();

        
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n=== MENU ===");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - BUSCAR ALUNO PELO ID");
            System.out.println("3 - LISTAR ALUNOS");
            System.out.println("4 - ATUALIZAR ALUNO");
            System.out.println("5 - DELETAR ALUNO");

            System.out.println("Escolha uma das opcoes: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1 -> {
                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    System.out.println("Idade:");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Faixa:");
                    String faixa = sc.nextLine();

                    Aluno aluno = service.criar(nome, idade, faixa);
                    System.out.println("Aluno Cadastrado: " + aluno.getId());
                }

                case 2 ->  {
                    System.out.println("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Aluno aluno = service.buscarPorId(id);
                    System.out.println("Aluno: " + aluno.getNome() + " | Idade: " + aluno.getIdade() + " | Faixa: " + aluno.getFaixa());
                }

                default -> System.out.println("Opcao invalida");

                case 3 -> {
                    List<Aluno> lista = service.listarTodos();

                    if(lista.isEmpty()){
                        System.out.println("Nenhum Aluno Cadastrado!");
                    } else{
                        for (Aluno a : lista){
                            System.out.println(a.getId() + " | " + a.getNome() + " | " + a.getIdade() + " | " + a.getFaixa());
                        }
                    }
                }

                case 4 ->{
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    System.out.println("Idade:");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Faixa:");
                    String faixa = sc.nextLine();

                    boolean ok  = service.atualizar(id, nome, idade, faixa);
                    System.out.println(ok ? "Atualizado" : "Aluno nao encontrado");
                    
                }

                case 5 ->{
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    
                    service.deletar(id);
                }

            }
        }


    }
}
import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    
    private List<Aluno> alunos = new ArrayList<>();
    private int proximoId= 1;

    public Aluno criar(String nome, int idade, String faixa){
        Aluno aluno = new Aluno(proximoId, nome, idade, faixa);
        proximoId++;
        alunos.add(aluno);
        return aluno;
    }

    public Aluno buscarPorId(int id){
        for(Aluno a : alunos){
            if(a.getId() == id ){
                return a;
            }
        }
        return null;
    }

    public List<Aluno> listarTodos(){
        return alunos;
    }

    public boolean atualizar(int id, String nome, int idade, String faixa){
         Aluno aluno = buscarPorId(id);
         if(aluno != null){
            aluno.setNome(nome);
            aluno.setIdade(idade);
            aluno.setFaixa(faixa);
            return true;
         }  
         return false;
    }

    public void deletar(int id){
        Aluno aluno = buscarPorId(id);
        if(aluno != null){
            alunos.remove(aluno);
            System.out.println("Aluno Removido");
            return;
        }
        System.out.println("Aluno nao encontrado");
    }
}

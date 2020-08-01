package business;

import entity.AlunoEntity;
import infraStructure.ValidationException;

import java.util.concurrent.ExecutionException;

public class AlunoBusiness {

    public void validate(AlunoEntity alunoEntity) throws ValidationException {

        if ("".equals(alunoEntity.getNome())) {
            throw new ValidationException("Nome obrigatório");
        }

        if ("".equals(alunoEntity.getSobrenome())) {
            throw new ValidationException("Sobrenome obrigatório");
        }
    }

    // CRUD
    // Create, read, update, dele
    // Criar, ler, atualizar, deletar

    public AlunoEntity getAlunoById(){
        return null;
    }

    public void create(AlunoEntity alunoEntity) {

    }

    public void update(AlunoEntity alunoEntity) {

    }

    public  void delete(){

    }

}

package br.com.sistema.repository;

import br.com.sistema.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

//Classe que irá gerenciar o objeto Funcionário no Banco de Dados
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    public Funcionario findByEmail(String email);
    public Funcionario findByNome(String nome);
    public Funcionario findByIdNotAndEmail(Long id, String email);
    public Funcionario findByIdNotAndNome(Long id, String nome);
}
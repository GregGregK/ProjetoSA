package br.com.sistema.service;

import br.com.sistema.model.Funcionario;

import java.util.List;

//Camada de Serviço
//Nessa interface criamos as assinaturas dos métodos
public interface FuncionarioService {

    //Métodos de consulta
    public Funcionario findById(Long id);
    public List<Funcionario> findAll();
    public Funcionario findByEmail(String email);
    public Funcionario findByNome(String nome);
    public String validarFuncionario(Funcionario funcionario);

    //Métodos save e delete
    public boolean save(Funcionario funcionario);
    public boolean delete(Long id);
}

package br.com.senai.shark.repository;

import org.springframework.data.jpa.repository.*;

import br.com.senai.shark.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{

}

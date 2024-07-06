package orm.mensagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import orm.mensagem.model.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long>{

    
} 
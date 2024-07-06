package orm.mensagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import orm.mensagem.model.MensagemCorpo;

public interface MensagemCorpoRepository extends JpaRepository<MensagemCorpo, Long>{
    
}

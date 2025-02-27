package orm.mensagem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orm.mensagem.model.Mensagem;
import orm.mensagem.repository.MensagemRepository;

import java.util.List;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;

    public List<Mensagem> findAll() {
        return mensagemRepository.findAll();
    }

    public Mensagem findById(Long id) {
        return mensagemRepository.findById(id).orElse(null);
    }

    public Mensagem save(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }

    public void deleteById(Long id) {
        mensagemRepository.deleteById(id);
    }
}
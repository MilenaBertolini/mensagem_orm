package orm.mensagem.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MensagemCorpo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

}

package med.fema.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "medicos")
@AllArgsConstructor
@NoArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String nome;

    @NotNull
    private String email;
    @NotNull
    private String crm;
    @NotNull
    private String especialidade;
    @NotNull
    private String logradouro;
    @NotNull
    private String bairro;
    @NotNull
    private String cep;

    private String complemento;

    private String numero;
    @NotNull
    private String uf;
    @NotNull
    private String cidade;
    @NotNull
    private String telefone;
    @NotNull
    private int ativo;

}

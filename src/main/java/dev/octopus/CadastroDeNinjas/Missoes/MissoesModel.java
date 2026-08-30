package dev.octopus.CadastroDeNinjas.Missoes;

import dev.octopus.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany - Uma missao para muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;
}

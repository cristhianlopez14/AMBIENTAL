package ambiental.ambiental.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private int idUsuario;

    @OneToMany(mappedBy = "idUsuarioFK", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Publicacion> publicacion;
}

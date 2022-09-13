package ambiental.ambiental.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    private int idPublicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuarioFK;

    @OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Imagen> imagen;
}

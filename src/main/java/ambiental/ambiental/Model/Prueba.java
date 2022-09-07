package ambiental.ambiental.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prueba")
public class Prueba {
    @Id
    private int idPrueba;

    @OneToOne
    @JoinColumn(name = "FK_PUBLICACION", updatable = false, nullable = false)
    private Publicacion publicacion;
}

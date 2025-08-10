package pe.edu.diego.proyectospring.infraestructura.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class ProductRepo {

    @Id
    private String id;
    private String skuInkafarma;
    private String slug;

}

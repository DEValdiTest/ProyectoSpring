package pe.edu.diego.proyectospring.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Phone {
    @Field(name = "phone")
    private String numberPhone;

    @Field(name = "FLG_PRINCIPAL")
    private String principal;

}

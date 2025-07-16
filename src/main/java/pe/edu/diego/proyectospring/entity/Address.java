package pe.edu.diego.proyectospring.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
public class Address {
    @Field(name = "CODE_ADDRESS")
    private String idAddress;

    @Field(name = "COD_CLIENTE")
    private String idClient;

    @Field(name = "COD_DIRECCION_CLI")
    private String idAddressClient;

    @Field(name = "COD_TIPO_DIRECCION")
    private String idAddressType;

    @Field(name = "DES_DIRECCION")
    private String addressDescription;

    @Field(name = "COD_UBIGEO")
    private String idUbigeo;

    @Field(name="COD_URBANIZACION")
    private String urbanizationCode;

    @Field(name="DES_REFERENCIA_DIRECCION")
    private String referenceAddressDescription;

    @Field(name = "USUARIO")
    private String user;

    @Field(name = "FECHA")
    private Date date;

    @Field(name = "COD_SUFIJO_DIRECCION")
    private String idAddressSuffix;

    @Field(name = "FLG_PRINCIPAL")
    private String isPrincipal;

    @Field(name = "FLG_ACTIVO")
    private String isActive;

    @Field(name = "LATITUD")
    private String latitude;

    @Field(name = "LONGITUD")
    private String longitude;

    @Field(name = "NUMBER_ADDRESS")
    private String number;

    @Field(name = "TIPO_DIRECCION")
    private String addressType;

    @Field(name = "PROPIET_DIRECCION")
    private String ownerName;

    @Field(name = "DISTRICT")
    private String district;
}

package pe.edu.diego.proyectospring.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "client")
public class Client {

    @Id
    String id;

    @Field(name = "COD_CLIENTE")
    private String idClient;

    @Field(name = "COD_ESTADO_CIVIL")
    private String idMaritalStatus;

    @Field(name = "DES_NOM_CLIENTE")
    private String name;

    @Field(name = "DES_APE_CLIENTE")
    private String lastName;

    @Field(name = "COD_DOCUMENTO_IDENTIDAD")
    private String idIdentityDocument;

    @Field(name = "NUM_DOCUMENTO_ID")
    private String identityDocumentNumber;

    @Field(name = "DES_DIRECCION_SOCIAL")
    private String descriptionSocialAddress;

    @Field(name = "DES_DIRECCION_COMERCIAL")
    private String descriptionCommercialAddress;

    @Field(name = "FLG_TIPO_JURIDICA")
    private String isLegalType;

    @Field(name = "DES_OBSERVACION")
    private String descriptionObservation;

    @Field(name = "DES_CARGO")
    private String descriptionPosition;

    @Field(name = "FLG_SEXO")
    private String isSex;

    @Field(name = "FLG_ESTADO")
    private String isState;

    @Field(name = "FLG_CLIENTE_VERIFICADO")
    private String isVerifyClient;

    @Field(name = "COD_USUARIO")
    private String idUser;

    @Field(name = "FCH_REGISTRA")
    private Date registrationDate;

    @Field(name = "COD_USUARIO_ACTUALIZA")
    private String idUserUpdate;

    @Field(name = "USUARIO")
    private String user;

    @Field(name = "FLG_VTA_CREDITO")
    private String isCreditSales;

    @Field(name = "CIA")
    private String cia;

    @Field(name = "COD_REL_CLIENTE")
    private String idClientRel;

    @Field(name = "DES_APE2_CLIENTE")
    private String lastName2;

    @Field(name = "MTO_CONSUMIDO")
    private Double amountConsumed;

    @Field(name = "MTO_LINEA_CRED")
    private Double amountCreditLine;

    @Field(name = "MTO_PEND_FACT")
    private Double amountPendingInvoice;

    @Field(name = "MTO_PEDIDO")
    private Double amountOrder;

    @Field(name = "NUM_DIAS_VIGENCIA")
    private Double numberEffectiveDays;

    @Field(name = "FLG_MUESTRA_FRAC")
    private String isSampleFrac;

    @Field(name = "FLG_MUESTRA_IGV")
    private String isSampleIGV;

    @Field(name = "FLG_BOTIQUIN")
    private String isBotiquin;

    @Field(name = "FLG_LISTA_PRC")
    private String isPriceList;

    @Field(name = "FLG_RESTRING_LISTA")
    private String isRestringList;

    @Field(name = "FLG_CERO")
    private String isZero;

    @Field(name = "COD_REL_CLIENTEGLM")
    private String idClientRelGlm;

    @Field(name = "DES_CLIENTE")
    private String descriptionClient;

    @Field(name = "FLG_ADD_OFF_LINE")
    private String isAddOffline;

    @Field(name = "DES_USUARIO")
    private String descriptionUser;

    @Field(name = "FLG_PROVEEDOR")
    private String isSupplier;

    @Field(name = "FLG_DIGEMID")
    private String isDigemid;

   /* @Field(name = "NUM_TELEFONO")
    private String phoneNumber;*/

    @Field(name = "EMAIL")
    private String email;

    @Field(name = "ADDRESS")
    private List<Address> addresses;

    @Field(name = "FLG_ACCEPT_TYC")
    private Boolean isAcceptTyC;

    @Field(name = "FLG_PRIVACY_POLICY")
    private Boolean isPrivacyPolicy;

    @Field(name = "FLG_DATA_TREATMENT")
    private Boolean isDataTreatment;

    @Field(name = "PHONES")
    private List<Phone> phones;

    @Field(name = "isFirstBuyMF")
    private Boolean isFirstBuyMF;

    @Field(name = "isFirstBuyIKF")
    private Boolean isFirstBuyIKF;

    @CreatedDate
    @Field(name = "createdDate")
    private String createdDate;

    @Field(name = "updatedDate")
    private String updatedDate;
}

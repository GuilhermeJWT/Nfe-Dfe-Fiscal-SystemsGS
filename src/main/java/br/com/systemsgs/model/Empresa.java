package br.com.systemsgs.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "empresa")
@SequenceGenerator(name = "EmpresaSeq", sequenceName = "SEQ_EMPRESA", allocationSize = 1)
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmpresaSeq")
    private Long id;
    private String cpfCnpj;
    private String razaoSocial;
    private byte[] certificado;
    private String senhaCertificado;
    private String nsu;

}
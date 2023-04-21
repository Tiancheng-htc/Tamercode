package es.caib.redose.model;

import java.util.Date;

/**
 * Uso generated by hbm2java
 */
public class Uso implements java.io.Serializable {

    private Long codigo;

    private Documento documento;

    private TipoUso tipoUso;

    private String referencia;

    private Date fecha;

    private Date fechaSello;

    /** default constructor */
    public Uso() {
    }

    /** full constructor */
    public Uso(Long usoCodigo, Documento redoseDocum, TipoUso redoseTiuso, String usoRef, Date usoFecha) {
        this.codigo = usoCodigo;
        this.documento = redoseDocum;
        this.tipoUso = redoseTiuso;
        this.referencia = usoRef;
        this.fecha = usoFecha;
    }

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long usoCodigo) {
        this.codigo = usoCodigo;
    }

    public Documento getDocumento() {
        return this.documento;
    }

    public void setDocumento(Documento redoseDocum) {
        this.documento = redoseDocum;
    }

    public TipoUso getTipoUso() {
        return this.tipoUso;
    }

    public void setTipoUso(TipoUso redoseTiuso) {
        this.tipoUso = redoseTiuso;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String usoRef) {
        this.referencia = usoRef;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date usoFecha) {
        this.fecha = usoFecha;
    }

    public Date getFechaSello() {
        return fechaSello;
    }

    public void setFechaSello(Date fechaSello) {
        this.fechaSello = fechaSello;
    }
}
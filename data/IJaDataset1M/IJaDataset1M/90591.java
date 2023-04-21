package com.icteam.fiji.model;

/**
 * TipRuoloEntPrcsGrp generated by hbm2java
 */
public class TipRuoloEntPrcsGrp extends Auditable implements java.io.Serializable {

    private Long CTipRuoloEntPrcsGrp;

    private String NRuoloEntPrcsGrp;

    /**
    * default constructor
    */
    public TipRuoloEntPrcsGrp() {
    }

    public Long getCTipRuoloEntPrcsGrp() {
        return this.CTipRuoloEntPrcsGrp;
    }

    public void setCTipRuoloEntPrcsGrp(Long CTipRuoloEntPrcsGrp) {
        if (CTipRuoloEntPrcsGrp != null && CTipRuoloEntPrcsGrp <= 0) this.CTipRuoloEntPrcsGrp = null; else this.CTipRuoloEntPrcsGrp = CTipRuoloEntPrcsGrp;
    }

    public String getNRuoloEntPrcsGrp() {
        return this.NRuoloEntPrcsGrp;
    }

    public void setNRuoloEntPrcsGrp(String NRuoloEntPrcsGrp) {
        this.NRuoloEntPrcsGrp = NRuoloEntPrcsGrp;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipRuoloEntPrcsGrp)) return false;
        TipRuoloEntPrcsGrp that = (TipRuoloEntPrcsGrp) o;
        Long tip = that.getCTipRuoloEntPrcsGrp();
        if (CTipRuoloEntPrcsGrp != null ? !CTipRuoloEntPrcsGrp.equals(tip) : tip != null) return false;
        return true;
    }

    public int hashCode() {
        return (CTipRuoloEntPrcsGrp != null ? CTipRuoloEntPrcsGrp.hashCode() : 0);
    }
}
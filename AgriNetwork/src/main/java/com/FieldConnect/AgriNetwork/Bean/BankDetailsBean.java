package com.FieldConnect.AgriNetwork.Bean;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankDetailsBean {

    private String MICR;
    private String BRANCH;
    private String ADDRESS;
    private String STATE;
    private String CONTACT;
    private boolean UPI;
    private boolean RTGS;
    private String CITY;
    private String CENTRE;
    private String DISTRICT;
    private boolean NEFT;
    private boolean IMPS;
    private String SWIFT;
    private String ISO3166;
    private String BANK;
    private String BANKCODE;
    private String IFSC;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankDetailsBean)) return false;
        BankDetailsBean that = (BankDetailsBean) o;
        return isUPI() == that.isUPI() && isRTGS() == that.isRTGS() && isNEFT() == that.isNEFT() && isIMPS() == that.isIMPS() && getMICR().equals(that.getMICR()) && getBRANCH().equals(that.getBRANCH()) && getADDRESS().equals(that.getADDRESS()) && getSTATE().equals(that.getSTATE()) && getCONTACT().equals(that.getCONTACT()) && getCITY().equals(that.getCITY()) && getCENTRE().equals(that.getCENTRE()) && getDISTRICT().equals(that.getDISTRICT()) && getSWIFT().equals(that.getSWIFT()) && getISO3166().equals(that.getISO3166()) && getBANK().equals(that.getBANK()) && getBANKCODE().equals(that.getBANKCODE()) && getIFSC().equals(that.getIFSC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMICR(), getBRANCH(), getADDRESS(), getSTATE(), getCONTACT(), isUPI(), isRTGS(), getCITY(), getCENTRE(), getDISTRICT(), isNEFT(), isIMPS(), getSWIFT(), getISO3166(), getBANK(), getBANKCODE(), getIFSC());
    }

}

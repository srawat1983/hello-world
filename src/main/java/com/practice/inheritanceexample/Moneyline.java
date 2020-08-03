package com.practice.inheritanceexample;

import java.math.BigDecimal;

public class Moneyline extends Account{

    BigDecimal closingBalance;
    BigDecimal ote;
    BigDecimal sov;
    BigDecimal lov;

    Moneyline(String account) {
    super(account);
    }



    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
    }

    public BigDecimal getOte() {
        return ote;
    }

    public void setOte(BigDecimal ote) {
        this.ote = ote;
    }

    public BigDecimal getSov() {
        return sov;
    }

    public void setSov(BigDecimal sov) {
        this.sov = sov;
    }

    public BigDecimal getLov() {
        return lov;
    }

    public void setLov(BigDecimal lov) {
        this.lov = lov;
    }



}

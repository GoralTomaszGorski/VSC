package goral.walutadto;

import java.math.BigDecimal;


public enum ExchangeType {
    EURPLN("eur", "zł", new BigDecimal("4.3")),
    PLNEUR("zł", "eur", new BigDecimal("0.23")),
    NOKPLN("kr", "zł", new BigDecimal("0.4052")),
    PLNNOK("zł", "kr", new BigDecimal("2.498"));

    private String baseCurrency;
    private String targetCurrency;
    private BigDecimal exchangeRate;


    ExchangeType(String baseCurrency, String targetCurrency, BigDecimal exchangeRate) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }
}

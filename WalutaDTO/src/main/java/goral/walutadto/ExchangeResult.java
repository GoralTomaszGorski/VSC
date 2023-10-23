package goral.walutadto;

import java.math.BigDecimal;

//DTO data transfer object
public class ExchangeResult {
    private BigDecimal base;
    private BigDecimal result;
    private ExchangeType exchangeType;

    public ExchangeResult(BigDecimal base, BigDecimal result, ExchangeType exchangeType) {
        this.base = base;
        this.result = result;
        this.exchangeType = exchangeType;
    }

    public BigDecimal getBase() {
        return base;
    }

    public BigDecimal getResult() {
        return result;
    }

    public ExchangeType getExchangeType() {
        return exchangeType;
    }


    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public void setExchangeType(ExchangeType exchangeType) {
        this.exchangeType = exchangeType;
    }
}

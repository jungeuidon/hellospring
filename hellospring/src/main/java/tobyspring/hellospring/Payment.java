package tobyspring.hellospring;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    private Long orderId;   // 외부에서 접근할 수 없게 (수정X) pirvate 으로
    private String currency; // 통화(ex. JPN, WON)
    // private Double, float // 돈관련해서 반올림에서 오차가 발생할 수 있기 때문에 사용 XX
    // 돈을 사용시에는 BigDecimal을 사용하자.
    private BigDecimal foreignCurrencyAmount; // 돈 관련해서는 BigDecimal을 사용한다.
    private BigDecimal exRate;  // 환율
    private BigDecimal convertedAmount; // 환전금액(원화)
    private LocalDateTime validUntil; // 환율제한시간
//


    // 자동생성 커맨드 alt+insert
    public Payment(Long orderId, String currency, BigDecimal foreignCurrencyAmount, BigDecimal exRate, BigDecimal convertedAmount, LocalDateTime validUntil) {
        this.orderId = orderId;
        this.currency = currency;
        this.foreignCurrencyAmount = foreignCurrencyAmount;
        this.exRate = exRate;
        this.convertedAmount = convertedAmount;
        this.validUntil = validUntil;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getForeignCurrencyAmount() {
        return foreignCurrencyAmount;
    }

    public BigDecimal getExRate() {
        return exRate;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId=" + orderId +
                ", currency='" + currency + '\'' +
                ", foreignCurrencyAmount=" + foreignCurrencyAmount +
                ", exRate=" + exRate +
                ", convertedAmount=" + convertedAmount +
                ", validUntil=" + validUntil +
                '}';
    }
}

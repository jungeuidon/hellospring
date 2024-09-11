package tobyspring.hellospring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true) //json안에 값이 없는것이 있어도 무시한다.
public record ExRateData(String result, Map<String, BigDecimal> rates) {
}

package src.dtos;
package .com.dtos;

import java.util.Map;

public record CurrencyDTO(String code, Map<String, Double> conversionRates) {
}
package com.ouhamza.ecommerce.dto;



import lombok.Data;
import lombok.NonNull;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */
@Data
public class PurchaseResponse {

    @NonNull
    private String orderTrackingNumber;
}

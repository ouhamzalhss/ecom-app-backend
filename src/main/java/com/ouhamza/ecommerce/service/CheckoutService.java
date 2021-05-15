package com.ouhamza.ecommerce.service;

import com.ouhamza.ecommerce.dto.Purchase;
import com.ouhamza.ecommerce.dto.PurchaseResponse;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}

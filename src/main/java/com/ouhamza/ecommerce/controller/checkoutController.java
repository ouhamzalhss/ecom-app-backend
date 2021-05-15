package com.ouhamza.ecommerce.controller;

import com.ouhamza.ecommerce.dto.Purchase;
import com.ouhamza.ecommerce.dto.PurchaseResponse;
import com.ouhamza.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */

@RestController
@CrossOrigin()
@RequestMapping("/api/checkout")
public class checkoutController {

    private CheckoutService checkoutService;


    public checkoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse purchase(@RequestBody Purchase purchase){
        PurchaseResponse response = this.checkoutService.placeOrder(purchase);
        return response;
    }
}

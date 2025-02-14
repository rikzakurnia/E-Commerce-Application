package com.app.payloads;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardDTO {
    @NotNull
    @Size(min = 13, max = 19)
    private String cardNumber;

    @NotNull
    @Size(min = 3, max = 4)
    private String cvc;
}

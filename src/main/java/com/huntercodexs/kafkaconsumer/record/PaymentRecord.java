package com.huntercodexs.kafkaconsumer.record;

import java.math.BigDecimal;

public record PaymentRecord(
    Integer id,
    String description,
    BigDecimal amount
) {}

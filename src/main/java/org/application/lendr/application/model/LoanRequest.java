package org.application.lendr.application.model;

import lombok.*;
import org.application.lendr.domain.model.User;

import java.time.Duration;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class LoanRequest {
    private final int amount;
    private final Long borrowerId;
    private final int daysToRepay;
    private final double interestRate;
}

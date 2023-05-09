package org.application.lendr.domain.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public final class LoanRequest {
    private final int amount;
    private final User borrower;
    private final Duration repaymentTerm;
    private final double interestRate;
}

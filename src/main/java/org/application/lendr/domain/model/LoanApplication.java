package org.application.lendr.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@RequiredArgsConstructor
public final class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private final int amount;

    @ManyToOne
    private final User borrower;
    private final Duration repaymentTerm;
    private final double interestRate;
}

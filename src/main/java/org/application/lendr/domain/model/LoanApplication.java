package org.application.lendr.domain.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@EqualsAndHashCode
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount;
    @ManyToOne
    private User borrower;
    private int repaymentTermInDays;
    private double interestRate;

    public LoanApplication(int amount, User borrower, int repaymentTermInDays, double interestRate) {
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTermInDays = repaymentTermInDays;
        this.interestRate = interestRate;
    }
}

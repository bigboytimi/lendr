package org.application.lendr.domain.service;

import lombok.RequiredArgsConstructor;
import org.application.lendr.application.model.LoanRequest;
import org.application.lendr.domain.exception.UserNotFoundException;
import org.application.lendr.domain.model.LoanApplication;
import org.application.lendr.domain.model.User;
import org.application.lendr.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class LoanApplicationAdapter {
    private final UserRepository userRepository;

    public LoanApplication transform(LoanRequest req){
        Optional<User> userOptional = userRepository.findById(req.getBorrowerId());
        if(userOptional.isPresent()){
            return new LoanApplication(req.getAmount(), userOptional.get(),
                    req.getDaysToRepay(), req.getInterestRate());
        } else{
            throw new UserNotFoundException(req.getBorrowerId());
        }
    }
}

package org.application.lendr.application;

import lombok.RequiredArgsConstructor;
import org.application.lendr.application.model.LoanRequest;
import org.application.lendr.domain.model.LoanApplication;
import org.application.lendr.domain.model.User;
import org.application.lendr.domain.repository.LoanApplicationRepository;
import org.application.lendr.domain.repository.UserRepository;
import org.application.lendr.domain.service.LoanApplicationAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoanController {
    private final LoanApplicationRepository loanApplicationRepository;
    private final UserRepository userRepository;
    private final LoanApplicationAdapter loanApplicationAdapter;

    @PostMapping(value = "/loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanRequest){
        loanApplicationRepository.save(loanApplicationAdapter.transform(loanRequest));
    }
    @GetMapping(value = "/loan/requests")
    public List<LoanApplication> findAllLoanApplications(){
        return loanApplicationRepository.findAll();
    }

    @GetMapping(value = "/users")
    public List<User> findUsers(){
        return userRepository.findAll();
    }
}

package com.pos.sale.point.service;


import com.pos.sale.point.domain.Branch;
import com.pos.sale.point.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BranchService {

    private final BranchRepository branchRepository;

    @Autowired
    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public Long addProducts(Branch branch) {
        return branchRepository.save(branch).getId();
    }


    public List<Branch> products() {
        return branchRepository.findAll();
    }

    public Branch getBranchById(Long id){
        return branchRepository.getOne(id);
    }
}

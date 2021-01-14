package com.pos.sale.point.manager;


import com.pos.sale.point.domain.Branch;
import com.pos.sale.point.domain.City;
import com.pos.sale.point.service.BranchService;
import com.pos.sale.point.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class BranchManager {

    private final BranchService branchService;
    private final CityService cityService;

    @Autowired
    public BranchManager(BranchService branchService, CityService cityService) {
        this.branchService = branchService;
        this.cityService = cityService;
    }

    public Branch addProducts( Branch branch) {
        City city = cityService.getCityById(branch.getCity().getId());
        if (city == null) {
            return null;
        }
        branch.setCity(city);
        return branchService.getBranchById(branchService.addProducts(branch));
    }

    public List<Branch> products() {
        return branchService.products();
    }

}

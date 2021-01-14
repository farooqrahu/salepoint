package com.pos.sale.point.service;


import com.pos.sale.point.domain.Branch;
import com.pos.sale.point.domain.City;
import com.pos.sale.point.repository.BranchRepository;
import com.pos.sale.point.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City getCityById(Long id) {
        return cityRepository.getOne(id);
    }

}

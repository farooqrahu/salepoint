package com.pos.sale.point.controller;


import com.pos.sale.point.domain.Branch;
import com.pos.sale.point.dto.UserDto;
import com.pos.sale.point.manager.BranchManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("branches")
public class BranchController {

//    @Autowired
    private final BranchManager branchManager;
    //    @Autowired
//    UserDto userDto;
//    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    @Autowired
    public BranchController(BranchManager branchManager) {
        this.branchManager = branchManager;
//        ctx.register(Config.class);
    }

    //
    @PostMapping("/add")
    public Branch addProducts(@RequestBody Branch branch) {
        System.out.println("dfffff" + branch);
//        branchRepository.save(branch);

        return branchManager.addProducts(branch);

    }

    @GetMapping("/list")
    public List<Branch> products() {



      /*  ctx.refresh();
        UserDto userDto = ctx.getBean(UserDto.class);
        userDto.setName("Farooq");
        System.out.println(userDto.getName());
        System.out.println(userDto.hashCode());

        UserDto userDto1 = ctx.getBean(UserDto.class);
        userDto1.setEmail("Rahu");
        System.out.println(userDto1.getName());
        System.out.println(userDto1.getEmail());
        System.out.println(userDto1.hashCode());*/
        return branchManager.products();
    }

}

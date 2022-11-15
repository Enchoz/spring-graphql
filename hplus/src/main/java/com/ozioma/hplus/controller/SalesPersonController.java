package com.ozioma.hplus.controller;

import com.ozioma.hplus.entity.SalesPerson;
import com.ozioma.hplus.repositories.SalesPersonRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SalesPersonController {
    private final SalesPersonRepository salesPersonRepository;

    public SalesPersonController(SalesPersonRepository salesPersonRepository) {
        this.salesPersonRepository = salesPersonRepository;
    }

    @QueryMapping
    public Iterable<SalesPerson> salesPersons() {
        return this.salesPersonRepository.findAll();
    }

    @QueryMapping
    public SalesPerson salesPersonById(@Argument Long id) {
        return this.salesPersonRepository.findById(id).orElseThrow();
    }
}

package com.jwalterwilkos.springpetclinicsfg.services;

import com.jwalterwilkos.springpetclinicsfg.model.Owner;
import com.jwalterwilkos.springpetclinicsfg.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

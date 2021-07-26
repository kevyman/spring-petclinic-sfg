package com.jwalterwilkos.springpetclinicsfg.services;

import com.jwalterwilkos.springpetclinicsfg.model.Owner;
import com.jwalterwilkos.springpetclinicsfg.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

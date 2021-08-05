package com.jwalterwilkos.springpetclinicsfg.services;

import com.jwalterwilkos.springpetclinicsfg.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

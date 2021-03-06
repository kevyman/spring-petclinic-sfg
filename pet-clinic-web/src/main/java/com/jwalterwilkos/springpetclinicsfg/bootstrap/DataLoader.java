package com.jwalterwilkos.springpetclinicsfg.bootstrap;

import com.jwalterwilkos.springpetclinicsfg.model.Owner;
import com.jwalterwilkos.springpetclinicsfg.model.Vet;
import com.jwalterwilkos.springpetclinicsfg.services.OwnerService;
import com.jwalterwilkos.springpetclinicsfg.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Wilkos");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Applegate");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Samuel");
        vet2.setLastName("Jackson");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}

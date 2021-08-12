package com.jwalterwilkos.springpetclinicsfg.bootstrap;

import com.jwalterwilkos.springpetclinicsfg.model.Owner;
import com.jwalterwilkos.springpetclinicsfg.model.Vet;
import com.jwalterwilkos.springpetclinicsfg.services.OwnerService;
import com.jwalterwilkos.springpetclinicsfg.services.VetService;
import com.jwalterwilkos.springpetclinicsfg.services.map.OwnerServiceMap;
import com.jwalterwilkos.springpetclinicsfg.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Wilkos");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Applegate");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Samuel");
        vet1.setLastName("Jackson");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}

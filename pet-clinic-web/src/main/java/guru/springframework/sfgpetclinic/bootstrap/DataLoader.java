package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Mausam");
        owner1.setLastName("Rayamajhi");

        ownerService.save(owner1);

        System.out.println("Loaded Owners....");

        Owner owner2 = new Owner();

        owner2.setFirstName("Rabin");
        owner2.setLastName("Poudel");

        ownerService.save(owner2);


        Vet vet1= new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2= new Vet();

        vet2.setFirstName("Rob");
        vet2.setLastName("Bas");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}

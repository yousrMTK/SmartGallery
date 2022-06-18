package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.Client;
import com.gallery.smart.SmartGallery.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    private ClientRepository clientrepository;

    @CrossOrigin
    @PostMapping(consumes = {"application/json"})
    public Client saveUser(@Validated @RequestBody Client client) {
        System.out.println("client.toString() = " + client.toString());
        return clientrepository.save(client);
    }
}

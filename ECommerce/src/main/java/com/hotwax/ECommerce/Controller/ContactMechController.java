package com.hotwax.ECommerce.Controller;

import com.hotwax.ECommerce.Entities.ContactMech;
import com.hotwax.ECommerce.Services.ContactMechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact-mechs")
public class ContactMechController {

    @Autowired
    private ContactMechService contactMechService;

    // Create ContactMech (POST)
    @PostMapping
    public ContactMech createContactMech(@RequestBody ContactMech contactMech) {
        return contactMechService.createContactMech(contactMech);
    }

    // Get all ContactMechs (GET)
    @GetMapping
    public List<ContactMech> getAllContactMechs() {
        return contactMechService.getAllContactMechs();
    }

    // Get ContactMech by ID (GET)
    @GetMapping("/{id}")
    public ContactMech getContactMechById(@PathVariable int id) {
        return contactMechService.getContactMechById(id);
    }

    // Update ContactMech (PUT)
    @PutMapping("/{id}")
    public ContactMech updateContactMech(@PathVariable int id, @RequestBody ContactMech updatedContactMech) {
        return contactMechService.updateContactMech(id, updatedContactMech);
    }

    // Delete ContactMech (DELETE)
    @DeleteMapping("/{id}")
    public void deleteContactMech(@PathVariable int id) {
        contactMechService.deleteContactMech(id);
    }
}

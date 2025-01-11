package com.hotwax.ECommerce.Services;

import com.hotwax.ECommerce.Entities.ContactMech;
import com.hotwax.ECommerce.respositories.ContactMechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactMechService {

    @Autowired
    private ContactMechRepository contactMechRepository;

    // Create a new ContactMech
    public ContactMech createContactMech(ContactMech contactMech) {
        return contactMechRepository.save(contactMech);
    }

    // Get all ContactMech records
    public List<ContactMech> getAllContactMechs() {
        return contactMechRepository.findAll();
    }

    // Get ContactMech by ID
    public ContactMech getContactMechById(int id) {
        Optional<ContactMech> optionalContactMech = contactMechRepository.findById(id);
        return optionalContactMech.orElseThrow(() -> new RuntimeException("ContactMech not found with ID: " + id));
    }

    // Update ContactMech
    public ContactMech updateContactMech(int id, ContactMech updatedContactMech) {
        ContactMech existingContactMech = getContactMechById(id);
        existingContactMech.setStreetAddress(updatedContactMech.getStreetAddress());
        existingContactMech.setCity(updatedContactMech.getCity());
        existingContactMech.setState(updatedContactMech.getState());
        existingContactMech.setPostalCode(updatedContactMech.getPostalCode());
        existingContactMech.setPhoneNumber(updatedContactMech.getPhoneNumber());
        existingContactMech.setEmail(updatedContactMech.getEmail());
        existingContactMech.setCustomer(updatedContactMech.getCustomer());
        return contactMechRepository.save(existingContactMech);
    }

    // Delete ContactMech
    public void deleteContactMech(int id) {
        contactMechRepository.deleteById(id);
    }
}

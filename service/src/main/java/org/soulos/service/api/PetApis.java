package org.soulos.service.api;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetApis implements org.openapitools.api.PetApi {
    private static final Logger log = LoggerFactory.getLogger(PetApis.class);

    @Override
    public ResponseEntity<Pet> addPet(Pet pet) {
        log.info("Adding pet: {}", pet);
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        log.info("Deleting pet: {}", petId);
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(String status) {
        log.info("Finding pets by status: {}", status);
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        log.info("Finding pets by tags: {}", tags);
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        log.info("Getting pet by id: {}", petId);
        return null;
    }

    @Override
    public ResponseEntity<Pet> updatePet(Pet pet) {
        log.info("Updating pet: {}", pet);
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        log.info("Updating pet with form: {}", petId);
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, Resource body) {
        log.info("Uploading file: {}", body);
        return null;
    }
}

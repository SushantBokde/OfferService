package com.example.offer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

	@Autowired
	private OfferRepository repository;

	@GetMapping("/getAllOffers")
	List<Offer> all() {
		return repository.findAll();
	}

	@PostMapping("/createNewOffer")
	Offer newOffer(@RequestBody Offer newOffer) {
		return repository.save(newOffer);
	}

	@GetMapping("/getOffer/{id}")
	Offer getOfferByID(@PathVariable Long id) {

		return repository.findById(id).orElseThrow(() -> new OfferNotFoundException(id));
	}

	@PutMapping("/expireOffer/{id}")
	Offer expireOffer(@PathVariable Long id) {

		return repository.findById(id).map(offer -> {
			offer.setExpired(false);
			return repository.save(offer);
		}).orElseThrow(() -> new OfferNotFoundException(id));
	}

	@DeleteMapping("/cancelOffer/{id}")
	Map<String, Boolean> deleteOffer(@PathVariable Long id) {
		repository.deleteById(id);
		Map<String, Boolean> response = new HashMap<String, Boolean>();
	    response.put("expired", Boolean.TRUE);
	    return response;
	}
}

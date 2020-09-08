package com.example.offer;

public class OfferNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6609221942294316658L;

	OfferNotFoundException(Long id) {
	    super("Could not find offer " + id);
	  }

}

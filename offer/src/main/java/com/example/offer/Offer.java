package com.example.offer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Representation of Offer in the system.
 */
@Entity
public class Offer {

	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private String description;
	private int productQuantity;
	private BigDecimal discountedPrice;
	private String currency;
	private String validTill;
	private boolean expired;

	Offer() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getValidTill() {
		return validTill;
	}

	public void setValidTill(String validTill) {
		this.validTill = validTill;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Offer))
			return false;
		Offer offer = (Offer) o;
		return Objects.equals(this.id, offer.id) && Objects.equals(this.productName, offer.productName)
				&& Objects.equals(this.productQuantity, offer.productQuantity)
				&& Objects.equals(this.discountedPrice, offer.discountedPrice)
				&& Objects.equals(this.expired, offer.expired)
				&& Objects.equals(this.validTill, offer.validTill) && Objects.equals(this.currency, offer.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.productName, this.productQuantity, this.discountedPrice,
				this.expired, this.validTill, this.currency);
	}

	@Override
	public String toString() {
		return "Offer{" + "id=" + this.id + ", productName='" + this.productName + '\'' + ", productQuantity='" + this.description
				+ '\'' + ", discountedPrice='" + this.discountedPrice + '\'' + ", validTill='" + this.validTill + '\''+ '}';
	}
}

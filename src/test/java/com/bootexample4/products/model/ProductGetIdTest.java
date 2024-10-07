
package com.bootexample4.products.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.junit.jupiter.api.*;

@Tag("unit")
public class ProductGetIdTest {

	@Test
	@Tag("valid")
	public void testGetIdReturnsCorrectIdValue() {
		Product product = new Product();
		product.setId(1L);
		Assertions.assertEquals(1L, product.getId());
	}

	@Test
	@Tag("valid")
	public void testGetIdReturnsNullForNewProductObject() {
		Product product = new Product();
		Assertions.assertNull(product.getId());
	}

	@Test
	@Tag("valid")
	public void testGetIdReturnsSameIdValueAfterMultipleCalls() {
		Product product = new Product();
		product.setId(1L);
		Assertions.assertEquals(1L, product.getId());
		Assertions.assertEquals(1L, product.getId());
	}

	@Test
	@Tag("valid")
	public void testGetIdPreservesIdValueAfterOtherFieldChanges() {
		Product product = new Product();
		product.setId(1L);
		product.setName("Product Name");
		product.setDescription("Product Description");
		product.setPrice(9.99);
		Assertions.assertEquals(1L, product.getId());
	}

	@Test
	@Tag("valid")
	public void testGetIdPreservesIdValueAfterPriceChange() {
		Product product = new Product();
		product.setId(1L);
		product.setPrice(9.99);
		Assertions.assertEquals(1L, product.getId());
	}

	@Test
	@Tag("valid")
	public void testGetIdPreservesIdValueAfterDescriptionChange() {
		Product product = new Product();
		product.setId(1L);
		product.setDescription("Product Description");
		Assertions.assertEquals(1L, product.getId());
	}

	@Test
	@Tag("valid")
	public void testGetIdPreservesIdValueAfterNameChange() {
		Product product = new Product();
		product.setId(1L);
		product.setName("Product Name");
		Assertions.assertEquals(1L, product.getId());

	}}

	Please note
	that the Product

	class must
	be defined
	as follows:

	@Entity
	public class Product {

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Long id;

			private String name;

			private String description;

			private double price;

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;

			}

}
These import statements

are required for
the code
to compile
:
package fr.r6a06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCustomer {


    @Test
    public void testStatement() {
        Customer customer1 = new Customer("customer1");
        Movie movie1 = new Movie("movie", Movie.REGULAR);
        Rental rental = new Rental(movie1, 2);
        customer1.addRental(rental);
        assertEquals(customer1.statement(), "Record for customer1\n\tmovie\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points");
    }

    @Test
    public void testGetName() {
        Customer customer2 = new Customer("customer2");

        String expected = "customer2";

        assertEquals(customer2.getName(), expected);
    }


}

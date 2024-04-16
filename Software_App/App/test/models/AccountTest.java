package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account  account0;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        account0 = new Account("John Doe","W104",20000001,"20000001@mail.setu.ie");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
       account0  = null;
    }

    @Test
    void underConstructorTests() {
        //Test under boundary's
        Account account = new Account("Testing names with exactly 34 char", "W13", 2000001, "20000000@mail.setu.ie");

        assertEquals("Testing names with exactly 34 char", account.getName());
        //Value accepted under 35 chars
        assertEquals("W13", account.getCourse());
        //Value accepted under 4 chars
        assertEquals(20000000, account.getId());
        //Value 2000001 not accepted default to 20000000
        assertEquals("20000000@mail.setu.ie", account.getContactInfo());
        //Value accepted under 25 chars
    }

    @Test
    void exactConstructorTests() {

        //Test exact boundary's
        Account account1 = new Account("Testing names with exactly 35 chars", "W143", 20000001, "20000000@mail.setu.ie2345");

        assertEquals("Testing names with exactly 35 chars", account1.getName());
        //Value accepted max 35 chars
        assertEquals("W143", account1.getCourse());
        //Value accepted max 4 chars
        assertEquals(20000001, account1.getId());
        //Value accepted within boundary's
        assertEquals("20000000@mail.setu.ie2345", account1.getContactInfo());
        //Value accepted max 25 chars
    }

    @Test
    void overConstructorTests(){

        //Test over boundary's
        Account account2 = new Account("Testing names with more than 35 chars","W1443",200002001,"20000000@mail.setu.ie2345");

        assertEquals("Student Name Error",account2.getName());
        //Value Testing names with more than 35 chars not accepted over 35 chars set to default
        assertEquals("W001",account2.getCourse());
        //Value W1443 not accepted over max 4 chars set to default
        assertEquals(20000000,account2.getId());
        //Value 200002001 not accepted set to default
        assertEquals("20000000@mail.setu.ie2345",account2.getContactInfo());
        //Value 20000000@mail.setu.ie2345 not accepted max 25 chars set to default
    }

    @Test
    void validateEquals(){
        Account otherAccount = new Account("John Doe","W104",20000001,"20000001@mail.setu.ie");

        assertNotSame(account0,otherAccount);

        assertEquals(account0,otherAccount);
    }

    @Test
    void toStringContainsAllFields(){
        assertTrue(account0.toString().contains("John Doe"));
        assertTrue(account0.toString().contains("W104"));
        assertTrue(account0.toString().contains("20000001"));
        assertTrue(account0.toString().contains("20000001@mail.setu.ie"));

    }



}
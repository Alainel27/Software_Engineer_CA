package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClubsTest {

    private Clubs  clubs0, clubs1, clubs2, clubs3;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        clubs0 = new Clubs("Esport Club",15,"Compete for glory");
        clubs1 = new Clubs("Testing names with exactly 34 char", 21,"This is a description of an event");
        clubs2 = new Clubs("Testing names with exactly 35 chars", 15,"Testing text with exactly 35 char's");
        clubs3 = new Clubs("Testing names with more than 35 chars",30,"Testing description's entry with more than 50 chars okiedokie");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        clubs0 = clubs1 = clubs2 = clubs3 = null;
    }

    @Test
    void underConstructorTests() {
        //Test under boundary's

        assertEquals("Testing names with exactly 34 char", clubs1.getName());
        //Value accepted under 35 chars

        assertEquals(21, clubs1.getCost());
        //Value accepted under 8 chars

        assertEquals("This is a description of an event", clubs1.getDesc());
        //Value accepted under 35 chars
    }

    @Test
    void exactConstructorTests() {
        //Test exact boundary's

        assertEquals("Testing names with exactly 35 chars", clubs2.getName());
        //Value accepted max 35 chars

        assertEquals(15, clubs2.getCost());
        //Value accepted max 4 chars

        assertEquals("Testing text with exactly 35 char's", clubs2.getDesc());
        //Value accepted max 25 chars
    }

    @Test
    void overConstructorTests(){

        //Test over boundary's

        assertEquals("Club Name Error", clubs3.getName());
        //Value Testing names with more than 35 chars not accepted over 35 chars set to default

        assertEquals(10, clubs3.getCost());
        //Value W1443 not accepted over max 4 chars set to default

        assertEquals("Clubs Description", clubs3.getDesc());
        //Value 20000000@mail.setu.ie2345 not accepted max 25 chars set to default
    }

    @Test
    void gettersAndSetters(){

        //Check the values
        assertEquals("Esport Club", clubs0.getName());
        assertEquals(15, clubs0.getCost());
        assertEquals("Compete for glory", clubs0.getDesc());


        //Set new values
        clubs0.setName("Go Karting");
        clubs0.setCost(20);
        clubs0.setDesc("Changed Desc");


        //Check that it changed
        assertEquals("Go Karting", clubs0.getName());
        assertEquals(20, clubs0.getCost());
        assertEquals("Changed Desc", clubs0.getDesc());


    }

    @Test
    void validateEquals(){
        Clubs otherClubs = new Clubs("Esport Club",15,"Compete for glory");

        assertNotSame(clubs0,otherClubs);

        assertEquals(clubs0,otherClubs);
    }

    @Test
    void toStringContainsAllFields(){
        assertTrue(clubs0.toString().contains("Esport Club"));
        assertTrue(clubs0.toString().contains("15"));
        assertTrue(clubs0.toString().contains("Compete for glory"));

    }



}
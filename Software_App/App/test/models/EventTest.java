package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    private Event  event0, event1, event2, event3;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        event0 = new Event("Computing Ball","14/04/24","20:00","Computing Ball in the tower hotel at 8pm until 11pm");
        event1 = new Event("Testing names with exactly 34 char", "21/03", "21", "This is a description of an event");
        event2 = new Event("Testing names with exactly 35 chars", "15/02/24", "20:30", "Testing description's entry with exactly 50 chars okay");
        event3 = new Event("Testing names with more than 35 chars","20/20/2004","19:30:55","Testing description's entry with more than 50 chars okiedokie");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        event0 = event1 = event2 = event3 = null;
    }

    @Test
    void underConstructorTests() {
        //Test under boundary's

        assertEquals("Testing names with exactly 34 char", event1.getName());
        //Value accepted under 35 chars

        assertEquals("21/03", event1.getDate());
        //Value accepted under 8 chars

        assertEquals("21", event1.getTime());
        //Value accepted under 5 chars

        assertEquals("This is a description of an event", event1.getDesc());
        //Value accepted under 25 chars
    }

    @Test
    void exactConstructorTests() {
        //Test exact boundary's

        assertEquals("Testing names with exactly 35 chars", event2.getName());
        //Value accepted max 35 chars

        assertEquals("15/02/24", event2.getDate());
        //Value accepted max 4 chars

        assertEquals("20:30", event2.getTime());
        //Value accepted within boundary's

        assertEquals("Testing description's entry with exactly 50 chars okay", event2.getDesc());
        //Value accepted max 25 chars
    }

    @Test
    void overConstructorTests(){

        //Test over boundary's

        assertEquals("Event Name Error",event3.getName());
        //Value Testing names with more than 35 chars not accepted over 35 chars set to default

        assertEquals("00/00/00",event3.getDate());
        //Value W1443 not accepted over max 4 chars set to default

        assertEquals("00.00",event3.getTime());
        //Value 200002001 not accepted set to default

        assertEquals("Event Description",event3.getDesc());
        //Value 20000000@mail.setu.ie2345 not accepted max 25 chars set to default
    }

    @Test
    void gettersAndSetters(){

        //Check the values
        assertEquals("Computing Ball",event0.getName());
        assertEquals("14/04/24",event0.getDate());
        assertEquals("20:00",event0.getTime());
        assertEquals("Computing Ball in the tower hotel at 8pm until 11pm",event0.getDesc());

        //Set new values
        event0.setName("Christmas Party");
        event0.setDate("21/12/24");
        event0.setTime("21:00");
        event0.setDesc("Changed Desc");

        //Check that it changed
        assertEquals("Christmas Party",event0.getName());
        assertEquals("21/12/24",event0.getDate());
        assertEquals("21:00",event0.getTime());
        assertEquals("Changed Desc",event0.getDesc());

    }

    @Test
    void validateEquals(){
        Event otherEvent = new Event("Computing Ball","14/04/24","20:00","Computing Ball in the tower hotel at 8pm until 11pm");

        assertNotSame(event0,otherEvent);

        assertEquals(event0,otherEvent);
    }

    @Test
    void toStringContainsAllFields(){
        assertTrue(event0.toString().contains("Computing Ball"));
        assertTrue(event0.toString().contains("14/04/24"));
        assertTrue(event0.toString().contains("20:00"));
        assertTrue(event0.toString().contains("Computing Ball in the tower hotel at 8pm until 11pm"));

    }



}
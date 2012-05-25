
package org.examproject.lang.core;

import org.examproject.lang.verb.value.Tense;
import org.junit.*;
import static org.junit.Assert.*;

public class SentenceTest {
    
    public SentenceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetPresentText() {
        System.out.println("getText Tense.Present");
        Sentence instance = new Sentence();
        
        Subject subject = new Subject("I");
        Verb verb = new Verb("call");
        Object object = new Object("him");
        Complement complement = new Complement("Bob");
        
        instance.setSubject(subject);
        instance.setVerb(verb);
        instance.setObject(object);
        instance.setComplement(complement);
        
        String expResult = "I call him Bob.";
        String result = instance.getText(Tense.Present);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPastText() {
        System.out.println("getText Tense.Past");
        Sentence instance = new Sentence();
        
        Subject subject = new Subject("I");
        Verb verb = new Verb("call");
        Object object = new Object("him");
        Complement complement = new Complement("Bob");
        
        instance.setSubject(subject);
        instance.setVerb(verb);
        instance.setObject(object);
        instance.setComplement(complement);
        
        String expResult = "I called him Bob.";
        String result = instance.getText(Tense.Past);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetFutureText() {
        System.out.println("getText Tense.Future");
        Sentence instance = new Sentence();
        
        Subject subject = new Subject("I");
        Verb verb = new Verb("call");
        Object object = new Object("him");
        Complement complement = new Complement("Bob");
        
        instance.setSubject(subject);
        instance.setVerb(verb);
        instance.setObject(object);
        instance.setComplement(complement);
        
        String expResult = "I will call him Bob.";
        String result = instance.getText(Tense.Future);
        assertEquals(expResult, result);
    }
    
}
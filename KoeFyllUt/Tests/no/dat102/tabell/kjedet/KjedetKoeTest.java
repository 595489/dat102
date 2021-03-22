package no.dat102.tabell.kjedet;

import no.hvl.dat102.kjedet.KjedetKoe;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KjedetKoeTest {

    @Before
    public void SetUp(){
        KjedetKoe koe = new KjedetKoe();
        String a = "Alfabet: ";
        koe.innKoe(a);
    }

    @Test
    public void testTomKoe(){
        assertTrue(koe.erTom());
    }

    @Test
    public void testKoe(){
    }
}

package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class DNAToRNAConversionTest {
    @Test
    public void testDna() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("TTTT"), b.dnaToRna("TTTT"), "UUUU");
    }

    @Test
    public void testDna2() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("GCAT"), b.dnaToRna("GCAT"), "GCAU");
    }
}
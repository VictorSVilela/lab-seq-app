package dev.victorvilela.labseq;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.victorvilela.labseq.exceptions.NegativeNumberException;
import dev.victorvilela.labseq.services.LabseqService;

public class LabSeqServiceTest {

    private LabseqService labseqService;
    private long startTime;

    @BeforeEach
    public void setUp() {
        labseqService = new LabseqService();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    public void tearDown() {
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test execution time: " + duration + " milliseconds");
    }

    @Test
    public void testGetLabSeqValue() {
        Assertions.assertEquals(0, labseqService.getLabSeqValue(0));
        Assertions.assertEquals(1, labseqService.getLabSeqValue(1));
        Assertions.assertEquals(0, labseqService.getLabSeqValue(2));
        Assertions.assertEquals(1, labseqService.getLabSeqValue(3));
        Assertions.assertEquals(1, labseqService.getLabSeqValue(4));
        Assertions.assertEquals(1, labseqService.getLabSeqValue(5));
        Assertions.assertEquals(1, labseqService.getLabSeqValue(6));
        Assertions.assertEquals(2, labseqService.getLabSeqValue(7));
        Assertions.assertEquals(2, labseqService.getLabSeqValue(8));
        Assertions.assertEquals(2, labseqService.getLabSeqValue(9));
        Assertions.assertEquals(3, labseqService.getLabSeqValue(10));
    }

    @Test
    public void testNegativeIndex() {
        Assertions.assertThrows(NegativeNumberException.class, () -> labseqService.getLabSeqValue(-1));
    }

    @Test
    public void testTimeGetLabSeqValue() {
        int index = 10000;
        long result = labseqService.getLabSeqValue(index);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Test execution time for l(" + index + "): " + duration + " milliseconds");
        System.out.println("Result for l(" + index + "): " + result);
    }
}


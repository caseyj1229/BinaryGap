import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {
    @org.junit.jupiter.api.Test
    void binaryGap() {

        assertEquals(3, BinaryGap.binaryGap(17));

        assertEquals(0,BinaryGap.binaryGap(3));

        assertEquals(0,BinaryGap.binaryGap(15));

        assertEquals(1,BinaryGap.binaryGap(20));

        assertEquals(5,BinaryGap.binaryGap(1041));

        assertEquals(0,BinaryGap.binaryGap(12));
    }
}
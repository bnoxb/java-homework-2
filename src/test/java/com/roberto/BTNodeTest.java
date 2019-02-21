package com.roberto;
import org.junit.Test;
import static org.junit.Assert.*;

public class BTNodeTest {
    @Test
    public void makeNodeWithValue(){
        BTNode testNode = new BTNode(1);
        assertEquals("Did not return value", 1, testNode.getValue());
        assertNull("Did not return left null", testNode.getLeft());
        assertNull("Did not return right null", testNode.getRight());
    }
}

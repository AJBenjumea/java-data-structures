package test;
import datastructures.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//UnitOfWork_StateUnderTest_ExpectedBehavior
public class QueueTest {
    Queue queue;

    @BeforeEach
    void initSetup() {
        queue = new Queue();
    }

    @Test
    void WhenCheckingSize_isEmpty_returnsTrue() {
        assertEquals(true, queue.isEmpty(), "Should return true if Queue empty");
    }

    @Test
    void WhenCheckingFirstItem_noFirstItem_returnsNull() {
        assertEquals(null, queue.peek(), "Should return null if no first item");
    }

    @Test
    void WhenAddingItem_emptyQueue_addsItemToTailAndHead() {
        queue.add(3);
        assertEquals(3, queue.getNodeVal(queue.getTail()));
        assertEquals(3, queue.getNodeVal(queue.getHead()));
    }

    @Test
    void WhenAddingItem_TwoItemsInQueue_addsItemToTailOnly() {
        queue.add(3);
        queue.add(4);
        queue.add(5);

        assertEquals(5, queue.getNodeVal(queue.getTail()));
        assertEquals(3, queue.getNodeVal(queue.getHead()));
    }

    @Test
    void WhenRemovingItem_threeItemsInQueue_removesAndReturnsFrontItem() {
        queue.add(3);
        queue.add(4);
        queue.add(5);

        assertEquals(3, queue.getNodeVal(queue.remove()));
    }

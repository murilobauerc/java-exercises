package test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Queue;

class QueueTest{
	private Queue<Integer> q, emptyQ;
	
	
	@BeforeEach
	void setup() {
		q = new Queue<Integer>(new ArrayList<>(Arrays.asList(15,20)));
		emptyQ = new Queue<Integer>();
	}
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEnqueue() {
		q.enqueue(12);
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(15,20,12));
		ArrayList<Integer> actual = q.items;
		assertEquals(expected, actual);
	}

	@Test
	void testDequeueElement() {
		Integer actual = q.dequeue();
		Integer expected = 15;
		assertEquals(expected, actual);
	}
	@Test
	void testDequeueQueue() {
		q.dequeue();
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(20));
		ArrayList<Integer> actual = q.items;
		assertEquals(expected, actual);
	}
	
	@Test
	void testDequeueEmpty() {
		assertThrows(IndexOutOfBoundsException.class, () -> emptyQ.dequeue());
	}
	
	
	@Test
	void testFirst() {
		Integer actual = q.first();
		Integer expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	void testIsEmptyIsTrue() {
		assertTrue(emptyQ.isEmpty());
	}

	@Test
	void testIsEmptyIsFalse() {
		assertFalse(q.isEmpty());
	}
	@Test
	void testSize() {
		
	}
}

package com.ivansychev.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOpenDBO {
    @Test
    public void testOpenDBO() {
        assertEquals("Success", OpenDBO.openDBO());
    }
}

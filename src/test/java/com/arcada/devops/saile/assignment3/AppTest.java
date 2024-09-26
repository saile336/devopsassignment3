package com.arcada.devops.saile.assignment3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

import com.arcada.devops.saile.assignment3.App.FriendsHandler;


public class AppTest {

    @Test
    public void testLinkPositive() throws IOException {
    	String[] expected = {"David", "Lukas", "Bob", "Pena", "Irmi"};
    	String[] actual = FriendsHandler.fetchFriends("MyLink");
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testLinkNegative() throws IOException {
    	String[] expected = {"David", "Lukas", "Bob", "Pena", "Irmi"};
    	String[] actual = FriendsHandler.fetchFriends("SomeOtherLink");
    	assertNotEquals(expected, actual);
    }
}

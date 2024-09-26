package com.arcada.devops.saile.assignment3;

import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    }
    
    public class FriendsHandler {
        public static String[] fetchFriends(String profileLink) {
            if(profileLink == "MyLink") {
            	return new String[]{"David", "Lukas", "Bob", "Pena", "Irmi"};
            }
            else return new String[]{"Empty list :("};
        }
    }
}

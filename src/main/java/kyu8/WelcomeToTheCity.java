/*
Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person.
Note that name will be an array consisting of one or more values that should be joined together with one space
betweeen each, and the length of the name array in test cases will vary.

Example:
sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")

This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
 */
package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WelcomeToTheCity {
    public String sayHello(String [] name, String city, String state){
        String fullName = Arrays.stream(name)
                .map(s -> new StringBuilder().append(s).append(" ").toString())
                .collect(Collectors.joining()).trim();
        return String.format("Hello, %s! Welcome to %s, %s!", fullName, city, state);
    }
}

package com.rimac;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class MyFirstFizzBuzz implements FizzBuzz {
    /*
    // This method receives:
    // Lower bound of closed interval, "from"
    // Upper bound of closed interval, "until"
    //
    // This method outputs (in return value, not on screen):
    // "Abra" if the number is divisible by 2
    // "Kadabra" if the number is divisible by 3
    // "Buzz" if the number is divisible by 5
    // String representation of the number otherwise
    */
    @Override
    public List<String> doMagic(int from, int until) {
        return IntStream.rangeClosed(from, until)
                .mapToObj(this::abracadabra)
                .collect(Collectors.toList());
    }

    protected final String abracadabra(int i) {
        final StringBuilder sb = new StringBuilder();

        if (i % 2 == 0) {
            sb.append("Abra");
        }

        if (i % 3 == 0) {
            sb.append("Kadabra");
        }
        
        if (i % 5 == 0) {
            sb.append("Buzz");
        }

        if (sb.length() == 0) {
            sb.append(i);
        }

        return sb.toString();
    }
}

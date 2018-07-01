package com.rimac;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Optional;

public final class MyFirstFizzBuzz implements FizzBuzz {
    public MyFirstFizzBuzz() {
        this.assistant = new MyOnlyAssistant();
    }
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
    //
    // I'm getting tired of changing this exact class over and over again when I'm
    // changing my magic incantations. Let's see if I can delegate the incantations.

    // I know, I'll just an assistant!
    // When given a number, they will either shout some incantation (which I assume is correct),
    // or say nothing at all, which means the number shouldn't be replaced.
    */

    @FunctionalInterface
    interface MagiciansAssistant {
        Optional<String> doLesserMagic(int number);
    }

    private final MagiciansAssistant assistant;

    @Override
    public List<String> doMagic(int from, int until) {
        return IntStream.rangeClosed(from, until)
                .mapToObj(i -> assistant.doLesserMagic(i)
                        .orElse(Integer.toString(i))
                ).collect(Collectors.toList());
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

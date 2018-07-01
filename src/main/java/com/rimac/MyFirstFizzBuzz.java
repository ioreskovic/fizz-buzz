package com.rimac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class MyFirstFizzBuzz implements FizzBuzz {
    public MyFirstFizzBuzz() {
        this.assistants = new ArrayList<>();

        this.assistants.add(new SimpleMindedMagiciansAssistant(2, "Abra"));
        this.assistants.add(new SimpleMindedMagiciansAssistant(3, "Kadabra"));
        this.assistants.add(new SimpleMindedMagiciansAssistant(5, "Buzz"));
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
    //
    // Hold on a second!!
    // My assistant now has the same problem I've had.
    // I've introduced more complexity, and just pushed the problem down the food chain.
    // I know!!
    // How about having one assistant for each separate incantation?
    // I'll just ask each of them for specific numbers, and combine their answers!!
    // Brilliant, just brilliant!
    //
    // But I still have to tell them how to do it. I wish I didn't have to do that.
    */

    private final List<SimpleMindedMagiciansAssistant> assistants;

    @Override
    public List<String> doMagic(int from, int until) {
        return IntStream.rangeClosed(from, until)
                .mapToObj(this::consultAssistants)
                .collect(Collectors.toList());
    }

    protected final String consultAssistants(int number) {
        String assistantsVote = assistants.stream()
                .map(assistant -> assistant.doSimpleMagic(number))
                .map(x -> x.orElse(""))
                .collect(Collectors.joining());

        if (assistantsVote.length() > 0) return assistantsVote;
        return Integer.toString(number);

    }
}

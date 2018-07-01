package com.rimac;

import java.util.Optional;

public class SimpleMindedMagiciansAssistant {
    private final int number;
    private final String incantation;

    public SimpleMindedMagiciansAssistant(int number, String incantation) {
        this.number = number;
        this.incantation = incantation;
    }

    public Optional<String> doSimpleMagic(int number) {
        if (number % this.number == 0) {
            return Optional.of(incantation);
        }

        return Optional.empty();
    }
}

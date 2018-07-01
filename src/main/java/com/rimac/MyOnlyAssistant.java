package com.rimac;

import java.util.Optional;

public class MyOnlyAssistant implements MyFirstFizzBuzz.MagiciansAssistant {
    @Override
    public Optional<String> doLesserMagic(int number) {
        final StringBuilder sb = new StringBuilder();

        if (number % 2 == 0) {
            sb.append("Abra");
        }

        if (number % 3 == 0) {
            sb.append("Kadabra");
        }

        if (number % 5 == 0) {
            sb.append("Buzz");
        }

        if (sb.length() == 0) {
            return Optional.empty();
        }

        return Optional.of(sb.toString());
    }
}

package com.rimac;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.google.common.truth.Truth.assertThat;

@RunWith(BlockJUnit4ClassRunner.class)
public class MyFirstFizzBuzzTest {
    @Test
    public void givenSomeRange_WhenDoingMagic_ThenAudienceShouldBeAmazed() {
        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz();

        final List<String> result = fizzBuzz.doMagic(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        assertThat(result).containsExactly(
                "1",
                "Abra",
                "Kadabra",
                "Abra",
                "Buzz",
                "AbraKadabra",
                "7",
                "Abra",
                "Kadabra",
                "AbraBuzz"
        ).inOrder();
    }

    @Test
    public void givenSuspiciousRange_WhenDoingMagic_ThenTheAudienceShouldBeGivingStandingOvations() {
        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz();

        final List<String> result = fizzBuzz.doMagic(Collections.singletonList(30));

        assertThat(result).containsExactly("AbraKadabraBuzz");
    }
}
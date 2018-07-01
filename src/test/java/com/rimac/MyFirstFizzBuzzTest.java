package com.rimac;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

@RunWith(BlockJUnit4ClassRunner.class)
public class MyFirstFizzBuzzTest {
    @Test
    public void givenSomeRange_WhenDoingMagic_ThenAudienceShouldBeAmazed() {
        final int from = 1;
        final int until = 10;

        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz(new Abra(), new Kadabra(), new Alakazam());

        final List<String> result = fizzBuzz.doMagic(from, until);

        assertThat(result).containsExactly(
                "1",
                "Abra",
                "Kadabra",
                "Abra",
                "Alakazam",
                "AbraKadabra",
                "7",
                "Abra",
                "Kadabra",
                "AbraAlakazam"
        ).inOrder();
    }

    @Test
    public void givenInvalidRange_WhenDoingMagic_ThenAudienceShouldBeConfused() {
        final int from = 42;
        final int until = 13;

        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz(new Abra(), new Kadabra(), new Alakazam());

        final List<String> result = fizzBuzz.doMagic(from, until);

        assertThat(result).isEmpty();
    }

    @Test
    public void givenSuspiciousRange_WhenDoingMagic_ThenTheAudienceShouldBeGivingStandingOvations() {
        final int from = 30;
        final int until = from;

        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz(new Abra(), new Kadabra(), new Alakazam());

        final List<String> result = fizzBuzz.doMagic(from, until);

        assertThat(result).containsExactly("AbraKadabraAlakazam");
    }
}
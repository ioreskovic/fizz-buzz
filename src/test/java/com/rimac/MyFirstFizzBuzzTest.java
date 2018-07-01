package com.rimac;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

@RunWith(BlockJUnit4ClassRunner.class)
public class MyFirstFizzBuzzTest {
    @Test
    public void givenSomeRange_WhenDoingMagic_ThenAudienceShouldBeAmazed() {
        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz(new Abra(), new Kadabra(), new Alakazam());

        final List<String> result = fizzBuzz.doMagic(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

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
    public void givenSuspiciousRange_WhenDoingMagic_ThenTheAudienceShouldBeGivingStandingOvations() {
        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz(new Abra(), new Kadabra(), new Alakazam());

        final List<String> result = fizzBuzz.doMagic(Collections.singletonList(30));

        assertThat(result).containsExactly("AbraKadabraAlakazam");
    }
}
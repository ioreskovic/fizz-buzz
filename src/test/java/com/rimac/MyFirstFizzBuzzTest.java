package com.rimac;

import org.hamcrest.CoreMatchers;
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

        final MyFirstFizzBuzz fizzBuzz = new MyFirstFizzBuzz();

        final List<String> result = fizzBuzz.doMagic(from, until);

        assertThat(result).containsExactly(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz"
        ).inOrder();
    }
}
package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Functional1Test {

  private static Functional1 functional1 = new Functional1();

  @ParameterizedTest(name = "[{index}]Asserting doubling({0}) == {1}.")
  @MethodSource({"doubling"})
  void doubling(List<Integer> nums, List<Integer> expected) {
    assertArrayEquals(expected.toArray(), functional1.doubling(nums).toArray());
  }

  static Stream<Arguments> doubling() {
    return Stream.of(
        Arguments.of(Arrays.asList(1, 2, 3), List.of(2, 4, 6)),
        Arguments.of(Arrays.asList(6, 8, 6, 8, -1), List.of(12, 16, 12, 16, -2)),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList(5), List.of(10)),
        Arguments.of(Arrays.asList(5, 10), List.of(10, 20)),
        Arguments.of(Arrays.asList(8, -5, 7, 3, 109), List.of(16, -10, 14, 6, 218)),
        Arguments.of(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2),
            List.of(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4)),
        Arguments.of(Arrays.asList(3, 1, 4, 1, 5, 9), List.of(6, 2, 8, 2, 10, 18))
    );
  }
}
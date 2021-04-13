package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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

  @ParameterizedTest(name = "[{index}]Asserting square({0}) == {1}.")
  @MethodSource({"square"})
  void square(List<Integer> nums, List<Integer> expected) {
    assertArrayEquals(expected.toArray(), functional1.square(nums).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting addStar({0}) == {1}.")
  @MethodSource({"addStar"})
  void addStar(List<String> strings, List<String> expected) {
    assertArrayEquals(expected.toArray(), functional1.addStar(strings).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting copies3({0}) == {1}.")
  @MethodSource({"copies3"})
  void copies3(List<String> strings, List<String> expected) {
    assertArrayEquals(expected.toArray(), functional1.copies3(strings).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting moreY({0}) == {1}.")
  @MethodSource({"moreY"})
  void moreY(List<String> strings, List<String> expected) {
    assertArrayEquals(expected.toArray(), functional1.moreY(strings).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting math1({0}) == {1}.")
  @MethodSource({"math1"})
  void math1(List<Integer> nums, List<Integer> expected) {
    assertArrayEquals(expected.toArray(), functional1.math1(nums).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting rightDigit({0}) == {1}.")
  @MethodSource({"rightDigit"})
  void rightDigit(List<Integer> nums, List<Integer> expected) {
    assertArrayEquals(expected.toArray(), functional1.rightDigit(nums).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting lower({0}) == {1}.")
  @MethodSource({"lower"})
  void lower(List<String> strings, List<String> expected) {
    assertArrayEquals(expected.toArray(), functional1.lower(strings).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting noX({0}) == {1}.")
  @MethodSource({"noX"})
  void noX(List<String> strings, List<String> expected) {
    assertArrayEquals(expected.toArray(), functional1.noX(strings).toArray());
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

  static Stream<Arguments> square() {
    return Stream.of(
        Arguments.of(Arrays.asList(1, 2, 3), List.of(1, 4, 9)),
        Arguments.of(Arrays.asList(6, 8, -6, -8, 1), List.of(36, 64, 36, 64, 1)),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList(12), List.of(144)),
        Arguments.of(Arrays.asList(5, 10), List.of(25, 100)),
        Arguments.of(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2),
            List.of(36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4))
    );
  }

  static Stream<Arguments> addStar() {
    return Stream.of(
        Arguments.of(Arrays.asList("a", "bb", "ccc"), List.of("a*", "bb*", "ccc*")),
        Arguments.of(Arrays.asList("hello", "there"), List.of("hello*", "there*")),
        Arguments.of(Arrays.asList("*"), List.of("**")),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList("kittens", "and", "chocolate", "and"),
            List.of("kittens*", "and*", "chocolate*", "and*")),
        Arguments.of(Arrays.asList("empty", "string", ""), List.of("empty*", "string*", "*"))
    );
  }

  static Stream<Arguments> copies3() {
    return Stream.of(
        Arguments.of(Arrays.asList("a", "bb", "ccc"), List.of("aaa", "bbbbbb", "ccccccccc")),
        Arguments.of(Arrays.asList("24", "a", ""), List.of("242424", "aaa", "")),
        Arguments
            .of(Arrays.asList("hello", "there"), List.of("hellohellohello", "theretherethere")),
        Arguments.of(Arrays.asList("no"), List.of("nonono")),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList("this", "and", "that", "and"),
            List.of("thisthisthis", "andandand", "thatthatthat", "andandand"))
    );
  }

  static Stream<Arguments> moreY() {
    return Stream.of(
        Arguments.of(Arrays.asList("a", "b", "c"), List.of("yay", "yby", "ycy")),
        Arguments.of(Arrays.asList("hello", "there"), List.of("yhelloy", "ytherey")),
        Arguments.of(Arrays.asList("yay"), List.of("yyayy")),
        Arguments.of(Arrays.asList("", "a", "xx"), List.of("yy", "yay", "yxxy")),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList("xx", "yy", "zz"), List.of("yxxy", "yyyy", "yzzy"))
    );
  }

  static Stream<Arguments> math1() {
    return Stream.of(
        Arguments.of(Arrays.asList(1, 2, 3), List.of(20, 30, 40)),
        Arguments.of(Arrays.asList(6, 8, 6, 8, 1), List.of(70, 90, 70, 90, 20)),
        Arguments.of(Arrays.asList(10), List.of(110)),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList(5, 10), List.of(60, 110)),
        Arguments.of(Arrays.asList(-1, -2, -3, -2, -1), List.of(0, -10, -20, -10, 0)),
        Arguments.of(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2),
            List.of(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30))
    );
  }

  static Stream<Arguments> rightDigit() {
    return Stream.of(
        Arguments.of(Arrays.asList(1, 22, 93), List.of(1, 2, 3)),
        Arguments.of(Arrays.asList(16, 8, 886, 8, 1), List.of(6, 8, 6, 8, 1)),
        Arguments.of(Arrays.asList(10, 0), List.of(0, 0)),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList(5, 10), List.of(5, 0)),
        Arguments.of(Arrays.asList(5, 50, 500, 5000, 5000), List.of(5, 0, 0, 0, 0)),
        Arguments.of(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2),
            List.of(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2))
    );
  }

  static Stream<Arguments> lower() {
    return Stream.of(
        Arguments.of(Arrays.asList("Hello", "Hi"), List.of("hello", "hi")),
        Arguments.of(Arrays.asList("AAA", "BBB", "ccc"), List.of("aaa", "bbb", "ccc")),
        Arguments.of(Arrays.asList("KitteN", "ChocolaTE"), List.of("kitten", "chocolate")),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList("EMPTY", ""), List.of("empty", "")),
        Arguments.of(Arrays.asList("aaX", "bYb", "Ycc", "ZZZ"), List.of("aax", "byb", "ycc", "zzz"))
    );
  }

  static Stream<Arguments> noX() {
    return Stream.of(
        Arguments.of(Arrays.asList("ax", "bb", "cx"), List.of("a", "bb", "c")),
        Arguments.of(Arrays.asList("xxax", "xbxbx", "xxcx"), List.of("a", "bb", "c")),
        Arguments.of(Arrays.asList("x"), List.of("")),
        Arguments.of(Arrays.asList(""), List.of("")),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList("the", "taxi"), List.of("the", "tai")),
        Arguments.of(Arrays.asList("the", "xxtxaxixxx"), List.of("the", "tai")),
        Arguments.of(Arrays.asList("this", "is", "the", "x"), List.of("this", "is", "the", ""))
    );
  }

}
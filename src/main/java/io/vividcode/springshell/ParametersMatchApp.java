package io.vividcode.springshell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ParametersMatchApp {
  @ShellMethod("Echo1")
  public String echo1(int a, int b, int c) {
    return String.format("a = %d, b = %d, c = %d", a, b, c);
  }

  @ShellMethod("Echo2")
  public String echo2(int a, @ShellOption("--boy") int b, int c) {
    return String.format("a = %d, b = %d, c = %d", a, b, c);
  }

  @ShellMethod("Echo3")
  public String echo3(@ShellOption(arity = 3) int[] numbers) {
    return String.format("a = %d, b = %d, c = %d", numbers[0], numbers[1], numbers[2]);
  }
}

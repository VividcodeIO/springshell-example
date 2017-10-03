package io.vividcode.springshell;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ParametersValidationApp {
  @ShellMethod("String size")
  public String stringSize(@Size(min = 3, max = 16) String name) {
    return String.format("Your name is %s", name);
  }

  @ShellMethod("Number range")
  public String numberRange(@Min(10) @Max(100) int number) {
    return String.format("The number is %s", number);
  }
}

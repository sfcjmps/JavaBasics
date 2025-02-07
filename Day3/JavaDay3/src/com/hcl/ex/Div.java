package com.hcl.ex;

public class Div {
  /**
   * Catching Exceptions.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    try {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      c = a / b;
      System.out.println("Division " + c);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero is not possible");
    } catch (NumberFormatException e) {
      System.out.println("String cannot be converted to integer");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("arguments are mandetory");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Program by hcl");
    }
  }
}

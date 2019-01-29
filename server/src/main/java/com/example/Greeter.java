/**
* JAVADOC
*
*/
package com.example;
/**
* Class java Greeter
*
*/
public class Greeter {
/**
* Constructeur
*
*/
  public Greeter() {
  }
  /**
  *@param final string
  *@return string
  */
    public final String greet(final String someone) {
      return String.format("Hello Karl, %s!", someone);
  }
}

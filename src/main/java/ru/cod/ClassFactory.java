package ru.cod  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * SpRecordClientW Object
   */
  public static ru.cod.ISpRecordClientW createSpRecordClientW() {
    return COM4J.createInstance( ru.cod.ISpRecordClientW.class, "{C50AD25C-1BDA-4CF3-ADAB-3C268EE9B645}" );
  }

  /**
   * SpRecordChannelClientW Object
   */
  public static ru.cod.ISpRecordChannelClientW createSpRecordChannelClientW() {
    return COM4J.createInstance( ru.cod.ISpRecordChannelClientW.class, "{9B2B0697-FAC8-4A1F-BC39-893C1CC0A0D5}" );
  }
}

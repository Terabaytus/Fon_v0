package ru.cod  ;

import com4j.*;

/**
 * Dispatch interface for SpRecordClientW Object
 */
@IID("{46A31CD6-FE75-410C-8A8E-A4111D9C298F}")
public interface ISpRecordClientW extends Com4jObject {
  // Methods:
  /**
   * @param flags Mandatory int parameter.
   * @param username Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int connect(
    int flags,
    java.lang.String username,
    java.lang.String password);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int disconnect();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int getLibVersion();


  /**
   * @param version Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int getSpRecordVersion(
    Holder<Integer> version);


  /**
   * @param milliseconds Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  int waitMessage(
    int milliseconds);


  /**
   * @param msg Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  int peekMessage(
    java.lang.Object msg);


  /**
   * @param names Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  int getDeviceNames(
    Holder<java.lang.String> names);


  /**
   * @param deviceName Mandatory java.lang.String parameter.
   * @param deviceSupport Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  int getDeviceSupport(
    java.lang.String deviceName,
    Holder<Integer> deviceSupport);


  /**
   * @param deviceName Mandatory java.lang.String parameter.
   * @param channelFlags Mandatory int parameter.
   * @param names Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  int getDeviceChannelNames(
    java.lang.String deviceName,
    int channelFlags,
    Holder<java.lang.String> names);


  /**
   * @param channelFlags Mandatory int parameter.
   * @param names Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  int getChannelNames(
    int channelFlags,
    Holder<java.lang.String> names);


  /**
   * @param channelFlags Mandatory int parameter.
   * @param channelSupport Mandatory int parameter.
   * @param readyToCall Mandatory boolean parameter.
   * @param names Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  int getChannelNamesEx(
    int channelFlags,
    int channelSupport,
    boolean readyToCall,
    Holder<java.lang.String> names);


  /**
   * @param channelName Mandatory java.lang.String parameter.
   * @param channelFlags Mandatory int parameter.
   * @param channelSupport Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  int getChannelSupport(
    java.lang.String channelName,
    int channelFlags,
    Holder<Integer> channelSupport);


  /**
   * @param channelName Mandatory java.lang.String parameter.
   * @param channelFlags Mandatory int parameter.
   * @param lineID Mandatory Holder<java.lang.String> parameter.
   * @param lineType Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  int getChannelLine(
    java.lang.String channelName,
    int channelFlags,
    Holder<java.lang.String> lineID,
    Holder<Integer> lineType);


  /**
   * @param channelName Mandatory java.lang.String parameter.
   * @param channelFlags Mandatory int parameter.
   * @param lineType Mandatory int parameter.
   * @param lineID Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(20)
  int getLineByChannel(
    java.lang.String channelName,
    int channelFlags,
    int lineType,
    Holder<java.lang.String> lineID);


  /**
   * @param knownLineID Mandatory java.lang.String parameter.
   * @param knownLineType Mandatory int parameter.
   * @param lineID Mandatory Holder<java.lang.String> parameter.
   * @param lineType Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(21)
  int getLineByLine(
    java.lang.String knownLineID,
    int knownLineType,
    Holder<java.lang.String> lineID,
    Holder<Integer> lineType);


  /**
   * @param lineID Mandatory java.lang.String parameter.
   * @param lineType Mandatory int parameter.
   * @param channelFlags Mandatory int parameter.
   * @param channelName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(22)
  int getChannelByLine(
    java.lang.String lineID,
    int lineType,
    int channelFlags,
    Holder<java.lang.String> channelName);


  /**
   * <p>
   * Getter method for the COM property "Connected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  boolean connected();


  // Properties:
}

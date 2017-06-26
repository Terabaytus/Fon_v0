package ru.cod  ;

import com4j.*;

/**
 * Dispatch interface for SpRecordChannelClientW Object
 */
@IID("{F6CCBB8B-2372-473E-9C32-AB6FFFB87832}")
public interface ISpRecordChannelClientW extends Com4jObject {
  // Methods:
  /**
   * @param channelName Mandatory java.lang.String parameter.
   * @param flags Mandatory int parameter.
   * @param username Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int connect(
    java.lang.String channelName,
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
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  int startRecord();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  int stopRecord();


  /**
   * @param number Mandatory java.lang.String parameter.
   * @param flags Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  int dialNumber(
    java.lang.String number,
    int flags);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  int dialingCancel();


  /**
   * @param signal Mandatory java.lang.Object parameter.
   * @param flags Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  int sendAudioData(
    @MarshalAs(NativeType.VARIANT) java.lang.Object signal,
    int flags);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  int clearAudioData();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  int handsetTake();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(20)
  int handsetPut();


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(21)
  int getWriting(
    Holder<Boolean> value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(22)
  int getHandsetState(
    Holder<Boolean> value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  int getLineState(
    Holder<Boolean> value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(24)
  int getChannelHandsetState(
    Holder<Boolean> value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(25)
  int getDialing(
    Holder<Boolean> value);


  /**
   * @param value Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(26)
  int getFileName(
    Holder<java.lang.String> value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(27)
  int getDTMFDetect(
    Holder<Boolean> value);


  /**
   * @param value Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(28)
  int setDTMFDetect(
    boolean value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(29)
  int getAudioDataSubscribe(
    Holder<Boolean> value);


  /**
   * @param value Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(30)
  int setAudioDataSubscribe(
    boolean value);


  /**
   * @param value Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(31)
  int getAudioDataBufferState(
    Holder<Integer> value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(32)
  int getOutputMode(
    Holder<Boolean> value);


  /**
   * @param value Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(33)
  int setOutputMode(
    boolean value);


  /**
   * @param value Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(34)
  int getAudioVolume(
    Holder<Integer> value);


  /**
   * @param value Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(35)
  int setAudioVolume(
    int value);


  /**
   * @param value Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(36)
  int getComment(
    Holder<java.lang.String> value);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(37)
  int setComment(
    java.lang.String value);


  /**
   * @param channelSupport Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(38)
  int getChannelSupport(
    Holder<Integer> channelSupport);


  /**
   * @param deviceName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(39)
  int getDeviceName(
    Holder<java.lang.String> deviceName);


  /**
   * @param waveFormatEx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(40)
  int getOutputSpRecordWF(
    java.lang.Object waveFormatEx);


  /**
   * @param waveFormatEx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(41)
  int getInputSpRecordWF(
    java.lang.Object waveFormatEx);


  /**
   * @param waveFormatEx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(42)
  int getOutputWF(
    java.lang.Object waveFormatEx);


  /**
   * @param waveFormatEx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(43)
  int setOutputWF(
    @MarshalAs(NativeType.VARIANT) java.lang.Object waveFormatEx);


  /**
   * @param waveFormatEx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(44)
  int getInputWF(
    java.lang.Object waveFormatEx);


  /**
   * @param waveFormatEx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(239) //= 0xef. The runtime will prefer the VTID if present
  @VTID(45)
  int setInputWF(
    @MarshalAs(NativeType.VARIANT) java.lang.Object waveFormatEx);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(240) //= 0xf0. The runtime will prefer the VTID if present
  @VTID(46)
  int getEchoCancellation(
    Holder<Boolean> value);


  /**
   * @param value Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(47)
  int setEchoCancellation(
    boolean value);


  /**
   * @param value Mandatory Holder<Boolean> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(242) //= 0xf2. The runtime will prefer the VTID if present
  @VTID(48)
  int getReadyToCall(
    Holder<Boolean> value);


  /**
   * @param infoIndex Mandatory int parameter.
   * @param value Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(243) //= 0xf3. The runtime will prefer the VTID if present
  @VTID(49)
  int getInfo(
    int infoIndex,
    java.lang.Object value);


  /**
   * @param lineID Mandatory Holder<java.lang.String> parameter.
   * @param lineType Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(244) //= 0xf4. The runtime will prefer the VTID if present
  @VTID(50)
  int getChannelLine(
    Holder<java.lang.String> lineID,
    Holder<Integer> lineType);


  /**
   * @param lineType Mandatory int parameter.
   * @param lineID Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(245) //= 0xf5. The runtime will prefer the VTID if present
  @VTID(51)
  int getLineByChannel(
    int lineType,
    Holder<java.lang.String> lineID);


  /**
   * <p>
   * Getter method for the COM property "Connected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(246) //= 0xf6. The runtime will prefer the VTID if present
  @VTID(52)
  boolean connected();


  // Properties:
}

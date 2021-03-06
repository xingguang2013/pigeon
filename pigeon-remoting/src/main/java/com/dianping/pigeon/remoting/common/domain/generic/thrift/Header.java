/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dianping.pigeon.remoting.common.domain.generic.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Header implements org.apache.thrift.TBase<Header, Header._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Header");

  private static final org.apache.thrift.protocol.TField MESSAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("messageType", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField REQUEST_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("requestInfo", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField RESPONSE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("responseInfo", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TRACE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("traceInfo", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField GLOBAL_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("globalContext", org.apache.thrift.protocol.TType.MAP, (short)5);
  private static final org.apache.thrift.protocol.TField LOCAL_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("localContext", org.apache.thrift.protocol.TType.MAP, (short)6);
  private static final org.apache.thrift.protocol.TField HEARTBEAT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("heartbeatInfo", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeaderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeaderTupleSchemeFactory());
  }

  public byte messageType; // optional
  public RequestInfo requestInfo; // optional
  public ResponseInfo responseInfo; // optional
  public TraceInfo traceInfo; // optional
  public Map<String,String> globalContext; // optional
  public Map<String,String> localContext; // optional
  public HeartbeatInfo heartbeatInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE_TYPE((short)1, "messageType"),
    REQUEST_INFO((short)2, "requestInfo"),
    RESPONSE_INFO((short)3, "responseInfo"),
    TRACE_INFO((short)4, "traceInfo"),
    GLOBAL_CONTEXT((short)5, "globalContext"),
    LOCAL_CONTEXT((short)6, "localContext"),
    HEARTBEAT_INFO((short)7, "heartbeatInfo");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MESSAGE_TYPE
          return MESSAGE_TYPE;
        case 2: // REQUEST_INFO
          return REQUEST_INFO;
        case 3: // RESPONSE_INFO
          return RESPONSE_INFO;
        case 4: // TRACE_INFO
          return TRACE_INFO;
        case 5: // GLOBAL_CONTEXT
          return GLOBAL_CONTEXT;
        case 6: // LOCAL_CONTEXT
          return LOCAL_CONTEXT;
        case 7: // HEARTBEAT_INFO
          return HEARTBEAT_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MESSAGETYPE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  private _Fields optionals[] = {_Fields.MESSAGE_TYPE,_Fields.REQUEST_INFO,_Fields.RESPONSE_INFO,_Fields.TRACE_INFO,_Fields.GLOBAL_CONTEXT,_Fields.LOCAL_CONTEXT,_Fields.HEARTBEAT_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("messageType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.REQUEST_INFO, new org.apache.thrift.meta_data.FieldMetaData("requestInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RequestInfo.class)));
    tmpMap.put(_Fields.RESPONSE_INFO, new org.apache.thrift.meta_data.FieldMetaData("responseInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ResponseInfo.class)));
    tmpMap.put(_Fields.TRACE_INFO, new org.apache.thrift.meta_data.FieldMetaData("traceInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TraceInfo.class)));
    tmpMap.put(_Fields.GLOBAL_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("globalContext", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.MAP        , "Context")));
    tmpMap.put(_Fields.LOCAL_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("localContext", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.MAP        , "Context")));
    tmpMap.put(_Fields.HEARTBEAT_INFO, new org.apache.thrift.meta_data.FieldMetaData("heartbeatInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HeartbeatInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Header.class, metaDataMap);
  }

  public Header() {
    this.messageType = (byte)0;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Header(Header other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.messageType = other.messageType;
    if (other.isSetRequestInfo()) {
      this.requestInfo = new RequestInfo(other.requestInfo);
    }
    if (other.isSetResponseInfo()) {
      this.responseInfo = new ResponseInfo(other.responseInfo);
    }
    if (other.isSetTraceInfo()) {
      this.traceInfo = new TraceInfo(other.traceInfo);
    }
    if (other.isSetGlobalContext()) {
      this.globalContext = other.globalContext;
    }
    if (other.isSetLocalContext()) {
      this.localContext = other.localContext;
    }
    if (other.isSetHeartbeatInfo()) {
      this.heartbeatInfo = new HeartbeatInfo(other.heartbeatInfo);
    }
  }

  public Header deepCopy() {
    return new Header(this);
  }

  @Override
  public void clear() {
    this.messageType = (byte)0;

    this.requestInfo = null;
    this.responseInfo = null;
    this.traceInfo = null;
    this.globalContext = null;
    this.localContext = null;
    this.heartbeatInfo = null;
  }

  public byte getMessageType() {
    return this.messageType;
  }

  public Header setMessageType(byte messageType) {
    this.messageType = messageType;
    setMessageTypeIsSet(true);
    return this;
  }

  public void unsetMessageType() {
    __isset_bit_vector.clear(__MESSAGETYPE_ISSET_ID);
  }

  /** Returns true if field messageType is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageType() {
    return __isset_bit_vector.get(__MESSAGETYPE_ISSET_ID);
  }

  public void setMessageTypeIsSet(boolean value) {
    __isset_bit_vector.set(__MESSAGETYPE_ISSET_ID, value);
  }

  public RequestInfo getRequestInfo() {
    return this.requestInfo;
  }

  public Header setRequestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

  public void unsetRequestInfo() {
    this.requestInfo = null;
  }

  /** Returns true if field requestInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestInfo() {
    return this.requestInfo != null;
  }

  public void setRequestInfoIsSet(boolean value) {
    if (!value) {
      this.requestInfo = null;
    }
  }

  public ResponseInfo getResponseInfo() {
    return this.responseInfo;
  }

  public Header setResponseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
    return this;
  }

  public void unsetResponseInfo() {
    this.responseInfo = null;
  }

  /** Returns true if field responseInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseInfo() {
    return this.responseInfo != null;
  }

  public void setResponseInfoIsSet(boolean value) {
    if (!value) {
      this.responseInfo = null;
    }
  }

  public TraceInfo getTraceInfo() {
    return this.traceInfo;
  }

  public Header setTraceInfo(TraceInfo traceInfo) {
    this.traceInfo = traceInfo;
    return this;
  }

  public void unsetTraceInfo() {
    this.traceInfo = null;
  }

  /** Returns true if field traceInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetTraceInfo() {
    return this.traceInfo != null;
  }

  public void setTraceInfoIsSet(boolean value) {
    if (!value) {
      this.traceInfo = null;
    }
  }

  public int getGlobalContextSize() {
    return (this.globalContext == null) ? 0 : this.globalContext.size();
  }

  public void putToGlobalContext(String key, String val) {
    if (this.globalContext == null) {
      this.globalContext = new HashMap<String,String>();
    }
    this.globalContext.put(key, val);
  }

  public Map<String,String> getGlobalContext() {
    return this.globalContext;
  }

  public Header setGlobalContext(Map<String,String> globalContext) {
    this.globalContext = globalContext;
    return this;
  }

  public void unsetGlobalContext() {
    this.globalContext = null;
  }

  /** Returns true if field globalContext is set (has been assigned a value) and false otherwise */
  public boolean isSetGlobalContext() {
    return this.globalContext != null;
  }

  public void setGlobalContextIsSet(boolean value) {
    if (!value) {
      this.globalContext = null;
    }
  }

  public int getLocalContextSize() {
    return (this.localContext == null) ? 0 : this.localContext.size();
  }

  public void putToLocalContext(String key, String val) {
    if (this.localContext == null) {
      this.localContext = new HashMap<String,String>();
    }
    this.localContext.put(key, val);
  }

  public Map<String,String> getLocalContext() {
    return this.localContext;
  }

  public Header setLocalContext(Map<String,String> localContext) {
    this.localContext = localContext;
    return this;
  }

  public void unsetLocalContext() {
    this.localContext = null;
  }

  /** Returns true if field localContext is set (has been assigned a value) and false otherwise */
  public boolean isSetLocalContext() {
    return this.localContext != null;
  }

  public void setLocalContextIsSet(boolean value) {
    if (!value) {
      this.localContext = null;
    }
  }

  public HeartbeatInfo getHeartbeatInfo() {
    return this.heartbeatInfo;
  }

  public Header setHeartbeatInfo(HeartbeatInfo heartbeatInfo) {
    this.heartbeatInfo = heartbeatInfo;
    return this;
  }

  public void unsetHeartbeatInfo() {
    this.heartbeatInfo = null;
  }

  /** Returns true if field heartbeatInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetHeartbeatInfo() {
    return this.heartbeatInfo != null;
  }

  public void setHeartbeatInfoIsSet(boolean value) {
    if (!value) {
      this.heartbeatInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE_TYPE:
      if (value == null) {
        unsetMessageType();
      } else {
        setMessageType((Byte)value);
      }
      break;

    case REQUEST_INFO:
      if (value == null) {
        unsetRequestInfo();
      } else {
        setRequestInfo((RequestInfo)value);
      }
      break;

    case RESPONSE_INFO:
      if (value == null) {
        unsetResponseInfo();
      } else {
        setResponseInfo((ResponseInfo)value);
      }
      break;

    case TRACE_INFO:
      if (value == null) {
        unsetTraceInfo();
      } else {
        setTraceInfo((TraceInfo)value);
      }
      break;

    case GLOBAL_CONTEXT:
      if (value == null) {
        unsetGlobalContext();
      } else {
        setGlobalContext((Map<String,String>)value);
      }
      break;

    case LOCAL_CONTEXT:
      if (value == null) {
        unsetLocalContext();
      } else {
        setLocalContext((Map<String,String>)value);
      }
      break;

    case HEARTBEAT_INFO:
      if (value == null) {
        unsetHeartbeatInfo();
      } else {
        setHeartbeatInfo((HeartbeatInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_TYPE:
      return Byte.valueOf(getMessageType());

    case REQUEST_INFO:
      return getRequestInfo();

    case RESPONSE_INFO:
      return getResponseInfo();

    case TRACE_INFO:
      return getTraceInfo();

    case GLOBAL_CONTEXT:
      return getGlobalContext();

    case LOCAL_CONTEXT:
      return getLocalContext();

    case HEARTBEAT_INFO:
      return getHeartbeatInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE_TYPE:
      return isSetMessageType();
    case REQUEST_INFO:
      return isSetRequestInfo();
    case RESPONSE_INFO:
      return isSetResponseInfo();
    case TRACE_INFO:
      return isSetTraceInfo();
    case GLOBAL_CONTEXT:
      return isSetGlobalContext();
    case LOCAL_CONTEXT:
      return isSetLocalContext();
    case HEARTBEAT_INFO:
      return isSetHeartbeatInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Header)
      return this.equals((Header)that);
    return false;
  }

  public boolean equals(Header that) {
    if (that == null)
      return false;

    boolean this_present_messageType = true && this.isSetMessageType();
    boolean that_present_messageType = true && that.isSetMessageType();
    if (this_present_messageType || that_present_messageType) {
      if (!(this_present_messageType && that_present_messageType))
        return false;
      if (this.messageType != that.messageType)
        return false;
    }

    boolean this_present_requestInfo = true && this.isSetRequestInfo();
    boolean that_present_requestInfo = true && that.isSetRequestInfo();
    if (this_present_requestInfo || that_present_requestInfo) {
      if (!(this_present_requestInfo && that_present_requestInfo))
        return false;
      if (!this.requestInfo.equals(that.requestInfo))
        return false;
    }

    boolean this_present_responseInfo = true && this.isSetResponseInfo();
    boolean that_present_responseInfo = true && that.isSetResponseInfo();
    if (this_present_responseInfo || that_present_responseInfo) {
      if (!(this_present_responseInfo && that_present_responseInfo))
        return false;
      if (!this.responseInfo.equals(that.responseInfo))
        return false;
    }

    boolean this_present_traceInfo = true && this.isSetTraceInfo();
    boolean that_present_traceInfo = true && that.isSetTraceInfo();
    if (this_present_traceInfo || that_present_traceInfo) {
      if (!(this_present_traceInfo && that_present_traceInfo))
        return false;
      if (!this.traceInfo.equals(that.traceInfo))
        return false;
    }

    boolean this_present_globalContext = true && this.isSetGlobalContext();
    boolean that_present_globalContext = true && that.isSetGlobalContext();
    if (this_present_globalContext || that_present_globalContext) {
      if (!(this_present_globalContext && that_present_globalContext))
        return false;
      if (!this.globalContext.equals(that.globalContext))
        return false;
    }

    boolean this_present_localContext = true && this.isSetLocalContext();
    boolean that_present_localContext = true && that.isSetLocalContext();
    if (this_present_localContext || that_present_localContext) {
      if (!(this_present_localContext && that_present_localContext))
        return false;
      if (!this.localContext.equals(that.localContext))
        return false;
    }

    boolean this_present_heartbeatInfo = true && this.isSetHeartbeatInfo();
    boolean that_present_heartbeatInfo = true && that.isSetHeartbeatInfo();
    if (this_present_heartbeatInfo || that_present_heartbeatInfo) {
      if (!(this_present_heartbeatInfo && that_present_heartbeatInfo))
        return false;
      if (!this.heartbeatInfo.equals(that.heartbeatInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Header other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Header typedOther = (Header)other;

    lastComparison = Boolean.valueOf(isSetMessageType()).compareTo(typedOther.isSetMessageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageType, typedOther.messageType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestInfo()).compareTo(typedOther.isSetRequestInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestInfo, typedOther.requestInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponseInfo()).compareTo(typedOther.isSetResponseInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseInfo, typedOther.responseInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraceInfo()).compareTo(typedOther.isSetTraceInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traceInfo, typedOther.traceInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGlobalContext()).compareTo(typedOther.isSetGlobalContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGlobalContext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.globalContext, typedOther.globalContext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocalContext()).compareTo(typedOther.isSetLocalContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocalContext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.localContext, typedOther.localContext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeartbeatInfo()).compareTo(typedOther.isSetHeartbeatInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeartbeatInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.heartbeatInfo, typedOther.heartbeatInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Header(");
    boolean first = true;

    if (isSetMessageType()) {
      sb.append("messageType:");
      sb.append(this.messageType);
      first = false;
    }
    if (isSetRequestInfo()) {
      if (!first) sb.append(", ");
      sb.append("requestInfo:");
      if (this.requestInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.requestInfo);
      }
      first = false;
    }
    if (isSetResponseInfo()) {
      if (!first) sb.append(", ");
      sb.append("responseInfo:");
      if (this.responseInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.responseInfo);
      }
      first = false;
    }
    if (isSetTraceInfo()) {
      if (!first) sb.append(", ");
      sb.append("traceInfo:");
      if (this.traceInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.traceInfo);
      }
      first = false;
    }
    if (isSetGlobalContext()) {
      if (!first) sb.append(", ");
      sb.append("globalContext:");
      if (this.globalContext == null) {
        sb.append("null");
      } else {
        sb.append(this.globalContext);
      }
      first = false;
    }
    if (isSetLocalContext()) {
      if (!first) sb.append(", ");
      sb.append("localContext:");
      if (this.localContext == null) {
        sb.append("null");
      } else {
        sb.append(this.localContext);
      }
      first = false;
    }
    if (isSetHeartbeatInfo()) {
      if (!first) sb.append(", ");
      sb.append("heartbeatInfo:");
      if (this.heartbeatInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.heartbeatInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HeaderStandardSchemeFactory implements SchemeFactory {
    public HeaderStandardScheme getScheme() {
      return new HeaderStandardScheme();
    }
  }

  private static class HeaderStandardScheme extends StandardScheme<Header> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Header struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.messageType = iprot.readByte();
              struct.setMessageTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUEST_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.requestInfo = new RequestInfo();
              struct.requestInfo.read(iprot);
              struct.setRequestInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESPONSE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.responseInfo = new ResponseInfo();
              struct.responseInfo.read(iprot);
              struct.setResponseInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRACE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.traceInfo = new TraceInfo();
              struct.traceInfo.read(iprot);
              struct.setTraceInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GLOBAL_CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.globalContext = new HashMap<String,String>(2*_map10.size);
                for (int _i11 = 0; _i11 < _map10.size; ++_i11)
                {
                  String _key12; // required
                  String _val13; // required
                  _key12 = iprot.readString();
                  _val13 = iprot.readString();
                  struct.globalContext.put(_key12, _val13);
                }
                iprot.readMapEnd();
              }
              struct.setGlobalContextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LOCAL_CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map14 = iprot.readMapBegin();
                struct.localContext = new HashMap<String,String>(2*_map14.size);
                for (int _i15 = 0; _i15 < _map14.size; ++_i15)
                {
                  String _key16; // required
                  String _val17; // required
                  _key16 = iprot.readString();
                  _val17 = iprot.readString();
                  struct.localContext.put(_key16, _val17);
                }
                iprot.readMapEnd();
              }
              struct.setLocalContextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // HEARTBEAT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.heartbeatInfo = new HeartbeatInfo();
              struct.heartbeatInfo.read(iprot);
              struct.setHeartbeatInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Header struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetMessageType()) {
        oprot.writeFieldBegin(MESSAGE_TYPE_FIELD_DESC);
        oprot.writeByte(struct.messageType);
        oprot.writeFieldEnd();
      }
      if (struct.requestInfo != null) {
        if (struct.isSetRequestInfo()) {
          oprot.writeFieldBegin(REQUEST_INFO_FIELD_DESC);
          struct.requestInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.responseInfo != null) {
        if (struct.isSetResponseInfo()) {
          oprot.writeFieldBegin(RESPONSE_INFO_FIELD_DESC);
          struct.responseInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.traceInfo != null) {
        if (struct.isSetTraceInfo()) {
          oprot.writeFieldBegin(TRACE_INFO_FIELD_DESC);
          struct.traceInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.globalContext != null) {
        if (struct.isSetGlobalContext()) {
          oprot.writeFieldBegin(GLOBAL_CONTEXT_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.globalContext.size()));
            for (Map.Entry<String, String> _iter18 : struct.globalContext.entrySet())
            {
              oprot.writeString(_iter18.getKey());
              oprot.writeString(_iter18.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.localContext != null) {
        if (struct.isSetLocalContext()) {
          oprot.writeFieldBegin(LOCAL_CONTEXT_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.localContext.size()));
            for (Map.Entry<String, String> _iter19 : struct.localContext.entrySet())
            {
              oprot.writeString(_iter19.getKey());
              oprot.writeString(_iter19.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.heartbeatInfo != null) {
        if (struct.isSetHeartbeatInfo()) {
          oprot.writeFieldBegin(HEARTBEAT_INFO_FIELD_DESC);
          struct.heartbeatInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeaderTupleSchemeFactory implements SchemeFactory {
    public HeaderTupleScheme getScheme() {
      return new HeaderTupleScheme();
    }
  }

  private static class HeaderTupleScheme extends TupleScheme<Header> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Header struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMessageType()) {
        optionals.set(0);
      }
      if (struct.isSetRequestInfo()) {
        optionals.set(1);
      }
      if (struct.isSetResponseInfo()) {
        optionals.set(2);
      }
      if (struct.isSetTraceInfo()) {
        optionals.set(3);
      }
      if (struct.isSetGlobalContext()) {
        optionals.set(4);
      }
      if (struct.isSetLocalContext()) {
        optionals.set(5);
      }
      if (struct.isSetHeartbeatInfo()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetMessageType()) {
        oprot.writeByte(struct.messageType);
      }
      if (struct.isSetRequestInfo()) {
        struct.requestInfo.write(oprot);
      }
      if (struct.isSetResponseInfo()) {
        struct.responseInfo.write(oprot);
      }
      if (struct.isSetTraceInfo()) {
        struct.traceInfo.write(oprot);
      }
      if (struct.isSetGlobalContext()) {
        {
          oprot.writeI32(struct.globalContext.size());
          for (Map.Entry<String, String> _iter20 : struct.globalContext.entrySet())
          {
            oprot.writeString(_iter20.getKey());
            oprot.writeString(_iter20.getValue());
          }
        }
      }
      if (struct.isSetLocalContext()) {
        {
          oprot.writeI32(struct.localContext.size());
          for (Map.Entry<String, String> _iter21 : struct.localContext.entrySet())
          {
            oprot.writeString(_iter21.getKey());
            oprot.writeString(_iter21.getValue());
          }
        }
      }
      if (struct.isSetHeartbeatInfo()) {
        struct.heartbeatInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Header struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.messageType = iprot.readByte();
        struct.setMessageTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.requestInfo = new RequestInfo();
        struct.requestInfo.read(iprot);
        struct.setRequestInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.responseInfo = new ResponseInfo();
        struct.responseInfo.read(iprot);
        struct.setResponseInfoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.traceInfo = new TraceInfo();
        struct.traceInfo.read(iprot);
        struct.setTraceInfoIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map22 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.globalContext = new HashMap<String,String>(2*_map22.size);
          for (int _i23 = 0; _i23 < _map22.size; ++_i23)
          {
            String _key24; // required
            String _val25; // required
            _key24 = iprot.readString();
            _val25 = iprot.readString();
            struct.globalContext.put(_key24, _val25);
          }
        }
        struct.setGlobalContextIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map26 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.localContext = new HashMap<String,String>(2*_map26.size);
          for (int _i27 = 0; _i27 < _map26.size; ++_i27)
          {
            String _key28; // required
            String _val29; // required
            _key28 = iprot.readString();
            _val29 = iprot.readString();
            struct.localContext.put(_key28, _val29);
          }
        }
        struct.setLocalContextIsSet(true);
      }
      if (incoming.get(6)) {
        struct.heartbeatInfo = new HeartbeatInfo();
        struct.heartbeatInfo.read(iprot);
        struct.setHeartbeatInfoIsSet(true);
      }
    }
  }

}


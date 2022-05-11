// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/remoteexecution/v1test/remote_execution.proto

package com.google.devtools.remoteexecution.v1test;

/**
 * <pre>
 * A request message for
 * [Execution.Execute][google.devtools.remoteexecution.v1test.Execution.Execute].
 * </pre>
 *
 * Protobuf type {@code google.devtools.remoteexecution.v1test.ExecuteRequest}
 */
public final class ExecuteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.remoteexecution.v1test.ExecuteRequest)
    ExecuteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteRequest.newBuilder() to construct.
  private ExecuteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteRequest() {
    instanceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecuteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecuteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            instanceName_ = s;
            break;
          }
          case 18: {
            com.google.devtools.remoteexecution.v1test.Action.Builder subBuilder = null;
            if (action_ != null) {
              subBuilder = action_.toBuilder();
            }
            action_ = input.readMessage(com.google.devtools.remoteexecution.v1test.Action.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(action_);
              action_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            skipCacheLookup_ = input.readBool();
            break;
          }
          case 32: {

            totalInputFileCount_ = input.readInt32();
            break;
          }
          case 40: {

            totalInputFileBytes_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_ExecuteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_ExecuteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.remoteexecution.v1test.ExecuteRequest.class, com.google.devtools.remoteexecution.v1test.ExecuteRequest.Builder.class);
  }

  public static final int INSTANCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object instanceName_;
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   * @return The instanceName.
   */
  @java.lang.Override
  public java.lang.String getInstanceName() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   * @return The bytes for instanceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceNameBytes() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private com.google.devtools.remoteexecution.v1test.Action action_;
  /**
   * <pre>
   * The action to be performed.
   * </pre>
   *
   * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override
  public boolean hasAction() {
    return action_ != null;
  }
  /**
   * <pre>
   * The action to be performed.
   * </pre>
   *
   * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
   * @return The action.
   */
  @java.lang.Override
  public com.google.devtools.remoteexecution.v1test.Action getAction() {
    return action_ == null ? com.google.devtools.remoteexecution.v1test.Action.getDefaultInstance() : action_;
  }
  /**
   * <pre>
   * The action to be performed.
   * </pre>
   *
   * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.remoteexecution.v1test.ActionOrBuilder getActionOrBuilder() {
    return getAction();
  }

  public static final int SKIP_CACHE_LOOKUP_FIELD_NUMBER = 3;
  private boolean skipCacheLookup_;
  /**
   * <pre>
   * If true, the action will be executed anew even if its result was already
   * present in the cache. If false, the result may be served from the
   * [ActionCache][google.devtools.remoteexecution.v1test.ActionCache].
   * </pre>
   *
   * <code>bool skip_cache_lookup = 3;</code>
   * @return The skipCacheLookup.
   */
  @java.lang.Override
  public boolean getSkipCacheLookup() {
    return skipCacheLookup_;
  }

  public static final int TOTAL_INPUT_FILE_COUNT_FIELD_NUMBER = 4;
  private int totalInputFileCount_;
  /**
   * <pre>
   * DEPRECATED: This field should be ignored by clients and servers and will be
   * removed.
   * </pre>
   *
   * <code>int32 total_input_file_count = 4;</code>
   * @return The totalInputFileCount.
   */
  @java.lang.Override
  public int getTotalInputFileCount() {
    return totalInputFileCount_;
  }

  public static final int TOTAL_INPUT_FILE_BYTES_FIELD_NUMBER = 5;
  private long totalInputFileBytes_;
  /**
   * <pre>
   * DEPRECATED: This field should be ignored by clients and servers and will be
   * removed.
   * </pre>
   *
   * <code>int64 total_input_file_bytes = 5;</code>
   * @return The totalInputFileBytes.
   */
  @java.lang.Override
  public long getTotalInputFileBytes() {
    return totalInputFileBytes_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getInstanceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceName_);
    }
    if (action_ != null) {
      output.writeMessage(2, getAction());
    }
    if (skipCacheLookup_ != false) {
      output.writeBool(3, skipCacheLookup_);
    }
    if (totalInputFileCount_ != 0) {
      output.writeInt32(4, totalInputFileCount_);
    }
    if (totalInputFileBytes_ != 0L) {
      output.writeInt64(5, totalInputFileBytes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInstanceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceName_);
    }
    if (action_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAction());
    }
    if (skipCacheLookup_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, skipCacheLookup_);
    }
    if (totalInputFileCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, totalInputFileCount_);
    }
    if (totalInputFileBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, totalInputFileBytes_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.remoteexecution.v1test.ExecuteRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.remoteexecution.v1test.ExecuteRequest other = (com.google.devtools.remoteexecution.v1test.ExecuteRequest) obj;

    if (!getInstanceName()
        .equals(other.getInstanceName())) return false;
    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (!getAction()
          .equals(other.getAction())) return false;
    }
    if (getSkipCacheLookup()
        != other.getSkipCacheLookup()) return false;
    if (getTotalInputFileCount()
        != other.getTotalInputFileCount()) return false;
    if (getTotalInputFileBytes()
        != other.getTotalInputFileBytes()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INSTANCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceName().hashCode();
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    hash = (37 * hash) + SKIP_CACHE_LOOKUP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSkipCacheLookup());
    hash = (37 * hash) + TOTAL_INPUT_FILE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalInputFileCount();
    hash = (37 * hash) + TOTAL_INPUT_FILE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalInputFileBytes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.remoteexecution.v1test.ExecuteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A request message for
   * [Execution.Execute][google.devtools.remoteexecution.v1test.Execution.Execute].
   * </pre>
   *
   * Protobuf type {@code google.devtools.remoteexecution.v1test.ExecuteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.remoteexecution.v1test.ExecuteRequest)
      com.google.devtools.remoteexecution.v1test.ExecuteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_ExecuteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_ExecuteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.remoteexecution.v1test.ExecuteRequest.class, com.google.devtools.remoteexecution.v1test.ExecuteRequest.Builder.class);
    }

    // Construct using com.google.devtools.remoteexecution.v1test.ExecuteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instanceName_ = "";

      if (actionBuilder_ == null) {
        action_ = null;
      } else {
        action_ = null;
        actionBuilder_ = null;
      }
      skipCacheLookup_ = false;

      totalInputFileCount_ = 0;

      totalInputFileBytes_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_ExecuteRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.remoteexecution.v1test.ExecuteRequest getDefaultInstanceForType() {
      return com.google.devtools.remoteexecution.v1test.ExecuteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.remoteexecution.v1test.ExecuteRequest build() {
      com.google.devtools.remoteexecution.v1test.ExecuteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.remoteexecution.v1test.ExecuteRequest buildPartial() {
      com.google.devtools.remoteexecution.v1test.ExecuteRequest result = new com.google.devtools.remoteexecution.v1test.ExecuteRequest(this);
      result.instanceName_ = instanceName_;
      if (actionBuilder_ == null) {
        result.action_ = action_;
      } else {
        result.action_ = actionBuilder_.build();
      }
      result.skipCacheLookup_ = skipCacheLookup_;
      result.totalInputFileCount_ = totalInputFileCount_;
      result.totalInputFileBytes_ = totalInputFileBytes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.remoteexecution.v1test.ExecuteRequest) {
        return mergeFrom((com.google.devtools.remoteexecution.v1test.ExecuteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.remoteexecution.v1test.ExecuteRequest other) {
      if (other == com.google.devtools.remoteexecution.v1test.ExecuteRequest.getDefaultInstance()) return this;
      if (!other.getInstanceName().isEmpty()) {
        instanceName_ = other.instanceName_;
        onChanged();
      }
      if (other.hasAction()) {
        mergeAction(other.getAction());
      }
      if (other.getSkipCacheLookup() != false) {
        setSkipCacheLookup(other.getSkipCacheLookup());
      }
      if (other.getTotalInputFileCount() != 0) {
        setTotalInputFileCount(other.getTotalInputFileCount());
      }
      if (other.getTotalInputFileBytes() != 0L) {
        setTotalInputFileBytes(other.getTotalInputFileBytes());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.remoteexecution.v1test.ExecuteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.remoteexecution.v1test.ExecuteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object instanceName_ = "";
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     * @return The instanceName.
     */
    public java.lang.String getInstanceName() {
      java.lang.Object ref = instanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     * @return The bytes for instanceName.
     */
    public com.google.protobuf.ByteString
        getInstanceNameBytes() {
      java.lang.Object ref = instanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     * @param value The instanceName to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstanceName() {
      
      instanceName_ = getDefaultInstance().getInstanceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     * @param value The bytes for instanceName to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceName_ = value;
      onChanged();
      return this;
    }

    private com.google.devtools.remoteexecution.v1test.Action action_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.remoteexecution.v1test.Action, com.google.devtools.remoteexecution.v1test.Action.Builder, com.google.devtools.remoteexecution.v1test.ActionOrBuilder> actionBuilder_;
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     * @return Whether the action field is set.
     */
    public boolean hasAction() {
      return actionBuilder_ != null || action_ != null;
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     * @return The action.
     */
    public com.google.devtools.remoteexecution.v1test.Action getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? com.google.devtools.remoteexecution.v1test.Action.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     */
    public Builder setAction(com.google.devtools.remoteexecution.v1test.Action value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        actionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     */
    public Builder setAction(
        com.google.devtools.remoteexecution.v1test.Action.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     */
    public Builder mergeAction(com.google.devtools.remoteexecution.v1test.Action value) {
      if (actionBuilder_ == null) {
        if (action_ != null) {
          action_ =
            com.google.devtools.remoteexecution.v1test.Action.newBuilder(action_).mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        actionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     */
    public Builder clearAction() {
      if (actionBuilder_ == null) {
        action_ = null;
        onChanged();
      } else {
        action_ = null;
        actionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     */
    public com.google.devtools.remoteexecution.v1test.Action.Builder getActionBuilder() {
      
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     */
    public com.google.devtools.remoteexecution.v1test.ActionOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            com.google.devtools.remoteexecution.v1test.Action.getDefaultInstance() : action_;
      }
    }
    /**
     * <pre>
     * The action to be performed.
     * </pre>
     *
     * <code>.google.devtools.remoteexecution.v1test.Action action = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.remoteexecution.v1test.Action, com.google.devtools.remoteexecution.v1test.Action.Builder, com.google.devtools.remoteexecution.v1test.ActionOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.remoteexecution.v1test.Action, com.google.devtools.remoteexecution.v1test.Action.Builder, com.google.devtools.remoteexecution.v1test.ActionOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
    }

    private boolean skipCacheLookup_ ;
    /**
     * <pre>
     * If true, the action will be executed anew even if its result was already
     * present in the cache. If false, the result may be served from the
     * [ActionCache][google.devtools.remoteexecution.v1test.ActionCache].
     * </pre>
     *
     * <code>bool skip_cache_lookup = 3;</code>
     * @return The skipCacheLookup.
     */
    @java.lang.Override
    public boolean getSkipCacheLookup() {
      return skipCacheLookup_;
    }
    /**
     * <pre>
     * If true, the action will be executed anew even if its result was already
     * present in the cache. If false, the result may be served from the
     * [ActionCache][google.devtools.remoteexecution.v1test.ActionCache].
     * </pre>
     *
     * <code>bool skip_cache_lookup = 3;</code>
     * @param value The skipCacheLookup to set.
     * @return This builder for chaining.
     */
    public Builder setSkipCacheLookup(boolean value) {
      
      skipCacheLookup_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the action will be executed anew even if its result was already
     * present in the cache. If false, the result may be served from the
     * [ActionCache][google.devtools.remoteexecution.v1test.ActionCache].
     * </pre>
     *
     * <code>bool skip_cache_lookup = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkipCacheLookup() {
      
      skipCacheLookup_ = false;
      onChanged();
      return this;
    }

    private int totalInputFileCount_ ;
    /**
     * <pre>
     * DEPRECATED: This field should be ignored by clients and servers and will be
     * removed.
     * </pre>
     *
     * <code>int32 total_input_file_count = 4;</code>
     * @return The totalInputFileCount.
     */
    @java.lang.Override
    public int getTotalInputFileCount() {
      return totalInputFileCount_;
    }
    /**
     * <pre>
     * DEPRECATED: This field should be ignored by clients and servers and will be
     * removed.
     * </pre>
     *
     * <code>int32 total_input_file_count = 4;</code>
     * @param value The totalInputFileCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalInputFileCount(int value) {
      
      totalInputFileCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DEPRECATED: This field should be ignored by clients and servers and will be
     * removed.
     * </pre>
     *
     * <code>int32 total_input_file_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalInputFileCount() {
      
      totalInputFileCount_ = 0;
      onChanged();
      return this;
    }

    private long totalInputFileBytes_ ;
    /**
     * <pre>
     * DEPRECATED: This field should be ignored by clients and servers and will be
     * removed.
     * </pre>
     *
     * <code>int64 total_input_file_bytes = 5;</code>
     * @return The totalInputFileBytes.
     */
    @java.lang.Override
    public long getTotalInputFileBytes() {
      return totalInputFileBytes_;
    }
    /**
     * <pre>
     * DEPRECATED: This field should be ignored by clients and servers and will be
     * removed.
     * </pre>
     *
     * <code>int64 total_input_file_bytes = 5;</code>
     * @param value The totalInputFileBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTotalInputFileBytes(long value) {
      
      totalInputFileBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DEPRECATED: This field should be ignored by clients and servers and will be
     * removed.
     * </pre>
     *
     * <code>int64 total_input_file_bytes = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalInputFileBytes() {
      
      totalInputFileBytes_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.remoteexecution.v1test.ExecuteRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.remoteexecution.v1test.ExecuteRequest)
  private static final com.google.devtools.remoteexecution.v1test.ExecuteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.remoteexecution.v1test.ExecuteRequest();
  }

  public static com.google.devtools.remoteexecution.v1test.ExecuteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteRequest>() {
    @java.lang.Override
    public ExecuteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecuteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecuteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecuteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.remoteexecution.v1test.ExecuteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * An `ExecutionPolicy` can be used to control the scheduling of the action.
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.ExecutionPolicy}
 */
public final class ExecutionPolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.ExecutionPolicy)
    ExecutionPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecutionPolicy.newBuilder() to construct.
  private ExecutionPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecutionPolicy() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecutionPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecutionPolicy(
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
          case 8: {

            priority_ = input.readInt32();
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
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecutionPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecutionPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.ExecutionPolicy.class, build.bazel.remote.execution.v2.ExecutionPolicy.Builder.class);
  }

  public static final int PRIORITY_FIELD_NUMBER = 1;
  private int priority_;
  /**
   * <pre>
   * The priority (relative importance) of this action. Generally, a lower value
   * means that the action should be run sooner than actions having a greater
   * priority value, but the interpretation of a given value is server-
   * dependent. A priority of 0 means the *default* priority. Priorities may be
   * positive or negative, and such actions should run later or sooner than
   * actions having the default priority, respectively. The particular semantics
   * of this field is up to the server. In particular, every server will have
   * their own supported range of priorities, and will decide how these map into
   * scheduling policy.
   * </pre>
   *
   * <code>int32 priority = 1;</code>
   * @return The priority.
   */
  @java.lang.Override
  public int getPriority() {
    return priority_;
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
    if (priority_ != 0) {
      output.writeInt32(1, priority_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, priority_);
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
    if (!(obj instanceof build.bazel.remote.execution.v2.ExecutionPolicy)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.ExecutionPolicy other = (build.bazel.remote.execution.v2.ExecutionPolicy) obj;

    if (getPriority()
        != other.getPriority()) return false;
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
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ExecutionPolicy parseFrom(
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
  public static Builder newBuilder(build.bazel.remote.execution.v2.ExecutionPolicy prototype) {
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
   * An `ExecutionPolicy` can be used to control the scheduling of the action.
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.ExecutionPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.ExecutionPolicy)
      build.bazel.remote.execution.v2.ExecutionPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecutionPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecutionPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.ExecutionPolicy.class, build.bazel.remote.execution.v2.ExecutionPolicy.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.ExecutionPolicy.newBuilder()
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
      priority_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecutionPolicy_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ExecutionPolicy getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.ExecutionPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ExecutionPolicy build() {
      build.bazel.remote.execution.v2.ExecutionPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ExecutionPolicy buildPartial() {
      build.bazel.remote.execution.v2.ExecutionPolicy result = new build.bazel.remote.execution.v2.ExecutionPolicy(this);
      result.priority_ = priority_;
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
      if (other instanceof build.bazel.remote.execution.v2.ExecutionPolicy) {
        return mergeFrom((build.bazel.remote.execution.v2.ExecutionPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.ExecutionPolicy other) {
      if (other == build.bazel.remote.execution.v2.ExecutionPolicy.getDefaultInstance()) return this;
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
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
      build.bazel.remote.execution.v2.ExecutionPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.ExecutionPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int priority_ ;
    /**
     * <pre>
     * The priority (relative importance) of this action. Generally, a lower value
     * means that the action should be run sooner than actions having a greater
     * priority value, but the interpretation of a given value is server-
     * dependent. A priority of 0 means the *default* priority. Priorities may be
     * positive or negative, and such actions should run later or sooner than
     * actions having the default priority, respectively. The particular semantics
     * of this field is up to the server. In particular, every server will have
     * their own supported range of priorities, and will decide how these map into
     * scheduling policy.
     * </pre>
     *
     * <code>int32 priority = 1;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * The priority (relative importance) of this action. Generally, a lower value
     * means that the action should be run sooner than actions having a greater
     * priority value, but the interpretation of a given value is server-
     * dependent. A priority of 0 means the *default* priority. Priorities may be
     * positive or negative, and such actions should run later or sooner than
     * actions having the default priority, respectively. The particular semantics
     * of this field is up to the server. In particular, every server will have
     * their own supported range of priorities, and will decide how these map into
     * scheduling policy.
     * </pre>
     *
     * <code>int32 priority = 1;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The priority (relative importance) of this action. Generally, a lower value
     * means that the action should be run sooner than actions having a greater
     * priority value, but the interpretation of a given value is server-
     * dependent. A priority of 0 means the *default* priority. Priorities may be
     * positive or negative, and such actions should run later or sooner than
     * actions having the default priority, respectively. The particular semantics
     * of this field is up to the server. In particular, every server will have
     * their own supported range of priorities, and will decide how these map into
     * scheduling policy.
     * </pre>
     *
     * <code>int32 priority = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      
      priority_ = 0;
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


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.ExecutionPolicy)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.ExecutionPolicy)
  private static final build.bazel.remote.execution.v2.ExecutionPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.ExecutionPolicy();
  }

  public static build.bazel.remote.execution.v2.ExecutionPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecutionPolicy>
      PARSER = new com.google.protobuf.AbstractParser<ExecutionPolicy>() {
    @java.lang.Override
    public ExecutionPolicy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecutionPolicy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecutionPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecutionPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.ExecutionPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


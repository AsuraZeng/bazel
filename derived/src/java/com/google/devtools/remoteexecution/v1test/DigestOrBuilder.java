// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/remoteexecution/v1test/remote_execution.proto

package com.google.devtools.remoteexecution.v1test;

public interface DigestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.remoteexecution.v1test.Digest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hash. In the case of SHA-256, it will always be a lowercase hex string
   * exactly 64 characters long.
   * </pre>
   *
   * <code>string hash = 1;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * The hash. In the case of SHA-256, it will always be a lowercase hex string
   * exactly 64 characters long.
   * </pre>
   *
   * <code>string hash = 1;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <pre>
   * The size of the blob, in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 2;</code>
   * @return The sizeBytes.
   */
  long getSizeBytes();
}

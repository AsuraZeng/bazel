// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/google/devtools/build/lib/packages/metrics/package_metrics.proto

package com.google.devtools.build.lib.packages.metrics;

public final class PackageMetricsOuterClass {
  private PackageMetricsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_devtools_build_lib_packages_metrics_PackageMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_devtools_build_lib_packages_metrics_PackageMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nRsrc/main/java/com/google/devtools/buil" +
      "d/lib/packages/metrics/package_metrics.p" +
      "roto\022#devtools.build.lib.packages.metric" +
      "s\032\036google/protobuf/duration.proto\"\236\001\n\016Pa" +
      "ckageMetrics\022\014\n\004name\030\001 \001(\t\0220\n\rload_durat" +
      "ion\030\002 \001(\0132\031.google.protobuf.Duration\022\023\n\013" +
      "num_targets\030\003 \001(\004\022\031\n\021computation_steps\030\004" +
      " \001(\004\022\034\n\024num_transitive_loads\030\005 \001(\004B2\n.co" +
      "m.google.devtools.build.lib.packages.met" +
      "ricsP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_devtools_build_lib_packages_metrics_PackageMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_devtools_build_lib_packages_metrics_PackageMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_devtools_build_lib_packages_metrics_PackageMetrics_descriptor,
        new java.lang.String[] { "Name", "LoadDuration", "NumTargets", "ComputationSteps", "NumTransitiveLoads", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

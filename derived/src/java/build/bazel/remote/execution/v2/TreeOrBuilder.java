// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

public interface TreeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.Tree)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The root directory in the tree.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Directory root = 1;</code>
   * @return Whether the root field is set.
   */
  boolean hasRoot();
  /**
   * <pre>
   * The root directory in the tree.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Directory root = 1;</code>
   * @return The root.
   */
  build.bazel.remote.execution.v2.Directory getRoot();
  /**
   * <pre>
   * The root directory in the tree.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Directory root = 1;</code>
   */
  build.bazel.remote.execution.v2.DirectoryOrBuilder getRootOrBuilder();

  /**
   * <pre>
   * All the child directories: the directories referred to by the root and,
   * recursively, all its children. In order to reconstruct the directory tree,
   * the client must take the digests of each of the child directories and then
   * build up a tree starting from the `root`.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Directory children = 2;</code>
   */
  java.util.List<build.bazel.remote.execution.v2.Directory> 
      getChildrenList();
  /**
   * <pre>
   * All the child directories: the directories referred to by the root and,
   * recursively, all its children. In order to reconstruct the directory tree,
   * the client must take the digests of each of the child directories and then
   * build up a tree starting from the `root`.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Directory children = 2;</code>
   */
  build.bazel.remote.execution.v2.Directory getChildren(int index);
  /**
   * <pre>
   * All the child directories: the directories referred to by the root and,
   * recursively, all its children. In order to reconstruct the directory tree,
   * the client must take the digests of each of the child directories and then
   * build up a tree starting from the `root`.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Directory children = 2;</code>
   */
  int getChildrenCount();
  /**
   * <pre>
   * All the child directories: the directories referred to by the root and,
   * recursively, all its children. In order to reconstruct the directory tree,
   * the client must take the digests of each of the child directories and then
   * build up a tree starting from the `root`.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Directory children = 2;</code>
   */
  java.util.List<? extends build.bazel.remote.execution.v2.DirectoryOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <pre>
   * All the child directories: the directories referred to by the root and,
   * recursively, all its children. In order to reconstruct the directory tree,
   * the client must take the digests of each of the child directories and then
   * build up a tree starting from the `root`.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Directory children = 2;</code>
   */
  build.bazel.remote.execution.v2.DirectoryOrBuilder getChildrenOrBuilder(
      int index);
}

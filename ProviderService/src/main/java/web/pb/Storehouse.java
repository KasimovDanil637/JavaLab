// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storehouse.proto

package web.pb;

public final class Storehouse {
  private Storehouse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProviderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProviderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProviderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProviderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020storehouse.proto\".\n\017ProviderRequest\022\014\n" +
      "\004name\030\001 \001(\t\022\r\n\005count\030\002 \001(\003\"\036\n\020ProviderRe" +
      "sponse\022\n\n\002id\030\001 \001(\0032I\n\021StorehouseService\022" +
      "4\n\013addNewMerch\022\020.ProviderRequest\032\021.Provi" +
      "derResponse\"\000B\n\n\006web.pbP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ProviderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProviderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProviderRequest_descriptor,
        new java.lang.String[] { "Name", "Count", });
    internal_static_ProviderResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ProviderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProviderResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

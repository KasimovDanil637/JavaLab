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
    internal_static_StorehouseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StorehouseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StorehouseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StorehouseResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020storehouse.proto\"\037\n\021StorehouseRequest\022" +
      "\n\n\002id\030\001 \001(\003\"#\n\022StorehouseResponse\022\r\n\005isH" +
      "as\030\001 \001(\0102V\n\021StorehouseService\022A\n\024GetMerc" +
      "hAvailability\022\022.StorehouseRequest\032\023.Stor" +
      "ehouseResponse\"\000B\n\n\006web.pbP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StorehouseRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StorehouseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StorehouseRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_StorehouseResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_StorehouseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StorehouseResponse_descriptor,
        new java.lang.String[] { "IsHas", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

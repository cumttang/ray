// automatically generated by the FlatBuffers compiler, do not modify
package org.ray.runtime.generated;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class TaskInfo extends Table {
  public static TaskInfo getRootAsTaskInfo(ByteBuffer _bb) { return getRootAsTaskInfo(_bb, new TaskInfo()); }
  public static TaskInfo getRootAsTaskInfo(ByteBuffer _bb, TaskInfo obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public TaskInfo __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String driverId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer driverIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer driverIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String taskId() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer taskIdAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer taskIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String parentTaskId() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer parentTaskIdAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer parentTaskIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public int parentCounter() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String actorCreationId() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer actorCreationIdAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer actorCreationIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public String actorCreationDummyObjectId() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer actorCreationDummyObjectIdAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer actorCreationDummyObjectIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }
  public int maxActorReconstructions() { int o = __offset(16); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String actorId() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer actorIdAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer actorIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }
  public String actorHandleId() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer actorHandleIdAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public ByteBuffer actorHandleIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 1); }
  public int actorCounter() { int o = __offset(22); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean isActorCheckpointMethod() { int o = __offset(24); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public Arg args(int j) { return args(new Arg(), j); }
  public Arg args(Arg obj, int j) { int o = __offset(26); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int argsLength() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public String returns(int j) { int o = __offset(28); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int returnsLength() { int o = __offset(28); return o != 0 ? __vector_len(o) : 0; }
  public ResourcePair requiredResources(int j) { return requiredResources(new ResourcePair(), j); }
  public ResourcePair requiredResources(ResourcePair obj, int j) { int o = __offset(30); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int requiredResourcesLength() { int o = __offset(30); return o != 0 ? __vector_len(o) : 0; }
  public ResourcePair requiredPlacementResources(int j) { return requiredPlacementResources(new ResourcePair(), j); }
  public ResourcePair requiredPlacementResources(ResourcePair obj, int j) { int o = __offset(32); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int requiredPlacementResourcesLength() { int o = __offset(32); return o != 0 ? __vector_len(o) : 0; }
  public int language() { int o = __offset(34); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String functionDescriptor(int j) { int o = __offset(36); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int functionDescriptorLength() { int o = __offset(36); return o != 0 ? __vector_len(o) : 0; }

  public static int createTaskInfo(FlatBufferBuilder builder,
      int driver_idOffset,
      int task_idOffset,
      int parent_task_idOffset,
      int parent_counter,
      int actor_creation_idOffset,
      int actor_creation_dummy_object_idOffset,
      int max_actor_reconstructions,
      int actor_idOffset,
      int actor_handle_idOffset,
      int actor_counter,
      boolean is_actor_checkpoint_method,
      int argsOffset,
      int returnsOffset,
      int required_resourcesOffset,
      int required_placement_resourcesOffset,
      int language,
      int function_descriptorOffset) {
    builder.startObject(17);
    TaskInfo.addFunctionDescriptor(builder, function_descriptorOffset);
    TaskInfo.addLanguage(builder, language);
    TaskInfo.addRequiredPlacementResources(builder, required_placement_resourcesOffset);
    TaskInfo.addRequiredResources(builder, required_resourcesOffset);
    TaskInfo.addReturns(builder, returnsOffset);
    TaskInfo.addArgs(builder, argsOffset);
    TaskInfo.addActorCounter(builder, actor_counter);
    TaskInfo.addActorHandleId(builder, actor_handle_idOffset);
    TaskInfo.addActorId(builder, actor_idOffset);
    TaskInfo.addMaxActorReconstructions(builder, max_actor_reconstructions);
    TaskInfo.addActorCreationDummyObjectId(builder, actor_creation_dummy_object_idOffset);
    TaskInfo.addActorCreationId(builder, actor_creation_idOffset);
    TaskInfo.addParentCounter(builder, parent_counter);
    TaskInfo.addParentTaskId(builder, parent_task_idOffset);
    TaskInfo.addTaskId(builder, task_idOffset);
    TaskInfo.addDriverId(builder, driver_idOffset);
    TaskInfo.addIsActorCheckpointMethod(builder, is_actor_checkpoint_method);
    return TaskInfo.endTaskInfo(builder);
  }

  public static void startTaskInfo(FlatBufferBuilder builder) { builder.startObject(17); }
  public static void addDriverId(FlatBufferBuilder builder, int driverIdOffset) { builder.addOffset(0, driverIdOffset, 0); }
  public static void addTaskId(FlatBufferBuilder builder, int taskIdOffset) { builder.addOffset(1, taskIdOffset, 0); }
  public static void addParentTaskId(FlatBufferBuilder builder, int parentTaskIdOffset) { builder.addOffset(2, parentTaskIdOffset, 0); }
  public static void addParentCounter(FlatBufferBuilder builder, int parentCounter) { builder.addInt(3, parentCounter, 0); }
  public static void addActorCreationId(FlatBufferBuilder builder, int actorCreationIdOffset) { builder.addOffset(4, actorCreationIdOffset, 0); }
  public static void addActorCreationDummyObjectId(FlatBufferBuilder builder, int actorCreationDummyObjectIdOffset) { builder.addOffset(5, actorCreationDummyObjectIdOffset, 0); }
  public static void addMaxActorReconstructions(FlatBufferBuilder builder, int maxActorReconstructions) { builder.addInt(6, maxActorReconstructions, 0); }
  public static void addActorId(FlatBufferBuilder builder, int actorIdOffset) { builder.addOffset(7, actorIdOffset, 0); }
  public static void addActorHandleId(FlatBufferBuilder builder, int actorHandleIdOffset) { builder.addOffset(8, actorHandleIdOffset, 0); }
  public static void addActorCounter(FlatBufferBuilder builder, int actorCounter) { builder.addInt(9, actorCounter, 0); }
  public static void addIsActorCheckpointMethod(FlatBufferBuilder builder, boolean isActorCheckpointMethod) { builder.addBoolean(10, isActorCheckpointMethod, false); }
  public static void addArgs(FlatBufferBuilder builder, int argsOffset) { builder.addOffset(11, argsOffset, 0); }
  public static int createArgsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startArgsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addReturns(FlatBufferBuilder builder, int returnsOffset) { builder.addOffset(12, returnsOffset, 0); }
  public static int createReturnsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startReturnsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addRequiredResources(FlatBufferBuilder builder, int requiredResourcesOffset) { builder.addOffset(13, requiredResourcesOffset, 0); }
  public static int createRequiredResourcesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRequiredResourcesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addRequiredPlacementResources(FlatBufferBuilder builder, int requiredPlacementResourcesOffset) { builder.addOffset(14, requiredPlacementResourcesOffset, 0); }
  public static int createRequiredPlacementResourcesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRequiredPlacementResourcesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLanguage(FlatBufferBuilder builder, int language) { builder.addInt(15, language, 0); }
  public static void addFunctionDescriptor(FlatBufferBuilder builder, int functionDescriptorOffset) { builder.addOffset(16, functionDescriptorOffset, 0); }
  public static int createFunctionDescriptorVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFunctionDescriptorVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endTaskInfo(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }

  /** This is manually added to avoid encoding/decoding cost as our object
   * id is a byte array instead of a string.
   * This function is error-prone. If the fields before `returns` changed,
   * the offset number should be changed accordingly.
   * TODO(yuhguo): fix this error-prone funciton.
   */
  public ByteBuffer returnsAsByteBuffer(int j) {
    int o = __offset(28);
    if (o == 0) {
      return null;
    }

    int offset = __vector(o) + j * 4;
    offset += bb.getInt(offset);
    ByteBuffer src = bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    int length = src.getInt(offset);
    src.position(offset + 4);
    src.limit(offset + 4 + length);
    return src;
  }
}

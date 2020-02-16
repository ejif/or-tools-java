// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/solver_parameters.proto

package com.google.ortools.constraintsolver;

public final class SolverParameters {
  private SolverParameters() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_operations_research_ConstraintSolverParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_operations_research_ConstraintSolverParameters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1ortools/constraint_solver/solver_param" +
      "eters.proto\022\023operations_research\"\315\007\n\032Con" +
      "straintSolverParameters\022X\n\016compress_trai" +
      "l\030\001 \001(\0162@.operations_research.Constraint" +
      "SolverParameters.TrailCompression\022\030\n\020tra" +
      "il_block_size\030\002 \001(\005\022\030\n\020array_split_size\030" +
      "\003 \001(\005\022\023\n\013store_names\030\004 \001(\010\022\033\n\023name_cast_" +
      "variables\030\005 \001(\010\022\032\n\022name_all_variables\030\006 " +
      "\001(\010\022\033\n\023profile_propagation\030\007 \001(\010\022\024\n\014prof" +
      "ile_file\030\010 \001(\t\022\034\n\024profile_local_search\030\020" +
      " \001(\010\022\"\n\032print_local_search_profile\030\021 \001(\010" +
      "\022\031\n\021trace_propagation\030\t \001(\010\022\024\n\014trace_sea" +
      "rch\030\n \001(\010\022\023\n\013print_model\030\013 \001(\010\022\031\n\021print_" +
      "model_stats\030\014 \001(\010\022\037\n\027print_added_constra" +
      "ints\030\r \001(\010\022\025\n\rdisable_solve\030\017 \001(\010\022\027\n\017use" +
      "_small_table\030e \001(\010\022\"\n\032use_cumulative_edg" +
      "e_finder\030i \001(\010\022!\n\031use_cumulative_time_ta" +
      "ble\030j \001(\010\022&\n\036use_cumulative_time_table_s" +
      "ync\030p \001(\010\022&\n\036use_sequence_high_demand_ta" +
      "sks\030k \001(\010\022%\n\035use_all_possible_disjunctio" +
      "ns\030l \001(\010\022\034\n\024max_edge_finder_size\030m \001(\005\022\034" +
      "\n\024diffn_use_cumulative\030n \001(\010\022\027\n\017use_elem" +
      "ent_rmq\030o \001(\010\022\"\n\032skip_locally_optimal_pa" +
      "ths\030q \001(\010\022\035\n\025check_solution_period\030r \001(\005" +
      "\">\n\020TrailCompression\022\022\n\016NO_COMPRESSION\020\000" +
      "\022\026\n\022COMPRESS_WITH_ZLIB\020\001J\004\010d\020eJ\004\010f\020gJ\004\010g" +
      "\020hJ\004\010h\020iBI\n#com.google.ortools.constrain" +
      "tsolverP\001\252\002\037Google.OrTools.ConstraintSol" +
      "verb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_operations_research_ConstraintSolverParameters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_operations_research_ConstraintSolverParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_operations_research_ConstraintSolverParameters_descriptor,
        new java.lang.String[] { "CompressTrail", "TrailBlockSize", "ArraySplitSize", "StoreNames", "NameCastVariables", "NameAllVariables", "ProfilePropagation", "ProfileFile", "ProfileLocalSearch", "PrintLocalSearchProfile", "TracePropagation", "TraceSearch", "PrintModel", "PrintModelStats", "PrintAddedConstraints", "DisableSolve", "UseSmallTable", "UseCumulativeEdgeFinder", "UseCumulativeTimeTable", "UseCumulativeTimeTableSync", "UseSequenceHighDemandTasks", "UseAllPossibleDisjunctions", "MaxEdgeFinderSize", "DiffnUseCumulative", "UseElementRmq", "SkipLocallyOptimalPaths", "CheckSolutionPeriod", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

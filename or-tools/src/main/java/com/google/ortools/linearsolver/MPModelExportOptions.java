/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

import java.lang.reflect.*;

/**
 *  Export options.
 */
public final class MPModelExportOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPModelExportOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPModelExportOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        main_research_linear_solverJNI.delete_MPModelExportOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MPModelExportOptions() {
    this(main_research_linear_solverJNI.new_MPModelExportOptions(), true);
  }

  /**
   *  Obfuscates variable and constraint names.
   */
  public void setObfuscate(boolean value) {
    main_research_linear_solverJNI.MPModelExportOptions_Obfuscate_set(swigCPtr, this, value);
  }

  /**
   *  Obfuscates variable and constraint names.
   */
  public boolean getObfuscate() {
    return main_research_linear_solverJNI.MPModelExportOptions_Obfuscate_get(swigCPtr, this);
  }

  /**
   *  Whether to log invalid variable and constraint names.
   */
  public void setLogInvalidNames(boolean value) {
    main_research_linear_solverJNI.MPModelExportOptions_LogInvalidNames_set(swigCPtr, this, value);
  }

  /**
   *  Whether to log invalid variable and constraint names.
   */
  public boolean getLogInvalidNames() {
    return main_research_linear_solverJNI.MPModelExportOptions_LogInvalidNames_get(swigCPtr, this);
  }

  /**
   * For .lp files only. Decides whether variables unused in the objective and<br>
   * constraints are shown when exported to a file.
   */
  public void setShowUnusedVariables(boolean value) {
    main_research_linear_solverJNI.MPModelExportOptions_ShowUnusedVariables_set(swigCPtr, this, value);
  }

  /**
   * For .lp files only. Decides whether variables unused in the objective and<br>
   * constraints are shown when exported to a file.
   */
  public boolean getShowUnusedVariables() {
    return main_research_linear_solverJNI.MPModelExportOptions_ShowUnusedVariables_get(swigCPtr, this);
  }

  /**
   * For .lp files only. Maximum line length in exported files. The default<br>
   * was chosen so that SCIP can read the files.
   */
  public void setMaxLineLength(int value) {
    main_research_linear_solverJNI.MPModelExportOptions_MaxLineLength_set(swigCPtr, this, value);
  }

  /**
   * For .lp files only. Maximum line length in exported files. The default<br>
   * was chosen so that SCIP can read the files.
   */
  public int getMaxLineLength() {
    return main_research_linear_solverJNI.MPModelExportOptions_MaxLineLength_get(swigCPtr, this);
  }

}
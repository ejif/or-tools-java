/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  A constraint is the main modeling object. It provides two methods:   - Post() is responsible for creating the demons and attaching them to     immediate demons().   - InitialPropagate() is called once just after Post and performs     the initial propagation. The subsequent propagations will be performed     by the demons Posted during the post() method.
 */
public class Constraint extends PropagationBaseObject {
  private transient long swigCPtr;

  protected Constraint(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.Constraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Constraint obj) {
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
        mainJNI.delete_Constraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  This method is called when the constraint is processed by the solver. Its main usage is to attach demons to variables.
   */
  public void post() {
    mainJNI.Constraint_post(swigCPtr, this);
  }

  /**
   *  This method performs the initial propagation of the constraint. It is called just after the post.
   */
  public void initialPropagate() {
    mainJNI.Constraint_initialPropagate(swigCPtr, this);
  }

  public String toString() {
    return mainJNI.Constraint_toString(swigCPtr, this);
  }

  /**
   *  Calls Post and then Propagate to initialize the constraints. This is usually done in the root node.
   */
  public void postAndPropagate() {
    mainJNI.Constraint_postAndPropagate(swigCPtr, this);
  }

  /**
   *  Accepts the given visitor.
   */
  public void accept(ModelVisitor visitor) {
    mainJNI.Constraint_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

  /**
   *  Is the constraint created by a cast from expression to integer variable?
   */
  public boolean isCastConstraint() {
    return mainJNI.Constraint_isCastConstraint(swigCPtr, this);
  }

  /**
   *  Creates a Boolean variable representing the status of the constraint (false = constraint is violated, true = constraint is satisfied). It returns nullptr if the constraint does not support this API.
   */
  public IntVar var() {
    long cPtr = mainJNI.Constraint_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

}

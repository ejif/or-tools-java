package io.github.ejif.ortools;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.google.ortools.linearsolver.MPConstraint;
import com.google.ortools.linearsolver.MPObjective;
import com.google.ortools.linearsolver.MPSolver;
import com.google.ortools.linearsolver.MPSolver.OptimizationProblemType;
import com.google.ortools.linearsolver.MPVariable;

class OrtoolsTest {

    @Test
    void test() {
        Ortools.load();

        MPSolver solver = new MPSolver("test", OptimizationProblemType.GLOP_LINEAR_PROGRAMMING);
        MPVariable x = solver.makeNumVar(0, MPSolver.infinity(), "x");

        MPObjective objective = solver.objective();
        objective.setCoefficient(x, 1);
        objective.setMaximization();

        MPConstraint c = solver.makeConstraint(-MPSolver.infinity(), 10);
        c.setCoefficient(x, 1);

        solver.solve();

        assertEquals(10, x.solutionValue());
    }
}

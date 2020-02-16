# or-tools-java

A wrapper around [Google OR-Tools](https://github.com/google/or-tools) for Java that works out of the box, without having to install or link anything. Just declare a dependency on the following Maven coordinates:

        <dependency>
            <groupId>io.github.ejif.ortools</groupId>
            <artifactId>or-tools-{platform}</artifactId>
            <version>{version}</version>
        </dependency>

Currently only the platform `macosx` is supported. For the latest version, see the [Releases](https://github.com/ejif/or-tools-java/releases) tab.

Now you can compile and run with any of the Java wrapper classes:

        import com.google.ortools.linearsolver.MPSolver;
        import com.google.ortools.linearsolver.MPSolver.OptimizationProblemType;
        import io.github.ejif.ortools.Ortools;

        public class Main {
            public static void main(String[] args) {
                Ortools.load();
                MPSolver solver = new MPSolver("test", OptimizationProblemType.GLOP_LINEAR_PROGRAMMING);
                ...
            }
        }

## Development

Follow the instructions [here](https://developers.google.com/optimization/install/java#source) to install OR-Tools from source.

As of OR-Tools 7.5, running `make third_party` and `make java` in that repo will generate Java source code in `ortools/java` and `ortools/gen/java`, which are merged together [here](or-tools/src/main/java).

The generated dynamic libraries were copied from that repo as well, to [here](or-tools-macosx/src/main/resources).


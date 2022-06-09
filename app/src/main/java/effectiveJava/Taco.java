package effectiveJava;

import java.util.Objects;

public class Taco extends Mexican {
    public enum Shell {
        FLOUR, CORN
    }

    private final Shell shell;

    public static class Builder extends Mexican.Builder<Builder> {
        private final Shell shell;

        public Builder(Shell shell) {
            this.shell = Objects.requireNonNull(shell);
        }

        @Override
        public Taco build() {
            return new Taco(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Taco(Builder builder) {
        super(builder);
        shell = builder.shell;
    }

    public void printShell() {
        System.out.println(shell.name());
    }
}

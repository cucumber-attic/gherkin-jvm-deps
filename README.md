This project repackages the dependencies of the JVM version of Gherkin into a new package, `gherkin.deps.*`.
This is to prevent conflicts when Gherkin is used along with other project depending on the same libraries.

To publish a new release:

```
make release
```
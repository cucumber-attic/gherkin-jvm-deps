module io.cucumber.gherkin.jvm.deps {
    exports gherkin.deps.com.google.gson;
    exports gherkin.deps.com.google.gson.annotations;
    exports gherkin.deps.com.google.gson.reflect;
    exports gherkin.deps.com.google.gson.stream;
    exports gherkin.deps.net.iharder;
    opens gherkin.deps.com.google.gson.internal to io.cucumber.gherkin;
    requires java.sql;
}

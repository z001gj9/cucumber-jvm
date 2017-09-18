package cucumber.util.log;

import org.slf4j.Logger;

public final class LoggerFactory {

    static boolean verbose = false;

    public static Logger getLogger(Class<?> clazz) {
        Logger primary = org.slf4j.LoggerFactory.getLogger(clazz);
        Logger secondary = new VerboseLogger(clazz.getName(), System.out);
        return new CompositeLogger(primary, secondary);
    }

    public static void setVerbose(boolean verbose) {
        LoggerFactory.verbose = verbose;
    }
}

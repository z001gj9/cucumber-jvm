package cucumber.util.log;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

import java.io.PrintStream;

final class VerboseLogger implements Logger {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final String INFO = "INFO";
    private static final String WARN = "WARN";
    private static final String ERROR = "ERROR";

    private static final long startTime = System.currentTimeMillis();

    private final String name;
    private final PrintStream out;

    VerboseLogger(String name, PrintStream out) {
        this.name = name;
        this.out = out;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override
    public void trace(Marker marker, String msg) {
        trace(msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        trace(format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        trace(format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        trace(format, argArray);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        trace(msg, t);
    }

    @Override
    public void trace(String msg) {
        // Ignored
    }

    @Override
    public void trace(String format, Object param1) {
        // Ignored
    }

    @Override
    public void trace(String format, Object param1, Object param2) {
        // Ignored
    }

    @Override
    public void trace(String format, Object[] argArray) {
        // Ignored
    }

    @Override
    public void trace(String msg, Throwable t) {
        // Ignored
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override
    public void debug(Marker marker, String msg) {
        debug(msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        debug(format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        debug(format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        debug(format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        debug(msg, t);
    }

    @Override
    public void debug(String msg) {
        // Ignored
    }

    @Override
    public void debug(String format, Object param1) {
        // Ignored
    }

    @Override
    public void debug(String format, Object param1, Object param2) {
        // Ignored
    }

    @Override
    public void debug(String format, Object[] argArray) {
        // Ignored
    }

    @Override
    public void debug(String msg, Throwable t) {
        // Ignored
    }

    private void log(String level, String format, Object arg1, Object arg2) {
        if(!LoggerFactory.verbose){
            return;
        }

        FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
        log(level, tp.getMessage(), tp.getThrowable());
    }

    private void log(String level, String format, Object[] argArray) {
        if(!LoggerFactory.verbose){
            return;
        }

        FormattingTuple tp = MessageFormatter.arrayFormat(format, argArray);
        log(level, tp.getMessage(), tp.getThrowable());
    }

    private void log(String level, String message, Throwable t) {
        if(!LoggerFactory.verbose){
            return;
        }

        StringBuilder log = new StringBuilder();

        long currentTime = System.currentTimeMillis();
        log.append(currentTime - startTime);
        log.append(" [");
        log.append(Thread.currentThread().getName());
        log.append("] ");
        log.append(level);
        log.append(" ");
        log.append(name);
        log.append(" - ");
        log.append(message);
        log.append(LINE_SEPARATOR);

        out.print(log.toString());
        if (t != null) {
            t.printStackTrace(out);
        }
        out.flush();
    }

    @Override
    public boolean isInfoEnabled() {
        return true;
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override
    public void info(Marker marker, String msg) {
        info(msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        info(format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        info(format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        info(format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        info(msg, t);
    }

    @Override
    public void info(String msg) {
        log(INFO, msg, (Throwable) null);
    }

    @Override
    public void info(String format, Object arg) {
        log(INFO, format, arg, null);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        log(INFO, format, arg1, arg2);
    }

    @Override
    public void info(String format, Object[] argArray) {
        log(INFO, format, argArray);
    }

    @Override
    public void info(String msg, Throwable t) {
        log(INFO, msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    @Override
    public void warn(Marker marker, String msg) {
        warn(msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        warn(format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        warn(format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        warn(format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        warn(msg, t);
    }

    @Override
    public void warn(String msg) {
        log(WARN, msg, (Throwable) null);
    }

    @Override
    public void warn(String format, Object arg) {
        log(WARN, format, arg, null);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        log(WARN, format, arg1, arg2);
    }

    @Override
    public void warn(String format, Object[] argArray) {
        log(WARN, format, argArray);
    }

    @Override
    public void warn(String msg, Throwable t) {
        log(WARN, msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        log(ERROR, msg, (Throwable) null);
    }

    @Override
    public void error(Marker marker, String msg) {
        error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        log(ERROR, format, arg, null);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        log(ERROR, format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        error(msg, t);
    }

    @Override
    public void error(String format, Object[] argArray) {
        log(ERROR, format, argArray);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        log(ERROR, msg, t);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        error(format, arg1, arg2);
    }
}

package cucumber.util.log;

import org.slf4j.Logger;
import org.slf4j.Marker;

final class CompositeLogger implements Logger {

    private final Logger primary;
    private final Logger secondary;

    CompositeLogger(Logger primary, Logger secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }


    @Override
    public String getName() {
        return "CompositeLogger[" +  primary.getName() + " and " + secondary.getName() + "]";
    }

    @Override
    public boolean isTraceEnabled() {
        return primary.isTraceEnabled() || secondary.isTraceEnabled();
    }

    @Override
    public void trace(String msg) {
        primary.trace(msg);
        secondary.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        primary.trace(format, arg);
        secondary.trace(format, arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        primary.trace(format, arg1, arg2);
        secondary.trace(format, arg1, arg2);
    }

    @Override
    public void trace(String format, Object... arguments) {
        primary.trace(format, arguments);
        secondary.trace(format, arguments);
    }

    @Override
    public void trace(String msg, Throwable t) {
        primary.trace(msg, t);
        secondary.trace(msg, t);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return primary.isTraceEnabled(marker) || secondary.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String msg) {
        primary.trace(marker, msg);
        secondary.trace(marker, msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        primary.trace(marker, format, arg);
        secondary.trace(marker, format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        primary.trace(marker, format, arg1, arg2);
        secondary.trace(marker, format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        primary.trace(marker, format, argArray);
        secondary.trace(marker, format, argArray);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        primary.trace(marker, msg, t);
        secondary.trace(marker, msg, t);
    }

    @Override
    public boolean isDebugEnabled() {
        return primary.isDebugEnabled() || secondary.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        primary.debug(msg);
        secondary.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        primary.debug(format, arg);
        secondary.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        primary.debug(format, arg1, arg2);
        secondary.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        primary.debug(format, arguments);
        secondary.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        primary.debug(msg, t);
        secondary.debug(msg, t);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return primary.isDebugEnabled(marker) || secondary.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String msg) {
        primary.debug(marker, msg);
        secondary.debug(marker, msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        primary.debug(marker, format, arg);
        secondary.debug(marker, format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        primary.debug(marker, format, arg1, arg2);
        secondary.debug(marker, format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        primary.debug(marker, format, arguments);
        secondary.debug(marker, format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        primary.debug(marker, msg, t);
        secondary.debug(marker, msg, t);
    }

    @Override
    public boolean isInfoEnabled() {
        return primary.isInfoEnabled() || secondary.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        primary.info(msg);
        secondary.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        primary.info(format, arg);
        secondary.info(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        primary.info(format, arg1, arg2);
        secondary.info(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object... arguments) {
        primary.info(format, arguments);
        secondary.info(format, arguments);
    }

    @Override
    public void info(String msg, Throwable t) {
        primary.info(msg, t);
        secondary.info(msg, t);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return primary.isInfoEnabled(marker) || secondary.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String msg) {
        primary.info(marker, msg);
        secondary.info(marker, msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        primary.info(marker, format, arg);
        secondary.info(marker, format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        primary.info(marker, format, arg1, arg2);
        secondary.info(marker, format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        primary.info(marker, format, arguments);
        secondary.info(marker, format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        primary.info(marker, msg, t);
        secondary.info(marker, msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return primary.isWarnEnabled() || secondary.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        primary.warn(msg);
        secondary.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        primary.warn(format, arg);
        secondary.warn(format, arg);
    }

    @Override
    public void warn(String format, Object... arguments) {
        primary.warn(format, arguments);
        secondary.warn(format, arguments);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        primary.warn(format, arg1, arg2);
        secondary.warn(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        primary.warn(msg, t);
        secondary.warn(msg, t);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return primary.isWarnEnabled(marker) || secondary.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String msg) {
        primary.warn(marker, msg);
        secondary.warn(marker, msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        primary.warn(marker, format, arg);
        secondary.warn(marker, format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        primary.warn(marker, format, arg1, arg2);
        secondary.warn(marker, format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        primary.warn(marker, format, arguments);
        secondary.warn(marker, format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        primary.warn(marker, msg, t);
        secondary.warn(marker, msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return primary.isErrorEnabled() || secondary.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        primary.error(msg);
        secondary.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        primary.error(format, arg);
        secondary.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        primary.error(format, arg1, arg2);
        secondary.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object... arguments) {
        primary.error(format, arguments);
        secondary.error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        primary.error(msg, t);
        secondary.error(msg, t);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return primary.isErrorEnabled(marker) || secondary.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String msg) {
        primary.error(marker, msg);
        secondary.error(marker, msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        primary.error(marker, format, arg);
        secondary.error(marker, format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        primary.error(marker, format, arg1, arg2);
        secondary.error(marker, format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        primary.error(marker, format, arguments);
        secondary.error(marker, format, arguments);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        primary.error(marker, msg, t);
        secondary.error(marker, msg, t);
    }
}

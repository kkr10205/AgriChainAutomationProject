package org.agriChain.utils;

public class WaitUtil {
    private static final long TIMEOUT = 60;
    public static final long IMPLICIT_WAIT = 20;
    public static long getImplicitWait() {
        return IMPLICIT_WAIT;
    }
    public static long getExplicitWaitDuration() {
        return TIMEOUT;
    }
}

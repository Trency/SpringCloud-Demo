package com.xiao.custom.config.client.configuration;

/**
 * @author Spencer Gibb
 */
public class ConfigClientStateHolder {
    private static ThreadLocal<String> state = new ThreadLocal<>();

    public static void resetState() {
        state.remove();
    }

    public static String getState() {
        return state.get();
    }

    public static void setState(String newState) {
        if (newState == null) {
            resetState();
            return;
        }
        state.set(newState);
    }
}

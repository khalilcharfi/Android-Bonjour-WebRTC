package com.github.warren_bank.bonjour_webrtc.data_model;

import com.github.warren_bank.bonjour_webrtc.R;
import com.github.warren_bank.bonjour_webrtc.util.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class SharedPrefs {

    // ---------------------------------------------------------------------------------------------

    public static void setDefaultPreferenceValues(Context context) {
        PreferenceManager.setDefaultValues(context, R.xml.general_preferences, false);
    }

    // ---------------------------------------------------------------------------------------------

    public static SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences;
    }

    public static SharedPreferences.Editor getSharedPreferencesEditor(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        return editor;
    }

    // --------------------------------------------------------------------------------------------- remove()

    public static boolean remove(Context context, int pref_key_id) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return remove(editor, context, pref_key_id, true);
    }

    public static boolean remove(SharedPreferences.Editor editor, Context context, int pref_key_id, boolean flush) {
        String key = context.getString(pref_key_id);
        return remove(editor, key, flush);
    }

    public static boolean remove(SharedPreferences.Editor editor, String key, boolean flush) {
        editor.remove(key);
        return flush && editor.commit();
    }

    // --------------------------------------------------------------------------------------------- putString()

    public static boolean putString(Context context, int pref_key_id, String value) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putString(editor, context, pref_key_id, value, true);
    }

    public static boolean putString(SharedPreferences.Editor editor, Context context, int pref_key_id, String value, boolean flush) {
        String key = context.getString(pref_key_id);
        return putString(editor, key, value, flush);
    }

    public static boolean putString(SharedPreferences.Editor editor, String key, String value, boolean flush) {
        editor.putString(key, value);
        return flush && editor.commit();
    }

    // --------------------------------------------------------------------------------------------- getString()

    public static String getString(Context context, int pref_key_id, String defValue) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getString(sharedPreferences, context, pref_key_id, defValue);
    }

    public static String getString(SharedPreferences sharedPreferences, Context context, int pref_key_id, String defValue) {
        String key = context.getString(pref_key_id);
        return getString(sharedPreferences, key, defValue);
    }

    public static String getString(SharedPreferences sharedPreferences, String key, String defValue) {
        return sharedPreferences.getString(key, defValue);
    }

    // --------------------------------------------------------------------------------------------- putBoolean()

    public static boolean putBoolean(Context context, int pref_key_id, boolean value) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putBoolean(editor, context, pref_key_id, value, true);
    }

    public static boolean putBoolean(SharedPreferences.Editor editor, Context context, int pref_key_id, boolean value, boolean flush) {
        String key = context.getString(pref_key_id);
        return putBoolean(editor, key, value, flush);
    }

    public static boolean putBoolean(SharedPreferences.Editor editor, String key, boolean value, boolean flush) {
        editor.putBoolean(key, value);
        return flush && editor.commit();
    }

    // --------------------------------------------------------------------------------------------- getBoolean()

    public static boolean getBoolean(Context context, int pref_key_id, boolean defValue) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getBoolean(sharedPreferences, context, pref_key_id, defValue);
    }

    public static boolean getBoolean(SharedPreferences sharedPreferences, Context context, int pref_key_id, boolean defValue) {
        String key = context.getString(pref_key_id);
        return getBoolean(sharedPreferences, key, defValue);
    }

    public static boolean getBoolean(SharedPreferences sharedPreferences, String key, boolean defValue) {
        return sharedPreferences.getBoolean(key, defValue);
    }

    // --------------------------------------------------------------------------------------------- putInt()

    public static boolean putInt(Context context, int pref_key_id, int value) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putInt(editor, context, pref_key_id, value, true);
    }

    public static boolean putInt(SharedPreferences.Editor editor, Context context, int pref_key_id, int value, boolean flush) {
        String key = context.getString(pref_key_id);
        return putInt(editor, key, value, flush);
    }

    public static boolean putInt(SharedPreferences.Editor editor, String key, int value, boolean flush) {
        editor.putInt(key, value);
        return flush && editor.commit();
    }

    // --------------------------------------------------------------------------------------------- getInt()

    public static int getInt(Context context, int pref_key_id, int defValue) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getInt(sharedPreferences, context, pref_key_id, defValue);
    }

    public static int getInt(SharedPreferences sharedPreferences, Context context, int pref_key_id, int defValue) {
        String key = context.getString(pref_key_id);
        return getInt(sharedPreferences, key, defValue);
    }

    public static int getInt(SharedPreferences sharedPreferences, String key, int defValue) {
        return sharedPreferences.getInt(key, defValue);
    }

    // --------------------------------------------------------------------------------------------- putLong()

    public static boolean putLong(Context context, int pref_key_id, long value) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putLong(editor, context, pref_key_id, value, true);
    }

    public static boolean putLong(SharedPreferences.Editor editor, Context context, int pref_key_id, long value, boolean flush) {
        String key = context.getString(pref_key_id);
        return putLong(editor, key, value, flush);
    }

    public static boolean putLong(SharedPreferences.Editor editor, String key, long value, boolean flush) {
        editor.putLong(key, value);
        return flush && editor.commit();
    }

    // --------------------------------------------------------------------------------------------- getLong()

    public static long getLong(Context context, int pref_key_id, long defValue) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getLong(sharedPreferences, context, pref_key_id, defValue);
    }

    public static long getLong(SharedPreferences sharedPreferences, Context context, int pref_key_id, long defValue) {
        String key = context.getString(pref_key_id);
        return getLong(sharedPreferences, key, defValue);
    }

    public static long getLong(SharedPreferences sharedPreferences, String key, long defValue) {
        return sharedPreferences.getLong(key, defValue);
    }

    // --------------------------------------------------------------------------------------------- putFloat()

    public static boolean putFloat(Context context, int pref_key_id, float value) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putFloat(editor, context, pref_key_id, value, true);
    }

    public static boolean putFloat(SharedPreferences.Editor editor, Context context, int pref_key_id, float value, boolean flush) {
        String key = context.getString(pref_key_id);
        return putFloat(editor, key, value, flush);
    }

    public static boolean putFloat(SharedPreferences.Editor editor, String key, float value, boolean flush) {
        editor.putFloat(key, value);
        return flush && editor.commit();
    }

    // --------------------------------------------------------------------------------------------- getFloat()

    public static float getFloat(Context context, int pref_key_id, float defValue) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getFloat(sharedPreferences, context, pref_key_id, defValue);
    }

    public static float getFloat(SharedPreferences sharedPreferences, Context context, int pref_key_id, float defValue) {
        String key = context.getString(pref_key_id);
        return getFloat(sharedPreferences, key, defValue);
    }

    public static float getFloat(SharedPreferences sharedPreferences, String key, float defValue) {
        return sharedPreferences.getFloat(key, defValue);
    }

    // --------------------------------------------------------------------------------------------- putDouble()

    public static boolean putDouble(Context context, int pref_key_id, double value) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putDouble(editor, context, pref_key_id, value, true);
    }

    public static boolean putDouble(SharedPreferences.Editor editor, Context context, int pref_key_id, double value, boolean flush) {
        String key = context.getString(pref_key_id);
        return putDouble(editor, key, value, flush);
    }

    public static boolean putDouble(SharedPreferences.Editor editor, String key, double value, boolean flush) {
        long longValue = Double.doubleToLongBits(value);
        editor.putLong(key, longValue);
        return flush && editor.commit();
    }

    // --------------------------------------------------------------------------------------------- getDouble()

    public static double getDouble(Context context, int pref_key_id, double defValue) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getDouble(sharedPreferences, context, pref_key_id, defValue);
    }

    public static double getDouble(SharedPreferences sharedPreferences, Context context, int pref_key_id, double defValue) {
        String key = context.getString(pref_key_id);
        return getDouble(sharedPreferences, key, defValue);
    }

    public static double getDouble(SharedPreferences sharedPreferences, String key, double defValue) {
        long longDefValue = Double.doubleToLongBits(defValue);
        long longValue    = sharedPreferences.getLong(key, longDefValue);
        double value      = Double.longBitsToDouble(longValue);
        return value;
    }

    // --------------------------------------------------------------------------------------------- putServerAlias()

    public static boolean putServerAlias(Context context, String serverAlias) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putServerAlias(editor, context, serverAlias, true);
    }

    public static boolean putServerAlias(SharedPreferences.Editor editor, Context context, String serverAlias, boolean flush) {
        int pref_key_id = R.string.pref_server_alias;
        return ((serverAlias == null) || serverAlias.isEmpty())
          ? remove(editor, context, pref_key_id, flush)
          : putString(editor, context, pref_key_id, serverAlias, flush)
        ;
    }

    // --------------------------------------------------------------------------------------------- getServerAlias()

    public static String getServerAlias(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getServerAlias(sharedPreferences, context);
    }

    public static String getServerAlias(SharedPreferences sharedPreferences, Context context) {
        int pref_key_id = R.string.pref_server_alias;
        String defValue = null;
        try {
            defValue = Util.getWlanIpAddress_String(context);
        }
        catch(Exception e) {}
        return getString(sharedPreferences, context, pref_key_id, defValue);
    }

    // --------------------------------------------------------------------------------------------- putCallAlertEnabled()

    public static boolean putCallAlertEnabled(Context context, boolean callAlertEnabled) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putCallAlertEnabled(editor, context, callAlertEnabled, true);
    }

    public static boolean putCallAlertEnabled(SharedPreferences.Editor editor, Context context, boolean callAlertEnabled, boolean flush) {
        int pref_key_id = R.string.pref_generalsettings_callalert_enabled_key;
        return putBoolean(editor, context, pref_key_id, callAlertEnabled, flush);
    }

    // --------------------------------------------------------------------------------------------- getCallAlertEnabled()

    public static boolean getCallAlertEnabled(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getCallAlertEnabled(sharedPreferences, context);
    }

    public static boolean getCallAlertEnabled(SharedPreferences sharedPreferences, Context context) {
        int pref_key_id  = R.string.pref_generalsettings_callalert_enabled_key;
        boolean defValue = Boolean.parseBoolean(context.getString(R.string.pref_generalsettings_callalert_enabled_default));
        return getBoolean(sharedPreferences, context, pref_key_id, defValue);
    }

    // --------------------------------------------------------------------------------------------- putCallAlertTimeout()

    public static boolean putCallAlertTimeout(Context context, float callAlertTimeout) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putCallAlertTimeout(editor, context, callAlertTimeout, true);
    }

    public static boolean putCallAlertTimeout(SharedPreferences.Editor editor, Context context, float callAlertTimeout, boolean flush) {
        int pref_key_id = R.string.pref_generalsettings_callalert_timeout_key;
        return putFloat(editor, context, pref_key_id, callAlertTimeout, flush);
    }

    // --------------------------------------------------------------------------------------------- getCallAlertTimeout()

    public static float getCallAlertTimeout(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getCallAlertTimeout(sharedPreferences, context);
    }

    public static float getCallAlertTimeout(SharedPreferences sharedPreferences, Context context) {
        int pref_key_id = R.string.pref_generalsettings_callalert_timeout_key;
        float defValue  = Float.parseFloat(context.getString(R.string.pref_generalsettings_callalert_timeout_default));
        return getFloat(sharedPreferences, context, pref_key_id, defValue);
    }

    // --------------------------------------------------------------------------------------------- putSocketServerPort()

    public static boolean putSocketServerPort(Context context, int socketServerPort) {
        SharedPreferences.Editor editor = getSharedPreferencesEditor(context);
        return putSocketServerPort(editor, context, socketServerPort, true);
    }

    public static boolean putSocketServerPort(SharedPreferences.Editor editor, Context context, int socketServerPort, boolean flush) {
        int pref_key_id = R.string.pref_generalsettings_socketserver_port_key;
        return putInt(editor, context, pref_key_id, socketServerPort, flush);
    }

    // --------------------------------------------------------------------------------------------- getSocketServerPort()

    public static int getSocketServerPort(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        return getSocketServerPort(sharedPreferences, context);
    }

    public static int getSocketServerPort(SharedPreferences sharedPreferences, Context context) {
        int pref_key_id = R.string.pref_generalsettings_socketserver_port_key;
        int defValue    = Integer.parseInt(context.getString(R.string.pref_generalsettings_socketserver_port_default), 10);
        return getInt(sharedPreferences, context, pref_key_id, defValue);
    }

    // ---------------------------------------------------------------------------------------------
}

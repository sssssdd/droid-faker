package de.rndm.droidFaker;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created with IntelliJ IDEA.
 * User: mkp
 * Date: 20.10.13
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */

public class AppPreferences {
    private static final String APP_SHARED_PREFS = "de.rndm.droidFaker";
    private SharedPreferences appSharedPrefs;
    private SharedPreferences.Editor prefsEditor;

    public AppPreferences(Context context)
    {
        this.appSharedPrefs = context.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
        this.prefsEditor = appSharedPrefs.edit();
    }

    public String getString(String key, String defValue){
        String value = "";
        if(key != null && !key.equals("")){
            value = appSharedPrefs.getString(key, "");
        }
        return value;
    }

    public String getString(String key){
        return getString(key, "");
    }

    public boolean getBoolean(String key, boolean defValue){
        boolean value = defValue;
        if(key != null && !key.equals("")){
            value = appSharedPrefs.getBoolean(key, defValue);
        }
        return value;
    }
    public boolean getBoolean(String key){
        return getBoolean(key, false);
    }

    public int getInteger(String key, int defValue){
        int value = defValue;
        if(key != null && !key.equals("")){
            value = appSharedPrefs.getInt(key, defValue);
        }
        return value;
    }
    public int getInteger(String key){
        return getInteger(key, 0);
    }

    public void set(String key, String value){
        if(key != null && value != null && !key.equals("") && !value.equals("")){
            prefsEditor.putString(key, value);
            prefsEditor.commit();
        }
    }
    public void set(String key, int value){
        if(key != null && !key.equals("")){
            prefsEditor.putInt(key, value);
            prefsEditor.commit();
        }
    }
    public void set(String key, boolean value){
        if(key != null && !key.equals("")){
            prefsEditor.putBoolean(key, value);
            prefsEditor.commit();
        }
    }
}
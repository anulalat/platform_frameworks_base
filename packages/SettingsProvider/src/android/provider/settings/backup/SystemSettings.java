/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.provider.settings.backup;

import android.compat.annotation.UnsupportedAppUsage;
import android.provider.Settings;

/** Information about the system settings to back up */
public class SystemSettings {

    /**
     * Settings to backup.
     *
     * NOTE: Settings are backed up and restored in the order they appear
     *       in this array. If you have one setting depending on another,
     *       make sure that they are ordered appropriately.
     */
    @UnsupportedAppUsage
    public static final String[] SETTINGS_TO_BACKUP = {
        Settings.System.STAY_ON_WHILE_PLUGGED_IN,   // moved to global
        Settings.System.WIFI_USE_STATIC_IP,
        Settings.System.WIFI_STATIC_IP,
        Settings.System.WIFI_STATIC_GATEWAY,
        Settings.System.WIFI_STATIC_NETMASK,
        Settings.System.WIFI_STATIC_DNS1,
        Settings.System.WIFI_STATIC_DNS2,
        Settings.System.BLUETOOTH_DISCOVERABILITY,
        Settings.System.BLUETOOTH_DISCOVERABILITY_TIMEOUT,
        Settings.System.FONT_SCALE,
        Settings.System.DIM_SCREEN,
        Settings.System.SCREEN_OFF_TIMEOUT,
        Settings.System.SCREEN_BRIGHTNESS_MODE,
        Settings.System.SCREEN_AUTO_BRIGHTNESS_ADJ,
        Settings.System.SCREEN_BRIGHTNESS_FOR_VR,
        Settings.System.ADAPTIVE_SLEEP,             // moved to secure
        Settings.System.VIBRATE_INPUT_DEVICES,
        Settings.System.MODE_RINGER_STREAMS_AFFECTED,
        Settings.System.TEXT_AUTO_REPLACE,
        Settings.System.TEXT_AUTO_CAPS,
        Settings.System.TEXT_AUTO_PUNCTUATE,
        Settings.System.TEXT_SHOW_PASSWORD,
        Settings.System.AUTO_TIME,                  // moved to global
        Settings.System.AUTO_TIME_ZONE,             // moved to global
        Settings.System.TIME_12_24,
        Settings.System.DATE_FORMAT,
        Settings.System.DTMF_TONE_WHEN_DIALING,
        Settings.System.DTMF_TONE_TYPE_WHEN_DIALING,
        Settings.System.HEARING_AID,
        Settings.System.TTY_MODE,
        Settings.System.MASTER_MONO,
        Settings.System.MASTER_BALANCE,
        Settings.System.SOUND_EFFECTS_ENABLED,
        Settings.System.HAPTIC_FEEDBACK_ENABLED,
        Settings.System.POWER_SOUNDS_ENABLED,       // moved to global
        Settings.System.DOCK_SOUNDS_ENABLED,        // moved to global
        Settings.System.LOCKSCREEN_SOUNDS_ENABLED,
        Settings.System.SHOW_WEB_SUGGESTIONS,
        Settings.System.SIP_CALL_OPTIONS,
        Settings.System.SIP_RECEIVE_CALLS,
        Settings.System.POINTER_SPEED,
        Settings.System.VIBRATE_WHEN_RINGING,
        Settings.System.RINGTONE,
        Settings.System.LOCK_TO_APP_ENABLED,
        Settings.System.NOTIFICATION_SOUND,
        Settings.System.ACCELEROMETER_ROTATION,
        Settings.System.SHOW_BATTERY_PERCENT,
        Settings.System.NOTIFICATION_VIBRATION_INTENSITY,
        Settings.System.RING_VIBRATION_INTENSITY,
        Settings.System.HAPTIC_FEEDBACK_INTENSITY,
        Settings.System.DISPLAY_COLOR_MODE,
        Settings.System.ALARM_ALERT,
        Settings.System.NOTIFICATION_LIGHT_PULSE,
        Settings.System.DOUBLE_TAP_SLEEP_GESTURE,
        Settings.System.DOUBLE_TAP_SLEEP_LOCKSCREEN,
        Settings.System.VOLUME_ROCKER_WAKE,
        Settings.System.VOLUME_BUTTON_MUSIC_CONTROL,
        Settings.System.RINGTONE_VIBRATION_PATTERN,
        Settings.System.CUSTOM_RINGTONE_VIBRATION_PATTERN,
        Settings.System.NOTIFICATION_HEADERS,
        Settings.System.CENTER_NOTIFICATION_HEADERS,
        Settings.System.USE_OLD_MOBILETYPE,
        Settings.System.QS_PANEL_BG_USE_NEW_TINT,
    };
}

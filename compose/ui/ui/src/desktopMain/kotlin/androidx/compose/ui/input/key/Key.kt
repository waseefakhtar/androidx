/*
 * Copyright 2020 The Android Open Source Project
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

package androidx.compose.ui.input.key

import java.awt.event.KeyEvent

// TODO(demin): implement most of key codes

/**
 * Actual implementation of [Key] for Desktop.
 *
 * @param keyCode an integer code representing the key pressed.
 */
// TODO: In AWT most modifiers have the same keycode. The only way how to distinguish them is
//  by using `location` property. The same about numpad location.
actual inline class Key(val keyCode: Int) {
    actual companion object {
        actual val Unknown = Key(0)
        actual val SoftLeft = Key(-1)
        actual val SoftRight = Key(-1)
        actual val Home = Key(KeyEvent.VK_HOME)
        actual val Back = Key(-1)
        actual val Help = Key(KeyEvent.VK_HELP)
        actual val NavigatePrevious = Key(-1)
        actual val NavigateNext = Key(-1)
        actual val NavigateIn = Key(-1)
        actual val NavigateOut = Key(-1)
        actual val SystemNavigationUp = Key(-1)
        actual val SystemNavigationDown = Key(-1)
        actual val SystemNavigationLeft = Key(-1)
        actual val SystemNavigationRight = Key(-1)
        actual val Call = Key(-1)
        actual val EndCall = Key(-1)
        actual val DPadUp = Key(KeyEvent.VK_KP_UP)
        actual val DPadDown = Key(KeyEvent.VK_KP_DOWN)
        actual val DPadLeft = Key(KeyEvent.VK_KP_LEFT)
        actual val DPadRight = Key(KeyEvent.VK_KP_RIGHT)
        actual val DPadCenter = Key(-1)
        actual val DPadUpLeft = Key(-1)
        actual val DPadDownLeft = Key(-1)
        actual val DPadUpRight = Key(-1)
        actual val DPadDownRight = Key(-1)
        actual val VolumeUp = Key(-1)
        actual val VolumeDown = Key(-1)
        actual val Power = Key(-1)
        actual val Camera = Key(-1)
        actual val Clear = Key(-1)
        actual val Number0 = Key(KeyEvent.VK_0)
        actual val Number1 = Key(KeyEvent.VK_1)
        actual val Number2 = Key(KeyEvent.VK_2)
        actual val Number3 = Key(KeyEvent.VK_3)
        actual val Number4 = Key(KeyEvent.VK_4)
        actual val Number5 = Key(KeyEvent.VK_5)
        actual val Number6 = Key(KeyEvent.VK_6)
        actual val Number7 = Key(KeyEvent.VK_7)
        actual val Number8 = Key(KeyEvent.VK_8)
        actual val Number9 = Key(KeyEvent.VK_9)
        actual val Number11 = Key(-1)
        actual val Number12 = Key(-1)
        actual val Plus = Key(KeyEvent.VK_PLUS)
        actual val Minus = Key(KeyEvent.VK_MINUS)
        actual val Multiply = Key(KeyEvent.VK_MULTIPLY)
        actual val Equals = Key(KeyEvent.VK_EQUALS)
        actual val Pound = Key(-1)
        actual val A = Key(KeyEvent.VK_A)
        actual val B = Key(KeyEvent.VK_B)
        actual val C = Key(KeyEvent.VK_C)
        actual val D = Key(KeyEvent.VK_D)
        actual val E = Key(KeyEvent.VK_E)
        actual val F = Key(KeyEvent.VK_F)
        actual val G = Key(KeyEvent.VK_G)
        actual val H = Key(KeyEvent.VK_H)
        actual val I = Key(KeyEvent.VK_I)
        actual val J = Key(KeyEvent.VK_J)
        actual val K = Key(KeyEvent.VK_K)
        actual val L = Key(KeyEvent.VK_L)
        actual val M = Key(KeyEvent.VK_M)
        actual val N = Key(KeyEvent.VK_N)
        actual val O = Key(KeyEvent.VK_O)
        actual val P = Key(KeyEvent.VK_P)
        actual val Q = Key(KeyEvent.VK_Q)
        actual val R = Key(KeyEvent.VK_R)
        actual val S = Key(KeyEvent.VK_S)
        actual val T = Key(KeyEvent.VK_T)
        actual val U = Key(KeyEvent.VK_U)
        actual val V = Key(KeyEvent.VK_V)
        actual val W = Key(KeyEvent.VK_W)
        actual val X = Key(KeyEvent.VK_X)
        actual val Y = Key(KeyEvent.VK_Y)
        actual val Z = Key(KeyEvent.VK_Z)
        actual val Comma = Key(KeyEvent.VK_COMMA)
        actual val Period = Key(KeyEvent.VK_PERIOD)
        actual val AltLeft = Key(KeyEvent.VK_ALT)
        actual val AltRight = Key(KeyEvent.VK_ALT)
        actual val ShiftLeft = Key(KeyEvent.VK_SHIFT)
        actual val ShiftRight = Key(KeyEvent.VK_SHIFT)
        actual val Tab = Key(KeyEvent.VK_TAB)
        actual val Spacebar = Key(KeyEvent.VK_SPACE)
        actual val Symbol = Key(-1)
        actual val Browser = Key(-1)
        actual val Envelope = Key(-1)
        actual val Enter = Key(KeyEvent.VK_ENTER)
        actual val Backspace = Key(KeyEvent.VK_BACK_SPACE)
        actual val Delete = Key(KeyEvent.VK_DELETE)
        actual val Escape = Key(KeyEvent.VK_ESCAPE)
        actual val CtrlLeft = Key(KeyEvent.VK_CONTROL)
        actual val CtrlRight = Key(KeyEvent.VK_CONTROL)
        actual val CapsLock = Key(KeyEvent.VK_CAPS_LOCK)
        actual val ScrollLock = Key(KeyEvent.VK_SCROLL_LOCK)
        actual val MetaLeft = Key(KeyEvent.VK_META)
        actual val MetaRight = Key(KeyEvent.VK_META)
        actual val Function = Key(-1)
        actual val PrintScreen = Key(KeyEvent.VK_PRINTSCREEN)
        actual val Break = Key(-1)
        actual val MoveHome = Key(-1)
        actual val MoveEnd = Key(-1)
        actual val Insert = Key(-1)
        actual val Cut = Key(-1)
        actual val Copy = Key(-1)
        actual val Paste = Key(-1)
        actual val Grave = Key(KeyEvent.VK_BACK_QUOTE)
        actual val LeftBracket = Key(KeyEvent.VK_OPEN_BRACKET)
        actual val RightBracket = Key(KeyEvent.VK_CLOSE_BRACKET)
        actual val Slash = Key(KeyEvent.VK_SLASH)
        actual val Backslash = Key(KeyEvent.VK_BACK_SLASH)
        actual val Semicolon = Key(KeyEvent.VK_SEMICOLON)
        actual val Apostrophe = Key(KeyEvent.VK_QUOTE)
        actual val At = Key(KeyEvent.VK_AT)
        actual val Number = Key(-1)
        actual val HeadsetHook = Key(-1)
        actual val Focus = Key(-1)
        actual val Menu = Key(-1)
        actual val Notification = Key(-1)
        actual val Search = Key(-1)
        actual val PageUp = Key(KeyEvent.VK_PAGE_UP)
        actual val PageDown = Key(KeyEvent.VK_PAGE_UP)
        actual val PictureSymbols = Key(-1)
        actual val SwitchCharset = Key(-1)
        actual val ButtonA = Key(-1)
        actual val ButtonB = Key(-1)
        actual val ButtonC = Key(-1)
        actual val ButtonX = Key(-1)
        actual val ButtonY = Key(-1)
        actual val ButtonZ = Key(-1)
        actual val ButtonL1 = Key(-1)
        actual val ButtonR1 = Key(-1)
        actual val ButtonL2 = Key(-1)
        actual val ButtonR2 = Key(-1)
        actual val ButtonThumbLeft = Key(-1)
        actual val ButtonThumbRight = Key(-1)
        actual val ButtonStart = Key(-1)
        actual val ButtonSelect = Key(-1)
        actual val ButtonMode = Key(-1)
        actual val Button1 = Key(-1)
        actual val Button2 = Key(-1)
        actual val Button3 = Key(-1)
        actual val Button4 = Key(-1)
        actual val Button5 = Key(-1)
        actual val Button6 = Key(-1)
        actual val Button7 = Key(-1)
        actual val Button8 = Key(-1)
        actual val Button9 = Key(-1)
        actual val Button10 = Key(-1)
        actual val Button11 = Key(-1)
        actual val Button12 = Key(-1)
        actual val Button13 = Key(-1)
        actual val Button14 = Key(-1)
        actual val Button15 = Key(-1)
        actual val Button16 = Key(-1)
        actual val Forward = Key(-1)
        actual val F1 = Key(KeyEvent.VK_F1)
        actual val F2 = Key(KeyEvent.VK_F2)
        actual val F3 = Key(KeyEvent.VK_F3)
        actual val F4 = Key(KeyEvent.VK_F4)
        actual val F5 = Key(KeyEvent.VK_F5)
        actual val F6 = Key(KeyEvent.VK_F6)
        actual val F7 = Key(KeyEvent.VK_F7)
        actual val F8 = Key(KeyEvent.VK_F8)
        actual val F9 = Key(KeyEvent.VK_F9)
        actual val F10 = Key(KeyEvent.VK_F10)
        actual val F11 = Key(KeyEvent.VK_F11)
        actual val F12 = Key(KeyEvent.VK_F12)
        actual val NumLock = Key(KeyEvent.VK_NUM_LOCK)
        actual val NumPad0 = Key(KeyEvent.VK_NUMPAD0)
        actual val NumPad1 = Key(KeyEvent.VK_NUMPAD1)
        actual val NumPad2 = Key(KeyEvent.VK_NUMPAD2)
        actual val NumPad3 = Key(KeyEvent.VK_NUMPAD3)
        actual val NumPad4 = Key(KeyEvent.VK_NUMPAD4)
        actual val NumPad5 = Key(KeyEvent.VK_NUMPAD5)
        actual val NumPad6 = Key(KeyEvent.VK_NUMPAD6)
        actual val NumPad7 = Key(KeyEvent.VK_NUMPAD7)
        actual val NumPad8 = Key(KeyEvent.VK_NUMPAD8)
        actual val NumPad9 = Key(KeyEvent.VK_NUMPAD9)
        actual val NumPadDivide = Key(KeyEvent.VK_DIVIDE)
        actual val NumPadMultiply = Key(KeyEvent.VK_MULTIPLY)
        actual val NumPadSubtract = Key(KeyEvent.VK_SUBTRACT)
        actual val NumPadAdd = Key(KeyEvent.VK_ADD)
        actual val NumPadDot = Key(KeyEvent.VK_PERIOD)
        actual val NumPadComma = Key(KeyEvent.VK_COMMA)
        actual val NumPadEnter = Key(KeyEvent.VK_ENTER)
        actual val NumPadEquals = Key(KeyEvent.VK_EQUALS)
        actual val NumPadLeftParenthesis = Key(KeyEvent.VK_LEFT_PARENTHESIS)
        actual val NumPadRightParenthesis = Key(KeyEvent.VK_RIGHT_PARENTHESIS)
        actual val MediaPlay = Key(-1)
        actual val MediaPause = Key(-1)
        actual val MediaPlayPause = Key(-1)
        actual val MediaStop = Key(-1)
        actual val MediaRecord = Key(-1)
        actual val MediaNext = Key(-1)
        actual val MediaPrevious = Key(-1)
        actual val MediaRewind = Key(-1)
        actual val MediaFastForward = Key(-1)
        actual val MediaClose = Key(-1)
        actual val MediaAudioTrack = Key(-1)
        actual val MediaEject = Key(-1)
        actual val MediaTopMenu = Key(-1)
        actual val MediaSkipForward = Key(-1)
        actual val MediaSkipBackward = Key(-1)
        actual val MediaStepForward = Key(-1)
        actual val MediaStepBackward = Key(-1)
        actual val MicrophoneMute = Key(-1)
        actual val VolumeMute = Key(-1)
        actual val Info = Key(-1)
        actual val ChannelUp = Key(-1)
        actual val ChannelDown = Key(-1)
        actual val ZoomIn = Key(-1)
        actual val ZoomOut = Key(-1)
        actual val Tv = Key(-1)
        actual val Window = Key(-1)
        actual val Guide = Key(-1)
        actual val Dvr = Key(-1)
        actual val Bookmark = Key(-1)
        actual val Captions = Key(-1)
        actual val Settings = Key(-1)
        actual val TvPower = Key(-1)
        actual val TvInput = Key(-1)
        actual val SetTopBoxPower = Key(-1)
        actual val SetTopBoxInput = Key(-1)
        actual val AvReceiverPower = Key(-1)
        actual val AvReceiverInput = Key(-1)
        actual val ProgramRed = Key(-1)
        actual val ProgramGreen = Key(-1)
        actual val ProgramYellow = Key(-1)
        actual val ProgramBlue = Key(-1)
        actual val AppSwitch = Key(-1)
        actual val LanguageSwitch = Key(-1)
        actual val MannerMode = Key(-1)
        actual val Toggle2D3D = Key(-1)
        actual val Contacts = Key(-1)
        actual val Calendar = Key(-1)
        actual val Music = Key(-1)
        actual val Calculator = Key(-1)
        actual val ZenkakuHankaru = Key(-1)
        actual val Eisu = Key(-1)
        actual val Muhenkan = Key(-1)
        actual val Henkan = Key(-1)
        actual val KatakanaHiragana = Key(-1)
        actual val Yen = Key(-1)
        actual val Ro = Key(-1)
        actual val Kana = Key(-1)
        actual val Assist = Key(-1)
        actual val BrightnessDown = Key(-1)
        actual val BrightnessUp = Key(-1)
        actual val Sleep = Key(-1)
        actual val WakeUp = Key(-1)
        actual val SoftSleep = Key(-1)
        actual val Pairing = Key(-1)
        actual val LastChannel = Key(-1)
        actual val TvDataService = Key(-1)
        actual val VoiceAssist = Key(-1)
        actual val TvRadioService = Key(-1)
        actual val TvTeletext = Key(-1)
        actual val TvNumberEntry = Key(-1)
        actual val TvTerrestrialAnalog = Key(-1)
        actual val TvTerrestrialDigital = Key(-1)
        actual val TvSatellite = Key(-1)
        actual val TvSatelliteBs = Key(-1)
        actual val TvSatelliteCs = Key(-1)
        actual val TvSatelliteService = Key(-1)
        actual val TvNetwork = Key(-1)
        actual val TvAntennaCable = Key(-1)
        actual val TvInputHdmi1 = Key(-1)
        actual val TvInputHdmi2 = Key(-1)
        actual val TvInputHdmi3 = Key(-1)
        actual val TvInputHdmi4 = Key(-1)
        actual val TvInputComposite1 = Key(-1)
        actual val TvInputComposite2 = Key(-1)
        actual val TvInputComponent1 = Key(-1)
        actual val TvInputComponent2 = Key(-1)
        actual val TvInputVga1 = Key(-1)
        actual val TvAudioDescription = Key(-1)
        actual val TvAudioDescriptionMixingVolumeUp = Key(-1)
        actual val TvAudioDescriptionMixingVolumeDown = Key(-1)
        actual val TvZoomMode = Key(-1)
        actual val TvContentsMenu = Key(-1)
        actual val TvMediaContextMenu = Key(-1)
        actual val TvTimerProgramming = Key(-1)
        actual val StemPrimary = Key(-1)
        actual val Stem1 = Key(-1)
        actual val Stem2 = Key(-1)
        actual val Stem3 = Key(-1)
        actual val AllApps = Key(-1)
        actual val Refresh = Key(-1)
        actual val ThumbsUp = Key(-1)
        actual val ThumbsDown = Key(-1)
        actual val ProfileSwitch = Key(-1)
    }

    actual override fun toString(): String {
        return "Key code: $keyCode"
    }
}

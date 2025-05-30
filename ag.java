/*
 * Decompiled with CFR 0.152.
 */
public abstract class ag
extends af {
    public static final Object b = new Object();

    public static int a(String string) {
        int n = 0;
        String string2 = null;
        block0 : switch (string.length()) {
            case 2: {
                switch (string.charAt(0)) {
                    case 'g': {
                        string2 = "gc";
                        n = -186;
                        break block0;
                    }
                    case 'i': {
                        string2 = "id";
                        n = -67;
                        break block0;
                    }
                }
                return 0;
            }
            case 3: {
                switch (string.charAt(1)) {
                    case 'e': {
                        string2 = "get";
                        n = -188;
                        break block0;
                    }
                    case 'r': {
                        string2 = "src";
                        n = -90;
                        break block0;
                    }
                    case 'a': {
                        switch (string.charAt(2)) {
                            case 'p': {
                                string2 = "map";
                                n = -23;
                                break block0;
                            }
                            case 'x': {
                                string2 = "max";
                                n = -24;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'd': {
                        string2 = "add";
                        n = -133;
                        break block0;
                    }
                    case 'M': {
                        string2 = "GME";
                        n = -368;
                        break block0;
                    }
                    case 'b': {
                        string2 = "abs";
                        n = -7;
                        break block0;
                    }
                    case 'I': {
                        switch (string.charAt(2)) {
                            case 'D': {
                                string2 = "$ID";
                                n = -396;
                                break block0;
                            }
                            case 'd': {
                                string2 = "$Id";
                                n = -397;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'i': {
                        string2 = "min";
                        n = -25;
                        break block0;
                    }
                    case 'o': {
                        switch (string.charAt(0)) {
                            case 'p': {
                                string2 = "pop";
                                n = -26;
                                break block0;
                            }
                            case 't': {
                                string2 = "top";
                                n = -360;
                                break block0;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
            case 4: {
                switch (string.charAt(0)) {
                    case 'e': {
                        string2 = "exec";
                        n = -61;
                        break block0;
                    }
                    case 'J': {
                        string2 = "JSON";
                        n = -400;
                        break block0;
                    }
                    case 'n': {
                        string2 = "name";
                        n = -82;
                        break block0;
                    }
                    case 'm': {
                        string2 = "mask";
                        n = -104;
                        break block0;
                    }
                    case 's': {
                        switch (string.charAt(2)) {
                            case 'r': {
                                string2 = "sort";
                                n = -36;
                                break block0;
                            }
                            case 'm': {
                                string2 = "some";
                                n = -35;
                                break block0;
                            }
                            case 'o': {
                                string2 = "stop";
                                n = -280;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'j': {
                        string2 = "join";
                        n = -19;
                        break block0;
                    }
                    case 'l': {
                        string2 = "left";
                        n = -363;
                        break block0;
                    }
                    case 'c': {
                        string2 = "call";
                        n = -10;
                        break block0;
                    }
                    case 'p': {
                        switch (string.charAt(1)) {
                            case 'l': {
                                string2 = "play";
                                n = -278;
                                break block0;
                            }
                            case 'u': {
                                string2 = "push";
                                n = -28;
                                break block0;
                            }
                            case 'o': {
                                string2 = "post";
                                n = -189;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'M': {
                        string2 = "Math";
                        n = -3;
                        break block0;
                    }
                    case 'D': {
                        string2 = "Date";
                        n = -385;
                        break block0;
                    }
                    case 'b': {
                        string2 = "back";
                        n = -191;
                        break block0;
                    }
                    case 'i': {
                        string2 = "init";
                        n = -307;
                        break block0;
                    }
                    case 't': {
                        switch (string.charAt(2)) {
                            case 'p': {
                                string2 = "type";
                                n = -87;
                                break block0;
                            }
                            case 'x': {
                                string2 = "text";
                                n = -101;
                                break block0;
                            }
                            case 's': {
                                string2 = "test";
                                n = -62;
                                break block0;
                            }
                            case 'i': {
                                string2 = "trim";
                                n = -65;
                                break block0;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
            case 5: {
                switch (string.charAt(0)) {
                    case 'S': {
                        switch (string.charAt(1)) {
                            case 'h': {
                                string2 = "Shape";
                                n = -86;
                                break block0;
                            }
                            case 't': {
                                string2 = "State";
                                n = -395;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'w': {
                        string2 = "width";
                        n = -68;
                        break block0;
                    }
                    case 'r': {
                        string2 = "right";
                        n = -361;
                        break block0;
                    }
                    case 'a': {
                        switch (string.charAt(1)) {
                            case 'l': {
                                string2 = "align";
                                n = -332;
                                break block0;
                            }
                            case 'p': {
                                string2 = "apply";
                                n = -9;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'E': {
                        string2 = "Error";
                        n = -57;
                        break block0;
                    }
                    case 'f': {
                        string2 = "focus";
                        n = -341;
                        break block0;
                    }
                    case 'L': {
                        string2 = "Label";
                        n = -99;
                        break block0;
                    }
                    case 'i': {
                        string2 = "image";
                        n = -91;
                        break block0;
                    }
                    case 'A': {
                        string2 = "Array";
                        n = -1;
                        break block0;
                    }
                    case 'e': {
                        string2 = "every";
                        n = -14;
                        break block0;
                    }
                    case 'm': {
                        string2 = "match";
                        n = -63;
                        break block0;
                    }
                    case 'v': {
                        string2 = "value";
                        n = -83;
                        break block0;
                    }
                    case 's': {
                        switch (string.charAt(3)) {
                            case 'l': {
                                string2 = "style";
                                n = -77;
                                break block0;
                            }
                            case 'c': {
                                string2 = "slice";
                                n = -34;
                                break block0;
                            }
                            case 'r': {
                                string2 = "start";
                                n = -309;
                                break block0;
                            }
                            case 'f': {
                                string2 = "shift";
                                n = -33;
                                break block0;
                            }
                            case 'i': {
                                string2 = "split";
                                n = -38;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'p': {
                        switch (string.charAt(2)) {
                            case 'u': {
                                string2 = "pause";
                                n = -279;
                                break block0;
                            }
                            case 'r': {
                                switch (string.charAt(3)) {
                                    case 'a': {
                                        string2 = "param";
                                        n = -88;
                                        break block0;
                                    }
                                    case 's': {
                                        string2 = "parse";
                                        n = -399;
                                        break block0;
                                    }
                                }
                                return 0;
                            }
                        }
                        return 0;
                    }
                    case 'c': {
                        string2 = "color";
                        n = -321;
                        break block0;
                    }
                    case 'I': {
                        string2 = "Image";
                        n = -89;
                        break block0;
                    }
                }
                return 0;
            }
            case 6: {
                switch (string.charAt(2)) {
                    case 'T': {
                        string2 = "noTabs";
                        n = -138;
                        break block0;
                    }
                    case 'a': {
                        switch (string.charAt(0)) {
                            case 'c': {
                                string2 = "charAt";
                                n = -11;
                                break block0;
                            }
                            case 's': {
                                string2 = "search";
                                n = -64;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'r': {
                        switch (string.charAt(5)) {
                            case 'l': {
                                string2 = "scroll";
                                n = -119;
                                break block0;
                            }
                            case 'e': {
                                string2 = "sprite";
                                n = -92;
                                break block0;
                            }
                            case 'n': {
                                string2 = "margin";
                                n = -347;
                                break block0;
                            }
                            case 'r': {
                                string2 = "border";
                                n = -359;
                                break block0;
                            }
                            case 'X': {
                                string2 = "worldX";
                                n = -78;
                                break block0;
                            }
                            case 'g': {
                                string2 = "String";
                                n = -5;
                                break block0;
                            }
                            case 'Y': {
                                string2 = "worldY";
                                n = -79;
                                break block0;
                            }
                            case 't': {
                                string2 = "target";
                                n = -70;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'd': {
                        switch (string.charAt(0)) {
                            case 'a': {
                                string2 = "addTab";
                                n = -139;
                                break block0;
                            }
                            case 'W': {
                                string2 = "Widget";
                                n = -66;
                                break block0;
                            }
                            case 'r': {
                                string2 = "reduce";
                                n = -30;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'j': {
                        string2 = "Object";
                        n = -4;
                        break block0;
                    }
                    case 'y': {
                        string2 = "layout";
                        n = -348;
                        break block0;
                    }
                    case 'g': {
                        string2 = "toggle";
                        n = -247;
                        break block0;
                    }
                    case 'L': {
                        string2 = "onLoad";
                        n = -122;
                        break block0;
                    }
                    case 't': {
                        switch (string.charAt(3)) {
                            case 'T': {
                                string2 = "setTab";
                                n = -141;
                                break block0;
                            }
                            case 'D': {
                                string2 = "getDay";
                                n = -387;
                                break block0;
                            }
                            case 'P': {
                                string2 = "getPIM";
                                n = -192;
                                break block0;
                            }
                            case 't': {
                                string2 = "bottom";
                                n = -362;
                                break block0;
                            }
                            case 'i': {
                                string2 = "notify";
                                n = -259;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'i': {
                        string2 = "height";
                        n = -69;
                        break block0;
                    }
                    case 'n': {
                        switch (string.charAt(0)) {
                            case 'l': {
                                string2 = "length";
                                n = -21;
                                break block0;
                            }
                            case 'c': {
                                string2 = "concat";
                                n = -13;
                                break block0;
                            }
                            case 'r': {
                                string2 = "random";
                                n = -29;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'm': {
                        switch (string.charAt(0)) {
                            case 'r': {
                                string2 = "remove";
                                n = -134;
                                break block0;
                            }
                            case 'N': {
                                string2 = "Number";
                                n = -54;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'v': {
                        string2 = "moveTo";
                        n = -76;
                        break block0;
                    }
                    case 's': {
                        string2 = "resume";
                        n = -310;
                        break block0;
                    }
                    case 'B': {
                        string2 = "onBlur";
                        n = -118;
                        break block0;
                    }
                    case 'l': {
                        switch (string.charAt(0)) {
                            case 'r': {
                                string2 = "reload";
                                n = -251;
                                break block0;
                            }
                            case 's': {
                                string2 = "splice";
                                n = -37;
                                break block0;
                            }
                            case 'f': {
                                string2 = "filter";
                                n = -15;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'c': {
                        string2 = "cycles";
                        n = -308;
                        break block0;
                    }
                    case 'p': {
                        string2 = "wapOut";
                        n = -195;
                        break block0;
                    }
                    case 'b': {
                        string2 = "substr";
                        n = -39;
                        break block0;
                    }
                    case 'I': {
                        string2 = "onInit";
                        n = -124;
                        break block0;
                    }
                }
                return 0;
            }
            case 7: {
                switch (string.charAt(3)) {
                    case 'S': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getSize";
                                n = -144;
                                break block0;
                            }
                            case 'm': {
                                string2 = "maxSize";
                                n = -107;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'r': {
                        switch (string.charAt(0)) {
                            case 'v': {
                                string2 = "vibrate";
                                n = -262;
                                break block0;
                            }
                            case 'o': {
                                string2 = "onError";
                                n = -293;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'a': {
                        string2 = "clearDB";
                        n = -181;
                        break block0;
                    }
                    case 'd': {
                        string2 = "padding";
                        n = -325;
                        break block0;
                    }
                    case 'E': {
                        string2 = "forEach";
                        n = -16;
                        break block0;
                    }
                    case 'u': {
                        switch (string.charAt(0)) {
                            case 'v': {
                                string2 = "valueOf";
                                n = -47;
                                break block0;
                            }
                            case 'f': {
                                string2 = "focused";
                                n = -74;
                                break block0;
                            }
                            case 'i': {
                                string2 = "isMuted";
                                n = -286;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'M': {
                        string2 = "setMute";
                        n = -287;
                        break block0;
                    }
                    case 'h': {
                        string2 = "unshift";
                        n = -46;
                        break block0;
                    }
                    case 'i': {
                        string2 = "visible";
                        n = -72;
                        break block0;
                    }
                    case 't': {
                        switch (string.charAt(0)) {
                            case 'e': {
                                string2 = "exitApp";
                                n = -197;
                                break block0;
                            }
                            case 'n': {
                                string2 = "nextTab";
                                n = -146;
                                break block0;
                            }
                            case 'T': {
                                string2 = "TextBox";
                                n = -100;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'e': {
                        switch (string.charAt(0)) {
                            case 'r': {
                                string2 = "reverse";
                                n = -32;
                                break block0;
                            }
                            case 'o': {
                                string2 = "onKeyUp";
                                n = -127;
                                break block0;
                            }
                            case 'i': {
                                string2 = "indexOf";
                                n = -18;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'm': {
                        string2 = "animate";
                        n = -8;
                        break block0;
                    }
                    case 'v': {
                        string2 = "prevTab";
                        n = -147;
                        break block0;
                    }
                    case 's': {
                        string2 = "version";
                        n = -198;
                        break block0;
                    }
                    case 'B': {
                        string2 = "hasBack";
                        n = -253;
                        break block0;
                    }
                    case 'l': {
                        string2 = "Boolean";
                        n = -53;
                        break block0;
                    }
                    case 'p': {
                        string2 = "display";
                        n = -261;
                        break block0;
                    }
                    case 'c': {
                        switch (string.charAt(0)) {
                            case 'e': {
                                string2 = "execute";
                                n = -250;
                                break block0;
                            }
                            case 'o': {
                                string2 = "opacity";
                                n = -350;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'D': {
                        string2 = "getDate";
                        n = -386;
                        break block0;
                    }
                    case 'I': {
                        string2 = "addItem";
                        n = -316;
                        break block0;
                    }
                    case 'R': {
                        string2 = "maxRows";
                        n = -103;
                        break block0;
                    }
                    case 'o': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "goToUrl";
                                n = -187;
                                break block0;
                            }
                            case 'o': {
                                string2 = "onFocus";
                                n = -117;
                                break block0;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
            case 8: {
                switch (string.charAt(3)) {
                    case 'S': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getState";
                                n = -81;
                                break block0;
                            }
                            case 's': {
                                string2 = "setState";
                                n = -80;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'V': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getValue";
                                n = -211;
                                break block0;
                            }
                            case 's': {
                                string2 = "setValue";
                                n = -210;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'u': {
                        string2 = "MenuList";
                        n = -311;
                        break block0;
                    }
                    case 'M': {
                        string2 = "getMonth";
                        n = -393;
                        break block0;
                    }
                    case 'h': {
                        string2 = "onChange";
                        n = -312;
                        break block0;
                    }
                    case 'C': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getCache";
                                n = -176;
                                break block0;
                            }
                            case 's': {
                                string2 = "setCache";
                                n = -175;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'i': {
                        string2 = "position";
                        n = -364;
                        break block0;
                    }
                    case 't': {
                        switch (string.charAt(4)) {
                            case 'S': {
                                string2 = "fontSize";
                                n = -354;
                                break block0;
                            }
                            case 'M': {
                                string2 = "textMode";
                                n = -102;
                                break block0;
                            }
                            case 'r': {
                                string2 = "toString";
                                n = -44;
                                break block0;
                            }
                            case 'P': {
                                string2 = "nextPage";
                                n = -108;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'e': {
                        switch (string.charAt(0)) {
                            case 's': {
                                string2 = "selected";
                                n = -85;
                                break block0;
                            }
                            case 'o': {
                                string2 = "onSelect";
                                n = -116;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'n': {
                        string2 = "onUnload";
                        n = -123;
                        break block0;
                    }
                    case 'W': {
                        switch (string.charAt(1)) {
                            case 'a': {
                                string2 = "maxWidth";
                                n = -333;
                                break block0;
                            }
                            case 'i': {
                                string2 = "minWidth";
                                n = -335;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'v': {
                        string2 = "prevPage";
                        n = -109;
                        break block0;
                    }
                    case 's': {
                        string2 = "parseInt";
                        n = -51;
                        break block0;
                    }
                    case 'l': {
                        switch (string.charAt(0)) {
                            case 'e': {
                                string2 = "evalJSON";
                                n = -245;
                                break block0;
                            }
                            case 'c': {
                                string2 = "collapse";
                                n = -73;
                                break block0;
                            }
                            case 'o': {
                                string2 = "onClosed";
                                n = -290;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'H': {
                        string2 = "getHours";
                        n = -389;
                        break block0;
                    }
                    case 'c': {
                        string2 = "Function";
                        n = -2;
                        break block0;
                    }
                }
                return 0;
            }
            case 9: {
                switch (string.charAt(0)) {
                    case 'r': {
                        string2 = "removeTab";
                        n = -140;
                        break block0;
                    }
                    case 'a': {
                        switch (string.charAt(1)) {
                            case 'l': {
                                string2 = "alignment";
                                n = -120;
                                break block0;
                            }
                            case 'c': {
                                string2 = "activated";
                                n = -371;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'T': {
                        switch (string.charAt(1)) {
                            case 'y': {
                                string2 = "TypeError";
                                n = -58;
                                break block0;
                            }
                            case 'o': {
                                string2 = "ToogleBox";
                                n = -84;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'u': {
                        string2 = "undefined";
                        n = -52;
                        break block0;
                    }
                    case 'M': {
                        switch (string.charAt(1)) {
                            case 'A': {
                                string2 = "MAX_VALUE";
                                n = -56;
                                break block0;
                            }
                            case 'I': {
                                string2 = "MIN_VALUE";
                                n = -55;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'g': {
                        string2 = "getRecord";
                        n = -179;
                        break block0;
                    }
                    case 'C': {
                        string2 = "Container";
                        n = -115;
                        break block0;
                    }
                    case 'f': {
                        string2 = "fontStyle";
                        n = -352;
                        break block0;
                    }
                    case 'i': {
                        string2 = "insertSYM";
                        n = -256;
                        break block0;
                    }
                    case 't': {
                        switch (string.charAt(2)) {
                            case 'H': {
                                string2 = "toHostMap";
                                n = -382;
                                break block0;
                            }
                            case 'u': {
                                string2 = "truncated";
                                n = -112;
                                break block0;
                            }
                            case 'x': {
                                string2 = "textAlign";
                                n = -356;
                                break block0;
                            }
                            case 't': {
                                string2 = "totalTabs";
                                n = -145;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'e': {
                        string2 = "emoticons";
                        n = -113;
                        break block0;
                    }
                    case 'n': {
                        switch (string.charAt(1)) {
                            case 'e': {
                                string2 = "nextFrame";
                                n = -95;
                                break block0;
                            }
                            case 'u': {
                                string2 = "numFrames";
                                n = -94;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'm': {
                        switch (string.charAt(1)) {
                            case 'a': {
                                string2 = "maxHeight";
                                n = -334;
                                break block0;
                            }
                            case 'i': {
                                string2 = "minHeight";
                                n = -336;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case '_': {
                        string2 = "__proto__";
                        n = -6;
                        break block0;
                    }
                    case 's': {
                        switch (string.charAt(1)) {
                            case 'e': {
                                string2 = "setRecord";
                                n = -178;
                                break block0;
                            }
                            case 'c': {
                                string2 = "scrollbar";
                                n = -342;
                                break block0;
                            }
                            case 'u': {
                                string2 = "substring";
                                n = -40;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'l': {
                        string2 = "lastFrame";
                        n = -98;
                        break block0;
                    }
                    case 'c': {
                        string2 = "connected";
                        n = -369;
                        break block0;
                    }
                    case 'p': {
                        switch (string.charAt(3)) {
                            case 'n': {
                                string2 = "phoneCall";
                                n = -196;
                                break block0;
                            }
                            case 'v': {
                                string2 = "prevFrame";
                                n = -96;
                                break block0;
                            }
                            case 't': {
                                string2 = "prototype";
                                n = -27;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'b': {
                        string2 = "borderArc";
                        n = -324;
                        break block0;
                    }
                    case 'o': {
                        switch (string.charAt(5)) {
                            case 'p': {
                                string2 = "onStopped";
                                n = -299;
                                break block0;
                            }
                            case 'r': {
                                string2 = "onStarted";
                                n = -298;
                                break block0;
                            }
                            case 'D': {
                                string2 = "onKeyDown";
                                n = -128;
                                break block0;
                            }
                            case 'L': {
                                string2 = "onKeyLeft";
                                n = -125;
                                break block0;
                            }
                            case 's': {
                                string2 = "onMessage";
                                n = -121;
                                break block0;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
            case 10: {
                switch (string.charAt(6)) {
                    case 'S': {
                        string2 = "screenShot";
                        n = -367;
                        break block0;
                    }
                    case 'a': {
                        string2 = "totalPages";
                        n = -111;
                        break block0;
                    }
                    case 'r': {
                        switch (string.charAt(0)) {
                            case 'a': {
                                string2 = "autoScroll";
                                n = -343;
                                break block0;
                            }
                            case 'R': {
                                string2 = "RangeError";
                                n = -59;
                                break block0;
                            }
                            case 'f': {
                                string2 = "firstFrame";
                                n = -97;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'N': {
                        string2 = "MotionNode";
                        n = -306;
                        break block0;
                    }
                    case 'd': {
                        string2 = "charCodeAt";
                        n = -12;
                        break block0;
                    }
                    case 'V': {
                        string2 = "createVBox";
                        n = -163;
                        break block0;
                    }
                    case 'u': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getMinutes";
                                n = -390;
                                break block0;
                            }
                            case 's': {
                                string2 = "setFocusOn";
                                n = -246;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'h': {
                        string2 = "StyleSheet";
                        n = -317;
                        break block0;
                    }
                    case 't': {
                        string2 = "setSoftkey";
                        n = -213;
                        break block0;
                    }
                    case 'i': {
                        string2 = "onKeyRight";
                        n = -126;
                        break block0;
                    }
                    case 'e': {
                        switch (string.charAt(0)) {
                            case 's': {
                                string2 = "setTimeout";
                                n = -229;
                                break block0;
                            }
                            case 'f': {
                                string2 = "focusKeyUp";
                                n = -131;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'n': {
                        string2 = "cseConnect";
                        n = -374;
                        break block0;
                    }
                    case 'P': {
                        string2 = "securePost";
                        n = -190;
                        break block0;
                    }
                    case 'm': {
                        switch (string.charAt(0)) {
                            case 'h': {
                                string2 = "hAlignment";
                                n = -330;
                                break block0;
                            }
                            case 'v': {
                                string2 = "vAlignment";
                                n = -331;
                                break block0;
                            }
                            case 'f': {
                                switch (string.charAt(1)) {
                                    case 'r': {
                                        string2 = "freeMemory";
                                        n = -233;
                                        break block0;
                                    }
                                    case 'o': {
                                        string2 = "fontFamily";
                                        n = -353;
                                        break block0;
                                    }
                                }
                                return 0;
                            }
                        }
                        return 0;
                    }
                    case 'H': {
                        string2 = "createHBox";
                        n = -164;
                        break block0;
                    }
                    case 'l': {
                        switch (string.charAt(0)) {
                            case 'C': {
                                string2 = "Controller";
                                n = -148;
                                break block0;
                            }
                            case 'v': {
                                string2 = "visibility";
                                n = -340;
                                break block0;
                            }
                            case 's': {
                                string2 = "styleClass";
                                n = -71;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'o': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getSeconds";
                                n = -391;
                                break block0;
                            }
                            case 'b': {
                                string2 = "background";
                                n = -358;
                                break block0;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
            case 11: {
                switch (string.charAt(6)) {
                    case 'F': {
                        string2 = "startGFYApp";
                        n = -254;
                        break block0;
                    }
                    case 'S': {
                        switch (string.charAt(0)) {
                            case 'c': {
                                string2 = "createShape";
                                n = -156;
                                break block0;
                            }
                            case 'b': {
                                string2 = "borderStyle";
                                n = -339;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'a': {
                        switch (string.charAt(3)) {
                            case 'D': {
                                string2 = "getDuration";
                                n = -283;
                                break block0;
                            }
                            case 'L': {
                                string2 = "getLocation";
                                n = -185;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'r': {
                        switch (string.charAt(2)) {
                            case 'L': {
                                string2 = "toLowerCase";
                                n = -43;
                                break block0;
                            }
                            case 't': {
                                string2 = "setEntryUrl";
                                n = -264;
                                break block0;
                            }
                            case 'U': {
                                string2 = "toUpperCase";
                                n = -45;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'd': {
                        string2 = "lastIndexOf";
                        n = -20;
                        break block0;
                    }
                    case 'V': {
                        string2 = "toggleValue";
                        n = -212;
                        break block0;
                    }
                    case 'C': {
                        switch (string.charAt(0)) {
                            case 'r': {
                                string2 = "removeCache";
                                n = -177;
                                break block0;
                            }
                            case 'b': {
                                string2 = "borderColor";
                                n = -323;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'L': {
                        string2 = "createLabel";
                        n = -151;
                        break block0;
                    }
                    case 'i': {
                        switch (string.charAt(0)) {
                            case 'w': {
                                string2 = "withSpinner";
                                n = -274;
                                break block0;
                            }
                            case 'c': {
                                string2 = "cseActivate";
                                n = -372;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 't': {
                        string2 = "currentPage";
                        n = -110;
                        break block0;
                    }
                    case 'A': {
                        string2 = "toHostArray";
                        n = -377;
                        break block0;
                    }
                    case 'e': {
                        switch (string.charAt(0)) {
                            case 'r': {
                                string2 = "replaceWith";
                                n = -75;
                                break block0;
                            }
                            case 't': {
                                string2 = "totalMemory";
                                n = -232;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'W': {
                        string2 = "borderWidth";
                        n = -322;
                        break block0;
                    }
                    case 'P': {
                        switch (string.charAt(0)) {
                            case 'c': {
                                string2 = "createPopup";
                                n = -166;
                                break block0;
                            }
                            case 't': {
                                string2 = "togglePopup";
                                n = -209;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 's': {
                        switch (string.charAt(0)) {
                            case 'b': {
                                string2 = "backHistory";
                                n = -244;
                                break block0;
                            }
                            case 'f': {
                                string2 = "fromHostMap";
                                n = -383;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'l': {
                        string2 = "getFullYear";
                        n = -388;
                        break block0;
                    }
                    case 'c': {
                        string2 = "queueAction";
                        n = -199;
                        break block0;
                    }
                    case 'q': {
                        string2 = "httpRequest";
                        n = -202;
                        break block0;
                    }
                    case 'I': {
                        string2 = "createImage";
                        n = -157;
                        break block0;
                    }
                    case 'R': {
                        switch (string.charAt(0)) {
                            case 'c': {
                                string2 = "createRadio";
                                n = -161;
                                break block0;
                            }
                            case 'r': {
                                string2 = "reduceRight";
                                n = -31;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'o': {
                        switch (string.charAt(10)) {
                            case 'X': {
                                string2 = "backgroundX";
                                n = -337;
                                break block0;
                            }
                            case 'Y': {
                                string2 = "backgroundY";
                                n = -338;
                                break block0;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
            case 12: {
                switch (string.charAt(6)) {
                    case 'S': {
                        switch (string.charAt(0)) {
                            case 'c': {
                                string2 = "createSpacer";
                                n = -155;
                                break block0;
                            }
                            case 'r': {
                                string2 = "removeScreen";
                                n = -220;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'e': {
                        switch (string.charAt(8)) {
                            case 'u': {
                                string2 = "httpsRequest";
                                n = -203;
                                break block0;
                            }
                            case 'D': {
                                string2 = "focusKeyDown";
                                n = -132;
                                break block0;
                            }
                            case 'L': {
                                string2 = "focusKeyLeft";
                                n = -129;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'n': {
                        switch (string.charAt(1)) {
                            case 'e': {
                                string2 = "setAsynchUrl";
                                n = -398;
                                break block0;
                            }
                            case 'o': {
                                string2 = "sortContacts";
                                n = -193;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'r': {
                        string2 = "triggerInput";
                        n = -218;
                        break block0;
                    }
                    case 'a': {
                        string2 = "fromCharCode";
                        n = -17;
                        break block0;
                    }
                    case 'N': {
                        string2 = "removeNotify";
                        n = -273;
                        break block0;
                    }
                    case 'm': {
                        string2 = "addAnimation";
                        n = -201;
                        break block0;
                    }
                    case 'V': {
                        string2 = "toHostVector";
                        n = -378;
                        break block0;
                    }
                    case 'H': {
                        string2 = "createHidden";
                        n = -158;
                        break block0;
                    }
                    case 'M': {
                        string2 = "openSYMTable";
                        n = -258;
                        break block0;
                    }
                    case 'C': {
                        string2 = "invokeCamera";
                        n = -182;
                        break block0;
                    }
                    case 'I': {
                        string2 = "closePIMList";
                        n = -243;
                        break block0;
                    }
                    case 'R': {
                        string2 = "removeRecord";
                        n = -180;
                        break block0;
                    }
                    case 'f': {
                        string2 = "onEndOfMedia";
                        n = -292;
                        break block0;
                    }
                    case 'i': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getMediaTime";
                                n = -281;
                                break block0;
                            }
                            case 's': {
                                string2 = "setMediaTime";
                                n = -282;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 't': {
                        switch (string.charAt(0)) {
                            case 'c': {
                                string2 = "currentFrame";
                                n = -93;
                                break block0;
                            }
                            case 'T': {
                                string2 = "TabContainer";
                                n = -137;
                                break block0;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
            case 13: {
                switch (string.charAt(8)) {
                    case 'r': {
                        string2 = "stopRecording";
                        n = -304;
                        break block0;
                    }
                    case 'a': {
                        string2 = "onSizeChanged";
                        n = -297;
                        break block0;
                    }
                    case 'T': {
                        string2 = "closeSYMTable";
                        n = -257;
                        break block0;
                    }
                    case 'x': {
                        string2 = "createTextBox";
                        n = -152;
                        break block0;
                    }
                    case 'd': {
                        string2 = "getAllWidgets";
                        n = -136;
                        break block0;
                    }
                    case 'E': {
                        string2 = "onRecordError";
                        n = -294;
                        break block0;
                    }
                    case 'V': {
                        string2 = "selectedValue";
                        n = -315;
                        break block0;
                    }
                    case 'y': {
                        string2 = "isPrototypeOf";
                        n = -50;
                        break block0;
                    }
                    case 'L': {
                        string2 = "selectedLabel";
                        n = -314;
                        break block0;
                    }
                    case 't': {
                        switch (string.charAt(12)) {
                            case 'g': {
                                string2 = "bytesToString";
                                n = -255;
                                break block0;
                            }
                            case 'D': {
                                string2 = "getWidgetByID";
                                n = -150;
                                break block0;
                            }
                            case 'd': {
                                string2 = "getWidgetById";
                                n = -149;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'A': {
                        string2 = "fromHostArray";
                        n = -379;
                        break block0;
                    }
                    case 'n': {
                        switch (string.charAt(0)) {
                            case 'c': {
                                string2 = "cseDisconnect";
                                n = -375;
                                break block0;
                            }
                            case 'g': {
                                switch (string.charAt(3)) {
                                    case 'T': {
                                        string2 = "getTabContent";
                                        n = -143;
                                        break block0;
                                    }
                                    case 'C': {
                                        string2 = "getCurrentURL";
                                        n = -252;
                                        break block0;
                                    }
                                }
                                return 0;
                            }
                            case 'd': {
                                string2 = "deleteContact";
                                n = -242;
                                break block0;
                            }
                            case 's': {
                                string2 = "setTabContent";
                                n = -142;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'm': {
                        string2 = "localeCompare";
                        n = -22;
                        break block0;
                    }
                    case 's': {
                        string2 = "toggleDisable";
                        n = -219;
                        break block0;
                    }
                    case 'c': {
                        string2 = "authenticated";
                        n = -370;
                        break block0;
                    }
                    case 'R': {
                        switch (string.charAt(0)) {
                            case '*': {
                                string2 = "**createRegex";
                                n = -60;
                                break block0;
                            }
                            case 'f': {
                                string2 = "focusKeyRight";
                                n = -130;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'I': {
                        string2 = "selectedIndex";
                        n = -313;
                        break block0;
                    }
                    case 'o': {
                        string2 = "dropShadowTop";
                        n = -326;
                        break block0;
                    }
                }
                return 0;
            }
            case 14: {
                switch (string.charAt(3)) {
                    case 'S': {
                        switch (string.charAt(4)) {
                            case 'c': {
                                string2 = "getScreenWidth";
                                n = -230;
                                break block0;
                            }
                            case 'o': {
                                string2 = "getSoftkeyText";
                                n = -214;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'A': {
                        string2 = "getAppProperty";
                        n = -207;
                        break block0;
                    }
                    case 'e': {
                        string2 = "resetScrollbar";
                        n = -174;
                        break block0;
                    }
                    case 'O': {
                        string2 = "hasOwnProperty";
                        n = -49;
                        break block0;
                    }
                    case 'r': {
                        string2 = "startRecording";
                        n = -303;
                        break block0;
                    }
                    case 'a': {
                        switch (string.charAt(6)) {
                            case 'e': {
                                string2 = "disableBackKey";
                                n = -267;
                                break block0;
                            }
                            case 'M': {
                                string2 = "createMenuList";
                                n = -170;
                                break block0;
                            }
                            case 'C': {
                                string2 = "createCheckbox";
                                n = -162;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'm': {
                        string2 = "fromHostVector";
                        n = -380;
                        break block0;
                    }
                    case 'V': {
                        switch (string.charAt(0)) {
                            case 'g': {
                                string2 = "getVolumeLevel";
                                n = -284;
                                break block0;
                            }
                            case 's': {
                                string2 = "setVolumeLevel";
                                n = -285;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'y': {
                        string2 = "playAlertSound";
                        n = -263;
                        break block0;
                    }
                    case 'p': {
                        switch (string.charAt(0)) {
                            case 'd': {
                                string2 = "dropShadowLeft";
                                n = -329;
                                break block0;
                            }
                            case 's': {
                                string2 = "stopAnimations";
                                n = -205;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'h': {
                        string2 = "highlightColor";
                        n = -351;
                        break block0;
                    }
                    case 'C': {
                        string2 = "getContentType";
                        n = -305;
                        break block0;
                    }
                    case 'g': {
                        string2 = "toggleMenuList";
                        n = -217;
                        break block0;
                    }
                    case 't': {
                        string2 = "textDecoration";
                        n = -355;
                        break block0;
                    }
                    case 'o': {
                        string2 = "toLocaleString";
                        n = -48;
                        break block0;
                    }
                }
                return 0;
            }
            case 15: {
                switch (string.charAt(3)) {
                    case 'A': {
                        string2 = "cseAuthenticate";
                        n = -373;
                        break block0;
                    }
                    case 'e': {
                        switch (string.charAt(10)) {
                            case 'a': {
                                string2 = "onRecordStarted";
                                n = -295;
                                break block0;
                            }
                            case 'o': {
                                string2 = "onRecordStopped";
                                n = -296;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'S': {
                        string2 = "getScreenHeight";
                        n = -231;
                        break block0;
                    }
                    case 'a': {
                        string2 = "createSeparator";
                        n = -154;
                        break block0;
                    }
                    case 'P': {
                        string2 = "getPIMNameField";
                        n = -237;
                        break block0;
                    }
                    case 'd': {
                        string2 = "sendTextMessage";
                        n = -221;
                        break block0;
                    }
                    case 'p': {
                        string2 = "dropShadowRight";
                        n = -327;
                        break block0;
                    }
                    case 'c': {
                        string2 = "cancelTextEntry";
                        n = -114;
                        break block0;
                    }
                    case 'M': {
                        string2 = "getMilliseconds";
                        n = -392;
                        break block0;
                    }
                    case 'k': {
                        switch (string.charAt(10)) {
                            case 'C': {
                                string2 = "backgroundColor";
                                n = -319;
                                break block0;
                            }
                            case 'I': {
                                string2 = "backgroundImage";
                                n = -320;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'C': {
                        string2 = "getContactField";
                        n = -194;
                        break block0;
                    }
                    case 't': {
                        string2 = "onStoppedAtTime";
                        n = -300;
                        break block0;
                    }
                    case 'o': {
                        string2 = "onVolumeChanged";
                        n = -301;
                        break block0;
                    }
                }
                return 0;
            }
            case 16: {
                switch (string.charAt(11)) {
                    case 'e': {
                        string2 = "backgroundRepeat";
                        n = -318;
                        break block0;
                    }
                    case 'S': {
                        string2 = "createStyleSheet";
                        n = -153;
                        break block0;
                    }
                    case 'n': {
                        string2 = "createMotionNode";
                        n = -200;
                        break block0;
                    }
                    case 'd': {
                        string2 = "removeAllWidgets";
                        n = -135;
                        break block0;
                    }
                    case 's': {
                        string2 = "notifyAndDisplay";
                        n = -260;
                        break block0;
                    }
                    case 'l': {
                        string2 = "MultiMediaPlayer";
                        n = -277;
                        break block0;
                    }
                    case 'c': {
                        string2 = "**createFunction";
                        n = -376;
                        break block0;
                    }
                    case 'L': {
                        string2 = "addWidgetToLayer";
                        n = -172;
                        break block0;
                    }
                    case 'f': {
                        string2 = "applyImageEffect";
                        n = -225;
                        break block0;
                    }
                    case 'o': {
                        string2 = "dropShadowBottom";
                        n = -328;
                        break block0;
                    }
                    case 't': {
                        string2 = "inputSuggestions";
                        n = -105;
                        break block0;
                    }
                }
                return 0;
            }
            case 17: {
                switch (string.charAt(10)) {
                    case 'e': {
                        string2 = "getTimezoneOffset";
                        n = -394;
                        break block0;
                    }
                    case 'w': {
                        string2 = "toLocaleLowerCase";
                        n = -41;
                        break block0;
                    }
                    case 'O': {
                        switch (string.charAt(0)) {
                            case 'a': {
                                string2 = "applyImageOverlay";
                                n = -227;
                                break block0;
                            }
                            case 'b': {
                                string2 = "backgroundOpacity";
                                n = -349;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'a': {
                        string2 = "onDeviceAvailable";
                        n = -302;
                        break block0;
                    }
                    case 'r': {
                        string2 = "getSystemProperty";
                        n = -206;
                        break block0;
                    }
                    case 'u': {
                        string2 = "getLastFocusedBox";
                        n = -249;
                        break block0;
                    }
                    case 'p': {
                        string2 = "toLocaleUpperCase";
                        n = -42;
                        break block0;
                    }
                    case 'k': {
                        string2 = "sdcardCheckString";
                        n = -275;
                        break block0;
                    }
                    case 'M': {
                        string2 = "sendBinaryMessage";
                        n = -222;
                        break block0;
                    }
                    case 'C': {
                        string2 = "getSoftkeyCommand";
                        n = -215;
                        break block0;
                    }
                    case 'U': {
                        string2 = "onDurationUpdated";
                        n = -291;
                        break block0;
                    }
                    case 'o': {
                        switch (string.charAt(6)) {
                            case 'A': {
                                string2 = "createAudioPlayer";
                                n = -165;
                                break block0;
                            }
                            case 'a': {
                                string2 = "writeDataToDevice";
                                n = -235;
                                break block0;
                            }
                            case 'V': {
                                string2 = "createVideoPlayer";
                                n = -168;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'i': {
                        string2 = "getDeviceFileUrls";
                        n = -224;
                        break block0;
                    }
                }
                return 0;
            }
            case 18: {
                switch (string.charAt(9)) {
                    case 'A': {
                        string2 = "scrollbarAlignment";
                        n = -346;
                        break block0;
                    }
                    case 'F': {
                        string2 = "scrollbarFaceColor";
                        n = -344;
                        break block0;
                    }
                    case 'n': {
                        switch (string.charAt(13)) {
                            case 'a': {
                                string2 = "onBufferingStarted";
                                n = -288;
                                break block0;
                            }
                            case 'o': {
                                string2 = "onBufferingStopped";
                                n = -289;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'r': {
                        switch (string.charAt(0)) {
                            case 'r': {
                                string2 = "readDataFromDevice";
                                n = -236;
                                break block0;
                            }
                            case 'g': {
                                string2 = "getPIMAddressField";
                                n = -241;
                                break block0;
                            }
                        }
                        return 0;
                    }
                    case 'N': {
                        string2 = "createPIMNameField";
                        n = -238;
                        break block0;
                    }
                    case 'C': {
                        string2 = "createTabContainer";
                        n = -171;
                        break block0;
                    }
                    case 'I': {
                        string2 = "getDeviceImageUrls";
                        n = -223;
                        break block0;
                    }
                    case 'f': {
                        string2 = "disableLeftSoftkey";
                        n = -265;
                        break block0;
                    }
                }
                return 0;
            }
            case 19: {
                switch (string.charAt(6)) {
                    case 'e': {
                        string2 = "disableRightSoftkey";
                        n = -266;
                        break block0;
                    }
                    case 'A': {
                        string2 = "invokeAudioRecorder";
                        n = -184;
                        break block0;
                    }
                    case 'b': {
                        string2 = "scrollbarTrackColor";
                        n = -345;
                        break block0;
                    }
                    case 'm': {
                        string2 = "applyImageTransform";
                        n = -226;
                        break block0;
                    }
                    case 't': {
                        string2 = "currentFunctionName";
                        n = -384;
                        break block0;
                    }
                    case 'V': {
                        string2 = "invokeVideoRecorder";
                        n = -183;
                        break block0;
                    }
                }
                return 0;
            }
            case 20: {
                switch (string.charAt(7)) {
                    case 'e': {
                        string2 = "getCurrentFocusedBox";
                        n = -248;
                        break block0;
                    }
                    case 'l': {
                        string2 = "removeAllCachedPages";
                        n = -208;
                        break block0;
                    }
                    case 'u': {
                        string2 = "backgroundAttachment";
                        n = -357;
                        break block0;
                    }
                    case 'a': {
                        string2 = "scrollbarBorderColor";
                        n = -366;
                        break block0;
                    }
                    case 'k': {
                        string2 = "inputTokenDelimiters";
                        n = -106;
                        break block0;
                    }
                    case 'm': {
                        string2 = "createImageFromBytes";
                        n = -159;
                        break block0;
                    }
                    case 'i': {
                        string2 = "createFixedSizeImage";
                        n = -160;
                        break block0;
                    }
                }
                return 0;
            }
            case 21: {
                switch (string.charAt(6)) {
                    case 'M': {
                        string2 = "createMotionSequencer";
                        n = -204;
                        break block0;
                    }
                    case 'W': {
                        string2 = "removeWidgetFromLayer";
                        n = -173;
                        break block0;
                    }
                    case 'P': {
                        string2 = "createPIMAddressField";
                        n = -239;
                        break block0;
                    }
                }
                return 0;
            }
            case 22: {
                switch (string.charAt(9)) {
                    case 'e': {
                        string2 = "androidOpenOptionsMenu";
                        n = -268;
                        break block0;
                    }
                    case 't': {
                        string2 = "androidOptionsMenuSize";
                        n = -272;
                        break block0;
                    }
                }
                return 0;
            }
            case 23: {
                switch (string.charAt(9)) {
                    case 'e': {
                        string2 = "androidClearOptionsMenu";
                        n = -270;
                        break block0;
                    }
                    case 't': {
                        string2 = "msSinceInterpreterStart";
                        n = -381;
                        break block0;
                    }
                    case 'o': {
                        string2 = "androidCloseOptionsMenu";
                        n = -271;
                        break block0;
                    }
                }
                return 0;
            }
            case 24: {
                switch (string.charAt(0)) {
                    case 'u': {
                        string2 = "updateAddressBookContact";
                        n = -240;
                        break block0;
                    }
                    case 'c': {
                        string2 = "createAddressBookContact";
                        n = -234;
                        break block0;
                    }
                    case 't': {
                        string2 = "toggleSoftkeyOptionsMenu";
                        n = -216;
                        break block0;
                    }
                }
                return 0;
            }
            case 25: {
                string2 = "androidAddOptionsMenuItem";
                n = -269;
                break;
            }
            case 26: {
                switch (string.charAt(6)) {
                    case 'A': {
                        string2 = "createAudioPlayerFromBytes";
                        n = -167;
                        break block0;
                    }
                    case 'V': {
                        string2 = "createVideoPlayerFromBytes";
                        n = -169;
                        break block0;
                    }
                }
                return 0;
            }
            case 28: {
                string2 = "createLabelWithEmbeddedLinks";
                n = -276;
                break;
            }
            case 30: {
                string2 = "scrollbarHorizontalOrientation";
                n = -365;
                break;
            }
            case 33: {
                string2 = "convertWidgetToUseFixedCoordinate";
                n = -228;
            }
        }
        if (string.equals(string2)) {
            return n;
        }
        return 0;
    }

    public boolean a(ah ah2, String string) {
        if (super.c(ah2, string)) {
            return true;
        }
        int n = ag.a(string);
        if (n != 0 && this.a(ah2, n)) {
            if (ah2.a(b)) {
                ad ad2 = ad.a(this, n);
                ah2.a(ad2);
                this.a_(string, ad2);
            }
            return true;
        }
        af af2 = this.a();
        if (af2 != null) {
            return af2.a(ah2, string);
        }
        return false;
    }

    public final boolean d(ah ah2, String string) {
        if (super.d(ah2, string)) {
            return true;
        }
        int n = ag.a(string);
        if (n == 0) {
            return false;
        }
        if (ah2 == null) {
            ah2 = new ah();
        }
        boolean bl = this.a(ah2, n);
        return bl;
    }

    public void a_(String string, Object object) {
        int n = ag.a(string);
        if (n != 0) {
            ah ah2;
            n = object instanceof ah ? ((ah2 = (ah)object).a() ? (int)(this.a(n, true, ah2.e() ? ah2.a() : null, ah2.b()) ? 1 : 0) : (int)(this.a(n, false, ah2.a(), 0) ? 1 : 0)) : (int)(this.a(n, false, object, 0) ? 1 : 0);
            if (n != 0) {
                return;
            }
        }
        super.a_(string, object);
    }

    public abstract boolean a(ah var1, int var2);

    public boolean a(int n, boolean bl, Object object, int n2) {
        return false;
    }

    public boolean a(ah ah2, af af2, int n, ah ah3) {
        throw new RuntimeException("callBuiltinMethod not implemented");
    }

    public final void b(ah ah2, af af2, String object, ah ah3) {
        if (af2 == null) {
            af2 = this;
        }
        if (super.c(ah2, (String)object)) {
            object = (af)ah2.a();
            if (!((af)object).a()) {
                throw new ClassCastException();
            }
            ((af)object).a(ah2, af2, ah3);
            return;
        }
        int n = ag.a((String)object);
        if (n == 0 || !this.a(ah2, n)) {
            af af3 = this.a();
            if (af3 != null) {
                af3.b(ah2, af2, (String)object, ah3);
                return;
            }
            throw new RuntimeException("SOWB.callMethod: no method " + (String)object);
        }
        if (ah2.a() != b) {
            object = (af)ah2.a();
            if (!((af)object).a()) {
                throw new ClassCastException();
            }
            ((af)object).a(ah2, af2, ah3);
            return;
        }
        this.a(ah2, af2, n, ah3);
    }
}

/*
 *
 */
package ru.ildev.color;

import ru.ildev.math.MoreMath;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс объекта 32-битного цвета. Он также содержит статические утилиты.
 *
 * @author Shafigin Ilyas (Шафигин Ильяс) <Ilyas74>
 * @version 0.3.8
 */
public class Color {

    // Стандартные цвета.

    /**  */
    public static final Color ALICEBLUE = new Color(0xf0f8ff);
    /**  */
    public static final Color ANTIQUEWHITE = new Color(0xfaebd7);
    /**
     * Аква.
     */
    public static final Color AQUA = new Color(0x00ffff);
    /**  */
    public static final Color AQUAMARINE = new Color(0x7fffd4);
    /**  */
    public static final Color AZURE = new Color(0xf0ffff);
    /**  */
    public static final Color BEIGE = new Color(0xf5f5dc);
    /**  */
    public static final Color BISQUE = new Color(0xffe4c4);
    /**
     * Черный.
     */
    public static final Color BLACK = new Color(0x000000);
    /**  */
    public static final Color BLANCHEDALMOND = new Color(0xffebcd);
    /**
     * Синий.
     */
    public static final Color BLUE = new Color(0x0000ff);
    /**  */
    public static final Color BLUEVIOLET = new Color(0x8a2be2);
    /**
     * Коричневый.
     */
    public static final Color BROWN = new Color(0xa52a2a);
    /**  */
    public static final Color BURLYWOOD = new Color(0xdeb887);
    /**  */
    public static final Color CADETBLUE = new Color(0x5f9ea0);
    /**  */
    public static final Color CHARTREUSE = new Color(0x7fff00);
    /**  */
    public static final Color CHOCOLATE = new Color(0xf2691e);
    /**  */
    public static final Color CORAL = new Color(0xff7f50);
    /**  */
    public static final Color CORNFLOWERBLUE = new Color(0x6495ed);
    /**  */
    public static final Color CORNSILK = new Color(0xfff8dc);
    /**  */
    public static final Color CRIMSON = new Color(0xdc143c);
    /**
     * Голубой.
     */
    public static final Color CYAN = new Color(0x00ffff);
    /**
     * Темно-синий.
     */
    public static final Color DARK_BLUE = new Color(0x00008b);
    /**
     * Темно-голубой.
     */
    public static final Color DARK_CYAN = new Color(0x008b8b);
    /**  */
    public static final Color DARK_GOLDENROD = new Color(0xb8860b);
    /**
     * Темно-серый.
     */
    public static final Color DARK_GRAY = new Color(0xa9a9a9);
    /**
     * Темно-зеленый.
     */
    public static final Color DARK_GREEN = new Color(0x006400);
    /**  */
    public static final Color DARK_KHAKI = new Color(0xbdb76b);
    /**  */
    public static final Color DARK_MAGENTA = new Color(0x8b008b);
    /**
     * Темно-оливковый.
     */
    public static final Color DARK_OLIVEGREEN = new Color(0x556b2f);
    /**
     * Темно-оранжевый.
     */
    public static final Color DARK_ORANGE = new Color(0xff8c00);
    /**  */
    public static final Color DARK_ORCHID = new Color(0x9932cc);
    /**
     * Темно-красный.
     */
    public static final Color DARK_RED = new Color(0x8b0000);
    /**  */
    public static final Color DARK_SALMON = new Color(0xe9967a);
    /**  */
    public static final Color DARK_SEAGREEN = new Color(0x8fbc8f);
    /**  */
    public static final Color DARK_SLATEBLUE = new Color(0x483d8b);
    /**  */
    public static final Color DARK_SLATEGRAY = new Color(0x2f4f4f);
    /**  */
    public static final Color DARK_TURQUOISE = new Color(0x00ced1);
    /**
     * Темно-фиолетовый.
     */
    public static final Color DARK_VIOLET = new Color(0x9400d3);
    /**  */
    public static final Color DEEPPINK = new Color(0xff1493);
    /**  */
    public static final Color DEEPSKYBLUE = new Color(0x00bfff);
    /**  */
    public static final Color DIMGRAY = new Color(0x696969);
    /**  */
    public static final Color DODGERBLUE = new Color(0x1e90ff);
    /**  */
    public static final Color FIREBRICK = new Color(0xb22222);
    /**  */
    public static final Color FLORALWHITE = new Color(0xfffaf0);
    /**  */
    public static final Color FORESTGREEN = new Color(0x228b22);
    /**  */
    public static final Color FUCHSIA = new Color(0xff00ff);
    /**  */
    public static final Color GAINSBORO = new Color(0xdcdcdc);
    /**  */
    public static final Color GHOSTWHITE = new Color(0xf8f8ff);
    /**
     * Золотой.
     */
    public static final Color GOLD = new Color(0xffd700);
    /**  */
    public static final Color GOLDENROD = new Color(0xdaa520);
    /**
     * Серый.
     */
    public static final Color GRAY = new Color(0x808080);
    /**
     * Зеленый.
     */
    public static final Color GREEN = new Color(0x00ff00);
    /**  */
    public static final Color GREENYELLOW = new Color(0xadff2f);
    /**  */
    public static final Color HONEYDEW = new Color(0xf0fff0);
    /**  */
    public static final Color HOTPINK = new Color(0xff69b4);
    /**  */
    public static final Color INDIANRED = new Color(0xcd5c5c);
    /**
     * Индиго.
     */
    public static final Color INDIGO = new Color(0x4b0082);
    /**  */
    public static final Color IVORY = new Color(0xfffff0);
    /**  */
    public static final Color KHAKI = new Color(0xf0e68c);
    /**  */
    public static final Color LAVENDER = new Color(0xe6e6fa);
    /**  */
    public static final Color LAVENDERBLUSH = new Color(0xfff0f5);
    /**  */
    public static final Color LAWNGREEN = new Color(0x7cfc00);
    /**  */
    public static final Color LEMONCHIFFON = new Color(0xfffacd);
    /**
     * Светло-синий.
     */
    public static final Color LIGHT_BLUE = new Color(0xadd8e6);
    /**  */
    public static final Color LIGHT_CORAL = new Color(0xf08080);
    /**
     * Светло-голубой.
     */
    public static final Color LIGHT_CYAN = new Color(0xe0ffff);
    /**  */
    public static final Color LIGHT_GOLDENRODYELLOW = new Color(0xfafad2);
    /**
     * Светло-серый.
     */
    public static final Color LIGHT_GRAY = new Color(0xd3d3d3);
    /**
     * Светло-зеленый.
     */
    public static final Color LIGHT_GREEN = new Color(0x90ee90);
    /**
     * Светло-розовый.
     */
    public static final Color LIGHT_PINK = new Color(0xffb6c1);
    /**  */
    public static final Color LIGHT_SALMON = new Color(0xffa07a);
    /**  */
    public static final Color LIGHT_SEAGREEN = new Color(0x20b2aa);
    /**  */
    public static final Color LIGHT_SKYBLUE = new Color(0x87cefa);
    /**  */
    public static final Color LIGHT_SLATEGRAY = new Color(0x778899);
    /**  */
    public static final Color LIGHT_STEELBLUE = new Color(0xb0c4de);
    /**
     * Светло-жёлтый.
     */
    public static final Color LIGHT_YELLOW = new Color(0xffffe0);
    /**
     * Лаймовый.
     */
    public static final Color LIME = new Color(0x00ff00);
    /**  */
    public static final Color LIMEGREEN = new Color(0x32cd32);
    /**  */
    public static final Color LINEN = new Color(0xfaf0e6);
    /**  */
    public static final Color MAGENTA = new Color(0xff00ff);
    /**  */
    public static final Color MAROON = new Color(0x800000);
    /**  */
    public static final Color MEDIUM_AQUAMARINE = new Color(0x66cdaa);
    /**  */
    public static final Color MEDIUM_BLUE = new Color(0x0000cd);
    /**  */
    public static final Color MEDIUM_ORCHID = new Color(0xba55d3);
    /**  */
    public static final Color MEDIUM_PURPLE = new Color(0x9370d8);
    /**  */
    public static final Color MEDIUM_SEAGREEN = new Color(0x3cd371);
    /**  */
    public static final Color MEDIUM_SLATEBLUE = new Color(0x7b68ee);
    /**  */
    public static final Color MEDIUM_SPRINGGREEN = new Color(0x00fa9a);
    /**  */
    public static final Color MEDIUM_TURQUOISE = new Color(0x48d1cc);
    /**  */
    public static final Color MEDIUM_VIOLETRED = new Color(0xc71585);
    /**  */
    public static final Color MIDNIGTBLUE = new Color(0x191970);
    /**  */
    public static final Color MINTCREAM = new Color(0xf5fffa);
    /**  */
    public static final Color MISTYROSE = new Color(0xffe4e1);
    /**  */
    public static final Color MOCCASIN = new Color(0xffe4b5);
    /**  */
    public static final Color NAVAJOWHITE = new Color(0xffdead);
    /**  */
    public static final Color NAVY = new Color(0x000080);
    /**  */
    public static final Color OLDLACE = new Color(0xfdf5e6);
    /**
     * Оливковый.
     */
    public static final Color OLIVE = new Color(0x808000);
    /**  */
    public static final Color OLIVEDRAB = new Color(0x6b8e23);
    /**
     * Оранжевый.
     */
    public static final Color ORANGE = new Color(0xffa500);
    /**  */
    public static final Color ORANGERED = new Color(0xff4500);
    /**  */
    public static final Color ORCHID = new Color(0xda70d6);
    /**  */
    public static final Color PALEGOLDENROD = new Color(0xeee8aa);
    /**  */
    public static final Color PALEGREEN = new Color(0x98fb98);
    /**  */
    public static final Color PALETURQUOISE = new Color(0xafeeee);
    /**  */
    public static final Color PALEVIOLETRED = new Color(0xd87093);
    /**  */
    public static final Color PAPAYAWHIP = new Color(0xffefd5);
    /**  */
    public static final Color PEACHPUFF = new Color(0xffdab9);
    /**  */
    public static final Color PERU = new Color(0xcd853f);
    /**
     * Розовый.
     */
    public static final Color PINK = new Color(0xffc0cb);
    /**  */
    public static final Color PLUM = new Color(0xdda0dd);
    /**  */
    public static final Color POWDERBLUE = new Color(0xb0e0e6);
    /**
     * Пурпурный.
     */
    public static final Color PURPLE = new Color(0x800080);
    /**
     * Красный.
     */
    public static final Color RED = new Color(0xff0000);
    /**  */
    public static final Color ROSYBROWN = new Color(0xbc8f8f);
    /**  */
    public static final Color ROYALBLUE = new Color(0x4169e1);
    /**  */
    public static final Color SADDLEBROWN = new Color(0x8b4513);
    /**  */
    public static final Color SALMON = new Color(0xfa8072);
    /**  */
    public static final Color SANDYBROWN = new Color(0xf4a460);
    /**  */
    public static final Color SEAGREEN = new Color(0x2e8b57);
    /**  */
    public static final Color SEASHELL = new Color(0xfff5ee);
    /**  */
    public static final Color SIENNA = new Color(0xa0522d);
    /**
     * Серебрянный.
     */
    public static final Color SILVER = new Color(0xc0c0c0);
    /**  */
    public static final Color SKYBLUE = new Color(0x87ceeb);
    /**  */
    public static final Color SLATEBLUE = new Color(0x6a5acd);
    /**  */
    public static final Color SLATEGRAY = new Color(0x708090);
    /**  */
    public static final Color SNOW = new Color(0xfffafa);
    /**  */
    public static final Color SPRINGGREEN = new Color(0x00ff7f);
    /**  */
    public static final Color STELLBLUE = new Color(0x4682b4);
    /**  */
    public static final Color TAN = new Color(0xd2b48c);
    /**  */
    public static final Color TEAL = new Color(0x008080);
    /**  */
    public static final Color THISTLE = new Color(0xd8bfd8);
    /**  */
    public static final Color TOMATO = new Color(0xff6347);
    /**  */
    public static final Color TURQUOISE = new Color(0x40e0d0);
    /**
     * Фиолетовый.
     */
    public static final Color VIOLET = new Color(0xee82ee);
    /**  */
    public static final Color WHEAT = new Color(0xf5deb3);
    /**
     * Белый.
     */
    public static final Color WHITE = new Color(0xffffff);
    /**  */
    public static final Color WHITESMOKE = new Color(0xf5f5f5);
    /**
     * Желтый.
     */
    public static final Color YELLOW = new Color(0xffff00);
    /**  */
    public static final Color YELLOWGREEN = new Color(0x9acd32);

    /**
     * Прозрачный.
     */
    public static final Color TRANSPARENT = new Color(255, 255, 255, 0);

    // Шаблоны.
    // rgb(r,g,b)
    private static final Pattern rgb_d_d_d = Pattern.compile("rgb\\(\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*\\)");
    // rgb(r%,g%,b%)
    private static final Pattern rgb_f_f_f = Pattern.compile("rgb\\(\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*\\)");
    // rgba(r,g,b,a)
    private static final Pattern rgba_d_d_d_f = Pattern.compile("rgba\\(\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*\\,\\s*([01]+(?:\\.[0-9]+)?)\\s*\\)");
    // rgba(r%,g%,b%,a%)
    private static final Pattern rgba_f_f_f_f = Pattern.compile("rgba\\(\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*\\,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*\\)");
    // hsb(h,s,b)
    private static final Pattern hsb_d_d_d = Pattern.compile("hsb\\(\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*\\)");
    // hsb(h%,s%,b%)
    private static final Pattern hsb_f_f_f = Pattern.compile("hsb\\(\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*\\)");
    // hsb(h,s,b,a)
    private static final Pattern hsba_d_d_d_f = Pattern.compile("hsba\\(\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3})\\s*\\,\\s*([01]+(?:\\.[0-9]+)?)\\s*\\)");
    // hsba(h%,s%,b%,a%)
    private static final Pattern hsba_f_f_f_f = Pattern.compile("hsba\\(\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*\\,\\s*([0-9]+(?:\\.[0-9]+)?)\\%\\s*\\)");
    // #rrggbb
    private static final Pattern hex_dd_dd_dd = Pattern.compile("#([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})");
    // #color
    private static final Pattern hex_d_d_d = Pattern.compile("#([a-fA-F0-9])([a-fA-F0-9])([a-fA-F0-9])");
    // #rrggbbaa
    private static final Pattern hex_dd_dd_dd_dd = Pattern.compile("#([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})");
    // #color
    private static final Pattern hex_d_d_d_d = Pattern.compile("#([a-fA-F0-9])([a-fA-F0-9])([a-fA-F0-9])([a-fA-F0-9])");
    // transparent
    private static final Pattern transparent = Pattern.compile("transparent");

    /**
     * Стандартный фактор утемнения или осветления цвета.
     */
    private static final float FACTOR = 0.7f;

    /**
     * Коэффициент конвертации интенсивности компонента цвета из целого числа
     * в действительное.
     * <pre>
     * <code>
     * color / 255.0f == color * INT_TO_FLOAT
     * </code>
     * </pre>
     */
    public static final float INT_TO_FLOAT = 1.0f / 255.0f;
    /**
     * Коэффициент конвертации интенсивности компонента цвета из действительного
     * числа в целое.
     * <pre>
     * <code>
     * (int) (color * 255.0f + 0.5f) == (int) (color * FLOAT_TO_INT)
     * </code>
     * </pre>
     */
    public static final float FLOAT_TO_INT = 255.0f + 0.5f / 255.0f;
    /**
     * 1 / 255 = {@value #INV_255}.
     */
    public static final float INV_255 = 1.0f / 255.0f;

    ////

    /**
     * Интенсивность красного компонента цвета от 0 до 1.
     */
    public float r = 0.0f;
    /**
     * Интенсивность зелёного компонента цвета от 0 до 1.
     */
    public float g = 0.0f;
    /**
     * Интенсивность синего компонента цвета от 0 до 1.
     */
    public float b = 0.0f;
    /**
     * Интенсивность альфа компонента цвета от 0 до 1.
     */
    public float a = 1.0f;

    /**
     * Стандартный конструктор.
     */
    public Color() {
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     */
    public Color(int r, int g, int b) {
        this.r = clamp(r) * INT_TO_FLOAT;
        this.g = clamp(g) * INT_TO_FLOAT;
        this.b = clamp(b) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @param a интенсивность альфа компонента цвета от 0 до 255.
     */
    public Color(int r, int g, int b, int a) {
        this.r = clamp(r) * INT_TO_FLOAT;
        this.g = clamp(g) * INT_TO_FLOAT;
        this.b = clamp(b) * INT_TO_FLOAT;
        this.a = clamp(a) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     */
    public Color(float r, float g, float b) {
        this.r = clamp(r);
        this.g = clamp(g);
        this.b = clamp(b);
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @param a интенсивность альфа компонента цвета от 0 до 1.
     */
    public Color(float r, float g, float b, float a) {
        this.r = clamp(r);
        this.g = clamp(g);
        this.b = clamp(b);
        this.a = clamp(a);
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов цвета без альфа.
     *
     * @param rgb RGB цвет, записанный в целое чило.
     */
    public Color(int rgb) {
        this.r = (0xff & rgb >> 16) * INT_TO_FLOAT;
        this.g = (0xff & rgb >> 8) * INT_TO_FLOAT;
        this.b = (0xff & rgb) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов цвета.
     *
     * @param rgba  RGBA цвет, записанный в целое чило.
     * @param alpha учитывать ли альфа компонент.
     */
    public Color(int rgba, boolean alpha) {
        if (alpha) this.a = (0xff & rgba >> 24) * INT_TO_FLOAT;
        this.r = (0xff & rgba >> 16) * INT_TO_FLOAT;
        this.g = (0xff & rgba >> 8) * INT_TO_FLOAT;
        this.b = (0xff & rgba) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов цвета, без альфа.
     *
     * @param string цвет, записанный в строку.
     */
    public Color(String string) {
        int rgb = rgba(string);
        this.r = (0xff & rgb >> 16) * INT_TO_FLOAT;
        this.g = (0xff & rgb >> 8) * INT_TO_FLOAT;
        this.b = (0xff & rgb) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий интенсивности компонентов цвета.
     *
     * @param string цвет, записанный в строку.
     * @param alpha  учитывать ли альфа компонент.
     */
    public Color(String string, boolean alpha) {
        int rgba = rgba(string);
        if (alpha) this.a = (0xff & rgba >> 24) * INT_TO_FLOAT;
        this.r = (0xff & rgba >> 16) * INT_TO_FLOAT;
        this.g = (0xff & rgba >> 8) * INT_TO_FLOAT;
        this.b = (0xff & rgba) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий значения компонентам из массива.
     *
     * @param rgb массив с компонентами RGBA цвета со значениями от 0 до 255.
     */
    public Color(int[] rgb) {
        if (rgb == null) throw new NullPointerException("rgba == null");
        assert rgb.length >= 3 : "rgba.length < 3";

        this.r = clamp(rgb[0]) * INT_TO_FLOAT;
        this.g = clamp(rgb[1]) * INT_TO_FLOAT;
        this.b = clamp(rgb[2]) * INT_TO_FLOAT;
        if (rgb.length >= 4) this.a = clamp(rgb[3]) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий значения компонентам из массива.
     *
     * @param rgb    массив с компонентами RGBA цвета со значениями от 0 до 255.
     * @param offset начальное расположение.
     */
    public Color(int[] rgb, int offset) {
        if (rgb == null) throw new NullPointerException("rgba == null");
        assert rgb.length >= 3 : "rgba.length < 3";

        this.r = clamp(rgb[0 + offset]) * INT_TO_FLOAT;
        this.g = clamp(rgb[1 + offset]) * INT_TO_FLOAT;
        this.b = clamp(rgb[2 + offset]) * INT_TO_FLOAT;
        if (rgb.length >= 4) this.a = clamp(rgb[3 + offset]) * INT_TO_FLOAT;
    }

    /**
     * Конструктор, устанавливающий значения компонентам из массива.
     *
     * @param rgb массив с компонентами RGBA цвета со значениями от 0 до 1.
     */
    public Color(float[] rgb) {
        if (rgb == null) throw new NullPointerException("rgba == null");
        assert rgb.length >= 3 : "rgba.length < 3";

        this.r = clamp(rgb[0]);
        this.g = clamp(rgb[1]);
        this.b = clamp(rgb[2]);
        if (rgb.length >= 4) this.a = clamp(rgb[3]);
    }

    /**
     * Конструктор, устанавливающий значения компонентам из массива.
     *
     * @param rgb    массив с компонентами RGBA цвета со значениями от 0 до 1.
     * @param offset начальное расположение.
     */
    public Color(float[] rgb, int offset) {
        if (rgb == null) throw new NullPointerException("rgba == null");
        assert rgb.length >= 3 : "rgba.length < 3";
        assert offset >= 0 : "offset < 0";
        assert offset + 3 < rgb.length : "offset + 3 > array.length";

        this.r = clamp(rgb[0 + offset]);
        this.g = clamp(rgb[1 + offset]);
        this.b = clamp(rgb[2 + offset]);
        if (rgb.length >= 4) this.a = clamp(rgb[3 + offset]);
    }

    /**
     * Конструктор, копирующий значения компонентов из другого объекта цвета.
     *
     * @param color цвет.
     */
    public Color(Color color) {
        if (color == null) throw new NullPointerException("color == null");
        this.r = clamp(color.r);
        this.g = clamp(color.g);
        this.b = clamp(color.b);
        this.a = clamp(color.a);
    }

    /**
     * Устанавливает новые значения компонентам цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     */
    public void set(int r, int g, int b) {
        this.r = clamp(r) * INT_TO_FLOAT;
        this.g = clamp(g) * INT_TO_FLOAT;
        this.b = clamp(b) * INT_TO_FLOAT;
    }

    /**
     * Устанавливает новые значения компонентам цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @param a интенсивность альфа компонента цвета от 0 до 255.
     */
    public void set(int r, int g, int b, int a) {
        this.r = clamp(r) * INT_TO_FLOAT;
        this.g = clamp(g) * INT_TO_FLOAT;
        this.b = clamp(b) * INT_TO_FLOAT;
        this.a = clamp(a) * INT_TO_FLOAT;
    }

    /**
     * Устанавливает новые значения компонентам цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     */
    public void set(float r, float g, float b) {
        this.r = clamp(r);
        this.g = clamp(g);
        this.b = clamp(b);
    }

    /**
     * Устанавливает новые значения компонентам цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @param a интенсивность альфа компонента цвета от 0 до 1.
     */
    public void set(float r, float g, float b, float a) {
        this.r = clamp(r);
        this.g = clamp(g);
        this.b = clamp(b);
        this.a = clamp(a);
    }

    /**
     * Устанавливает новые значения компонентам цвета.
     *
     * @param rgb RGB цвет, записанный в целое чило.
     */
    public void set(int rgb) {
        this.r = (0xff & rgb >> 16) * INT_TO_FLOAT;
        this.g = (0xff & rgb >> 8) * INT_TO_FLOAT;
        this.b = (0xff & rgb) * INT_TO_FLOAT;
    }

    /**
     * Устанавливает новые значения компонентам цвета.
     *
     * @param rgba  RGBA цвет, записанный в целое чило.
     * @param alpha учитывать ли альфа компонент.
     */
    public void set(int rgba, boolean alpha) {
        if (alpha) this.a = (0xff & rgba >> 24) * INT_TO_FLOAT;
        this.r = (0xff & rgba >> 16) * INT_TO_FLOAT;
        this.g = (0xff & rgba >> 8) * INT_TO_FLOAT;
        this.b = (0xff & rgba) * INT_TO_FLOAT;
    }

    /**
     * Копирует значения компонентов из другого объекта цвета.
     *
     * @param color цвет.
     */
    public void copy(Color color) {
        if (color == null) throw new NullPointerException("color == null");
        this.r = clamp(color.r);
        this.g = clamp(color.g);
        this.b = clamp(color.b);
        this.a = clamp(color.a);
    }

    @Override
    public Color clone() {
        Color color = new Color();
        color.r = this.r;
        color.g = this.g;
        color.b = this.b;
        color.a = this.a;
        return color;
    }

    /**
     * Фиксирует значения компонентов цвета.
     */
    public void clamp() {
        this.r = clamp(this.r);
        this.g = clamp(this.g);
        this.b = clamp(this.b);
        this.a = clamp(this.a);
    }

    /**
     * Умножает данный цвет на {@code color}.
     *
     * @param color цвет.
     */
    public void multiply(Color color) {
        this.r *= color.r;
        this.g *= color.g;
        this.b *= color.b;
        //this.a *= color.a;
        this.clamp();
    }

    /**
     * Умножает каждый компонент данного цвета на число.
     *
     * @param value число.
     */
    public void multiply(float value) {
        this.r *= value;
        this.g *= value;
        this.b *= value;
        //this.a *= value;
        this.clamp();
    }

    /**
     * Прибавляет к данному цвету цвет {@code color}.
     *
     * @param color цвет.
     */
    public void add(Color color) {
        this.r += color.r;
        this.g += color.g;
        this.b += color.b;
        //this.a += color.a;
        this.clamp();
    }

    /**
     * Вычитает из данного цвета цвет {@code color}.
     *
     * @param color цвет.
     */
    public void subtract(Color color) {
        this.r -= color.r;
        this.g -= color.g;
        this.b -= color.b;
        //this.a -= color.a;
        this.clamp();
    }

    /**
     * Инвертирует данный цвет.
     */
    public void invert() {
        this.r = 255 - this.r;
        this.g = 255 - this.g;
        this.b = 255 - this.b;
    }

    /**
     * @return
     */
    public Color brighter() {
        return new Color(brighter(this.toInteger()), true);
    }

    /**
     * @return
     */
    public Color darker() {
        return new Color(darker(this.toInteger()), true);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof Color)) return false;
        Color other = (Color) obj;

        if (this.a == other.a) return false;
        if (this.r == other.r) return false;
        if (this.g == other.g) return false;
        if (this.b == other.b) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (this.a * FLOAT_TO_INT) << 24 |
                (int) (this.r * FLOAT_TO_INT) << 16 |
                (int) (this.g * FLOAT_TO_INT) << 8 |
                (int) (this.b * FLOAT_TO_INT);
    }

    /**
     * Конвертирует данный цвет в объект цвета класса {@code java.awt.Color}.
     *
     * @return объект цвета класса {@code java.awt.Color}.
     */
    public java.awt.Color toAWTColor() {
        return new java.awt.Color(this.r, this.g, this.b, this.a);
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @return целое число.
     */
    public int toInteger() {
        return (int) (this.a * FLOAT_TO_INT) << 24 |
                (int) (this.r * FLOAT_TO_INT) << 16 |
                (int) (this.g * FLOAT_TO_INT) << 8 |
                (int) (this.b * FLOAT_TO_INT);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "r=" + this.r + ",g=" + this.g + ",b=" + this.b + ",a=" + this.a + "]";
    }

    /**
     * Получает строку из 32-битного цвета.
     * каналы цвета.
     *
     * @return строку.
     */
    public String toRGBAString() {
        return "rgba(" + this.r + ", " + this.g + ", " + this.b + ", " + this.a + ")";
    }

    /**
     * Получает массив четырех компонентов цвета, значения которых от 0 до 255.
     *
     * @return массив четырех компонентов цвета, значения которых от 0 до 255.
     */
    public int[] toArray() {
        return new int[]{
                (int) (this.r * FLOAT_TO_INT) << 16,
                (int) (this.g * FLOAT_TO_INT) << 8,
                (int) (this.b * FLOAT_TO_INT),
                (int) (this.a * FLOAT_TO_INT) << 24
        };
    }

    /**
     * Получает массив четырех компонентов цвета, значения которых от 0 до 255.
     *
     * @param array массив.
     * @return массив четырех компонентов цвета, значения которых от 0 до 255.
     */
    public int[] toArray(int[] array) {
        if (array == null) throw new NullPointerException("array == null");
        assert array.length >= 4 : "array.length < 4";
        array[0] = (int) (this.r * FLOAT_TO_INT) << 16;
        array[1] = (int) (this.g * FLOAT_TO_INT) << 8;
        array[2] = (int) (this.b * FLOAT_TO_INT);
        array[3] = (int) (this.a * FLOAT_TO_INT) << 24;
        return array;
    }

    /**
     * Получает массив четырех компонентов цвета, значения которых от 0 до 255.
     *
     * @param array  массив.
     * @param offset начальное положение.
     * @return массив четырех компонентов цвета, значения которых от 0 до 255.
     */
    public int[] toArray(int[] array, int offset) {
        if (array == null) throw new NullPointerException("array == null");
        assert array.length >= 4 : "array.length < 4";
        assert offset >= 0 : "offset < 0";
        assert offset + 4 < array.length : "offset + 4 > array.length";
        array[0 + offset] = (int) (this.r * FLOAT_TO_INT) << 16;
        array[1 + offset] = (int) (this.g * FLOAT_TO_INT) << 8;
        array[2 + offset] = (int) (this.b * FLOAT_TO_INT);
        array[3 + offset] = (int) (this.a * FLOAT_TO_INT) << 24;
        return array;
    }

    /**
     * Получает массив четырех компонентов цвета, значения которых от 0 до 1.
     *
     * @param array массив.
     * @return массив четырех компонентов цвета, значения которых от 0 до 1.
     */
    public float[] toArray(float[] array) {
        if (array == null) throw new NullPointerException("array == null");
        assert array.length >= 4 : "array.length < 4";
        array[0] = this.r;
        array[1] = this.g;
        array[2] = this.b;
        array[3] = this.a;
        return array;
    }

    /**
     * Получает массив четырех компонентов цвета, значения которых от 0 до 1.
     *
     * @param array  массив.
     * @param offset начальное положение.
     * @return массив четырех компонентов цвета, значения которых от 0 до 1.
     */
    public float[] toArray(float[] array, int offset) {
        if (array == null) throw new NullPointerException("array == null");
        assert array.length >= 4 : "array.length < 4";
        assert offset >= 0 : "offset < 0";
        assert offset + 4 < array.length : "offset + 4 > array.length";
        array[0 + offset] = this.r;
        array[1 + offset] = this.g;
        array[2 + offset] = this.b;
        array[3 + offset] = this.a;
        return array;
    }

    // Статические функции.

    /**
     * Получает массив трех компонентов цвета.
     *
     * @param color 32-битный цвет.
     * @return массив трех компонентов цвета.
     */
    public static int[] getRGB(int color) {
        return new int[]{
                0xff & color >> 16,
                0xff & color >> 8,
                0xff & color
        };
    }

    /**
     * Получает массив четырех компонентов цвета.
     *
     * @param color 32-битный цвет.
     * @return массив четырех компонентов цвета.
     */
    public static int[] getRGBA(int color) {
        return new int[]{
                0xff & color >> 16,
                0xff & color >> 8,
                0xff & color,
                0xff & color >> 24
        };
    }

    /**
     * Получает 32-битный серый цвет.
     *
     * @param gray градация серого от 0 до 255.
     * @return 32-битный цвет.
     */
    public static int gray(int gray) {
        return 0xff000000 | gray << 16 | gray << 8 | gray;
    }

    /**
     * Получает 32-битный прозрачный серый цвет.
     *
     * @param gray  градация серого от 0 до 255.
     * @param alpha интенсивность альфа компонента цвета от 0 до 255.
     * @return 32-битный прозрачный цвет.
     */
    public static int gray(int gray, int alpha) {
        return gray << 24 | gray << 16 | gray << 8 | gray;
    }

    /**
     * Получает полностью непрозрачный 32-битный цвет.
     *
     * @param rgb 32-битный цвет.
     * @return прозрачный 32-битный цвет.
     */
    public static int rgba(int rgb) {
        return 0xff000000 | rgb;
    }

    /**
     * Получает прозрачный 32-битный цвет.
     *
     * @param rgb   32-битный цвет.
     * @param alpha интенсивность альфа компонента цвета от 0 до 255.
     * @return 32-битный прозрачный цвет.
     */
    public static int rgba(int rgb, int alpha) {
        return alpha << 24 | 0xffffff & rgb;
    }

    /**
     * Получает 32-битный цвет.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @return 32-битный цвет.
     */
    public static int rgb(int r, int g, int b) {
        return r << 16 | g << 8 | b;
    }

    /**
     * Получает 32-битный цвет.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @return 32-битный цвет.
     */
    public static int rgb(float r, float g, float b) {
        return (int) (r * FLOAT_TO_INT) << 16 |
                (int) (g * FLOAT_TO_INT) << 8 |
                (int) (b * FLOAT_TO_INT);
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @param a интенсивность альфа компонента цвета от 0 до 255.
     * @return 32-битный цвет.
     */
    public static int rgba(int r, int g, int b, int a) {
        return a << 24 | r << 16 | g << 8 | b;
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @param a интенсивность альфа компонента цвета от 0 до 1.
     * @return 32-битный цвет.
     */
    public static int rgba(float r, float g, float b, float a) {
        return (int) (a * FLOAT_TO_INT) << 24 |
                (int) (r * FLOAT_TO_INT) << 16 |
                (int) (g * FLOAT_TO_INT) << 8 |
                (int) (b * FLOAT_TO_INT);
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param rgba массив с компонентами RGBA цвета со значениями от 0 до 255.
     * @return 32-битный цвет.
     */
    public static int rgba(int rgba[]) {
        int color = 0;
        if (rgba == null || rgba.length == 0) return color;
        if (rgba.length > 0) color |= (0xff & rgba[0]) << 16;
        if (rgba.length > 1) color |= (0xff & rgba[1]) << 8;
        if (rgba.length > 2) color |= 0xff & rgba[2];
        if (rgba.length > 3) color |= (0xff & rgba[3]) << 24;
        return color;
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param rgba массив с компонентами RGBA цвета со значениями от 0 до 1.
     * @return 32-битный цвет.
     */
    public static int rgba(float rgba[]) {
        int color = 0;
        if (rgba == null || rgba.length == 0) return color;
        if (rgba.length > 0) color |= (int) (rgba[0] * FLOAT_TO_INT) << 16;
        if (rgba.length > 1) color |= (int) (rgba[1] * FLOAT_TO_INT) << 8;
        if (rgba.length > 2) color |= (int) (rgba[2] * FLOAT_TO_INT);
        if (rgba.length > 3) color |= (int) (rgba[3] * FLOAT_TO_INT) << 24;
        return color;
    }

    /**
     * Получает новый цвета, созданный из строки с hex цетом.
     *
     * @param string строка с цветом в виде "#rrggbb".
     * @param alpha
     * @return 32-битный цвет.
     */
    public static int rgba(String string, int alpha) {
        return alpha << 24 | decode(string);
    }

    /**
     * Получает новый цвета, созданный из строки с hex цетом.
     *
     * @param string строка с цветом в виде "#rrggbb".
     * @return 32-битный цвет.
     */
    public static int rgba(String string) {
        return decode(string);
    }

    /**
     * Получает 32-битный цвет.
     *
     * @param x
     * @param s
     * @param b
     * @return 32-битный цвет.
     */
    public static int hsb(int h, int s, int b) {
        return Color.rgba(Color.HSBtoRGB(h, s, b));
    }

    /**
     * Получает 32-битный цвет.
     *
     * @param x   от 0 до 1.
     * @param ctx от 0 до 1.
     * @param b   от 0 до 1.
     * @return 32-битный цвет.
     */
    public static int hsb(float h, float s, float b) {
        return Color.rgba(Color.HSBtoRGB(h, s, b));
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param x   0 до 255.
     * @param ctx 0 до 255.
     * @param b   0 до 255.
     * @param a   0 до 255.
     * @return 32-битный цвет.
     */
    public static int hsba(int h, int s, int b, int a) {
        return a << 24 | Color.rgba(Color.HSBtoRGB(h, s, b));
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param x   от 0 до 1.
     * @param ctx от 0 до 1.
     * @param b   от 0 до 1.
     * @param a   от 0 до 1.
     * @return 32-битный цвет.
     */
    public static int hsba(float h, float s, float b, float a) {
        return (int) (a * FLOAT_TO_INT) << 24 | Color.rgba(Color.HSBtoRGB(h, s, b));
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param hsba массив с компонентами HSBA цвета со значениями от 0 до 255.
     * @return 32-битный цвет.
     */
    public static int hsba(int[] hsba) {
        if (hsba == null || hsba.length < 3) return 0;
        float[] hsb = {hsba[0] * INT_TO_FLOAT, hsba[1] * INT_TO_FLOAT, hsba[2] * INT_TO_FLOAT};
        float[] rgba;
        if (hsba.length > 3) {
            rgba = new float[4];
            rgba[3] = hsba[3] * INT_TO_FLOAT;
        } else {
            rgba = new float[3];
        }
        Color.HSBtoRGB(hsb, rgba);
        return Color.rgba(rgba);
    }

    /**
     * Получает цвет в виде целого числа.
     *
     * @param rgba массив с компонентами HSBA цвета со значениями от 0 до 1.
     * @return 32-битный цвет.
     */
    public static int hsba(float hsba[]) {
        if (hsba == null || hsba.length < 3) return 0;
        float[] rgba;
        if (hsba.length > 3) {
            rgba = new float[4];
            rgba[3] = hsba[3] * INT_TO_FLOAT;
        } else {
            rgba = new float[3];
        }
        Color.HSBtoRGB(hsba, rgba);
        return Color.rgba(rgba);
    }

    /**
     * Получает новый цвета, созданный из строки с hex цетом.
     *
     * @param string строка с HSB цветом.
     * @param alpha
     * @return 32-битный цвет.
     */
    public static int hsba(String string, int alpha) {
        return alpha << 24 | decode(string);
    }

    /**
     * Получает новый цвета, созданный из строки с hex цетом.
     *
     * @param string строка с HSB цветом.
     * @return 32-битный цвет.
     */
    public static int hsba(String string) {
        return decode(string);
    }

    /**
     * Расшифровывает цвет из строки.
     *
     * @param string строка.
     * @return 32-битный цвет.
     */
    public static int decode(String string) {
        if (string == null) return 0;

        try {
            Matcher matcher;
            matcher = rgb_d_d_d.matcher(string);
            if (matcher.matches()) {
                int r = clamp(Integer.parseInt(matcher.group(1)));
                int g = clamp(Integer.parseInt(matcher.group(2)));
                int b = clamp(Integer.parseInt(matcher.group(3)));
                return 0xff000000 | r << 16 | g << 8 | b;
            }

            matcher = rgb_f_f_f.matcher(string);
            if (matcher.matches()) {
                int r = clamp((int) (Float.parseFloat(matcher.group(1)) * 2.55f + 0.5f));
                int g = clamp((int) (Float.parseFloat(matcher.group(2)) * 2.55f + 0.5f));
                int b = clamp((int) (Float.parseFloat(matcher.group(3)) * 2.55f + 0.5f));
                return 0xff000000 | r << 16 | g << 8 | b;
            }

            matcher = rgba_d_d_d_f.matcher(string);
            if (matcher.matches()) {
                int r = clamp(Integer.parseInt(matcher.group(1)));
                int g = clamp(Integer.parseInt(matcher.group(2)));
                int b = clamp(Integer.parseInt(matcher.group(3)));
                int a = clamp((int) (Float.parseFloat(matcher.group(4)) * 255f + 0.5f));
                return a << 24 | r << 16 | g << 8 | b;
            }

            matcher = rgba_f_f_f_f.matcher(string);
            if (matcher.matches()) {
                int r = clamp((int) (Float.parseFloat(matcher.group(1)) * 2.55 + 0.5));
                int g = clamp((int) (Float.parseFloat(matcher.group(2)) * 2.55 + 0.5));
                int b = clamp((int) (Float.parseFloat(matcher.group(3)) * 2.55 + 0.5));
                int a = clamp((int) (Float.parseFloat(matcher.group(4)) * 2.55 + 0.5));
                return a << 24 | r << 16 | g << 8 | b;
            }

            matcher = hsb_d_d_d.matcher(string);
            if (matcher.matches()) {
                int h = clamp(Integer.parseInt(matcher.group(1)));
                int s = clamp(Integer.parseInt(matcher.group(2)));
                int b = clamp(Integer.parseInt(matcher.group(3)));
                float[] rgb = HSBtoRGB(h, s, b);
                return rgba(rgb);
            }

            matcher = hsb_f_f_f.matcher(string);
            if (matcher.matches()) {
                int h = clamp((int) (Float.parseFloat(matcher.group(1)) * 2.55f + 0.5f));
                int s = clamp((int) (Float.parseFloat(matcher.group(2)) * 2.55f + 0.5f));
                int b = clamp((int) (Float.parseFloat(matcher.group(3)) * 2.55f + 0.5f));
                float[] rgb = HSBtoRGB(h, s, b);
                return rgba(rgb);
            }

            matcher = hsba_d_d_d_f.matcher(string);
            if (matcher.matches()) {
                float h = clamp(Integer.parseInt(matcher.group(1)) * INT_TO_FLOAT);
                float s = clamp(Integer.parseInt(matcher.group(2)) * INT_TO_FLOAT);
                float b = clamp(Integer.parseInt(matcher.group(3)) * INT_TO_FLOAT);
                float a = clamp(Float.parseFloat(matcher.group(4)));
                float[] rgba = HSBtoRGB(new float[]{h, s, b, a}, new float[4]);
                rgba[3] = a;
                return rgba(rgba);
            }

            matcher = hsba_f_f_f_f.matcher(string);
            if (matcher.matches()) {
                float h = clamp(Float.parseFloat(matcher.group(1)) * 2.55f);
                float s = clamp(Float.parseFloat(matcher.group(2)) * 2.55f);
                float b = clamp(Float.parseFloat(matcher.group(3)) * 2.55f);
                float a = clamp(Float.parseFloat(matcher.group(4)) * 0.0255f);
                float[] rgba = HSBtoRGB(new float[]{h, s, b, a}, new float[4]);
                rgba[3] = a;
                return rgba(rgba);
            }

            matcher = hex_dd_dd_dd.matcher(string);
            if (matcher.matches()) {
                int r = clamp(Integer.parseInt(matcher.group(1), 16));
                int g = clamp(Integer.parseInt(matcher.group(2), 16));
                int b = clamp(Integer.parseInt(matcher.group(3), 16));
                return 0xff000000 | r << 16 | g << 8 | b;
            }

            matcher = hex_d_d_d.matcher(string);
            if (matcher.matches()) {
                int r = clamp(Integer.parseInt(matcher.group(1) + matcher.group(1), 16));
                int g = clamp(Integer.parseInt(matcher.group(2) + matcher.group(2), 16));
                int b = clamp(Integer.parseInt(matcher.group(3) + matcher.group(3), 16));
                return 0xff000000 | r << 16 | g << 8 | b;
            }

            matcher = hex_dd_dd_dd_dd.matcher(string);
            if (matcher.matches()) {
                int r = clamp(Integer.parseInt(matcher.group(1), 16));
                int g = clamp(Integer.parseInt(matcher.group(2), 16));
                int b = clamp(Integer.parseInt(matcher.group(3), 16));
                int a = clamp(Integer.parseInt(matcher.group(4), 16));
                return a << 24 | r << 16 | g << 8 | b;
            }

            matcher = hex_d_d_d_d.matcher(string);
            if (matcher.matches()) {
                int r = clamp(Integer.parseInt(matcher.group(1) + matcher.group(1), 16));
                int g = clamp(Integer.parseInt(matcher.group(2) + matcher.group(2), 16));
                int b = clamp(Integer.parseInt(matcher.group(3) + matcher.group(3), 16));
                int a = clamp(Integer.parseInt(matcher.group(4) + matcher.group(4), 16));
                return a << 24 | r << 16 | g << 8 | b;
            }

            matcher = transparent.matcher(string);
            if (matcher.matches()) {
                return 0x00ffffff;
            }
        } catch (NumberFormatException exception) {
            //Logger.error(class.getName() + ".decode(" + string + ")", e);
        }

        return 0;
    }

    /**
     * Получает интенсивность альфа компонента цвета.
     *
     * @param rgb 32-битный цвет.
     * @return интенсивность альфа компонента цвета от 0 до 1.
     */
    public static float alpha(int rgb) {
        return 0xff & rgb >> 24;
    }

    /**
     * Получает интенсивность красного компонента цвета.
     *
     * @param rgb 32-битный цвет.
     * @return интенсивность красного компонента цвета от 0 до 1.
     */
    public static float red(int rgb) {
        return 0xff & rgb >> 16;
    }

    /**
     * Получает интенсивность зеленого компонента цвета.
     *
     * @param rgb 32-битный цвет.
     * @return интенсивность зеленого компонента цвета от 0 до 1.
     */
    public static float green(int rgb) {
        return 0xff & rgb >> 8;
    }

    /**
     * Получает интенсивность синего компонента цвета.
     *
     * @param rgb 32-битный цвет.
     * @return интенсивность синего компонента цвета от 0 до 1.
     */
    public static float blue(int rgb) {
        return 0xff & rgb;
    }

    /**
     * Расчитывает оттенок 32-битного цвета.
     *
     * @param rgb 32-битный цвет.
     * @return оттенок от 0 до 1.
     */
    public static float hue(int rgb) {
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;
        return hue(r, g, b);
    }

    /**
     * Расчитывает оттенок 32-битного цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @return оттенок от 0 до 1.
     */
    public static float hue(int r, int g, int b) {
        return RGBtoHSB(r, g, b)[0];
    }

    /**
     * Расчитывает оттенок 32-битного цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @return оттенок от 0 до 1.
     */
    public static float hue(float r, float g, float b) {
        return RGBtoHSB(r, g, b)[0];
    }

    /**
     * Расчитывает насыщенность 32-битного цвета.
     *
     * @param rgb 32-битный цвет.
     * @return насыщенность от 0 до 1.
     */
    public static float saturation(int rgb) {
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;
        return saturation(r, g, b);
    }

    /**
     * Расчитывает насыщенность 32-битного цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @return насыщенность от 0 до 1.
     */
    public static float saturation(int r, int g, int b) {
        return RGBtoHSB(r, g, b)[1];
    }

    /**
     * Расчитывает насыщенность 32-битного цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @return насыщенность от 0 до 1.
     */
    public static float saturation(float r, float g, float b) {
        return RGBtoHSB(r, g, b)[1];
    }

    /**
     * Расчитывает яркость 32-битного цвета.
     *
     * @param rgb 32-битный цвет.
     * @return яркость от 0 до 1.
     */
    public static float brightness(int rgb) {
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;
        return brightness(r, g, b);
    }

    /**
     * Расчитывает яркость 32-битного цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @return яркость от 0 до 1.
     */
    public static float brightness(int r, int g, int b) {
        return RGBtoHSB(r, g, b)[2];
    }

    /**
     * Расчитывает яркость 32-битного цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @return яркость от 0 до 1.
     */
    public static float brightness(float r, float g, float b) {
        return RGBtoHSB(r, g, b)[2];
    }

    /**
     * Расчитывает яркость 32-битного цвета по NTSC.
     *
     * @param rgb 32-битный цвет.
     * @return яркость от 0 до 255.
     */
    public static int brightnessNTSC(int rgb) {
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;
        return (int) MoreMath.sqrt(0.299f * r * r + 0.587f * g * g + 0.114f * b * b);
    }

    /**
     * Расчитывает яркость 32-битного цвета по NTSC.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @return яркость от 0 до 255.
     */
    public static int brightnessNTSC(int r, int g, int b) {
        return (int) MoreMath.sqrt(0.299f * r * r + 0.587f * g * g + 0.114f * b * b);
    }

    /**
     * Инвертирует цвет.
     *
     * @param rgba 32-битный цвет.
     * @return инвертированный цвет.
     */
    public static int invert(int rgba) {
        int a = 0xff & rgba >> 24;
        int r = 0xff & rgba >> 16;
        int g = 0xff & rgba >> 8;
        int b = 0xff & rgba;

        r = 255 - r;
        g = 255 - g;
        b = 255 - b;

        return a << 24 | r << 16 | g << 8 | b;
    }

    /**
     * Создает случайный 32-битный цвет.
     *
     * @param offset от 0 до 255.
     * @param alpha  прозрачность от 0 до 255.
     * @return случайный 32-битный цвет.
     */
    public static int random(int offset, int alpha) {
        int multiplier = 255 - clamp(offset);
        int r = (int) (MoreMath.random() * multiplier + offset);
        int g = (int) (MoreMath.random() * multiplier + offset);
        int b = (int) (MoreMath.random() * multiplier + offset);
        return rgba(r, g, b, alpha);
    }

    /**
     * Создает случайный 32-битный цвет.
     *
     * @param offset от 0 до 1.
     * @param alpha  прозрачность от 0 до 1.
     * @return случайный 32-битный цвет.
     */
    public static int random(float offset, float alpha) {
        float multiplier = 1.0f - clamp(offset);
        float r = MoreMath.random() * multiplier + offset;
        float g = MoreMath.random() * multiplier + offset;
        float b = MoreMath.random() * multiplier + offset;
        return rgba(r, g, b, alpha);
    }

    /**
     * Создает случайный 32-битный цвет.
     *
     * @param offset от 0 до 255.
     * @return случайный 32-битный цвет.
     */
    public static int random(int offset) {
        int multiplier = 255 - clamp(offset);
        int r = (int) (MoreMath.random() * multiplier + offset);
        int g = (int) (MoreMath.random() * multiplier + offset);
        int b = (int) (MoreMath.random() * multiplier + offset);
        int a = (int) (MoreMath.random() * multiplier + offset);
        return rgba(r, g, b, a);
    }

    /**
     * Создает случайный 32-битный цвет.
     *
     * @param offset от 0 до 1.
     * @return случайный 32-битный цвет.
     */
    public static int random(float offset) {
        float multiplier = 1.0f - clamp(offset);
        float r = MoreMath.random() * multiplier + offset;
        float g = MoreMath.random() * multiplier + offset;
        float b = MoreMath.random() * multiplier + offset;
        float a = MoreMath.random() * multiplier + offset;
        return rgba(r, g, b, a);
    }

    /**
     * Получает осветленный 32-битный цвет.
     *
     * @param rgb 32-битный цвет.
     * @return осветленный 32-битный цвет.
     */
    public static int brighter(int rgb) {
        return brighter(rgb, FACTOR);
    }

    /**
     * Получает осветленный 32-битный цвет.
     *
     * @param rgb    32-битный цвет.
     * @param factor фактор осветления.
     * @return осветленный 32-битный цвета.
     */
    public static int brighter(int rgb, float factor) {
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;

        int i = (int) (1.0 / (1.0 - factor));
        if (r == 0 && g == 0 && b == 0) {
            return 0xff000000 | i << 16 | i << 8 | i;
        }

        if (r > 0 && r < i) r = i;
        if (g > 0 && g < i) g = i;
        if (b > 0 && b < i) b = i;

        return 0xff000000 |
                MoreMath.min((int) (r / factor), 255) << 16 |
                MoreMath.min((int) (g / factor), 255) << 8 |
                MoreMath.min((int) (b / factor), 255);
    }

    /**
     * Получает утемненный 32-битный цвет.
     *
     * @param rgb 32-битный цвет.
     * @return утемненный 32-битный цвет.
     */
    public static int darker(int rgb) {
        return darker(rgb, FACTOR);
    }

    /**
     * Получает утемненный 32-битный цвет.
     *
     * @param rgb    32-битный цвет.
     * @param factor фактор утемнения.
     * @return утемненнsq 32-битный цвет.
     */
    public static int darker(int rgb, float factor) {
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;

        return 0xff000000 |
                MoreMath.max((int) (r * factor), 0) << 16 |
                MoreMath.max((int) (g * factor), 0) << 8 |
                MoreMath.max((int) (b * factor), 0);
    }

    /**
     * Определяет, является ли 32-битный цвет градацией серого.
     *
     * @param rgb 32-битный цвет.
     * @return {@code true}, если цвет является серым.
     */
    public static boolean isGray(int rgb) {
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;
        return r == g && g == b;
    }

    /**
     * Смешивает два 32-битных цвета через линейную интерполяцию.
     *
     * @param rgba1 верхний цвет.
     * @param rgba2 нижний цвет.
     * @param a     параметр интерполяции.
     * @return смешаный 32-битный цвет.
     */
    public static int lerp(int rgba1, int rgba2, float a) {
        int a1 = 0xff & rgba1 >> 24;
        int r1 = 0xff & rgba1 >> 16;
        int g1 = 0xff & rgba1 >> 8;
        int b1 = 0xff & rgba1;

        int a2 = 0xff & rgba2 >> 24;
        int r2 = 0xff & rgba2 >> 16;
        int g2 = 0xff & rgba2 >> 8;
        int b2 = 0xff & rgba2;

        a1 = (int) (a1 + a * (a2 - a1));
        r1 = (int) (r1 + a * (r2 - r1));
        g1 = (int) (g1 + a * (g2 - g1));
        b1 = (int) (b1 + a * (b2 - b1));

        return a1 << 24 | r1 << 16 | g1 << 8 | b1;
    }

    /**
     * Получает строку из 32-битного цвета. Строка имеет вид "rgb(r, g, b)",
     * если альфа канал равен 0, иначе "rgba(r, g, b, a)", где r, g, b, a -
     * каналы цвета.
     *
     * @param rgb 32-битный цвет
     * @return строка.
     */
    public static String string(int rgb) {
        int a = 0xff & rgb >> 24;
        int r = 0xff & rgb >> 16;
        int g = 0xff & rgb >> 8;
        int b = 0xff & rgb;

        if (a == 0) {
            return "rgb(" + r + ", " + g + ", " + b + ")";
        } else {
            return "rgba(" + r + ", " + g + ", " + b + ", " + a + ")";
        }
    }

    /**
     * Нормализирует значение цвета.
     *
     * @param color цвет.
     * @return нормализированный цвет от 0 до 255.
     */
    public static int clamp(int color) {
        return color < 0 ? 0 : color > 255 ? 255 : color;
    }

    /**
     * Нормализирует значение цвета.
     *
     * @param color цвет.
     * @return нормализированный цвет от 0 до 1.
     */
    public static float clamp(float color) {
        return color < 0.0f ? 0.0f : color > 1.0f ? 1.0f : color;
    }

    /**
     * Получает массив компонентов RGB цвета эквивалентный HSB цвету.
     *
     * @param h оттенок от 0 до 255.
     * @param s насыщенность от 0 до 255.
     * @param b яркость от 0 до 255.
     * @return массив компонентов RGB цвета.
     */
    public static float[] HSBtoRGB(int h, int s, int b) {
        return HSBtoRGB(new float[]{h / 255.0f, s / 255.0f, b / 255.0f}, new float[3]);
    }

    /**
     * Получает массив компонентов RGB цвета эквивалентный HSB цвету.
     *
     * @param h оттенок от 0 до 1.
     * @param s насыщенность от 0 до 1.
     * @param b яркость от 0 до 1.
     * @return массив компонентов RGB цвета.
     */
    public static float[] HSBtoRGB(float h, float s, float b) {
        return HSBtoRGB(new float[]{h, s, b}, new float[3]);
    }

    /**
     * Получает массив компонентов RGB цвета эквивалентный HSB цвету.
     *
     * @param hsb массив HSB значений.
     * @return массив компонентов RGB цвета.
     */
    public static float[] HSBtoRGB(float[] hsb) {
        return HSBtoRGB(hsb, new float[3]);
    }

    /**
     * Получает массив компонентов RGB цвета эквивалентный HSB цвету.
     *
     * @param hsb массив HSB значений.
     * @param rgb результат, т.е компоненты RGB цвета.
     * @return массив компонентов RGB цвета.
     */
    public static float[] HSBtoRGB(float[] hsb, float[] rgb) {
        if (rgb == null) rgb = new float[3];
        if (hsb[1] == 0.0f) {
            rgb[0] = rgb[1] = rgb[2] = hsb[2];
            return rgb;
        }

        float h = (hsb[0] - MoreMath.floor(hsb[0])) * 6.0f;
        float f = h - MoreMath.floor(h);
        float p = hsb[2] * (1.0f - hsb[1]);
        float q = hsb[2] * (1.0f - hsb[1] * f);
        float t = hsb[2] * (1.0f - hsb[1] * (1.0f - f));

        switch (MoreMath.floor(h)) {
            case 0: {
                rgb[0] = hsb[2];
                rgb[1] = t;
                rgb[2] = p;
                break;
            }

            case 1: {
                rgb[0] = q;
                rgb[1] = hsb[2];
                rgb[2] = p;
                break;
            }

            case 2: {
                rgb[0] = p;
                rgb[1] = hsb[2];
                rgb[2] = t;
                break;
            }

            case 3: {
                rgb[0] = p;
                rgb[1] = q;
                rgb[2] = hsb[2];
                break;
            }

            case 4: {
                rgb[0] = t;
                rgb[1] = p;
                rgb[2] = hsb[2];
                break;
            }

            case 5: {
                rgb[0] = hsb[2];
                rgb[1] = p;
                rgb[2] = q;
                break;
            }
        }

        return rgb;
    }

    /**
     * Получает массив компонентов HSB цвета, созданный из RGB компонентов цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 255.
     * @param g интенсивность зелёного компонента цвета от 0 до 255.
     * @param b интенсивность синего компонента цвета от 0 до 255.
     * @return массив компонентов HSB цвета.
     */
    public static float[] RGBtoHSB(int r, int g, int b) {
        return RGBtoHSB(new float[]{r / 255.0f, g / 255.0f, b / 255.0f}, new float[3]);
    }

    /**
     * Получает массив компонентов HSB цвета, созданный из RGB компонентов цвета.
     *
     * @param r интенсивность красного компонента цвета от 0 до 1.
     * @param g интенсивность зелёного компонента цвета от 0 до 1.
     * @param b интенсивность синего компонента цвета от 0 до 1.
     * @return массив компонентов HSB цвета.
     */
    public static float[] RGBtoHSB(float r, float g, float b) {
        return RGBtoHSB(new float[]{r, g, b}, new float[3]);
    }

    /**
     * Получает массив компонентов HSB цвета, созданный из массива компонентов
     * RGB цвета.
     *
     * @param rgb массив компонентов RGB цвета.
     * @return массив компонентов HSB цвета.
     */
    public static float[] RGBtoHSB(float[] rgb) {
        return RGBtoHSB(rgb, new float[3]);
    }

    /**
     * Получает массив компонентов HSB цвета эквивалентный RGB цвету.
     *
     * @param rgb массив компонентов RGB цвета.
     * @param hsb результат, т.е HSB цвет.
     * @return массив компонентов HSB цвета.
     */
    public static float[] RGBtoHSB(float[] rgb, float[] hsb) {
        if (hsb == null) hsb = new float[3];

        float min = MoreMath.min(rgb[0], rgb[1], rgb[2]);
        float max = MoreMath.max(rgb[0], rgb[1], rgb[2]);

        hsb[2] = max;
        if (min == max) return hsb;

        float diff = max - min;
        if (diff == max) {
            hsb[1] = 1.0f;
        } else {
            if (max != 0.0f) {
                hsb[1] = diff / max;
            } else {
                hsb[1] = 0.0f;
            }
        }

        if (hsb[1] == 0.0f) {
            hsb[0] = 0.0f;
        } else {
            if (rgb[0] == max) {
                hsb[0] = (rgb[1] - rgb[2]) / diff;
            } else if (rgb[1] == max) {
                hsb[0] = 2.0f + (rgb[2] - rgb[0]) / diff;
            } else {
                hsb[0] = 4.0f + (rgb[0] - rgb[1]) / diff;
            }

            hsb[0] /= 6.0f;
            if (hsb[0] < 0.0f) {
                hsb[0]++;
            } else if (hsb[0] > 1.0f) {
                hsb[0]--;
            }
        }

        return hsb;
    }

    /**
     * Тест.
     * @param args аргументы.
     *//*
    public static void main(String[] args) {
        Logger.log("decode(\"rgb(255, 100, 50)\") =>", new Color(decode("rgb(255, 100, 50)")));
        Logger.log("decode(\"rgb(50%, 100%, 50%)\") =>", new Color(decode("rgb(50%, 100%, 50%)")));
        Logger.log("decode(\"rgba(255, 100, 50, 100)\") =>", new Color(decode("rgba(255, 100, 50, 100)"), true));
        Logger.log("decode(\"rgba(50%, 100%, 50%, 50%)\") =>", new Color(decode("rgba(50%, 100%, 50%, 50%)"), true));
        Logger.log("decode(\"#aabb99\") =>", new Color(decode("#aabb99")));
        Logger.log("decode(\"#ab9\") =>", new Color(decode("#ab9")));
        Logger.log("decode(\"#aabb99dd\") =>", new Color(decode("#aabb99dd"), true));
        Logger.log("decode(\"#ab9d\") =>", new Color(decode("#ab9d"), true));
        Logger.log("decode(\"transparent\") =>", new Color(decode("transparent"), true));
    }*/

}

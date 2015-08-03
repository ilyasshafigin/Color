/*
 *
 */
package ru.ildev.color;

import ru.ildev.math.MoreMath;

/**
 * Класс таблици цветов, который содержит массив цветов.
 *
 * @author Shafigin Ilyas (Шафигин Ильяс) <Ilyas74>
 * @version 0.0.0
 */
public class ArrayColormap implements Colormap {

    /**
     * Массив цветов. Размер массива должен быть равен 256.
     */
    protected int[] map;

    /**
     * Стандартный конструктор.
     */
    public ArrayColormap() {
        this.map = new int[256];
    }

    /**
     * Конструктор, устанавливающий массив цветов.
     *
     * @param map массив цветов.
     */
    public ArrayColormap(int[] map) {
        if (map == null) throw new NullPointerException("map == null");
        this.map = map;
    }

    /**
     * Получает массив цветов.
     *
     * @return массив цветов.
     */
    public int[] getMap() {
        return this.map;
    }

    /**
     * Устанавливает массив цветов.
     *
     * @param map массив цветов.
     */
    public void setMap(int[] map) {
        if (map == null) throw new NullPointerException("map == null");
        this.map = map;
    }

    /**
     * Получает цвет в указанной позиции.
     *
     * @param position позиция от 0 до 255.
     * @return цвет.
     */
    public int getColor(int position) {
        int index = Color.clamp(position);
        return this.map[index];
    }

    @Override
    public int getColor(float position) {
        int index = Color.clamp((int) (position * Color.FLOAT_TO_INT));
        return this.map[index];
    }

    /**
     * Устанавливает цвет по индексом в массиве.
     *
     * @param index индекс.
     * @param color цвет.
     */
    public void setColor(int index, int color) {
        if (index < 0 || index >= 256)
            throw new IllegalArgumentException("index < 0 || index >= 256");
        this.map[index] = color;
    }

    /**
     * Устанавливает в массив под индексами от {@code firstIndex} до {@lastIndex}
     * один цвет {@code color}.
     *
     * @param firstIndex начальный индекс.
     * @param lastIndex  конечный индекс.
     * @param color      цвет.
     */
    public void setColor(int firstIndex, int lastIndex, int color) {
        if (firstIndex > lastIndex)
            throw new IllegalArgumentException("firstIndex > lastIndex");
        if (firstIndex < 0 || firstIndex >= 256)
            throw new IllegalArgumentException("firstIndex < 0 || firstIndex >= 256");
        if (lastIndex < 0 || lastIndex >= 256)
            throw new IllegalArgumentException("lastIndex < 0 || lastIndex >= 256");

        for (int i = lastIndex; i <= lastIndex; i++) {
            this.map[i] = color;
        }
    }

    /**
     * Устанавливает в массив под индексами от {@code firstIndex} до {@lastIndex}
     * интерполированные цвета между {@code color1} и {@code color2}.
     *
     * @param firstIndex начальный индекс.
     * @param lastIndex  конечный индекс.
     * @param color1     начальный цвет.
     * @param color2     конечный цвет.
     */
    public void setColor(int firstIndex, int lastIndex, int color1, int color2) {
        if (firstIndex > lastIndex)
            throw new IllegalArgumentException("firstIndex > lastIndex");
        if (firstIndex < 0 || firstIndex >= 256)
            throw new IllegalArgumentException("firstIndex < 0 || firstIndex >= 256");
        if (lastIndex < 0 || lastIndex >= 256)
            throw new IllegalArgumentException("lastIndex < 0 || lastIndex >= 256");

        for (int i = firstIndex; i <= lastIndex; i++) {
            this.map[i] = Color.lerp(color1, color2, MoreMath.norm(i, firstIndex, lastIndex));
        }
    }

    /**
     * Устанавливает в массив под индексами от {@code firstIndex} до {@code index}
     * интерполированные цвета между цветом под индексом {@code firstIndex} и
     * {@code color}, и от {@code index} до {@code lastIndex} между {@code color}
     * и цветом под индексом {@code lastIndex}.
     *
     * @param index      индекс.
     * @param firstIndex начальный индекс.
     * @param lastIndex  конечный индекс.
     * @param color      цвет.
     */
    public void setColorInterpolated(int index, int firstIndex, int lastIndex, int color) {
        if (firstIndex > lastIndex)
            throw new IllegalArgumentException("firstIndex > lastIndex");
        if (firstIndex < 0 || firstIndex >= 256)
            throw new IllegalArgumentException("firstIndex < 0 || firstIndex >= 256");
        if (lastIndex < 0 || lastIndex >= 256)
            throw new IllegalArgumentException("lastIndex < 0 || lastIndex >= 256");
        if (index < firstIndex || index > lastIndex)
            throw new IllegalArgumentException("index < firstIndex || index > lastIndex");

        int firstColor = this.map[firstIndex];
        int lastColor = this.map[lastIndex];

        for (int i = firstIndex; i <= index; i++) {
            this.map[i] = Color.lerp(firstColor, color, MoreMath.norm(i, firstIndex, index));
        }

        for (int i = index; i <= lastIndex; i++) {
            this.map[i] = Color.lerp(color, lastColor, MoreMath.norm(i, index, lastIndex));
        }
    }

    /**
     * Заносит в массив цвета таблицы цветов.
     *
     * @return массив.
     */
    public int[] toArray() {
        return this.toArray(new int[256]);
    }

    /**
     * Заносит в массив цвета таблицы цветов.
     *
     * @param array массив.
     * @return массив.
     */
    public int[] toArray(int[] array) {
        if (array == null)
            throw new NullPointerException("array == null");
        if (array.length == 0)
            throw new IllegalArgumentException("array.length == 0");

        float length = (float) array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = this.getColor(i / length);
        }

        return array;
    }

    /**
     * Заносит в массив цвета таблицы цветов.
     *
     * @param colormap таблица цветов.
     * @return массив.
     */
    public static int[] asArray(Colormap colormap) {
        return ArrayColormap.asArray(colormap, new int[256]);
    }

    /**
     * Заносит в массив цвета таблицы цветов.
     *
     * @param colormap таблица цветов.
     * @param array    массив.
     * @return массив.
     */
    public static int[] asArray(Colormap colormap, int[] array) {
        if (array == null)
            throw new NullPointerException("array == null");
        if (array.length == 0)
            throw new IllegalArgumentException("array.length == 0");

        float length = (float) array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = colormap.getColor(i / length);
        }

        return array;
    }

}

/*
 *
 */
package ru.ildev.color;

/**
 * Интерфейс классов карты цветов.
 *
 * @author Shafigin Ilyas (Шафигин Ильяс) <Ilyas74>
 * @version 0.0.0
 */
public interface Colormap {

    /**
     * Получает цвет карты цветов в зависимости от параметра {@code position}.
     *
     * @param position значение позиции цвета от 0 до 1.
     * @return цвет.
     */
    int getColor(float position);

}

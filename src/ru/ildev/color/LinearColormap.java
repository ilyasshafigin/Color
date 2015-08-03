/**
 *
 */
package ru.ildev.color;


/**
 * Класс линейной карты цветов. В нем используется линейная интерполяция между
 * двумя цветами.
 *
 * @author Ильяс
 */
public class LinearColormap implements Colormap {

    /**
     * Начальный цвет.
     */
    private int color1;
    /**
     * Конечный цвет.
     */
    private int color2;

    /**
     * Конструктор, создающий карту цветов.
     *
     * @param color1 начальный цвет.
     * @param color2 конечный цвет.
     */
    public LinearColormap(int color1, int color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    /**
     * Получает начальный цвет.
     *
     * @return начальный цвет.
     */
    public int getColor1() {
        return this.color1;
    }

    /**
     * Устанавливает начальный цвет.
     *
     * @param color1 начальный цвет.
     */
    public void setColor1(int color1) {
        this.color1 = color1;
    }

    /**
     * Получает конечный цвет.
     *
     * @return конечный цвет.
     */
    public int getColor2() {
        return this.color2;
    }

    /**
     * Устанавливает конечный цвет.
     *
     * @param color2 конечный цвет.
     */
    public void setColor2(int color2) {
        this.color2 = color2;
    }

    @Override
    public int getColor(float position) {
        return Color.lerp(this.color1, this.color2, position);
    }

}

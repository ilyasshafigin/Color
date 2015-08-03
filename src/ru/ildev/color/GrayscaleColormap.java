/**
 *
 */
package ru.ildev.color;


/**
 * Класс карты цветов градации серого.
 *
 * @author Ильяс
 */
public class GrayscaleColormap implements Colormap {

    @Override
    public int getColor(float position) {
        int c = Color.clamp((int) (position * Color.FLOAT_TO_INT));
        return 0xff000000 | (c << 16) | (c << 8) | c;
    }

}

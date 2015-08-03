/*
 *
 */
package ru.ildev.color;

import ru.ildev.math.MoreMath;

import java.io.*;
import java.net.URL;

/**
 * Класс градиента. Он представляет собой линейный градиент, который возвращает
 * нужный цвет в зависимости от коэффициента, который лежит от 0 до 1.
 *
 * @author Ilyas74
 * @version 1.3.7
 */
public class Gradient extends ArrayColormap {

    /**
     * Массив положений цветов.
     */
    private int[] fractions = new int[0];
    /**
     * Массив цветов градиента.
     */
    private int[] colors = new int[0];
    /**
     * Флаг инициализации градиента.
     */
    private boolean initialize = false;

    /**
     * Стандартный конструктор.
     */
    public Gradient() {
        super();
    }

    /**
     * Конструктор, устанавливающий цвета градиента.
     *
     * @param gradients массив цетов градиента.
     */
    public Gradient(int[] gradients) {
        super(gradients);
    }

    /**
     * Конструктор, устанавливающий цвета и их позиции, необходимые для создания
     * градиента.
     *
     * @param fractions положения цветов в целых числах от 0 до 255.
     * @param colors    массив цветов.
     */
    public Gradient(int[] fractions, int[] colors) {
        if (fractions == null) throw new NullPointerException("fractions == null");
        if (colors == null) throw new NullPointerException("colors == null");

        this.fractions = fractions;
        this.colors = colors;
        this.initialize();
    }

    /**
     * Конструктор, устанавливающий цвета и их позиции, необходимые для создания
     * градиента.
     *
     * @param fractions положения цветов с плавающей точкой от 0 до 1.
     * @param colors    массив цветов.
     */
    public Gradient(float[] fractions, int[] colors) {
        if (fractions == null) throw new NullPointerException("fractions == null");
        if (colors == null) throw new NullPointerException("colors == null");

        int size = fractions.length;
        int[] intFractions = new int[size];
        for (int i = 0; i < size; i++) {
            intFractions[i] = (int) (fractions[i] * Color.FLOAT_TO_INT);
        }

        this.fractions = intFractions;
        this.colors = colors;
        this.initialize();
    }

    /**
     * Инициализирует градиент.
     */
    private void initialize() {
        this.sort();

        int size = this.colors.length;
        for (int i = 1; i < size; i++) {
            int start = Color.clamp(this.fractions[i - 1]);
            int end = Color.clamp(this.fractions[i]);

            int color1 = this.colors[i - 1];
            int color2 = this.colors[i];

            float length = end - start;

            for (int j = start; j < end; j++) {
                float a = (j - start) / length;
                this.map[j] = Color.lerp(color1, color2, a);
            }
        }

        this.initialize = true;
    }

    /**
     * Сортирует массивы.
     */
    private void sort() {
        for (int i = 1; i < this.fractions.length; i++) {
            for (int j = 0; j < i; j++) {
                if (this.fractions[i] < this.fractions[j]) {
                    MoreMath.swap(this.fractions, i, j);
                    MoreMath.swap(this.colors, i, j);
                }
            }
        }
    }

    /**
     * Добавляет цвет в список.
     *
     * @param color    цвет.
     * @param fraction позиция от 0 до 256.
     */
    public void add(int color, int fraction) {
        int size = this.colors.length;

        int[] ncolors = new int[size + 1];
        int[] nfractions = new int[size + 1];

        System.arraycopy(this.colors, 0, ncolors, 0, size);
        System.arraycopy(this.fractions, 0, nfractions, 0, size);

        this.colors = ncolors;
        this.fractions = nfractions;

        this.colors[size] = color;
        this.fractions[size] = fraction;

        this.initialize = false;
        this.initialize();
    }

    /**
     * Добавляет цвет в список.
     *
     * @param color    цвет.
     * @param fraction позиция от 0 до 1.
     */
    public void add(int color, float fraction) {
        this.add(color, Color.clamp((int) (fraction * Color.FLOAT_TO_INT)));
    }

    @Override
    public int getColor(float position) {
        if (!this.initialize) this.initialize();

        return super.getColor(position);
    }

    /**
     * Создает объект градиента, читая цвета и позиции из файла.
     *
     * @param file файл.
     * @return объект градиента.
     * @throws FileNotFoundException если нет файла.
     * @throws IOException           при ошибрах ввода/вывода.
     * @see #create(java.io.InputStream)
     */
    public static Gradient create(File file) throws IOException {
        return create(new FileInputStream(file));
    }

    /**
     * Создает объект градиента, читая цвета и позиции из объекта
     * класса {@code URL}.
     *
     * @param url объект класса {@code URL}.
     * @return объект градиента.
     * @throws IOException при ошибрах ввода/вывода.
     * @see #create(java.io.InputStream)
     */
    public static Gradient create(URL url) throws IOException {
        return create(url.openStream());
    }

    /**
     * Создает объект градиента, читая цвета и позиции из потока ввода.
     *
     * @param inputStream поток ввода.
     * @return объект градиента.
     * @throws IOException при ошибрах ввода/вывода.
     */
    @SuppressWarnings("resource")
    public static Gradient create(InputStream inputStream) throws IOException {
        Gradient gradient = new Gradient();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        String[] lineArray;

        while ((line = bufferedReader.readLine()) != null) {
            lineArray = line.split(" ");
            if (lineArray.length == 2) {
                gradient.add(Integer.decode(lineArray[0]),
                        Integer.valueOf(lineArray[1]));
            }
        }

        bufferedReader.close();

        return gradient;
    }

}

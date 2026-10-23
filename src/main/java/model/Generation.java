package model;

import java.time.LocalDate;

/**
 * Класс для определения поколения консоли.
 * {@code Поколение} - период времени, в которой были популярны те
 * или иные технологии
 */
public class Generation {
    /**
     * Название поколение
     */
    private String name;
    /**
     * Дата начала поколения
     */
    private LocalDate startDate;
    /**
     * Дата конца поколения
     */
    private LocalDate endDate;
    /**
     * Описание поколения
     */
    private String description;
}

package model;

import java.time.LocalDate;

/**
 * Класс сущности проблема консоли или аксессуаров.
 * Например, {@code Перегрев консоли}.
 */
public class Problem {
    /**
     * Идентификатор ошибки
     */
    private Integer id;
    /**
     * Наименование ошибки
     */
    private String name;
    /**
     * Дата обнаружения
     */
    private LocalDate detectionDate;
    /**
     * статус проблемы
     */
    private String status;
    /**
     * описание проблемы
     */
    private String description;
    /**
     *
     */
    private String solution;
}

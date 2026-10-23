package model;

import java.net.URL;

/**
 * Класс сущности производителя. Например, указывается в
 * {@link model.Console} или {@link model.Accessory}.
 */
public class Manufacturer {
    /**
     * Наименование производителя
     */
    private String name;
    /**
     * Страна производителя
     */
    private String country;
    /**
     * Юридический адрес главного офиса
     */
    private String mainAddress;
    /**
     * электронная почта
     */
    private String email;
    /**
     * Официальный сайт производителя
     */
    private URL officialSite;
}

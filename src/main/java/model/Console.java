package model;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;

/** Класс для описания игровой консоли
 * @author Lns55
 * @version 1.0
 */
public class Console {
    /** Уникальный идентификатор*/
    private Integer id;
    /** Название */
    private String name;
    /**Дата выпуска*/
    private LocalDate releseDate;
    /**Дата завершения выпуска*/
    private LocalDate removalDate; // LocalDate - дата
    /**Дата завершения поддержки*/
    private LocalDate supportEndDate;
    /**Ссылка на официальную страницу консоли*/
    private URL officialPage; // URL - ссылка
    /**Производитель*/
    private Manufacturer manufacturer;
    /**Шаблон списка характаристик*/
    private List<CharacterisTemplate> characterisList;
    /**Список особенностей консоли*/
    private List<Peculiarity> peculiarityList;
    /**Форм-фактор консоли*/
    private FormFactor formFactor;
    /**Список поддерживаемых аксессуаров*/
    private List<Accessory> accessoriesList;
    /**Список известных проблем консоли*/
    private List<Problem> problemList;
    /**Поколение консоли*/
    private Generation generation;
    /**Описание консоли*/
    private String mainArticle;
    /**Список тегов(меток) консоли*/
    private List<Tag> tagList;
    /**Список вариантов консоли*/
    private List<Variety> varietyList;
}

package model;

import java.util.List;
import java.util.Map;

/**
 * Класс сущности варианта консоли.
 * <br>
 * Консоли могут иметь несколько вариантов комлектации в
 * зависимости от различных признаков, например, региона.
 */
public class Variety {
    /**
     * Ссылка на консоль
     */
    private Console mainConsole;
    /**
     * Наименование
     */
    private String name;
    /**
     * Список особых  свойств, отличных от основной версии консоли
     */
    //TODO: сделать отдельный класс для CharacteristicValue<?>
    //чтобы использовать в нескольких местах
    private Map<CharacterisTemplate,
            Map<String,CharacteristicValue>
            > characteristicList;
}

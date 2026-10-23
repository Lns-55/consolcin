package model;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Класс шаблона характеристики.
 * Описывает тип данных характеристики для списка
 * характеристик консоли.
 * @author Lns55
 * @version 1.0
 */
public class CharacterisTemplate {
    /**Наименование типа характеристики, например
     * {@code "комплектующее"},{@code "свойство"}
     */
    private String name;
    /**
     * Описаниехарактеристики (пояснение)
     */
    private String description;
    /** Шаблон спруктуры данных характеристики - наименование и тип*/
    private Map<String, Type> structure;
    /**
     * Группа характеристики, например, характеристика {@code процессор}
     * может находиться в группе {@code железо}
     */
    private String group; //железо
}

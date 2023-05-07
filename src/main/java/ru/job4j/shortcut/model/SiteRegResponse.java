package ru.job4j.shortcut.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Модель данных сайт-ответ
 *
 * @author Alexander Emelyanov
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class SiteRegResponse {

    /**
     * Статус регистрации сайта
     */
    private String registration;

    /**
     * Логин сайта
     */
    private String login;

    /**
     * Пароль сайта
     */
    private String password;
}

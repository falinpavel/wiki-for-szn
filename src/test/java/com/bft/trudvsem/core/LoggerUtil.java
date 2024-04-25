package com.bft.trudvsem.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * LoggerUtil - класс для логирования сообщений.
 * Он использует Log4j для управления логированием.
 */
public class LoggerUtil {

    // Инициализация логгера с использованием Log4j
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    /**
     * Записывает информационное сообщение в лог.
     * @param message Записываемое сообщение
     */
    public static void info(String message) {
        logger.info(message);
    }

    /**
     * Записывает сообщение об ошибке вместе с связанным исключением.
     * @param message Записываемое сообщение
     * @param throwable Связанное исключение
     */
    public static void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    // Здесь можно добавить другие методы для логирования
}
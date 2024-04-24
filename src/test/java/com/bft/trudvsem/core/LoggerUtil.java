package com.bft.trudvsem.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    // Инициализация логгера с использованием Log4j
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    // Пример метода для логирования информационного сообщения
    public static void info(String message) {
        logger.info(message);
    }

    // Пример метода для логирования сообщения об ошибке
    public static void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    // Другие методы для логирования
}

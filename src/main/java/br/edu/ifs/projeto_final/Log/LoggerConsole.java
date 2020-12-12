package br.edu.ifs.projeto_final.Log;

import br.edu.ifs.projeto_final.Enum.LogTypeEnum;

public class LoggerConsole implements LoggerInterface {
    @Override
    public void log(String message) {
        System.out.println(LoggerPrepare.formartMessage(message));
    }

    public void log(String message, LogTypeEnum logType) {
        LoggerPrepare.callLogType(message, logType, this);
    }

    @Override
    public void debug(String message) {
        System.out.println(LoggerPrepare.formartMessage(message, LogTypeEnum.DEBUG, "\033[0;32m"));
    }

    @Override
    public void info(String message) {
        System.out.println(LoggerPrepare.formartMessage(message, LogTypeEnum.INFO, "\033[0;34m"));
    }

    @Override
    public void warning(String message) {
        System.out.println(LoggerPrepare.formartMessage(message, LogTypeEnum.WARNING, "\033[0;33m"));
    }

    @Override
    public void error(String message) {
        System.out.println(LoggerPrepare.formartMessage(message, LogTypeEnum.ERROR, "\033[0;31m"));
    }

    @Override
    public void alert(String message) {
        System.out.println(LoggerPrepare.formartMessage(message, LogTypeEnum.ALERT, "\033[0;36m"));
    }
}

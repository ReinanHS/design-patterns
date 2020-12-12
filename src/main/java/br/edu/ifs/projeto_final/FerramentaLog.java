package br.edu.ifs.projeto_final;

import br.edu.ifs.projeto_final.Enum.LogTypeEnum;
import br.edu.ifs.projeto_final.Log.LoggerConsole;
import br.edu.ifs.projeto_final.Log.LoggerFile;

public class FerramentaLog {
    protected static LoggerConsole loggerConsole;
    protected static LoggerFile loggerFile;

    public static LoggerConsole getLoggerConsole()
    {
        if (loggerConsole == null){
            loggerConsole = new LoggerConsole();
        }

        return  loggerConsole;
    }

    public static LoggerFile getLoggerFile()
    {
        if (loggerFile == null){
            loggerFile = new LoggerFile();
        }

        return  loggerFile;
    }

    public static void log(Object message, LogTypeEnum logTypeEnum, Class loggerInterfaceClass)
    {
        try {
            Object loggerClass = loggerInterfaceClass.newInstance();

            if (loggerClass instanceof LoggerConsole){
                getLoggerConsole().log(message.toString(), logTypeEnum);
            }else if(loggerClass instanceof  LoggerFile){
                getLoggerFile().log(message.toString(), logTypeEnum);
            }

        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

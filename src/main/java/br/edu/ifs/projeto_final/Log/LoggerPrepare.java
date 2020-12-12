package br.edu.ifs.projeto_final.Log;

import br.edu.ifs.projeto_final.Enum.LogTypeEnum;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerPrepare {

    public static String formartMessage(String message, LogTypeEnum logType, String color)
    {
        return color+"["+getDate()+"]["+logType+"] "+message+"\033[0m";
    }

    public static String formartMessage(String message, LogTypeEnum logType) {
        return "["+getDate()+"]["+logType+"] "+message;
    }

    public static String formartMessage(String message) {
        return "["+getDate()+"][LOG] "+message;
    }

    public static String getDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return dtf.format(now);
    }

    public static void callLogType(String message, LogTypeEnum typeLog, Object obj) {
        Method[] methods = LoggerInterface.class.getMethods();

        for (Method method: methods) {
            if (method.getName().equals(typeLog.toString().toLowerCase())){
                try {
                    method.invoke(obj, message);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

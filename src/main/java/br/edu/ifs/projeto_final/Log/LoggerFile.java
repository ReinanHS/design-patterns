package br.edu.ifs.projeto_final.Log;

import br.edu.ifs.projeto_final.Enum.LogTypeEnum;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class LoggerFile implements LoggerInterface {

    public final static String FILE_NAME = "log.txt";

    @Override
    public void log(String message) {
       writeLog(LoggerPrepare.formartMessage(message));
    }

    public void log(String message, LogTypeEnum logType)
    {
        LoggerPrepare.callLogType(message, logType, this);
    }

    @Override
    public void debug(String message) {
        writeLog(LoggerPrepare.formartMessage(message, LogTypeEnum.DEBUG));
    }

    @Override
    public void info(String message) {
        writeLog(LoggerPrepare.formartMessage(message, LogTypeEnum.INFO));
    }

    @Override
    public void warning(String message) {
        writeLog(LoggerPrepare.formartMessage(message, LogTypeEnum.WARNING));
    }

    @Override
    public void error(String message) {
        writeLog(LoggerPrepare.formartMessage(message, LogTypeEnum.ERROR));
    }

    @Override
    public void alert(String message) {
        writeLog(LoggerPrepare.formartMessage(message, LogTypeEnum.ALERT));
    }

    public static void writeLog(String text) {
        File file = new File(FILE_NAME);

        try{
            if(!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fop= new FileOutputStream(file,true);
            if(text != null){
                fop.write(text.getBytes());
                fop.write(System.getProperty("line.separator").getBytes());
            }

            fop.flush();
            fop.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}

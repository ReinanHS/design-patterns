package br.edu.ifs.projeto_final;

import br.edu.ifs.projeto_final.Enum.LogTypeEnum;
import br.edu.ifs.projeto_final.Log.LoggerConsole;
import br.edu.ifs.projeto_final.Log.LoggerFile;

public class Cliente {
    public static void main(String[] args) {
        LoggerConsole loggerConsole = new LoggerConsole();
        LoggerFile loggerFile = new LoggerFile();

        for (int i = 0; i < 10; i++) {
            loggerConsole.log("Número: "+i);
            loggerFile.log("Número: "+i);
            loggerConsole.log("Número: "+i, LogTypeEnum.DEBUG);
            loggerConsole.log("Número: "+i, LogTypeEnum.INFO);
            loggerConsole.log("Número: "+i, LogTypeEnum.ALERT);
            loggerConsole.log("Número: "+i, LogTypeEnum.WARNING);
            loggerConsole.log("Número: "+i, LogTypeEnum.ERROR);
        }
    }
}

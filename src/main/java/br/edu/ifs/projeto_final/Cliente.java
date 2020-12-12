package br.edu.ifs.projeto_final;

import br.edu.ifs.projeto_final.Enum.LogTypeEnum;
import br.edu.ifs.projeto_final.Log.LoggerConsole;
import br.edu.ifs.projeto_final.Log.LoggerFile;

public class Cliente {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            FerramentaLog.log(i, LogTypeEnum.WARNING, LoggerFile.class);
            FerramentaLog.log(i, LogTypeEnum.WARNING, LoggerConsole.class);
        }
    }
}

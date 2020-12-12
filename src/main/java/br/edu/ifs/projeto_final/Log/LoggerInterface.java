package br.edu.ifs.projeto_final.Log;

public interface LoggerInterface {
    /**
     * Função para criar um log genérico com uma mensagem
     *
     * @param message - Mensagem que será exibida no log
     */
    void log(String message);

    /**
     * Função para criar um log do tipo DEBUG
     *
     * @param message - Mensagem que será exibida no log
     */
    void debug(String message);

    /**
     * Função para criar um log do tipo INFO
     *
     * @param message - Mensagem que será exibida no log
     */
    void info(String message);

    /**
     * Função para criar um log do tipo WARNING
     *
     * @param message - Mensagem que será exibida no log
     */
    void warning(String message);

    /**
     * Função para criar um log do tipo ERROR
     *
     * @param message - Mensagem que será exibida no log
     */
    void error(String message);

    /**
     * Função para criar um log do tipo ALERT
     *
     * @param message - Mensagem que será exibida no log
     */
    void alert(String message);
}

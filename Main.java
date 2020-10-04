package br.univille.poo.logger;

import java.io.File;
import java.io.FileWriter;


class Main {
    public static void main(String[] args) {
    	
    	
    	
    	Logger loggerC = LoggerFactory.getInstance().createConsoleLogger();
        Logger loggerF = LoggerFactory.getInstance().createFileLogger();
        
        
        
        loggerC.mensagem("Iniciou o Sistema");
        loggerC.mensagem("Executando o Sistema");
        loggerC.mensagem("Finalizou o Sistema");
       
        loggerF.mensagem("Iniciou o Sistema");
        loggerF.mensagem("Executando o Sistema");
        loggerF.mensagem("Finalizou o Sistema");
      
      
        
    }
       
}
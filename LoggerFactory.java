package br.univille.poo.logger;

 public abstract class LoggerFactory {
	
	 abstract Logger  createConsoleLogger();
	 
	 abstract Logger createFileLogger();
	
	
	 protected LoggerFactory(){};
	 
	 private static LoggerFactory instance ;
	
	   
	    public static  LoggerFactory getInstance()
	    {
	        if(instance==null)
	        {
	            instance = new LoggerFactoryConcreta();
	        }
	        return instance;
	    }
	   
	}
package com.krykunenko.producers;

public enum WorkType {
    CREATE ( " creating"),
    MAKE( " making "),
    SELL( "selling");
    private String message;
    WorkType( String message){
        this.message = message;
    }


}

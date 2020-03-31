

module org.praxislive.libp5x.core {
    
    requires java.desktop;
    requires java.sql;
    
    exports processing.core;
    exports processing.data;
    exports processing.event;
    exports processing.opengl;
    
    opens processing.core;
    opens processing.data;
    opens processing.event;
    opens processing.opengl;
    
}

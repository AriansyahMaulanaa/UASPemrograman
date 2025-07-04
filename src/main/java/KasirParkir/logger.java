/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ariansyah
 */
package KasirParkir;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class logger {
    private static final Logger logger = Logger.getLogger("KasirParkirLogger");

    static {
        try {
            // Simpan log ke file log.txt
            FileHandler fileHandler = new FileHandler("log.txt", true); // true = append
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            // Tampilkan juga ke konsol
            ConsoleHandler consoleHandler = new ConsoleHandler();
            logger.addHandler(consoleHandler);

            // Set level log (bisa diubah ke Level.INFO atau lainnya)
            logger.setLevel(Level.ALL);

            // Hindari duplikasi output log
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            System.err.println("Gagal inisialisasi logger: " + e.getMessage());
        }
    }

    // Method untuk mendapatkan logger instance
    public static Logger getLogger() {
        return logger;
    }

    public static void log(Level SEVERE, Object object, Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

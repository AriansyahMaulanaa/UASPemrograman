package KasirParkir;

import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    public static String formatRupiah(double nilai) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(nilai);
    }
}

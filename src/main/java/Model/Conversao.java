
package Model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conversao {
    
    public static double converterDoubleDoisDecimais(double precoDouble) {
    DecimalFormat fmt = new DecimalFormat("0.00");      
    String string = fmt.format(precoDouble);
    String[] part = string.split("[,]");
    String string2 = part[0]+"."+part[1];
        double preco = Double.parseDouble(string2);
    return preco;
}
    
   public static String arredondar(double media) {
   DecimalFormat df = new DecimalFormat("0.00");
   df.setRoundingMode(RoundingMode.HALF_UP);
   return df.format(media);
}
    
}

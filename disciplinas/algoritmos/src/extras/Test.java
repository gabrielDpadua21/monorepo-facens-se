package extras;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        HashMap<String, HashMap<String,String>> gens = new HashMap<String,HashMap<String,String>>();
        HashMap<String,String> acctyp =  new HashMap<String,String>();
        acctyp.put("'Open'","ACCTYP 01");
        gens.put("'GEN01'", acctyp);
        acctyp =  new HashMap<String,String>();
        acctyp.put("'Sheltered'","ACCTYP 02");
        gens.put("'GEN02'", acctyp);
        acctyp =  new HashMap<String,String>();
        acctyp.put("'Spousal sheltered'","ACCTYP 03");
        gens.put("'GEN03'",acctyp );
        acctyp =  new HashMap<String,String>();
        acctyp.put("'Education'","ACCTYP 06");
        gens.put("'GEN06'",acctyp );
        acctyp =  new HashMap<String,String>();
        acctyp.put("'Non-ded. sheltered'","ACCTYP 12");
        gens.put("'GEN06'",acctyp );
        acctyp =  new HashMap<String,String>();
        acctyp.put("'Structured Product'","ACCTYP 30");
        gens.put("'GEN06'",acctyp );

        acctyp =  new HashMap<String,String>();
        acctyp.put("'Emergency Cash'","ACCTYP 31");
        gens.put("'GEN06'",acctyp );

        System.out.println(gens.toString());

        int teste = 0;

    }

}

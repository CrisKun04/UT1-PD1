package ut1ej4;

public class OtrasOperaciones {
    
    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 0; i <= (cadena.length()-1); i++) {
            if (cadena.charAt(i) != ' ') {  //cuenta los espacios no vacios
            res++;  //suma si tiene un caracter y no es un espacio vacio 
            }
        }
        return res; //Al final devuelve la cantidad de simbolos no vacios()
        }
        public static int getValor() {
            int vector[] = { 6, 16, 26,36,46,56,66,76 };
            int idx = 7;
            return vector[idx];
        }
        public static char getPrimerCaracter(String palabra) {
            String string[] = new String[5];    //// [null, null, null, null, null]
            string[0]= palabra;
            return (string[0].charAt(1));
        }
        public static String paraAString(int a) {
            return String.valueOf(a) ;
        } 
    
}

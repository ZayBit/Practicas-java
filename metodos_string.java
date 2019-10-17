class metodos_string{
    public static void main(String[] args){
        String ms = "Un nuevo mundo nos espera-";
        String mss = "";

        System.out.println(ms); // Un nuevo mundo nos espera

        System.out.println(ms.length()); // 25 (Longitud de caracteres)

        System.out.println(ms.charAt(0)); // "U" Recorre el string caracter a caracter

        System.out.println(ms.substring(0, 2)); // "Un" substrae caracteres desde un punto A a un punto B (inicio, final)

        System.out.println(ms.substring(19)); // "espera" substrae caracteres desde un punto inicial hacia adelante

        System.out.println(ms.trim()); // "Un nuevo mundo nos espera" elimina espacios en blanco Ej. " Hola" - "Hola"

        System.out.println(ms.indexOf("nos")); // Devuelve (15) el indice en el que se encontro la palabra clave "nos" 

        System.out.println(mss.isEmpty()); // Devuelve true si la cadena esta vacia y false si no esta vacia

        System.out.println(ms.toLowerCase()); // Devulve la cadena en minusculas

        System.out.println(ms.toUpperCase()); // Devuelve la cadena en mayusculas

        System.out.println(ms.replace("Un", "El")); // Reemplaza todas las ocurrencias "Un" a "El"

    }
}
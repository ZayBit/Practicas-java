class funciones{
    public static void main(String[] args){
        mensaje();
        mensaje_v2("Funcion nueva!");
    }

    // Funcion sin parametros
    public static void mensaje(){
        System.out.println("Hola!, Funcion!.");
    }
    
    // Funcion con parametros
    public static void mensaje_v2(String ms){
        System.out.println(ms);
    }

}

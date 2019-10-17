class condicional_y_switch{
    public static void main(String[] args){
        boolean entrada = true;

        String puerta = (entrada) ? "La entrada esta abierta" : "La entrada esta cerrada";

        System.out.println(puerta);

        int[] numeros = {1,2,3,4};

        if(entrada){
            System.out.println("Es verdadero");
        }else{
            System.out.println("Es falso");
        }

        switch(numeros[3]){
            case 1:
                System.out.println("Es el numero #1");
                break;
            case 2:
                System.out.println("Es el numero #2");
                break;
            case 3:
                System.out.println("Es el numero #3");
                break;
            default:
                System.out.println("Al parecer no es ningun numero definido");
                break;
        }
    }
}
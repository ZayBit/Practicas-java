// import java.lang.reflect.Array;

class bucles{
    public static void main(String[] args){
        int count = 0;
        String[] nombres = {"alan","denis","alberto"};
        
        int length_nombres = nombres.length;

        // Bucle for 
        
        for(int i = 0; i < length_nombres;i++){
            System.out.println(nombres[i]);
        }

        // Bucle while

        while(count < length_nombres){
             System.out.println(nombres[count]);
              count++;
        }
        
        // Bucle do_while

        do {
             System.out.println(nombres[count]);
             count++;
        } while (count < length_nombres);

        // Bucle ForEach

        for(String nombre : nombres){
            System.out.println(nombre);
        }
        
    }
}
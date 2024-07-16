import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //scanner class
        Scanner cb = new Scanner(System.in);


        String palabrasecreta= "inteligence";
        int intentosmaximos = 10;
        int intentos = 0;
        boolean iscorrect = false;

        //areglos

        char[] letrasadivinadas = new char[palabrasecreta.length()];


        //estructure
        for (int i = 0; i < letrasadivinadas.length; i++) {
            letrasadivinadas[i]= '_'; 
        }

        //estructure iterative
        while (!iscorrect && intentos < intentosmaximos) {
            System.out.println("Palabra a adivinar  "+String.valueOf(letrasadivinadas)+" ("+palabrasecreta.length()+" letras)" );
            System.out.println("Introduce una letra");

            char letra = cb.next().charAt(0);

            boolean letracorrecta = false;
            for (int i = 0; i < palabrasecreta.length(); i++) {
                
                //estructure control condicional
                if (palabrasecreta.charAt(i)==letra) {
                    letrasadivinadas[i]=letra;
                    letracorrecta=true;
                }
            }
            
            if (!letracorrecta) {
                intentos++;
                System.out.println("Incorrecto \nte quedan "+(intentosmaximos-intentos)+" intentos");
            }
            if (String.valueOf(letrasadivinadas).equals(palabrasecreta)) {
                iscorrect = true;
                System.out.println("Adivinaste la palabra: "+palabrasecreta);
            }
        }

        if (!iscorrect) {
            System.out.println("PERDISTE");
        }

        cb.close();




    }
}

/*
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
*/

public class Ej12_CuestionarioTipotest {
    public static void main(String[] args) {

        System.out.println("1)Fol: Es bueno Elon musk?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: Absolutamente, no ves que nos va a dar internet gratis");
        System.out.println("Por favor, introduzca su respuesta: ");

        int A = Integer.parseInt(System.console().readLine());
        int puntos = 0;
        switch (A) {
            case 1:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 2:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("2)Programacion: Java es util?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: Absolutamente, Si se programa Minecraft con eso");
        System.out.println("Por favor, introduzca su respuesta: ");

        int B = Integer.parseInt(System.console().readLine());

        switch (B) {
            case 1:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 2:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("correcto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("3)Programacion: Te gusta Java?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: Es to facil primo");
        System.out.println("Por favor, introduzca su respuesta: ");

        int C = Integer.parseInt(System.console().readLine());
        switch (C) {
            case 1:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 2:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("4)Sistemas: Cual sistema es superior?");
        System.out.println("1: Ubuntu");
        System.out.println("2: Windows");
        System.out.println("3: Mac");
        System.out.println("Por favor, introduzca su respuesta: ");

        int D = Integer.parseInt(System.console().readLine());
        switch (D) {
            case 1:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 2:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("5)Fol: Usted que cree que es lo mas importante?");
        System.out.println("1: Una Carrera");
        System.out.println("2: Saberlo todo");
        System.out.println("3: Softskills");
        System.out.println("Por favor, introduzca su respuesta: ");

        int F = Integer.parseInt(System.console().readLine());
        switch (F) {
            case 1:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 2:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("6)Base de datos: Base de datos es util para RTS?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: No tiene nada que ver son de IA");
        System.out.println("Por favor, introduzca su respuesta: ");

        int E = Integer.parseInt(System.console().readLine());
        switch (E) {
            case 1:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;

            case 2:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("6)Entorno: Yumi y rufus son...?");
        System.out.println("1: Personajes del lol");
        System.out.println("2: Herramientas muy utiles para hacer dualboot");
        System.out.println("3: Sistemas operativos");
        System.out.println("Por favor, introduzca su respuesta: ");

        int G = Integer.parseInt(System.console().readLine());
        switch (G) {
            case 1:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;

            case 2:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            case 3:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("7)Base de datos: Es necesario que cada tabla tenga una primary key?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: Pueden tener claves foraneas pero nunca primary");
        System.out.println("Por favor, introduzca su respuesta: ");

        int I = Integer.parseInt(System.console().readLine());
        switch (I) {
            case 1:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            case 2:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            case 3:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("8)Programacion: HTML es un lenguaje de programacion?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: Literalmente es un SO");
        System.out.println("Por favor, introduzca su respuesta: ");

        int J = Integer.parseInt(System.console().readLine());
        switch (J) {
            case 1:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 2:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            case 3:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("9)Fol: en España es ilegal despedir por via Whatsapp?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: Que va eso le dices chao y listo");
        System.out.println("Por favor, introduzca su respuesta: ");

        int k = Integer.parseInt(System.console().readLine());
        switch (k) {
            case 1:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            case 2:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }

        System.out.println("10)Programacion: en Geany necesita importar librerias para ciertas operaciones?");
        System.out.println("1: Si");
        System.out.println("2: No");
        System.out.println("3: Que es Geany?");
        System.out.println("Por favor, introduzca su respuesta: ");

      int l = Integer.parseInt(System.console().readLine());
        switch (l) {
            case 1:
                System.out.println("correcto +1 punto ");
                puntos += 1;
                System.out.println("Su puntuacion es " + puntos);
                break;
            case 2:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            case 3:
                System.out.println("incorrecto -1 punto ");
                puntos -= 1;
                System.out.println("Su puntuacion es " + puntos);

                break;
            default:
                System.out.println("Sin respuesta ");

                break;
        }
        System.out.println("Sus puntos son "+puntos);

        if (puntos>=5) {
            System.out.println("Sus conocimientos son buenos");
        }
        else if (puntos <5 && puntos>0) {
            System.out.println("Sus conocimientos son malos");

        }
        else  {
            System.out.println("Sus conocimientos son malardos por favor desapuntate del curso");

        }
    }
}

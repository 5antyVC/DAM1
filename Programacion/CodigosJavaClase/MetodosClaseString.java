public class MetodosClaseString {
    public static void main(String[] args) {
        String Santiago="Santiago";
        System.out.println(Santiago.length());//Dice la longitud del array
        System.out.println(Santiago.indexOf("a"));//Dice la posicion del primer caracter dado
        System.out.println(Santiago.lastIndexOf("a"));//Dice la posicion del ultimo caracter dado
        System.out.println(Santiago.charAt(0));//Imprime el string de la posicion dada
        System.out.println(Santiago.substring(0,8));//Imprime el array en el intervalo
        System.out.println(Santiago.toUpperCase());//Pone en mayusuclas
        System.out.println(Santiago.toLowerCase());//Pone en minusculas
        System.out.println(Santiago.equals("San"));//Compara
        System.out.println(Santiago.equalsIgnoreCase("santiago")); //IgnoraMayusulas
        System.out.println(Santiago.compareTo("Santiago"));//Numero de diferencias
        System.out.println(Santiago.compareTo("Santyago")); //Numero de diferencias
        System.out.println(Santiago.toCharArray());//Imprime Array caracter por caracter
        System.out.println(Santiago.trim()); //Quita espacios de los lados
        System.out.println(Santiago.valueOf(2));//Castea por ejemplo "80" a floatl.Santiago= 80.0
        System.out.println(Santiago.replace('o','x'));//Cambia el caracter por el dado
        System.out.println(Santiago.substring(0,4));//Imprime el intervalo
        System.out.println(Santiago.substring(4));//Imprime a partir del intervalo
        System.out.println(Santiago.startsWith("San"));//Empieza con
        System.out.println(Santiago.endsWith("ago"));//Termina con
        System.out.println(Santiago.split("a"));//Quita el caracter




    }
}

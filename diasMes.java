public class Segun_Caso_o_Switch {
    public static void main(String args[]) {
      // Switch Case
        // Un 'switch' funciona con un tipo de dato byte, short, char e int
        // También funciona con tipos enumerados (discutido en tipos Enum),
        // la clase String y unas pocas clases especiales que envuelven
        // tipos primitivos: Character, Byte, Short e Integer.
        int mes = 3;
        String mesString;
        switch (mes){
            case 1:
                    mesString = "Enero";
                    break;
            case 2:
                    mesString = "Febrero";
                    break;
            case 3:
                    mesString = "Marzo";
                    break;
            default:
                    mesString = "Algun otro mes";
                    break;
        }
        System.out.println("Resultado switch Case: " + mesString);
    }
}
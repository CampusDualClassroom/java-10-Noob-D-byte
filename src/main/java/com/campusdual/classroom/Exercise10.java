package com.campusdual.classroom;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {


    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        String color;
        int contadorAzul = 0;//Contador para saber cantas bolas azules salen
        do {
            color = getBall();//chamo ao metodo getBall para que me de as bolas.

            System.out.println("La bola es de color: " + color);


            if (color.equals("azul")) {// Si o color é igual a "azul"
                contadorAzul++;//Sumamoslle unha unidade ao contadorAzul
            }


        } while (contadorAzul < 2);//o bucle do-while  cando salgan 2 bolas azules, finalizará.
    }


    // Un métod que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el métod randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        switch (randomWithRange(1, 4)) { //Este metodo devolve o color da pelota de forma random cos case que presentamos.

            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            default:
                return "";
        }
    }

    public static int randomWithRange(int min, int max) {//xenera un num aleatorio no rango que se lle da,se lle dou como
        //valor max 3, será o rango entre 1 e 2, e por eso non me salia o case 3. Por eso  lle puxen max 4.

        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
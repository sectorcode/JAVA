package com.pe.sectorcode;

/**
 *
 * @Author Josue Lopez
 */
public class CaracteresEscape
{
  public static void main(String[] args) {

    /***
     * \033[0m	Cerrar todas las propiedades
     * \033[1m	Establecer resaltado
     * \033[4m	Subrayar
     * \033[5m	Parpadeo
     * \033[7m	Pantalla inversa
     * \033[8m	Blanking
     * \033[30m-\33[37m	Establecer color de primer plano
     * \033[40m-\33[47m	Establecer color de fondo
     * \033[nA	Mueve el cursor hacia arriba n líneas
     * \033[nB	Mueve el cursor hacia abajo n líneas
     * \033[nC	Cursor n líneas a la derecha
     * \033[nD	Mueve el cursor hacia la izquierda por n líneas
     * \033[y;xH	Establecer la posición del cursor
     * \033[2J	Pantalla clara
     * \033[K	Borrar contenido del cursor al final de la línea
     * \034[s	Guardar posición del cursor
     * \033[u	Restaurar la posición del cursor
     * \033[?25l	Ocultar cursor
     * \033[?25h	Mostrar cursor
     */
    System.out.print("\033[30m\u25B0");
    System.out.print("\033[31m\u25B0");
    System.out.print("\033[32m\u25B0");
    System.out.print("\033[33m\u25B0");
    System.out.print("\033[32m\u25B0");
    System.out.print("\033[31m\u25B0");
    System.out.print("\033[37m\u25B0");
    System.out.print("\033[36m\u25B0");
    System.out.print("\033[35m\u25B0");
    System.out.print("\033[34m\u25B0");
    System.out.print("\033[36m\u25B0");
    System.out.print("\033[37m\u25B0");
    System.out.print("\033[38m\u25B0");
  }
}

package com.pe.sectorcode;

public class CaracteresEspeciales
{
  public static void main(String[] args)
  {
    /**
     * \n  -> Salto de línea. Sitúa el cursor al principio de la línea siguiente
     * \r  -> Ir al principio de la línea. Mueve el cursor al principio de la línea actual.
     * \b  -> Retroceso. Mueve el cursor un carácter atrás en la línea actual.
     * \t  -> Tabulador horizontal. Mueve el cursor hacia adelante una distancia determinada por el tabulador.
     * \f  -> Nueva página. Mueve el cursor al principio de la siguiente página.
     * \"  -> Comillas. Permite mostrar por pantalla el caracter comillas dobles.
     * \'  -> Comilla simple. Permite mostrar por pantalla el carácter comilla simple.
     * \\  -> Barra inversa.
     * \udddd -> Carácter Unicode. d representa un dígito hexadecimal del caracter Unicode.
     */


    // \n  -> Salto de línea. Sitúa el cursor al principio de la línea siguiente
    System.out.println("Juan\nMariel\nArturo\nKike");

    // \r  -> Ir al principio de la línea. Mueve el cursor al principio de la línea actual.
    System.out.println("Lunes\rMartes, Miércoles");

     // \t  -> Tabulador horizontal. Mueve el cursor hacia adelante una distancia determinada por el tabulador.
    System.out.println("Lunes\tMartes\tMiércoles");


    //Manejo de comillas
    System.out.println("\"Lunes\",\"Martes\",\'Miércoles\', \'Jueves\'");

    //Carateres unicode
    System.out.println("0x2500 =\u2500");
    System.out.println("0x2501 =\u2501");
    System.out.println("0x2502 =\u2502");
    System.out.println("0x2503 =\u2503");
    System.out.println("0x2504 =\u2504");
    System.out.println("0x2505 =\u2505");
    System.out.println("0x2506 =\u2506");
    System.out.println("0x2507 =\u2507");
    System.out.println("0x2508 =\u2508");
    System.out.println("0x2509 =\u2509");
    System.out.println("0x250a =\u250a");
    System.out.println("0x250b =\u250b");
    System.out.println("0x250c =\u250c");
    System.out.println("0x250d =\u250d");
    System.out.println("0x250e =\u250e");
    System.out.println("0x250f =\u250f");
    System.out.println("0x2510 =\u2510");
    System.out.println("0x2511 =\u2511");
    System.out.println("0x2512 =\u2512");
    System.out.println("0x2513 =\u2513");
    System.out.println("0x2514 =\u2514");
    System.out.println("0x2515 =\u2515");
    System.out.println("0x2516 =\u2516");
    System.out.println("0x2517 =\u2517");
    System.out.println("0x2518 =\u2518");
    System.out.println("0x2519 =\u2519");
    System.out.println("0x251a =\u251a");
    System.out.println("0x251b =\u251b");
    System.out.println("0x251c =\u251c");
    System.out.println("0x251d =\u251d");
    System.out.println("0x251e =\u251e");
    System.out.println("0x251f =\u251f");
    System.out.println("0x2520 =\u2520");
    System.out.println("0x2521 =\u2521");
    System.out.println("0x2522 =\u2522");
    System.out.println("0x2523 =\u2523");
    System.out.println("0x2524 =\u2524");
    System.out.println("0x2525 =\u2525");
    System.out.println("0x2526 =\u2526");
    System.out.println("0x2527 =\u2527");
    System.out.println("0x2528 =\u2528");
    System.out.println("0x2529 =\u2529");
    System.out.println("0x252a =\u252a");
    System.out.println("0x252b =\u252b");
    System.out.println("0x252c =\u252c");
    System.out.println("0x252d =\u252d");
    System.out.println("0x252e =\u252e");
    System.out.println("0x252f =\u252f");
    System.out.println("0x2530 =\u2530");
    System.out.println("0x2531 =\u2531");
    System.out.println("0x2532 =\u2532");
    System.out.println("0x2533 =\u2533");
    System.out.println("0x2534 =\u2534");
    System.out.println("0x2535 =\u2535");
    System.out.println("0x2536 =\u2536");
    System.out.println("0x2537 =\u2537");
    System.out.println("0x2538 =\u2538");
    System.out.println("0x2539 =\u2539");
    System.out.println("0x253a =\u253a");
    System.out.println("0x253b =\u253b");
    System.out.println("0x253c =\u253c");
    System.out.println("0x253d =\u253d");
    System.out.println("0x253e =\u253e");
    System.out.println("0x253f =\u253f");
    System.out.println("0x2540 =\u2540");
    System.out.println("0x2541 =\u2541");
    System.out.println("0x2542 =\u2542");
    System.out.println("0x2543 =\u2543");
    System.out.println("0x2544 =\u2544");
    System.out.println("0x2545 =\u2545");
    System.out.println("0x2546 =\u2546");
    System.out.println("0x2547 =\u2547");
    System.out.println("0x2548 =\u2548");
    System.out.println("0x2549 =\u2549");
    System.out.println("0x254a =\u254a");
    System.out.println("0x254b =\u254b");
    System.out.println("0x254c =\u254c");
    System.out.println("0x254d =\u254d");
    System.out.println("0x254e =\u254e");
    System.out.println("0x254f =\u254f");
    System.out.println("0x2550 =\u2550");
    System.out.println("0x2551 =\u2551");
    System.out.println("0x2552 =\u2552");
    System.out.println("0x2553 =\u2553");
    System.out.println("0x2554 =\u2554");
    System.out.println("0x2555 =\u2555");
    System.out.println("0x2556 =\u2556");
    System.out.println("0x2557 =\u2557");
    System.out.println("0x2558 =\u2558");
    System.out.println("0x2559 =\u2559");
    System.out.println("0x255a =\u255a");
    System.out.println("0x255b =\u255b");
    System.out.println("0x255c =\u255c");
    System.out.println("0x255d =\u255d");
    System.out.println("0x255e =\u255e");
    System.out.println("0x255f =\u255f");
    System.out.println("0x2560 =\u2560");
    System.out.println("0x2561 =\u2561");
    System.out.println("0x2562 =\u2562");
    System.out.println("0x2563 =\u2563");
    System.out.println("0x2564 =\u2564");
    System.out.println("0x2565 =\u2565");
    System.out.println("0x2566 =\u2566");
    System.out.println("0x2567 =\u2567");
    System.out.println("0x2568 =\u2568");
    System.out.println("0x2569 =\u2569");
    System.out.println("0x256a =\u256a");
    System.out.println("0x256b =\u256b");
    System.out.println("0x256c =\u256c");
    System.out.println("0x256d =\u256d");
    System.out.println("0x256e =\u256e");
    System.out.println("0x256f =\u256f");
    System.out.println("0x2570 =\u2570");
    System.out.println("0x2571 =\u2571");
    System.out.println("0x2572 =\u2572");
    System.out.println("0x2573 =\u2573");
    System.out.println("0x2574 =\u2574");
    System.out.println("0x2575 =\u2575");
    System.out.println("0x2576 =\u2576");
    System.out.println("0x2577 =\u2577");
    System.out.println("0x2578 =\u2578");
    System.out.println("0x2579 =\u2579");
    System.out.println("0x257a =\u257a");
    System.out.println("0x257b =\u257b");
    System.out.println("0x257c =\u257c");
    System.out.println("0x257d =\u257d");
    System.out.println("0x257e =\u257e");
    System.out.println("0x257f =\u257f");

  }
}

package com.dev.reto01;

public class Reto01Operadores {

    public static void main(String[] args) {

        // 1. OPERADORES ARITMÉTICOS (Matemáticas básicas)
        System.out.println("--- OPERADORES ARITMÉTICOS ---");
        int a = 10;
        int b = 3;
        System.out.println("Suma (a + b): " + (a + b));
        System.out.println("Resta (a - b): " + (a - b));
        System.out.println("Multiplicación (a * b): " + (a * b));
        System.out.println("División (a / b): " + (a / b));
// El módulo te da lo que sobra. Si divides 10 entre 3 (da 3), sobra 1.
        System.out.println("Módulo o residuo (a % b): " + (a % b));

// 2. OPERADORES RELACIONALES (Comparaciones)
        System.out.println("\n--- OPERADORES RELACIONALES ---");
// Estos operadores no dan números como resultado, dan un 'boolean' (true o false)
        System.out.println("¿a es igual a b?: " + (a == b));       // false
        System.out.println("¿a es diferente de b?: " + (a != b));  // true
        System.out.println("¿a es mayor que b?: " + (a > b));      // true
        System.out.println("¿a es menor o igual a b?: " + (a <= b)); // false

// 3. OPERADORES LÓGICOS (Filtros compuestos)
        System.out.println("\n--- OPERADORES LÓGICOS ---");
        boolean tieneConocimiento = true;
        boolean tienePracticas = false;

// AND (&&): Exige que AMBAS sean 'true' para dar 'true'
        System.out.println("AND (&&): " + (tieneConocimiento && tienePracticas));
// OR (||): Es más relajado, con que UNA sea 'true', el resultado es 'true'
        System.out.println("OR (||): " + (tieneConocimiento || tienePracticas));
// NOT (!): Voltea la moneda. Si era 'true', lo vuelve 'false'
        System.out.println("NOT (!): " + (!tieneConocimiento));

// 4. OPERADORES DE ASIGNACIÓN (Guardar y actualizar datos)
        System.out.println("\n--- OPERADORES DE ASIGNACIÓN ---");
        int miVariable = 5; // El igual (=) asigna el valor por primera vez
        System.out.println("Valor inicial: " + miVariable);

        miVariable += 5; // Esto es un atajo para decir: miVariable = miVariable + 5
        System.out.println("Valor sumado (+=): " + miVariable);

// 5. CICLO WHILE

        System.out.println("\n ciclo while ");

        int miEdad = 1;

        while (miEdad <= 19){
            System.out.println("mi edad actual: " + miEdad);
            miEdad ++;
        }

// 6. CONDICIONAL SWITCH

        System.out.println(" \n condicional switch");

        int meseDelAno= 5;

        switch (meseDelAno){
            case 1:
            System.out.println("enero");
                    break;

            case 2:
                System.out.println("febrero");
                    break;


            case 3:
                System.out.println("marzo");
                break;

            case 4:
                System.out.println("abril");
                break;

            default:
                System.out.println("no tengo ningun mes ");
        }

        System.out.println("\n--- DIFICULTAD EXTRA (CICLO FOR) ---");
// AQUÍ DEBAJO DEJAS EL CICLO FOR CON EL IF QUE YA ARMAMOS


        for (int i = 10; i <= 55; i ++){

            if (i % 2 == 0 && i !=16 && i % 3 != 0){

                System.out.println(i);
            }
        }


        for ( int e = 10; e >= 0; e--){
            System.out.println("cuenta regrsiva: " + e);

            if (e == 5 ){
                System.out.println("llegamos a la mitad de la cuenta ");
            }
        }
    }
}

# 06 **Generador de secuencia de Fibonacci con límite**

**Instrucción:** Desarrolla un programa en Java que genere la secuencia de Fibonacci hasta un límite especificado por el usuario. El programa debe:

1. Solicitar al usuario un número entero positivo como límite
2. Generar y mostrar todos los números de la secuencia de Fibonacci que sean menores o iguales al límite ingresado
3. Al final, mostrar cuántos números de la secuencia fueron generados y la suma de todos ellos

Recuerda que la secuencia de Fibonacci comienza con 0 y 1, y cada número subsiguiente es la suma de los dos anteriores (0, 1, 1, 2, 3, 5, 8, 13, 21, ...).

Ejemplo: Si el usuario ingresa 50 como límite, el programa debería mostrar: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 (10 números generados, suma: 88).

Analisis
como voya  solicitar un enetero positivo, voy a ser uso del Scanner, asi que en primer lugayr de importar el escanner al principio.
luego, haciendo uso del scanner le solicitu a un usuario que ingrese un numero positivo como limite para la secuencia, y este lo almaceno en una variable entera porque el problema dice que debe ser enetero, asi que designo la variable como int.

ahora voy a inicializar un For  en el que establecere la condicion segun lo indica el problema es decir (int = i ; i <= numero ingresado por el usuario ; i++) 

voy a hacer uso de un ciclo for para definir un limite , dentro de este inicializo un contador que vaya sumando o acumulando cada iteracion y ese es el valor que voy a estar usando para en otra variabale llamada resultado ir almacenando cada numero de la secuencia de fibonacci 
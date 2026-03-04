# Algoritmos Iterativos y Recursivos en Java

Demostración comparativa de implementaciones **iterativas** y **recursivas** de algoritmos clásicos en **Java 11+**, con explicaciones claras, manejo de errores y análisis de complejidad.

Proyecto educativo creado para entender las diferencias prácticas entre ambos enfoques: legibilidad, rendimiento, uso de memoria y casos donde uno es preferible al otro.

- [Introducción](#introducción)
- [Algoritmos incluidos](#algoritmos-incluidos)
- [Requisitos](#requisitos)
- [Instalación y ejecución](#instalación-y-ejecución)
- [Estructura del proyecto](#estructura-del-proyecto)
- [Ejemplos de uso](#ejemplos-de-uso)
- [Análisis de complejidad](#análisis-de-complejidad)
- [Trade-offs: ¿Cuándo usar recursión vs iteración?](#trade-offs-cuándo-usar-recursión-vs-iteración)
- [Buenas prácticas aplicadas](#buenas-prácticas-aplicadas)
- [Licencia](#licencia)
- [Autor](#autor)

## Introducción

Este repositorio muestra implementaciones limpias y comentadas de cuatro algoritmos clásicos:

- Factorial
- Fibonacci
- Búsqueda binaria
- Máximo Común Divisor (MCD – Algoritmo de Euclides)

Cada algoritmo tiene **dos versiones**:

- **Recursiva** → elegante, fácil de entender conceptualmente
- **Iterativa** → más eficiente en memoria y tiempo para casos grandes

Ideal para estudiantes, entrevistas técnicas y para comprender optimizaciones reales.}

## Algoritmos incluidos

| Algoritmo              | Recursivo                  | Iterativo                  | Caso de uso típico                  |
|------------------------|----------------------------|----------------------------|--------------------------------------|
| Factorial              | `FactorialRecursivo`       | `FactorialIterativo`       | Matemáticas, combinatoria            |
| Fibonacci              | `FibonacciRecursivo`       | `FibonacciIterativo`       | Series, programación dinámica        |
| Búsqueda Binaria       | `BusquedaBinariaRecursiva` | `BusquedaBinariaIterativa` | Búsqueda eficiente en datos ordenados |
| Máximo Común Divisor   | `MCDRecursivo`             | `MCDIterativo`             | Criptografía, simplificación fracciones |

## Requisitos

- **Java** 11 o superior 
- Compilador `javac` y runtime `java` (incluidos en JDK)
- Opcional: IDE VS Code + Extension Pack for Java)

## Instalación y ejecución

### Opción 1 – Ejecución directa (sin IDE)

```bash
# 1. Clonar el repositorio (o descargar ZIP)
git clone https://github.com/AllSoto/algoritmos-iterativos-recursivos-java.git
cd algoritmos-iterativos-recursivos-java

# 2. Compilar todos los archivos .java
javac *.java

# 3. Ejecutar cualquier clase (ejemplo con Fibonacci)
java FibonacciRecursivo
java FibonacciIterativo

Opción 2 – Usando un IDE

Abre la carpeta del proyecto en IntelliJ / Eclipse / VS Code
Deja que el IDE detecte el proyecto Java automáticamente
Haz clic derecho → Run en cualquier clase que tenga main()

algoritmos-java/
├── FactorialRecursivo.java
├── FactorialIterativo.java
├── FibonacciRecursivo.java
├── FibonacciIterativo.java
├── BusquedaBinariaRecursiva.java
├── BusquedaBinariaIterativa.java
├── MCDRecursivo.java
├── MCDIterativo.java
├── FactorialRecursivo.mp4
├── FactorialIterativo.mp4
├── FibonacciRecursivo.mp4
├── FibonacciIterativo.mp4
├── BusquedaBinariaRecursiva.mp4
├── BusquedaBinariaIterativa.mp4
├── MCDRecursivo.mp4
├── MCDIterativo.mp4

##Ejemplos de uso##

// Factorial
System.out.println(FactorialRecursivo.factorial(10));   // → 3,628,800
System.out.println(FactorialIterativo.factorial(10));   // → 3,628,800

// Fibonacci (n-ésimo término)
System.out.println(FibonacciRecursivo.fibonacci(15));   // → 610
System.out.println(FibonacciIterativo.fibonacci(15));   // → 610

// Búsqueda binaria
int[] arr = {1, 3, 5, 7, 9, 11, 13};
System.out.println(BusquedaBinariaIterativa.busquedaBinaria(arr, 7));  // → 3


//Buenas prácticas aplicadas

Uso de long en lugar de int para evitar desbordamiento rápido
Validación de parámetros (números negativos)
Nombres de métodos y variables claros (camelCase estándar Java)
Comentarios Javadoc en métodos públicos (puedes agregarlos)
Manejo de excepciones apropiado
Evitar recursión de cola no optimizada (Java no hace tail-call optimization)

//Licencia
MIT License
Puedes usar, modificar y distribuir este código libremente.

//Autor
Alberto José
Guatemala 🇬🇹

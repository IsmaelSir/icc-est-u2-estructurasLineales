# Estructuras Lineales - Ejercicios

Este proyecto contiene implementaciones de estructuras de datos lineales en Java, con ejercicios prácticos para reforzar el conocimiento de **pilas** y su uso en diferentes problemas.

## Ejercicios Implementados

### 1. Ejercicio 01: Validación de Signos
**Descripción:**  
Este ejercicio implementa un algoritmo que determina si un string que contiene los caracteres `(`, `)`, `{`, `}`, `[` y `]` es válido.  
Un string es válido si:
- Cada paréntesis abierto tiene un paréntesis de cierre correspondiente.
- Los paréntesis están correctamente anidados.

**Ejemplo de uso:**  
- Input: `([]){}`  
  - Output: `true`  
- Input: `({)}`
  - Output: `false`

**Funcionamiento del código:**  
- Se utiliza una **pila genérica** para almacenar los caracteres abiertos mientras se recorre el string.
- Cuando se encuentra un carácter de cierre, se compara con el elemento en el tope de la pila.
- Si no coincide o la pila está vacía al intentar hacer un cierre, el string no es válido.

### 2. Ejercicio 02: Ordenar un Stack
**Descripción:**  
Este ejercicio implementa un algoritmo que ordena una pila de números enteros de forma ascendente, colocando los elementos más pequeños en el tope de la pila.  

**Ejemplo de uso:**  
- Input: `(tope) 5 -> 1 -> 4 -> 2`  
  - Output: `(tope) 1 -> 2 -> 4 -> 5`

**Funcionamiento del código:**  
- Se utiliza una pila auxiliar para organizar los elementos.
- Los elementos de la pila original se comparan con los de la pila auxiliar, moviéndolos de forma ordenada.
- Al final, la pila original queda ordenada sin utilizar estructuras de datos adicionales.


Makigas sealed classes explanation:
https://www.youtube.com/watch?v=afKADOZkNH8&list=PLTd5ehIj0goOxgHKsBIbGRvAwMWclrHDi&index=13&ab_channel=makigas

# Sealed Classes
El concepto de Sealed classes sirve para que podamos definir una jerarquía de clases que limita qué otras clases pueden extender o implementar una clase o interfaz específica. Esto es útil para controlar la herencia y garantizar que solo ciertas clases puedan ser parte de una jerarquía.

Basicamente me aseguro de antemano quien va a estar extendiendo a mi clase "padre" y de esa forma no permito que cualquier clase pueda extenderla. Esto es útil para mantener un control más estricto sobre la jerarquía de clases y evitar herencias no deseadas.

En este ejemplo, tenemos una clase `Desayuno` que es sellada (`sealed`) y dos clases que la extienden: `Cafe` y `Tostada`. Ambas clases son finales (`final`), lo que significa que no pueden ser extendidas por otras clases. Esto asegura que solo estas dos clases específicas puedan ser creadas a partir de la clase `Desayuna`.


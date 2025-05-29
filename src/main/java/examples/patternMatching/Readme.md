Makigas explica pattern matching:
Pero tambien se muestra un poco de sealed, record (podes repasar estos conceptos en los otros packagess que cree)

https://www.youtube.com/watch?v=2ih8_z6bEy8&list=PLTd5ehIj0goOxgHKsBIbGRvAwMWclrHDi&index=13


# Pattern Matching
Pattern matching es una característica de Java que permite realizar comparaciones más flexibles y concisas entre objetos.


Aca se hace un ejemplo de Pattern Matching. En el ejemplo vemos una interfaz "figuraGeometrica" la cual es implementada por "Circulo", "Rectangulo" y "cuadrado".

Luego se crea un metodo "area" el cual recibe una figuraGeometrica y utiliza pattern matching para determinar el tipo de figura y calcular su área de manera más concisa.

Tambien se aplica el concepto de "destructuración de patrones" para extraer los valores de las propiedades de las figuras directamente en la declaración del método. (Destructuring)
```java
    public static float area(FiguraGeometrica g){
    return switch (g) {
        case Rectangulo(float ancho, float alto) -> ancho * alto;
        case Triangulo(float base, float altura) -> (base * altura) / 2;
        case Cuadrado(String nombre, float lado) -> lado * lado;
    };
}
```


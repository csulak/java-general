# Operaciones en Streams de Java: ¿Perezosas o Eager?

En Java, las operaciones sobre streams se dividen en dos grandes categorías:

1. ✅ **Operaciones intermedias** → *perezosas (lazy)*
2. 🔚 **Operaciones terminales** → *eager (forzan la ejecución)*

---

## 📊 Cuadro resumen

| Tipo         | Método                         | ¿Es perezosa? | Descripción breve                                                  |
|--------------|--------------------------------|---------------|----------------------------------------------------------------------|
| Intermedia   | `filter(Predicate)`            | ✅ Sí         | Filtra elementos según condición                                    |
| Intermedia   | `map(Function)`                | ✅ Sí         | Transforma cada elemento                                            |
| Intermedia   | `flatMap(Function)`            | ✅ Sí         | Transforma y aplana múltiples streams                               |
| Intermedia   | `distinct()`                   | ✅ Sí         | Elimina duplicados                                                  |
| Intermedia   | `sorted()`                     | ✅ Sí         | Ordena elementos según orden natural                                |
| Intermedia   | `sorted(Comparator)`           | ✅ Sí         | Ordena según comparador                                             |
| Intermedia   | `peek(Consumer)`               | ✅ Sí         | Ejecuta una acción sin modificar (útil para debugging)              |
| Intermedia   | `limit(long)`                  | ✅ Sí         | Limita a los primeros N elementos                                   |
| Intermedia   | `skip(long)`                   | ✅ Sí         | Omite los primeros N elementos                                      |
| Terminal     | `forEach(Consumer)`            | ❌ No         | Itera sobre cada elemento (desencadena ejecución)                   |
| Terminal     | `forEachOrdered(Consumer)`     | ❌ No         | Igual que `forEach`, pero ordenado (en streams paralelos)           |
| Terminal     | `collect(Collector)`           | ❌ No         | Convierte el stream en una colección (lista, set, mapa, etc.)       |
| Terminal     | `toList()`                     | ❌ No         | Atajo para `collect(Collectors.toList())` en Java 16+               |
| Terminal     | `reduce(...)`                  | ❌ No         | Reduce el stream a un solo valor                                    |
| Terminal     | `count()`                      | ❌ No         | Cuenta los elementos                                                |
| Terminal     | `anyMatch(Predicate)`          | ❌ No         | Devuelve `true` si algún elemento cumple                            |
| Terminal     | `allMatch(Predicate)`          | ❌ No         | `true` si todos cumplen                                             |
| Terminal     | `noneMatch(Predicate)`         | ❌ No         | `true` si ninguno cumple                                            |
| Terminal     | `findFirst()`                  | ❌ No         | Devuelve el primer elemento (opcional)                              |
| Terminal     | `findAny()`                    | ❌ No         | Devuelve un elemento cualquiera (ideal en paralelos)                |
| Terminal     | `min(Comparator)`              | ❌ No         | Mínimo según comparador                                             |
| Terminal     | `max(Comparator)`              | ❌ No         | Máximo según comparador                                             |

---

## 💡 Claves para recordar

- Las **operaciones intermedias** son *lazy*: se encadenan pero no hacen nada hasta que se aplica una terminal.
- Las **operaciones terminales** son *eager*: disparan la ejecución del stream.
- Esto permite construir pipelines eficientes y controlados.

---
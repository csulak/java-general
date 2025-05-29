Makigas link record explanation:
https://www.youtube.com/watch?v=TYtA8cJUzxA&list=PLTd5ehIj0goOxgHKsBIbGRvAwMWclrHDi&index=7&ab_channel=makigas

# Record Classes

En Java, las clases `record` son una forma concisa de definir clases inmutables que se utilizan principalmente para almacenar datos. 
Estas clases proporcionan una sintaxis simplificada para crear clases que solo contienen campos y no tienen comportamiento adicional.

No es necesario implementar el constructor, equals, hashCode o toString 
ya que el compilador lo hace automáticamente para nosotros.
Además, los campos son finales por defecto, por lo cual no podre modificarlos una vez que se ha creado una instancia de la clase `record`.

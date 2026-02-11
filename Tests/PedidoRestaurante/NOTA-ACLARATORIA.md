No se encuentran tests para las excepciones en este paquete, sino
que se encuentran en el paquete Excepciones, en la clase ExcepcionesTest, ya que
no hemos recibido instrucciones en clase acerca de la forma de conocer si un método arroja una excepción sin cargarnos todo el testing (es decir, que la comprobación de la excepción funcione como un test más, y no como una excepción)

Se usó la librería JUnit, tal y como se nos enseñó en el módulo de Entornos de Desarrollo,
y dado que la mayría de funciones de testing eran muy similares, con una estructura muy repetitiva, se automatizó 
usando la herramienta de inteligencia artificial Codex de OpenAI, con el siguiente prompt:

> @Articulo.java @Pedido.java @ColeccionId.java
> Quiero que dentro de la carpeta Tests generes test para los archivos seleccionados. Los test deben de seguir las siguientes indicaciones: Deben de contener un valor esperado, un valor real resultado de la ejecución del método según el problema que el método debe solucionar, y una sentencia assert cuya condición es la igualdad del valor esperado y el valor real. En caso de que los métodos tengan un retorno vacío, evalúa el cambio que realizan en sus respectivos objetos, y compara dichos cambios.
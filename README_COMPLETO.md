# DOCUMENTACIÓN DEL PROYECTO

Esta es una documentación concisa del proyecto implementada gracias a la IA.
Se han aplicado los siguientes conceptos de Programación Orientada a Objetos:
* Encapsulación
* Uso de enum
* Uso de atributos static
* Uso de colecciones (HashMap, HashSet)
* Excepciones personalizadas
* Validaciones de lógica
* Trabajo colaborativo con Git y GitHub

El sistema permite crear pedidos, añadir artículos, controlar cantidades, calcular el precio total y gestionar el estado del pedido.

## Estructura del Proyecto

El proyecto está organizado en el paquete:

PedidoRestaurante

### **Clases principales:**

1. Articulo.java → Representa un artículo del restaurante.
2. Pedido.java → Representa un pedido realizado por un cliente.
3. EstadoPedido.java → Enumeración que define los estados posibles del pedido.
4. ColeccionId.java → Clase auxiliar para gestionar identificadores únicos.
5. Excepciones personalizadas:

* CantidadInvalidaDeArticulo
* LimiteArticulosAlcanzadoException

## Funcionalidades Implementadas

### **Gestión de artículos**

Cada artículo tiene:

* ID generado automáticamente.
* Nombre.
* Precio.
* Se pueden modificar nombre y precio mediante setters.

### **Gestión del pedido**

Cada pedido contiene:

* Nombre del cliente.
* Lista de artículos con cantidad (almacenados en HashMap<Articulo, Integer>).
* Estado del pedido (EstadoPedido).
* Identificador generado automáticamente mediante atributo static.

### **Validaciones implementadas**

* Máximo 5 artículos diferentes por pedido.
* No se puede disminuir la cantidad de un artículo si su cantidad es 1.
* No se puede cambiar el estado a un estado anterior.
* Uso de excepciones personalizadas para controlar errores.

### **Estados del pedido**

Gestionados mediante enum:

* EN_PREPARACION
* LISTO_PARA_ENTREGAR
* ENTREGADO

El flujo permitido es:

EN_PREPARACION → LISTO_PARA_ENTREGAR → ENTREGADO

## Cálculo del Precio Total

El método calcularTotal() recorre la colección de artículos y calcula:

precio total = precio del artículo × cantidad

El total se muestra junto con el resumen del pedido mediante el método printPedido().

## Flujo de Trabajo con Git y GitHub

Este proyecto se ha realizado en pareja siguiendo un flujo básico de trabajo con Git:
1. Creación del repositorio en GitHub.
2. Invitación al compañero/a como colaborador.
3. Clonado del repositorio en ambos equipos.
4. Desarrollo por turnos en tareas pequeñas.
5. Uso de:

* git add
* git commit
* git push

Se realizaron commits pequeños y descriptivos para facilitar el seguimiento del historial.




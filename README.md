# Programación 2 – Trabajo Práctico

## Enunciado

Una concesionaria de automóviles ofrece a la venta vehículos de la marca **Ford** que son fabricados a pedido. Existen dos grandes familias:

* **Autos**: Mondeo, Focus, Ka
* **Pick-ups**: Ranger, F150 Raptor

Cada modelo tiene un **precio base**, que indica el costo del vehículo sin adicionales.

### Etapas de Fabricación

1. Recepción y clasificación de piezas
2. Corte de piezas metálicas
3. Ensamblado de chasis y carrocería
4. Pintura
5. Ensamble de partes mecánicas
6. Terminación de exteriores
7. Acabados interiores
8. Verificación
9. Entrega

> **Nota:** Las etapas tienen implementaciones distintas para automóviles y pick-ups.

### Registro de Clientes

El cliente debe registrarse con:

* Nombre y apellido
* Dirección
* DNI
* Email
* Teléfono de contacto
* Contraseña
* Suscripción opcional a promociones mensuales

Los clientes activos quedan en una lista de clientes.

### Proceso de Pedido

1. El comprador se loguea.
2. Elige un modelo de vehículo (descripción + precio base).
3. Puede agregar **adicionales**:

   * Aire Acondicionado
   * MP3 Player
   * Llantas de aleación
   * Alarma
4. El sistema muestra una descripción del pedido y el **precio total** (base + extras).
5. Si confirma, envía el pedido y se añade a la lista de pedidos.
6. Opcional: suscripción a notificación por email cuando el vehículo esté listo para entrega.

### Avance de Fabricación

* Los operarios se loguean con email y contraseña.
* Avanzan el estado de la producción al completar cada etapa.
* El gerente puede ver el progreso de todos los vehículos en proceso en una interfaz sencilla.

## Requisitos de la Solución

1. **Diagrama de Clases**: Incluir todas las relaciones, métodos y atributos necesarios. Aplicar patrones de diseño adecuados. Debe contener más de 10 clases.
2. **Diagrama de Secuencia**: Desde que un usuario existente realiza el pedido de un Ford Ka con Aire y Llantas de aleación hasta que recibe el email de notificación de que su vehículo está listo.
3. **Código Genérico**: Implementar el patrón que describa los pasos de fabricación de un vehículo, con métodos para conocer el estado actual y avanzar a la siguiente etapa.

---

*¡Bienvenido/a al repositorio del Trabajo Práctico de Programación 2!*
Aquí encontrarás los diagramas y el código necesario para modelar y simular la producción de vehículos Ford por pedido.

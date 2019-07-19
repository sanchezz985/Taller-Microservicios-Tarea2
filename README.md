# Taller-Microservicios-Tarea2
Proyecto para el registro de un cliente y productos con el patron de diseño publish - subscribe

# Objetivo

El objetivo de esta práctica es hacer la implementación de el patrón de diseño publish - subscribe mediante eventos y colas de mensajes. 
En este repositorio se encuentran los proyectos y las instrucciones necesarias para poder ejecutar la práctica.

# Herramientas utilizadas

- Angular
- Spring Boot
- RabbitMQ
- Mongo DB
- NodeJS
- Java JDK 1.8

# Requerimientos

Se debe contar con el JDK de java en su versión 8, asi como RabbitMQ, NodeJS y MongoDB para el correcto funcionamiento de los proyectos en este repositorio.

A continuacón se menciona la forma de instalar NodeJS y MongoDB.

# Instalación de NodeJS

Es necesario instalar NodeJS para poder ejecutar la parte del front ya que esta construida con Angular.

Los pasos para instalar NodeJS son los siguientes:

- Puedes ingresar a la siguiente URL: https://nodejs.org/es/download/ en la cual encontraras el instalador para las plataformas Linux, Windows y Mac.

[Insertar imagen de la pagina de node]

- Una vez descargado el instalador,debes ejecutarlo y seguir las instrucciones.

[Insertar imagen de instalador]

- Si lo prefieres y usas alguna plataforma como Linux o Mac puedes usar algun gestor de paquetes para hacer la instalación.

(Ejemplo de instalación en Ubuntu)
```sh
$ sudo apt-get update
$ sudo apt-get install nodejs
```

Una vez instalado NodeJS debemos instalar su gestor de paquetes [npm]  

(Ejemplo de instalación en Ubuntu)
```sh
$ sudo apt-get install nodejs
```

Para ver que la instalación haya sido exitosa (ya sea con el instalador o desde linea de comandos) podemos ejecutar los siguientes comandos

```sh
$ node -v
$ npm -v
```

Lo cual nos dará como resultado lo siguiente

[Insertar imagen de los comandos de versiones]

# Instalación de Mongo DB

Debido a que la instalación de MongoDB tiene mas variaciones para instalar de acuerdo al sistema operativo, puedes seguir el siguiente tutorial donde se explica como hacer la instalación paso a paso en Windows, Linux y Mac: 

https://platzi.com/blog/como-instalar-mongodb-en-window-linux-y-mac/

# Levantando la aplicación
Este repositorio consta de 4 proyectos:

- [HW2-Client-Microservice] - Proyecto con la lógica necesaria para el registro de clientes y dispara los eventos para el registro de productos.
- [HW2-Product-Microservice] - Proyecto con la lógica necesaria para el registro de productos y dispara los eventos para el envío de notificaciones.
- [HW2-Log-Microservice] - Proyecto con la lógica necesaria para el envío de notificaciones, por simplicidad este proyecto solamente muestra logs en la consola simulando el envìo de las notificaciones.
- [HW2-Dashboard] - Proyecto que contiene las vistas usadas para visualizar la información.

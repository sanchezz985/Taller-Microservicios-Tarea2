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

- [HW2-Client-Microservice] - Proyecto con la lógica necesaria para el registro de clientes y dispara los eventos para el registro de productos, levanta por el puerto `8080` .
- [HW2-Product-Microservice] - Proyecto con la lógica necesaria para el registro de productos y dispara los eventos para el envío de notificaciones, levanta por el puerto `8081`.
- [HW2-Log-Microservice] - Proyecto con la lógica necesaria para el envío de notificaciones, por simplicidad este proyecto solamente muestra logs en la consola simulando el envìo de las notificaciones, levanta por el puerto `8082`.
- [HW2-Dashboard] - Proyecto que contiene las vistas usadas para visualizar la información, levanta por el puerto `4200`.

El primer paso es asegurarte de que base de datos Mongo este funcionando, puedes verificar que puedas entrar a la consola de mongo con el siguiente comando:

```sh
$ mongo
```

Una vez que hayas clonado el repositorio puedes dirigirte a la ruta de los primeros tres proyectos para compilarlos.

[Insertar imagen de los 3 proyectos]

Para hacer la compilación de los proyectos puedes ejecutar la siguiente linea:

```sh
$ mvn clean package -DSkipTests
```

Si todo sale bien el proyecto compilará y generará un Jar en la carpeta target el cual se ejecuta de la siguiente manera

```sh
$ java -jar target/{nombre-del-jar}.jar
```

Una vez que los 3 proyectos han sido levantados debemos correr la aplicación hecha en Angular para poder manipular la información, esto lo hacemos de la siguiente forma:

- Dirigete a la ruta del repositorio donde este la carpeta [HW2-Dashboard]

[Insertar imagen de la ruta del Dashboard]

- ejecuta el siguiente comando

```sh
$ npm start
```

- Una vez que haya terminado el proceso aparecerá un mensaje que dice que puedes visualizar el proyecto en la siguiente dirección:

```sh
http://localhost:4200
```

Una vez en el navegador, veras una tabla vacía, esto es porque no hay usuarios registrados, para hacerlo oprime el botón Registrar.

[Insertar imagen del home]

Llena el registro con los datos indicados y al hacerlo serás redirigido a la pagina principal, si todo fue correcto deberias ver tu registro nuevo en la tabla.

[Insertar imagen del registro]

Una vez que hayas realizado estos pasos puedes regresar a la consola donde se estaban corriendo los jar para verificar los logs y ver que todo haya funcionado correctamente.

En un caso ideal se hará el registro del cliente y si RabbitMQ esta funcionando correctamente depositará los mensajes de clientes registrados para ser leídos por el microservicio de productos y veríficar si se necesita registrar un nuevo producto.

Cuando se registra un producto tambíen se detona una notificación en el ultimo microservicio.

A continuación vemos un ejemplo de un flujo completo realizado de manera exitosa.

[Insertar imagen de caso exitoso]

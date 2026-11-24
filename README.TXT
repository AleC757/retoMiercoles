COMBATE RPG CON MOCKITO Y JUNIT

1. Abrir el proyecto
En BlueJ, abre la carpeta reto, que contiene package.bluej y las clases Java.
El proyecto usa org.junit.Test y org.junit.Assert de JUnit 4.
La instalación revisada de BlueJ 6.0.1 incluye Java 21 y JUnit 4.12.
Comprueba tu versión en Ayuda → Acerca de BlueJ y tus imports en CombateTest.

2. Configurar Mockito
Mockito se agrega como biblioteca Java. Con Java 21, descarga estos cuatro
JAR de Maven Central:

https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.14.2/mockito-core-5.14.2.jar
https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.15.4/byte-buddy-1.15.4.jar
https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.15.4/byte-buddy-agent-1.15.4.jar
https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.jar

Para mostrar la configuración al docente, abre Herramientas → Preferencias
→ Bibliotecas, pulsa Agregar para seleccionar cada JAR y reinicia BlueJ.
Captura el listado con los cuatro JAR cargados. Si compartes el proyecto,
también puedes poner los JAR en una carpeta llamada +libs junto a package.bluej
y volver a abrir el proyecto. Elige una de las dos formas de carga.

Mockito 5 exige Java 11 o superior. Si el equipo usa Java 8, usa Mockito
4.11.0, Byte Buddy y Byte Buddy Agent 1.12.19, y Objenesis 3.3. Si el
BlueJ del aula trabaja exclusivamente con JUnit 5, cambia los imports a
org.junit.jupiter.api.Test y org.junit.jupiter.api.Assertions.assertEquals.
Para confirmar qué JUnit usa ese BlueJ, crea temporalmente una clase de
pruebas desde su menú y revisa los imports que genera.

3. Ejecutar y tomar las capturas
- Pulsa Compilar. Si org.mockito no se reconoce, revisa los JAR y vuelve
  a abrir BlueJ.
- Abre CombateTest y captura el método ataqueNormal completo. Deben verse
  mock(), el constructor de Combate, when(), assertEquals() y verify().
- Haz clic derecho en CombateTest y elige Ejecutar todas las pruebas, o usa
  el botón de ejecución de pruebas del proyecto. Captura el panel de
  resultados con cuatro pruebas y cero fallos si todas pasan.
- Guarda las tres imágenes como 01-bibliotecas.png, 02-uso-mockito.png
  y 03-resultados.png.

4. Explicar el ejemplo
GeneradorAleatorio se crea primero porque el constructor de Combate lo
requiere. Cada prueba crea su propio Combate real y su propio Enemigo
simulado. En el ataque normal, when() fija el azar en 50 y la defensa en
10. assertEquals() comprueba que atacar() devuelve 20. verify() comprueba
que el enemigo recibió una llamada con recibirDamage(20).

La defensa se consulta en ataques que aciertan. En el ataque fallido se
envía cero daño, así que no hace falta entrenar la defensa en esa prueba.

Referencias
https://bluej.org/download/files/bluej-ref-manual.pdf
https://github.com/mockito/mockito
https://central.sonatype.com/artifact/org.mockito/mockito-core/5.14.2

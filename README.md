# CVDS-LAB02

### CREAR UN PROYECTO CON MAVEN

- Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).

  Para crear un arquetipo básico
  para desarrollar un proyecto con maven, disponemos del siguiente
  comando:
  
  mvn
  archetype:create -DgroupId=[your project’s group id] -DartifactId=[your
  project’s artifact id] -DarchetypeArtifactId=maven-archetype-archetype
  Creamos un proyecto a partir de un arquetipo básico de maven:
  
  mvn archetype:create
  -DgroupId=com.autentia -DartifactId=proyecto-basico
  -DarchetypeArtifactId=maven-archetype-archetype
  
  Y
  obtendremos una estructura de directorios así:
  
  ![{4C83F794-247A-4B37-8223-3C72556A44B1}](https://github.com/user-attachments/assets/7b1f7f82-a88c-49e8-ac71-7e9996c89af1)


- Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:

  ProjectId: org.apache.maven.archetypes:maven-archetype-quickstart:1.0
  Id del Grupo: edu.eci.cvds
  Id del Artefacto: Patterns
  Paquete: edu.eci.cvds.patterns.archetype

  usamos el siguiente comando:
  mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -Dpackage=edu.eci.cvds.patterns.archetype - 
  DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeVersion=1.0

  Este comando generará un proyecto Maven con la estructura de un proyecto Java básico, utilizando el arquetipo maven-  
  archetype-quickstart y con los parámetros específicos que has proporcionado.

- Para ver el conjunto de archivos y directorios creados por el comando mvn ejecute el comando tree.

  ![{EB0A95E4-202C-45C1-A213-BB8A5B48757F}](https://github.com/user-attachments/assets/6f7a5c3b-a1f0-41fb-aef5-4140dff8f9a2)

### AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO

- Edite el archivo pom.xml y realize la siguiente actualización:Hay que cambiar la version del compilador de Java a la     
  versión 8, para ello, agregue la sección properties antes de la sección de dependencias:

  ![{A2847E0A-02A7-4D1C-8F35-4A4E6727303D}](https://github.com/user-attachments/assets/a4d64f11-2011-42ee-89ae-6019513c75f1)

### COMPILAR Y EJECUTAR

- Para compilar ejecute el comando: $ mvn package

  ![{B63F9249-7A13-4E21-8E80-6F8846D8FC06}](https://github.com/user-attachments/assets/8af0903f-1574-46b3-86e0-cdabe46e1fc4)

- Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.
  
El parámetro -Dpackage en el comando de Maven se utiliza para especificar el paquete base del código fuente generado para el proyecto. En Java, el "paquete" (o package) es una manera de organizar las clases y evitar conflictos de nombres. En términos de Maven y su uso con un arquetipo, el parámetro package indica el nombre del paquete que se asignará automáticamente a las clases generadas dentro del proyecto.
    
Por ejemplo, si usas -Dpackage=edu.eci.cvds.patterns.archetype, Maven generará el código fuente bajo esa estructura de paquetes. Así, las clases generadas estarán dentro de un directorio llamado edu/eci/cvds/patterns/archetype.

**OTROS PARAMETROS**

**1. DgroupId:**
Define el Group ID del proyecto (usualmente el dominio invertido, como com.ejemplo).
Ejemplo: -DgroupId=edu.eci.cvds.

**2. DartifactId:**
Define el Artifact ID del proyecto (generalmente es el nombre del proyecto).
Ejemplo: -DartifactId=Patterns.

**3. Dversion:**
Especifica la versión del proyecto.
Ejemplo: -Dversion=1.0-SNAPSHOT.

**4. DarchetypeGroupId:**
Define el Group ID del arquetipo (la plantilla que se usará para crear el proyecto).
Ejemplo: -DarchetypeGroupId=org.apache.maven.archetypes.

**5. DarchetypeArtifactId:**
Define el Artifact ID del arquetipo.
Ejemplo: -DarchetypeArtifactId=maven-archetype-quickstart.

**6. DarchetypeVersion:**
Especifica la versión del arquetipo que se va a usar.
Ejemplo: -DarchetypeVersion=1.0.

**7. DarchetypeCatalog:**
Define el catálogo de arquetipos a usar (puede ser internal, remote, o local).
Ejemplo: -DarchetypeCatalog=remote.

**8. DinteractiveMode:**
Controla si Maven debe interactuar con el usuario para pedir entradas. Si lo pones a false, Maven no hará preguntas y tomará los valores por defecto.
Ejemplo: -DinteractiveMode=false.

**9. DjavaVersion:**
Especifica la versión de Java que se va a utilizar en el proyecto. Este parámetro no es tan común, pero puede ser útil si necesitas configurar la versión de Java de tu proyecto.
Ejemplo: -DjavaVersion=11.

- Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación.

  ![{8B060016-50AA-448B-92D8-53D60FB1743F}](https://github.com/user-attachments/assets/093b8863-754d-45a2-9c04-d979716bcab0)
  ![{BAD2425A-1AFC-4DB2-954D-BDFBA995494B}](https://github.com/user-attachments/assets/40101e64-7a67-4d5d-80d6-b8b61b6d089f)

- Utilizar la primera posición del parámetro que llega al método "main" para realizar el saludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:

  ![{4DD0F3D2-90F8-4CB7-AF37-D0937F0B8213}](https://github.com/user-attachments/assets/c035912f-25aa-4343-85b9-c8b08b47fdec)


- Buscar cómo enviar parámetros al plugin "exec".
  para enviar parametros al plugin 'exec' usamos el siguiente comando:
  java -Dexec.args="Mensaje"

- Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!
  
  ![{FA1FD886-A8B0-4570-B54A-8DA802506295}](https://github.com/user-attachments/assets/a56e2a21-55e1-4712-93e2-068b81618290)


- Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!

  ![{77451AC7-6467-41DD-A211-95CCBE9CA7B4}](https://github.com/user-attachments/assets/69b2f13e-2d35-4364-a771-995b05017d2a)

- Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?

- Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.

- Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

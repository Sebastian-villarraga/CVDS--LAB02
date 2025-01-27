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

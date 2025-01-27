# CVDS-LAB02

## CREAR UN PROYECTO CON MAVEN
==============================

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

## AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
=================================================

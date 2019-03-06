# Catalogo3

Abstract Factory: Catálogo de personajes

Éste proyecto será trabajado en Java. Usa el patrón de diseño Abstract Factory para poder escoger los personajes que va a tener el proyecto, usando el patrón. Se usa la fábrica abstracta para definir qué acciones van a realizar los diferentes personajes, y las clases concretas van a ser los diferentes tipos de personajes que tendrá el proyecto

Diagrama Abstract Factory:

![No ha sido encontrado el diagrama](https://github.com/DanielRoa20171020077/Catalogo4/blob/master/Catalogo.png)<br>

Builder: Montar personaje

en este caso se hace uso del patron builder para montar los productos creados anteriormente con el abstract factory de modo que el usuario puede elegir que equipamiento tendra cada personaje

Diagrama Builder:

![No ha sido encontrado el diagrama](https://github.com/DanielRoa20171020077/Catalogo4/blob/master/DiagramaBuilder2.png)<br>

Prototype: Imprimir Tropas

una vez el usuario personaliza sus guerreros, este elige la cantidad de elfos, humanos y orcos que desea en su ejercito de modo que ingresa el numero y se muestran las tropas que este digito, esto se logra gracias al patron prototype al generar un prototipo concreto gracias a los metodos de clonacion y la relacion jerarquica que se observan en el siguiente diagrama

Diagrama Prototype: 

![No ha sido encontrado el diagrama](https://github.com/DanielRoa20171020077/Catalogo4/blob/master/prototype.png)<br>

Ya impresas la tropa con la que el usuario comenzara el juego se abre un nuevo JFrame del cual estará una matriz en la que se ubicaran los personajes elegidos para pelear contra la CPU, de modo que surge la necesidad de manejar poblaciones y para ello se hace uso del patrón Flyweight el cual reduce considerablemente la gestión de recursos al ofrecer un objeto del cual las poblaciones copiaran y simplemente variaran según sus coordenadas en la matriz.
Diagrama Flyweight: 

![No ha sido encontrado el diagrama]( https://static.dzone.com/dz1/dz-files/flyweight_pattern.png) br>


En esta nueva versión del Catálogo de personajes se optó por extender la clase Canvas al momento de ejecutar el juego con sus respectivas animaciones con el propósito de mejorar gestión de recursos y evitar problemas que se presentaron anteriormente al hacer uso de un JPanel.
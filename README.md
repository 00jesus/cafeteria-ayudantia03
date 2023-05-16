#Analisis de dependencias, proyecto Cafeteria
-----
Extension del proyecto de Cafeteria con el uso de Visual Paradigm 

*-Como se detalla en el diagrama de clases, en la cafeteria existen relaciones de clases de asociacion*
+ Entre la clase Cafeteria y la clase Cafe existe una asociacion de "*composicion*" ya que en terminos de jerarquia, la Cafeteria es superior a Cafe, y en terminos practicos la clase Cafe estara dentro de la clase Cafeteria
+ Con la clase Alfajor tambien hay una asociacion de "*composicion*" ya que esta clase esta contenida dentro de la clase Cafeteria
---------
Ahora a nivel practico, a nivel de codigo, esto se ve reflejado en la implentacion de la asociacion

Por ejemplo, como Cafe esta contenida dentro de Cafeteria (composicion) la manera en que se reflejara en el codigo es mediante un Arraylist
+ Pueden ser diversos arreglos, en este caso es un Arraylist ya que los elementos Cafe van contenidos desde 0,null hasta MUCHOS, lo mismo para la clase Alfajor

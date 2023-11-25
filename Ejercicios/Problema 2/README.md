	Definir:
	Problema: Dada la ecuación que ingrese se regresara los valores de las raíces en caso de que estén sobre el conjunto de los números reales, en el caso de que no indicara la solución esta en el conjunto de los números complejos.
	Entradas: Ingresar el valor de a, b y c.
	Salidas: Los dos valores de la formula general (x1, x2) y muestra cual de las raíces son reales.
	Descomponer.
	Se solicita al usuario que ingrese a, b y c.
	Se calcula el discriminante de la ecuación cuadrática, dado por la formula b^2-4ac.
	Te arrojara como resultado:
-Si el discriminante > cero, hay dos raíces reales distintas.
-Si el discriminante = cero, existe una sola raíz real idéntica. 
-Si el discriminante < cero, no tiene raíces reales, pertenecen a números complejos.
     3.Diseño 
	Diagrama de flujo.
La solución del problema se basa en los siguientes pasos:
	Ingresar los datos de a, b y c.
	Modificar los datos de la ecuación.
	Dado el resultado se darán dos respuestas que serán x1 y x2.
	Y te arrojara un mensaje que siga si hay dos raíces, solo una o ninguna.

	Desarrollar:
 
El código comienza con las import necesarias y algunos comentarios que nos proporcionan información sobre la clase. 
 
Desarrollo de la solución:
	La ecuación cuadrática siempre será  〖ax〗^2+bx+c=0 siempre que la ecuación esta ordenada podemos ver cuál es el valor de a, b y c.
	Al ya tener ingresado los valores de a, b y c los remplazaremos en la ecuación 
(-b±√(b²-4ac))/(2a).
	Teniendo el resuelto, de ahí se sacarán los dos resultados el positivo o negativo
los cuales los identificaremos como X1 el cual será el resultado positivo y X2 que será el negativo.
	Dependiendo el resultado se mostrará un texto donde dirá si tiene dos raíces reales, Si solo tiene una o si no tiene ninguna solución real.

	 Se comprobó si el código se ejecuta correctamente y para eso se realizó pruebas de escritorio. 
 
   
	Documentar.

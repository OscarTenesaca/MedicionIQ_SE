(defglobal ?*puntaje* = 0)

(deftemplate testInteligencia

      (slot edad
        (type INTEGER)
        (default ?NONE)
        (range 1 99)
    )

    (slot nombre
        (type STRING)
        (default ?NONE)
    )
    
    (slot pregunta1
        (type SYMBOL)
        (default ?NONE)
    )
    (slot pregunta2
        (type SYMBOL)
        (default ?NONE)
    )
    (slot pregunta3
        (type SYMBOL)
        (default ?NONE)
    )
    
    (slot pregunta4 
        (type SYMBOL)
        (default ?NONE)
    )
    
    (slot pregunta5
        (type SYMBOL)
        (default ?NONE)
    )
    
    (slot pregunta6
        (type SYMBOL)
        (default ?NONE)
    )
    
    (slot pregunta7
        (type SYMBOL)
        (default ?NONE)
    )
    
    (slot pregunta8
        (type SYMBOL)
        (default ?NONE)
    )
    )

    

(defrule respuesta-pregunta1
    (testInteligencia
        (pregunta1 ?preg1)
    )
=>
    (if (eq ?preg1 compasivo)
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg1 reconfortante)
        then
            (bind ?*puntaje* (+ ?*puntaje* 1))
    )
    (if (eq ?preg1 explicativo)
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg1 entrometido)
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
)


(defrule respuesta-pregunta2
        (testInteligencia
            (pregunta2 ?preg2)
    )
=>
    (if (eq ?preg2 A7)
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg2 B17)
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg2 C19  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 1))
    )
    (if (eq ?preg2 D18  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )     

)



(defrule respuesta-pregunta3
        (testInteligencia 
            (pregunta3 ?preg3)
            )
=>
    (if (eq ?preg3 cobarde )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg3 estirado )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
            )
    (if (eq ?preg3 fuerte )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg3 debil )
        then
            (bind ?*puntaje* (+ ?*puntaje* 1))
    )     

)



(defrule respuesta-pregunta4
        (testInteligencia 
            (pregunta4 ?preg4)
    )
=>
    (if (eq ?preg4 alambre)
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg4 electricidad )
        then
            (bind ?*puntaje* (+ ?*puntaje* 1))
    )
    (if (eq ?preg4 calor  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg4  gas  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )     

)

(defrule respuesta-pregunta5
        (testInteligencia
            (pregunta5 ?preg5)
    )
=>
    (if (eq ?preg5 injusticia )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg5 queja)
        then
            (bind ?*puntaje* (+ ?*puntaje* 1))
    )
    (if (eq ?preg5 futil  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg5 pecado )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )     

)


(defrule respuesta-pregunta6
        (testInteligencia
            (pregunta6 ?preg6)
    )
=>
    (if (eq ?preg6 ALUGIA)
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg6 OBLLACA)
        then
            (bind ?*puntaje* (+ ?*puntaje* 1))
    )
    (if (eq ?preg6 TREIUB  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg6 LOMPAA  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )     

)


(defrule respuesta-pregunta7
        (testInteligencia 
            (pregunta7 ?preg7)
    )
=>
    (if (eq ?preg7 EVALCL )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg7 ORAS )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
            )
    (if (eq ?preg7 RTIGARMAA  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg7 CISUF  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 1))
    )     

)


(defrule respuesta-pregunta8
        (testInteligencia
            (pregunta8 ?preg8)
    )
=>
    (if (eq ?preg8 LOBO)
        then
            (bind ?*puntaje* (+ ?*puntaje* 2))
    )
    (if (eq ?preg8 PUMA )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg8 TIGRE )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )
    (if (eq ?preg8 GUEPARDO  )
        then
            (bind ?*puntaje* (+ ?*puntaje* 0))
    )     

)




(defrule analisis
    (testInteligencia 
		(nombre ?n)
	)
	
	=>
	
	(open "/Users/oscartenesaca/eclipse-workspace/SEClipsProyecto/Respuestas/ResultadoTotal.txt" data "w")
	
    if(and(>= ?*puntaje* 0)(<= ?*puntaje* 3)
        then
            (printout t  "   " crlf ) 
            (printout data ?n " IQ: el nivel IQ es bajo" )
            (printout data  "Su puntaje es de:   " ?*puntaje* crlf ) 
             (printout data  "   " crlf ) 
     )
     if(and(>= ?*puntaje* 4)(<= ?*puntaje* 6)
        then
            (printout t  "   " crlf ) 
            (printout data ?n " IQ: el nivel IQ es medio" )
            (printout data  "Su puntaje es de:   " ?*puntaje* crlf ) 
            (printout data  "   " crlf ) 
     )
     if(and(>= ?*puntaje* 7)(<= ?*puntaje* 10)
        then
            (printout t  "   " crlf ) 
            (printout data ?n " IQ: el nivel IQ es alto" )
            (printout data  "Su puntaje es de:   " ?*puntaje* crlf ) 
            (printout data  "   " crlf ) 
    )


(close data)



)


(defrule imprimir
    (testInteligencia
	(edad ?e)
	(nombre ?n)
	(pregunta1 ?resp1)
	(pregunta2 ?resp2)
	(pregunta3 ?resp3)
	(pregunta4 ?resp4)
	(pregunta5 ?resp5)
	(pregunta6 ?resp6)
	(pregunta7 ?resp7)
	(pregunta8 ?resp8)
	)
=> 
	(open "/Users/oscartenesaca/eclipse-workspace/SEClipsProyecto/Respuestas/ResultadoProyecto.txt" data
	"a")
	(printout data "Edad: " ?e
	crlf)
	(printout data "Nombre: " ?n
	crlf)
	(printout data "1. ¿Cuál de las palabras mostradas a continuación es la más cercana en significado a la palabra "tranquilizador"?  " ?resp1
	crlf)
	(printout data "2. ¿Qué número sigue por lógica a esta serie? 4 6 9 6 14 6 ...  " ?resp2
	crlf)
	(printout data "3. ¿Cuál de las palabras de más abajo expresa el significado opuesto a la palabra "duro"?  " ?resp3
	crlf)
	(printout data "4. Agua es a tubería lo que ... es a cable.  " ?resp4
	crlf)
	(printout data "5. ¿Qué palabra significa "expresión de disconformidad"?  " ?resp5
	crlf)
	(printout data "6. ¿Qué animal no encaja con los demás?  " ?resp6
	crlf)
	(printout data "7. Selecciona la palabra que no encaja con las restantes.  " ?resp7
	crlf)
	(printout data "8. ¿Cuál de la siguientes palabras no encaja con las restantes?   " ?resp8
	crlf)
	
	(close data)
)












